package com.hxqh.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
@Entity
@Table(name = "tb_userrole")
public class UserRole implements Serializable {

    private static final long serialVersionUID = -5635451455169818687L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userroleid;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ROLEID")
    private Role role;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "USERID")
    private User user;

    public UserRole() {
    }

    public UserRole(Role role, User user) {
        this.role = role;
        this.user = user;
    }

    public Integer getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}