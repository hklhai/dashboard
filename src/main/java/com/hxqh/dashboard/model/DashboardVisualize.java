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

    private Integer x;
    private Integer y;
    private Integer h;
    private Integer w;

    public DashboardVisualize() {
    }

    public DashboardVisualize(Dashboard dashboard, Visualize visualize, Integer x, Integer y, Integer h, Integer w) {
        this.dashboard = dashboard;
        this.visualize = visualize;
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
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

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }
}
