package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.common.Constants;
import com.hxqh.dashboard.common.ObjectUtil;
import com.hxqh.dashboard.model.ColumnMap;
import com.hxqh.dashboard.model.Dashboard;
import com.hxqh.dashboard.model.Database;
import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.model.base.Message;
import com.hxqh.dashboard.service.ShowService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Controller
@RequestMapping("/show")
public class ShowController {

    @Autowired
    private ShowService showService;

    /**
     * @ModelAttribute 标记的方法, 会在每个目标方法执行之前被 SpringMVC 调用!
     */
    @ModelAttribute
    public void getUser(@RequestParam(value = "bid", required = false) Integer bid, Map<String, Object> map) {
        if (null != bid) {
            // 从数据库中获取对象
            Dashboard dashboard = showService.findDashboardByVid(bid);
            map.put("dashboardDb", dashboard);
        }
    }


    @ResponseBody
    @RequestMapping(value = "/visualize", method = RequestMethod.POST)
    public Visualize visualize(@RequestBody IntegerValue integerValue) {
        return showService.findVisualizeByVid(integerValue.getIntegerId());
    }

    @ResponseBody
    @RequestMapping(value = "/visualizeData", method = RequestMethod.POST)
    public ShowDto visualizeData(@RequestBody IntegerValue integerValue) {
        return showService.findLineByVid(integerValue.getIntegerId(), 1, 1, 1);
    }

    @ResponseBody
    @RequestMapping(value = "/visualizeAdd", method = RequestMethod.POST)
    public Message addVisualize(@RequestBody VisualDto visualDto) {
        Message message;
        try {
            if (showService.isVisualizeByVisualizename(visualDto.getVisualize().getVisualizename())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                // 判断column符合规范，第一列为字符串，其余为数值
                message = validColumn(visualDto);
                if (message.getCode() == 1) {
                    String tableName = showService.getTableName(visualDto);
                    showService.addVisualize(visualDto, tableName);
                    message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
                }
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }

    private Message validColumn(VisualDto visualDto) {
        Message message = null;
        List<ColumnDto> columnMapList = visualDto.getColumnList();
        List<String> typeList = columnMapList.stream().map(ColumnDto::getType).collect(Collectors.toList());
        for (int i = 0; i < typeList.size(); i++) {
            String type = typeList.get(i);
            if (i == 0) {
                if (!type.toLowerCase().startsWith("varchar")) {
                    message = new Message(Constants.FAIL, Constants.FIRST_NOT_VARCHAR);
                    return message;
                }
            } else {
                if (type.toLowerCase().startsWith("varchar")) {
                    message = new Message(Constants.FAIL, Constants.TAIL_MUST_NUMBER);
                    return message;
                }
            }
        }
        message = new Message(Constants.SUCCESS);
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "/visualize/{id}", method = RequestMethod.DELETE)
    public Message visualizeDelete(@PathVariable("id") Integer integerValue) {
        Message message = null;
        try {
            Dashboard dashboard = showService.visualizeHasUsed(integerValue);
            if (null == dashboard) {
                showService.visualizeDelete(integerValue);
                message = new Message(Constants.SUCCESS, Constants.DELETESUCCESS);
            } else {
                String dashboardname = dashboard.getDashboardname();
                message = new Message(Constants.FAIL, dashboardname + Constants.HASUSED);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.DELETEFAIL);
            e.printStackTrace();
        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "/visualize", method = RequestMethod.PUT)
    public Message visualizeUpdate(@RequestBody VisualDto visualDto) {
        Message message = null;
        try {
            if (showService.isVisualizeByVisualizenameAndVidNot(visualDto.getVisualize())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                showService.updateVisualize(visualDto);
                message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITFAIL);
            e.printStackTrace();
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "/visualizeList2", method = RequestMethod.POST)
    public VisualizeDto visualizeList2(@RequestBody Visualize visualize,
                                       @RequestParam(value = "page", defaultValue = "0") int page,
                                       @RequestParam(value = "size", defaultValue = "10") int size,
                                       @RequestParam(value = "bid", defaultValue = "0") int bid) {
        VisualizeDto visualizeDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "vid");
        try {
            visualize.setBid(bid);
            Pageable pageable = new PageRequest(page, size, sort);
            visualizeDto = showService.visualizeList2(visualize, pageable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return visualizeDto;
    }


    /*=======================================================================================================*/

    @ResponseBody
    @RequestMapping(value = "/dashboardAdd", method = RequestMethod.POST)
    public Message addDashboard(@RequestBody Dashboard dashboard) {
        Message message;
        try {

            if (showService.isDashboardByDashboardName(dashboard.getDashboardname())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                showService.addDashboard(dashboard);
                message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
            }

        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "/dashboard/{id}", method = RequestMethod.POST)
    public Dashboard dashboard(@PathVariable("id") Integer integerValue) {
        return showService.findDashboardByVid(integerValue);
    }


    @ResponseBody
    @RequestMapping(value = "/dashboardVisualize", method = RequestMethod.POST)
    public Message dashboardVisualize(@RequestBody DashboardVisualizeDto dashboardVisualizeDto) {
        Message message;
        try {
            showService.addDashboardVisualize(dashboardVisualizeDto);
            message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "/dashboard/{id}", method = RequestMethod.DELETE)
    public Message dashboardDelete(@PathVariable("id") Integer integerValue) {
        Message message = null;
        try {
            showService.dashboardDelete(integerValue);
            message = new Message(Constants.SUCCESS, Constants.DELETESUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.DELETEFAIL);
            e.printStackTrace();
        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "/dashboard", method = RequestMethod.PUT)
    public Message dashboardUpdate(Dashboard dashboardDb, @RequestBody Dashboard dashboard) {
        Message message = null;
        try {
            BeanUtils.copyProperties(dashboard, dashboardDb, ObjectUtil.getNullPropertyNames(dashboard));
            if (showService.isDashboardByDashboardNameAndBidNot(dashboardDb)) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                showService.updateDashboard(dashboardDb);
                message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITFAIL);
            e.printStackTrace();
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "/dashboardData", method = RequestMethod.POST)
    public DashboardShowDto dashboardData(@RequestBody IntegerValue integerValue) {
        DashboardShowDto showDto = showService.findDashboardDataByVid(integerValue.getIntegerId());
        return showDto;
    }


    @ResponseBody
    @RequestMapping(value = "/dashboardList2", method = RequestMethod.POST)
    public DashboardDto dashboardList2(@RequestBody Dashboard dashboard,
                                       @RequestParam(value = "page", defaultValue = "0") int page,
                                       @RequestParam(value = "size", defaultValue = "10") int size) {
        DashboardDto dashboardDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "bid");
        try {
            Pageable pageable = new PageRequest(page, size, sort);
            dashboardDto = showService.dashboardList2(dashboard, pageable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dashboardDto;
    }

    @RequestMapping(value = "/excel/export")
    public void exportExcel(HttpServletResponse response) throws Exception {
        HSSFWorkbook wb = showService.exportVisualizeExcel();
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-disposition", "attachment;filename=export_visualize.xls");
        OutputStream ouputStream = response.getOutputStream();
        wb.write(ouputStream);
        ouputStream.flush();
        ouputStream.close();
    }

    @ResponseBody
    @RequestMapping(value = "/databaseList", method = RequestMethod.GET)
    public List<Database> databaseList() {
        List<Database> databases = new ArrayList<>();
        try {
            databases = showService.databaseList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return databases;
    }


    @ResponseBody
    @RequestMapping(value = "/validateDatabase", method = RequestMethod.GET)
    public Message validateDatabase(@RequestParam(value = "dbid", defaultValue = "1") Integer dbid) {
        Message message = new Message(Constants.SUCCESS, Constants.CONNECTION_SUCCESSFUL);
        try {
            Boolean isTrue = showService.validateDatabase(dbid);
            if (isTrue) {
                message.setMessage(Constants.CONNECTION_SUCCESSFUL);
            } else {
                message.setMessage(Constants.CONNECTION_FAILED);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.CONNECTION_FAILED);
            e.printStackTrace();
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "/tableList", method = RequestMethod.GET)
    public List<String> tableList(@RequestParam(value = "dbid", defaultValue = "1") Integer dbid) {
        List<String> stringList = new ArrayList<>();
        try {
            stringList = showService.tableList(dbid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }

    /**
     * 获取数据库表中列
     *
     * @param tablename
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/columnList", method = RequestMethod.GET)
    public List<ColumnDto> columnList(@RequestParam String tablename,
                                      @RequestParam(value = "dbid", defaultValue = "1") Integer dbid) {
        List<ColumnDto> columnDtoList = new ArrayList<>(15);
        try {
            columnDtoList = showService.columnList(tablename, dbid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnDtoList;
    }


    /**
     * 获取列对应关系
     *
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/columnMapList", method = RequestMethod.GET)
    public List<ColumnMap> columnMapList(@RequestParam Integer vid) {
        List<ColumnMap> columnMapList = new ArrayList<>();
        try {
            columnMapList = showService.columnMapList(vid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnMapList;
    }


    /**
     * 设置列对应关系
     *
     * @param columnMap
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/columnMapUpdate", method = RequestMethod.PUT)
    public Message columnMapUpdate(@RequestBody ColumnMap columnMap) {
        Message message = null;
        try {
            if (showService.isSameColumn(columnMap)) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                showService.columnMapUpdate(columnMap);
                message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITFAIL);
            e.printStackTrace();
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "/databaseAdd", method = RequestMethod.POST)
    public Message databaseAdd(@RequestBody Database database) {
        Message message;
        try {
            showService.databaseAdd(database);
            message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "/databaseUpdate", method = RequestMethod.PUT)
    public Message databaseUpdate(@RequestBody Database database) {
        Message message = null;
        try {
            showService.databaseUpdate(database);
            message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITFAIL);
            e.printStackTrace();
        }
        return message;
    }


}
