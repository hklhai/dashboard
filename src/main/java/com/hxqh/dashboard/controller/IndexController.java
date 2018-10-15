package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.model.UserObj;
import com.hxqh.dashboard.model.assist.LoginDto;
import com.hxqh.dashboard.model.base.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
@Controller
public class IndexController {


    /**
     * index
     *
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "user/index";
    }



}
