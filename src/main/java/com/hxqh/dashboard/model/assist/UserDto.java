package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.User;
import com.hxqh.dashboard.model.base.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/19.
 *
 * @author Ocean lin
 */
public class UserDto extends Page {

    private List<User> userList;

    public UserDto(List<User> userList) {
        this.userList = userList;
    }

    public UserDto(Pageable page, Integer totalPages, Long total, List<User> userList) {
        super(page, totalPages, total);
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
