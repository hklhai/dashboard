package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.common.Constants;
import com.hxqh.dashboard.common.ObjectUtil;
import com.hxqh.dashboard.model.Dashboard;
import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.model.base.Message;
import com.hxqh.dashboard.model.base.PageInfo;
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
import java.util.Map;

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
    public void getUser(@RequestParam(value = "bid", required = false) Integer bid,
                        @RequestParam(value = "vid", required = false) Integer vid,
                        Map<String, Object> map) {
        if (null != bid) {
            // 从数据库中获取对象
            Dashboard dashboard = showService.findDashboardByVid(bid);
            map.put("dashboardDb", dashboard);
        }
        if (null != vid) {
            Visualize visualize = showService.findVisualizeByVid(vid);
            map.put("visualizeDb", visualize);
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
    public Message addVisualize(@RequestBody Visualize visualize) {
        Message message;
        try {
            if (showService.isVisualizeByVisualizename(visualize.getVisualizename())) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                showService.addVisualize(visualize);
                message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "/visualize/{id}", method = RequestMethod.DELETE)
    public Message visualizeDelete(@PathVariable("id") Integer integerValue) {
        Message message = null;
        try {
            showService.visualizeDelete(integerValue);
            message = new Message(Constants.SUCCESS, Constants.DELETESUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.DELETEFAIL);
            e.printStackTrace();
        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "/visualize", method = RequestMethod.PUT)
    public Message visualizeUpdate(Visualize visualizeDb, @RequestBody Visualize visualize) {
        Message message = null;
        try {
            BeanUtils.copyProperties(visualize, visualizeDb, ObjectUtil.getNullPropertyNames(visualize));
            showService.updateVisualize(visualizeDb);
            message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITSUCCESS);
            e.printStackTrace();
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "/visualizeList", method = RequestMethod.POST)
    public VisualizeDto visualizeList(@RequestBody PageInfo pageInfo) {

        VisualizeDto visualizeDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "vid");
        try {
            Pageable pageable = new PageRequest(pageInfo.getPage(), pageInfo.getSize(), sort);
            visualizeDto = showService.visualizeList(null, pageable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return visualizeDto;
    }

    @ResponseBody
    @RequestMapping(value = "/visualizeList2", method = RequestMethod.POST)
    public VisualizeDto visualizeList2(@RequestBody Visualize visualize,
                                       @RequestParam(value = "page", defaultValue = "0") int page,
                                       @RequestParam(value = "size", defaultValue = "10") int size) {
        VisualizeDto visualizeDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "vid");
        try {
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

            if (showService.isDashboardByVisualizename(dashboard.getDashboardname())) {
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
            showService.updateDashboard(dashboardDb);
            message = new Message(Constants.SUCCESS, Constants.EDITSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.EDITSUCCESS);
            e.printStackTrace();
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "/dashboardData", method = RequestMethod.POST)
    public DashboardShowDto dashboardData(@RequestBody IntegerValue integerValue) {
        return showService.findDashboardDataByVid(integerValue.getIntegerId());
    }

    @ResponseBody
    @RequestMapping(value = "/dashboardList", method = RequestMethod.POST)
    public DashboardDto dashboardList(@RequestBody PageInfo pageInfo) {
        DashboardDto dashboardDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "bid");
        try {
            Pageable pageable = new PageRequest(pageInfo.getPage(), pageInfo.getSize(), sort);
            dashboardDto = showService.dashboardList(null, pageable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dashboardDto;
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


}
