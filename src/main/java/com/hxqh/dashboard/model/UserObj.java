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
@Table(name = "tb_user")
public class UserObj implements Serializable {

    private static final long serialVersionUID = 3367852520038806572L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userid;

    private String name;

    private String password;

    private String address;

    @Column(name = "\"DESCRIBE\"")
    private String describe;

    private String email;

    private String mobile;

    private String sex;

    private String username;

    private Integer userstatus;

    private String department;

    @Transient
    private String roleid;

    //bi-directional many-to-one association to UserroleObj
    @OneToMany(mappedBy = "tbUser")
    @XStreamOmitField
    private List<TbUserrole> tbUserroles;


    public UserObj() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    public List<TbUserrole> getTbUserroles() {
        return tbUserroles;
    }

    public void setTbUserroles(List<TbUserrole> tbUserroles) {
        this.tbUserroles = tbUserroles;
    }
}