package com.hxqh.dashboard.controller;

import com.hxqh.dashboard.common.Account;
import com.hxqh.dashboard.model.User;
import com.hxqh.dashboard.model.assist.LoginDto;
import com.hxqh.dashboard.model.base.Message;
import com.hxqh.dashboard.model.base.SessionInfo;
import com.hxqh.dashboard.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private SystemService systemService;

    /**
     * 登录Function
     *
     * @param loginDto 登录dto
     * @param map      前台返回信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Message login(@RequestBody LoginDto loginDto, Map<String, Object> map) {
        User user = systemService.findUserById(loginDto.getName());
        return webLogin(user, loginDto, map);
    }

    private Message webLogin(User user, LoginDto loginDto, Map<String, Object> map) {
        Message message = new Message(0, "");
        Message success = new Message(1, "LoginSuccess");
        if (null != user) {
            String password = null;
            try {
                password = Account.encrypt(loginDto.getPassword());
                if (user.getPassword().toUpperCase().equals(password)) {
                    //加入Session中
                    SessionInfo sessionInfo = new SessionInfo();
                    sessionInfo.setName(user.getName());
                    map.put("sessionInfo", sessionInfo);
                    return success;
                } else {
                    message.setMessage("Password authentication error!");
                    return message;
                }
            } catch (Exception e) {
                message.setMessage("System exception, please contact the administrator！");
                e.printStackTrace();
                return message;
            }
        } else {
            //用户名不存在
            message.setMessage("The account does not exist!");
            return message;
        }
    }

}
