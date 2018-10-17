package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.common.Constants;
import com.hxqh.dashboard.model.Dashboard;
import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.assist.*;
import com.hxqh.dashboard.model.base.Message;
import com.hxqh.dashboard.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


    @ResponseBody
    @RequestMapping(value = "/visualize", method = RequestMethod.POST)
    public Visualize visualize(@RequestBody IntegerValue integerValue) {
        return showService.findVisualizeByVid(integerValue.getIntegerId());
    }

    @ResponseBody
    @RequestMapping(value = "/visualizeData", method = RequestMethod.POST)
    public ShowDto visualizeData(@RequestBody IntegerValue integerValue) {
        return showService.findLineByVid(integerValue.getIntegerId());
    }

    @ResponseBody
    @RequestMapping(value = "/visualize", method = RequestMethod.PUT)
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
    @RequestMapping(value = "/visualizeList", method = RequestMethod.POST)
    public VisualizeDto visualizeList(@RequestBody Visualize visualize,
                                      @RequestParam(value = "page", defaultValue = "0") Integer page,
                                      @RequestParam(value = "size", defaultValue = "15") Integer size) {

        VisualizeDto visualizeDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "vid");
        try {
            Pageable pageable = new PageRequest(page, size, sort);
            visualizeDto = showService.visualizeList(visualize, pageable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return visualizeDto;
    }

    /*=======================================================================================================*/

    @ResponseBody
    @RequestMapping(value = "/dashboard", method = RequestMethod.PUT)
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
    @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    public Dashboard dashboard(@RequestBody IntegerValue integerValue) {
        return showService.findDashboardByVid(integerValue.getIntegerId());
    }

    @ResponseBody
    @RequestMapping(value = "/dashboardVisualize", method = RequestMethod.PUT)
    public Message dashboardVisualize(@RequestBody DoubleIntegerValue integerValue) {
        // DoubleIntegerValue第一个dashboard，第二个visualize
        Message message;
        try {
            // 判断关系是否存在
            if (showService.isHasDashboardVisualize(integerValue)) {
                message = new Message(Constants.FAIL, Constants.ADDFAILHASHALREADY);
            } else {
                showService.addDashboardVisualize(integerValue);
                message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
            }
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
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
    public DashboardDto dashboardList(@RequestBody Dashboard dashboard,
                                      @RequestParam(value = "page", defaultValue = "0") Integer page,
                                      @RequestParam(value = "size", defaultValue = "15") Integer size) {

        DashboardDto dashboardDto = null;
        Sort sort = new Sort(Sort.Direction.DESC, "bid");
        try {
            Pageable pageable = new PageRequest(page, size, sort);
            dashboardDto = showService.dashboardList(dashboard, pageable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dashboardDto;
    }

}
