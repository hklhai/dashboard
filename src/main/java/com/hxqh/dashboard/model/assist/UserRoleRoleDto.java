package com.hxqh.dashboard.model.assist;

/**
 * Created by Ocean lin on 2018/10/23.
 *
 * @author Ocean lin
 */
public class UserRoleRoleDto {

    private Integer userroleid;
    private Integer roleid;
    private Integer userid;

    public UserRoleRoleDto() {
    }

    public UserRoleRoleDto(Integer userroleid, Integer roleid, Integer userid) {
        this.userroleid = userroleid;
        this.roleid = roleid;
        this.userid = userid;
    }

    public Integer getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
