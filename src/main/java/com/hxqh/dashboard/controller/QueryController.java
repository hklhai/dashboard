package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
@Controller
public class QueryController {

    @Autowired
    private SystemService systemService;

    /**
     * 保留
     *
     * @return
     */
    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String status() {
        return "market/bigData";
    }


}
