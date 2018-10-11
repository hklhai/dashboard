package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.User;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
public interface SystemService {

    /**
     * 根据用户名获取User对象
     *
     * @param name 用户名
     * @return 用户对象
     */
    User findUserById(String name);


}
