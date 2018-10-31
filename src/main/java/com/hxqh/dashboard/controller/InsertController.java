package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.common.Constants;
import com.hxqh.dashboard.model.assist.InsertInfo;
import com.hxqh.dashboard.model.base.Message;
import com.hxqh.dashboard.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ocean lin on 2018/10/31.
 *
 * @author Ocean lin
 */
@Controller
@RequestMapping("/insert")
public class InsertController {

    @Autowired
    private ShowService showService;


    @ResponseBody
    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public Message data(@RequestBody InsertInfo insertInfo) {
        Message message;
        try {
            showService.insertData(insertInfo);
            message = new Message(Constants.SUCCESS, Constants.ADDSUCCESS);
        } catch (Exception e) {
            message = new Message(Constants.FAIL, Constants.ADDFAIL);
            e.printStackTrace();
        }
        return message;
    }


}
