package com.hxqh.dashboard.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
@Entity
@Table(name = "tb_rolemodel")
public class TbRolemodel implements Serializable {
    private static final long serialVersionUID = 514934059612730438L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rolemodelid;

    @ManyToOne
    @JoinColumn(name = "MODELID")
    private TbModel tbModel;

    @ManyToOne
    @JoinColumn(name = "ROLEID")
    private TbRole tbRole;

    public TbRolemodel() {
    }

    public TbRolemodel(TbModel tbModel, TbRole tbRole) {
        this.tbModel = tbModel;
        this.tbRole = tbRole;
    }

    public Integer getRolemodelid() {
        return this.rolemodelid;
    }

    public void setRolemodelid(Integer rolemodelid) {
        this.rolemodelid = rolemodelid;
    }

    public TbModel getTbModel() {
        return tbModel;
    }

    public void setTbModel(TbModel tbModel) {
        this.tbModel = tbModel;
    }

    public TbRole getTbRole() {
        return tbRole;
    }

    public void setTbRole(TbRole tbRole) {
        this.tbRole = tbRole;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TbRolemodel{");
        sb.append("rolemodelid=").append(rolemodelid);
        sb.append(", tbModel=").append(tbModel);
        sb.append(", tbRole=").append(tbRole);
        sb.append('}');
        return sb.toString();
    }
}