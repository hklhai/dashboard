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


    /**
     * 获取视图对象
     *
     * @param integerValue 视图ID
     * @return 视图对象
     */
    @ResponseBody
    @RequestMapping(value = "/visualize", method = RequestMethod.POST)
    public Visualize visualize(@RequestBody IntegerValue integerValue) {
        return showService.findVisualizeByVid(integerValue.getIntegerId());
    }

    /**
     * 获取视图中数据
     *
     * @param integerValue 视图主键
     * @return 视图内数据DTO
     */
    @ResponseBody
    @RequestMapping(value = "/visualizeData", method = RequestMethod.POST)
    public ShowDto visualizeData(@RequestBody IntegerValue integerValue) {
        return showService.findLineByVid(integerValue.getIntegerId(), 1, 1, 1);
    }

    /**
     * 新增视图
     *
     * @param visualDto 前端传入视图及column DTO
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/visualizeAdd", method = RequestMethod.POST)
    public Message addVisualize(@RequestBody VisualDto visualDto) {
        Message message;
        try {
            if (showService.isVisualizeByVisualizename(visualDto.getVisualize().getVisualizename())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                // 判断column符合规范，第一列为字符串，其余为数值
                message = validColumn(visualDto.getColumnList());
                if (message.getCode() == 1) {
                    String tableName = showService.getTableName(visualDto.getVisualize().getType());
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

    /**
     * 验证column
     *
     * @param columnMapList 用户传入ColumnList
     * @return message信息
     */
    private Message validColumn(List<ColumnDto> columnMapList) {
        Message message = null;
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

    /**
     * 视图删除
     *
     * @param integerValue 视图ID主键
     * @return message信息
     */
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

    /**
     * 视图更新接口，集成多Y轴、多X轴，多个ColumnMap更新；
     * 集成删除多X轴，多Y周接口
     *
     * @param visualDto 用户传入视图信息
     * @return message信息
     */
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


    /**
     * 视图分页接口
     *
     * @param visualize 带查询条件的视图接口
     * @param page      页数
     * @param size      页容量
     * @param bid       仪表板ID
     * @return
     */
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

    /**
     * 添加仪表板
     *
     * @param dashboard 前台传入仪表板
     * @return message信息
     */
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

    /**
     * 仪表板信息获取
     *
     * @param integerValue 仪表板ID
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/dashboard/{id}", method = RequestMethod.POST)
    public Dashboard dashboard(@PathVariable("id") Integer integerValue) {
        return showService.findDashboardByVid(integerValue);
    }

    /**
     * 仪表板绑定视图接口
     *
     * @param dashboardVisualizeDto 仪表板ID、视图ID绑定信息
     * @return message信息
     */
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

    /**
     * 仪表板删除
     *
     * @param integerValue 仪表板ID主键
     * @return message信息
     */
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

    /**
     * 仪表板更新
     *
     * @param dashboardDb 仪表板数据库信息
     * @param dashboard   前台传入仪表板信息
     * @return message信息
     */
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

    /**
     * 仪表板内展示数据接口
     *
     * @param integerValue 仪表板ID主键
     * @return 仪表板内数据
     */
    @ResponseBody
    @RequestMapping(value = "/dashboardData", method = RequestMethod.POST)
    public DashboardShowDto dashboardData(@RequestBody IntegerValue integerValue) {
        DashboardShowDto showDto = showService.findDashboardDataByVid(integerValue.getIntegerId());
        return showDto;
    }

    /**
     * 仪表板分页接口
     *
     * @param dashboard 带条件查询的仪表板
     * @param page      页数
     * @param size      页容量
     * @return 仪表板列表
     */
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

    /**
     * 视图导出接口
     *
     * @param response HttpServletResponse
     * @throws Exception
     */
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

    /**
     * 数据库配置列表信息
     *
     * @return 数据库配置列表
     */
    @ResponseBody
    @RequestMapping(value = "/databaseList", method = RequestMethod.GET)
    public List<Database> databaseList(@RequestParam(value = "valid", defaultValue = "0") Integer valid) {
        List<Database> databases = new ArrayList<>();
        try {
            databases = showService.databaseList(valid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return databases;
    }

    /**
     * 验证数据库是否可用
     *
     * @param dbid 数据库配置ID主键
     * @return message信息
     */
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


    /**
     * 数据表列表接口
     *
     * @param dbid 数据库ID主键
     * @return 数据表列表
     */
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
     * @param tablename 表名
     * @param dbid      数据库ID
     * @return 列对应关系列表DTO
     */
    @ResponseBody
    @RequestMapping(value = "/columnList", method = RequestMethod.GET)
    public List<ColumnDto> columnList(@RequestParam String tablename,
                                      @RequestParam(value = "dbid", defaultValue = "1") Integer dbid,
                                      @RequestParam(value = "vid", defaultValue = "0") Integer vid) {
        List<ColumnDto> columnDtoList = new ArrayList<>(15);
        try {
            columnDtoList = showService.columnList(tablename, dbid,vid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnDtoList;
    }


    /**
     * 获取列对应关系
     *
     * @param vid 视图主键
     * @return 列对应关系列表
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
     * @param columnMap 列对应关系列表
     * @return message信息
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


    /**
     * 数据库配置添加
     *
     * @param database 前台传入数据库对象
     * @return message信息
     */
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


    /**
     * 数据库更新
     *
     * @param database 数据库实体
     * @return message信息
     */
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


    /**
     * 数据库删除
     *
     * @param integerValue 数据库主键
     * @return message信息
     */
    @ResponseBody
    @RequestMapping(value = "/database/{id}", method = RequestMethod.DELETE)
    public Message databaseDelete(@PathVariable("id") Integer integerValue) {
        Message message = null;
        try {
            showService.databaseDelete(integerValue);
            message = new Message(Constants.SUCCESS, Constants.DELETESUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.DELETEFAIL);
            e.printStackTrace();
        }
        return message;
    }


}
