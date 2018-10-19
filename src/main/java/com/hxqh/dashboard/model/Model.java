package com.hxqh.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
@Entity
@Table(name = "tb_model")
public class Model implements Serializable {

    private static final long serialVersionUID = 1545833445940178502L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer modelid;

    private Integer ismdeol;

    private String modeldesc;

    private String modelname;

    private BigDecimal modelstatus;

    private Integer parentid;

    private String remark;

    private BigDecimal sortnum;

    private String murl;

    private Integer isurl;

    @JsonIgnore
    @OneToMany(mappedBy = "model")
    private List<RoleModel> roleModels;

    @Transient
    private List<Model> childList;

    public Model() {
    }

    public Integer getIsurl() {
        return isurl;
    }

    public void setIsurl(Integer isurl) {
        this.isurl = isurl;
    }

    public List<Model> getChildList() {
        return childList;
    }

    public void setChildList(List<Model> childList) {
        this.childList = childList;
    }

    public List<RoleModel> getRoleModels() {
        return roleModels;
    }

    public void setRoleModels(List<RoleModel> roleModels) {
        this.roleModels = roleModels;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getIsmdeol() {
        return this.ismdeol;
    }

    public void setIsmdeol(Integer ismdeol) {
        this.ismdeol = ismdeol;
    }

    public String getModeldesc() {
        return this.modeldesc;
    }

    public void setModeldesc(String modeldesc) {
        this.modeldesc = modeldesc;
    }

    public String getModelname() {
        return this.modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public BigDecimal getModelstatus() {
        return this.modelstatus;
    }

    public void setModelstatus(BigDecimal modelstatus) {
        this.modelstatus = modelstatus;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getSortnum() {
        return this.sortnum;
    }

    public void setSortnum(BigDecimal sortnum) {
        this.sortnum = sortnum;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }
}