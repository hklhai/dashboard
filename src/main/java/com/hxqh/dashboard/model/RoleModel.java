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
@Table(name = "tb_rolemodel")
public class RoleModel implements Serializable {

    private static final long serialVersionUID = 5091514811807859218L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rolemodelid;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "MODELID")
    private Model model;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ROLEID")
    private Role role;

    public RoleModel() {
    }

    public RoleModel(Model model, Role role) {
        this.model = model;
        this.role = role;
    }

    public Integer getRolemodelid() {
        return this.rolemodelid;
    }

    public void setRolemodelid(Integer rolemodelid) {
        this.rolemodelid = rolemodelid;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RoleModel{");
        sb.append("rolemodelid=").append(rolemodelid);
        sb.append(", model=").append(model);
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }
}