package com.hxqh.dashboard.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2018/10/24.
 *
 * @author Ocean lin
 */

@Entity
@Table(name = "tb_modeldashboard")
public class ModelDashboard implements Serializable {

    private static final long serialVersionUID = 4072757330585058958L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer modeldashboardid;

    @ManyToOne
    @JoinColumn(name = "MODELID")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "BID")
    private Dashboard dashboard;

    private Integer visitPath;

    public ModelDashboard() {
    }

    public ModelDashboard(Model model, Dashboard dashboard, Integer visitPath) {
        this.model = model;
        this.dashboard = dashboard;
        this.visitPath = visitPath;
    }

    public Integer getModeldashboardid() {
        return modeldashboardid;
    }

    public void setModeldashboardid(Integer modeldashboardid) {
        this.modeldashboardid = modeldashboardid;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public Integer getVisitPath() {
        return visitPath;
    }

    public void setVisitPath(Integer visitPath) {
        this.visitPath = visitPath;
    }
}
