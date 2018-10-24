package com.hxqh.dashboard.model.assist;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/23.
 *
 * @author Ocean lin
 */
public class UserRolesDto {

    private Integer userid;

    private List<UserRoleRoleDto> roleList;

    private List<Integer> deleteList;

    public UserRolesDto() {
    }

    public UserRolesDto(Integer userid, List<UserRoleRoleDto> roleList) {
        this.userid = userid;
        this.roleList = roleList;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public List<UserRoleRoleDto> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<UserRoleRoleDto> roleList) {
        this.roleList = roleList;
    }

    public List<Integer> getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(List<Integer> deleteList) {
        this.deleteList = deleteList;
    }
}
