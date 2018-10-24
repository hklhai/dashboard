package com.hxqh.dashboard.model.assist;

/**
 * Created by Ocean lin on 2018/10/23.
 *
 * @author Ocean lin
 */
public class RoleModelModelDto {

    private Integer rolemodelid;
    private Integer roleid;
    private Integer modelid;

    public RoleModelModelDto() {
    }

    public RoleModelModelDto(Integer rolemodelid, Integer roleid, Integer modelid) {
        this.rolemodelid = rolemodelid;
        this.roleid = roleid;
        this.modelid = modelid;
    }

    public Integer getRolemodelid() {
        return rolemodelid;
    }

    public void setRolemodelid(Integer rolemodelid) {
        this.rolemodelid = rolemodelid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }
}
