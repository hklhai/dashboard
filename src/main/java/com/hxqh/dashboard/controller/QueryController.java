package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ocean lin on 2017/7/1.
 *
 * @author Lin
 */
@Controller
public class QueryController {

    @Autowired
    private SystemService systemService;

    /**
     *  保留
     *
     * @return
     */
    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String status() {
        return "market/bigData";
    }


}
