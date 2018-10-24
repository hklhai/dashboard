package com.hxqh.dashboard.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Ocean lin on 2018/10/24.
 *
 * @author Ocean lin
 */
@Entity
@Table(name = "v_role_model")
public class VRoleModel {

    @Id
    private Integer rolemodelid;
    private Integer roleid;
    private String rolename;
    private Integer modelid;
    private String modelname;

    public VRoleModel() {
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

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }
}
