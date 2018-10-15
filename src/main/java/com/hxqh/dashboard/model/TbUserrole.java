package com.hxqh.dashboard.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
@Entity
@Table(name = "tb_userrole")
public class TbUserrole implements Serializable {

    private static final long serialVersionUID = 973351636320452908L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userroleid;

    @ManyToOne
    @JoinColumn(name = "ROLEID")
    private TbRole tbRole;

    @ManyToOne
    @JoinColumn(name = "USERID")
    private UserObj tbUser;

    public TbUserrole() {
    }

    public Integer getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }

    public TbRole getTbRole() {
        return tbRole;
    }

    public void setTbRole(TbRole tbRole) {
        this.tbRole = tbRole;
    }

    public UserObj getTbUser() {
        return this.tbUser;
    }

    public void setTbUser(UserObj tbUser) {
        this.tbUser = tbUser;
    }


}