package com.hxqh.dashboard.model;

import com.thoughtworks.xstream.annotations.XStreamOmitField;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
@Entity
@Table(name = "tb_role")
public class TbRole implements Serializable {

    private static final long serialVersionUID = -7288218037607497452L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roleid;

    private String roledesc;

    private String rolename;

    private Integer rolestatus;

    private Integer sortnum;

    @OneToMany(mappedBy = "tbRole")
    @XStreamOmitField
    private List<TbUserrole> tbUserroles;

    @OneToMany(mappedBy = "tbRole")
    @XStreamOmitField
    private List<TbRolemodel> tbRolemodels;


    public TbRole() {
    }

    public List<TbUserrole> getTbUserroles() {
        return tbUserroles;
    }

    public void setTbUserroles(List<TbUserrole> tbUserroles) {
        this.tbUserroles = tbUserroles;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRoledesc() {
        return this.roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public String getRolename() {
        return this.rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getRolestatus() {
        return this.rolestatus;
    }

    public void setRolestatus(Integer rolestatus) {
        this.rolestatus = rolestatus;
    }

    public Integer getSortnum() {
        return this.sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    public List<TbRolemodel> getTbRolemodels() {
        return tbRolemodels;
    }

    public void setTbRolemodels(List<TbRolemodel> tbRolemodels) {
        this.tbRolemodels = tbRolemodels;
    }
}