package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.common.Constants;
import com.hxqh.dashboard.model.Line;
import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.assist.IntegerValue;
import com.hxqh.dashboard.model.base.Message;
import com.hxqh.dashboard.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
        return showService.findByVid(integerValue.getIntegerId());
    }

    @ResponseBody
    @RequestMapping(value = "/visualizeData", method = RequestMethod.POST)
    public List<Line> visualizeData(@RequestBody IntegerValue integerValue) {
        return showService.findLineByVid(integerValue.getIntegerId());
    }

    @ResponseBody
    @RequestMapping(value = "/visualize", method = RequestMethod.PUT)
    public Message addVisualize(@RequestBody Visualize visualize) {
        Message message = null;
        try {
            showService.addVisualize(visualize);
            message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        } finally {
            return message;
        }

    }

}
