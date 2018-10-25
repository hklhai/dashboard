package com.hxqh.dashboard.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * Created by Ocean lin on 2018/10/24.
 *
 * @author Ocean lin
 */

@Entity
@Table(name = "v_user_model")
public class ViewUserModel {

    @Id
    private Integer usermodelid;
    private Integer userid;
    private String name;
    private Integer modelid;
    private String modelname;
    private String modeldesc;

    private Integer parentid;

    private Integer bid;

    @Transient
    private List<ViewUserModel> viewUserModelList;

    public ViewUserModel() {
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public List<ViewUserModel> getViewUserModelList() {
        return viewUserModelList;
    }

    public void setViewUserModelList(List<ViewUserModel> viewUserModelList) {
        this.viewUserModelList = viewUserModelList;
    }

    public Integer getUsermodelid() {
        return usermodelid;
    }

    public void setUsermodelid(Integer usermodelid) {
        this.usermodelid = usermodelid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getModeldesc() {
        return modeldesc;
    }

    public void setModeldesc(String modeldesc) {
        this.modeldesc = modeldesc;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}
