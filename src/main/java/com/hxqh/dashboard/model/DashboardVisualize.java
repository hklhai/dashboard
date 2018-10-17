package com.hxqh.dashboard.model;

import javax.persistence.*;

/**
 * Created by Ocean lin on 2018/10/16.
 *
 * @author Ocean lin
 */
@Entity
@Table(name = "tb_dashboard_visualize")
public class DashboardVisualize {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer did;

    @ManyToOne
    @JoinColumn(name = "BID")
    private Dashboard dashboard;

    @ManyToOne
    @JoinColumn(name = "VID")
    private Visualize visualize;

    public DashboardVisualize() {
    }

    public DashboardVisualize(Dashboard dashboard, Visualize visualize) {
        this.dashboard = dashboard;
        this.visualize = visualize;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public Visualize getVisualize() {
        return visualize;
    }

    public void setVisualize(Visualize visualize) {
        this.visualize = visualize;
    }
}
