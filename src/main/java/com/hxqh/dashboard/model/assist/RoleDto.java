package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.Role;
import com.hxqh.dashboard.model.User;
import com.hxqh.dashboard.model.base.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/19.
 *
 * @author Ocean lin
 */
public class RoleDto extends Page {

    private List<Role> roleList;

    public RoleDto(List<Role> roleList) {
        this.roleList = roleList;
    }

    public RoleDto(Pageable page, Integer totalPages, List<Role> roleList) {
        super(page, totalPages);
        this.roleList = roleList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
