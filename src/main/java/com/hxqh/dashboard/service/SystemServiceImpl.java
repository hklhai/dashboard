package com.hxqh.dashboard.service;

import com.hxqh.dashboard.model.UserObj;
import com.hxqh.dashboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ocean lin on 2018/4/8.
 *
 * @author Ocean lin
 */
@Service("systemService")
public class SystemServiceImpl implements SystemService {

    @Autowired
    private UserRepository userDao;

    @Override
    public UserObj findUserById(String name) {
        return userDao.findUserByName(name);
    }


}
