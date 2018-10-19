package com.hxqh.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Role implements Serializable {

    private static final long serialVersionUID = 1760980718942376564L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roleid;

    private String roledesc;

    private String rolename;

    private Integer rolestatus;

    private Integer sortnum;

    @OneToMany(mappedBy = "role")
    @XStreamOmitField
    @JsonIgnore
    private List<UserRole> userRoles;

    @OneToMany(mappedBy = "role")
    @XStreamOmitField
    @JsonIgnore
    private List<RoleModel> roleModels;


    public Role() {
    }

    public List<UserRole> getUserroles() {
        return userRoles;
    }

    public void setUserroles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
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

    public List<RoleModel> getRoleModels() {
        return roleModels;
    }

    public void setRoleModels(List<RoleModel> roleModels) {
        this.roleModels = roleModels;
    }
}