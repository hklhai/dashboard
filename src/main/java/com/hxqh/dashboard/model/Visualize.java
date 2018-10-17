package com.hxqh.dashboard.model;

import com.thoughtworks.xstream.annotations.XStreamOmitField;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Ocean lin on 2018/10/12.
 *
 * @author Ocean lin
 */
@Entity
@Table(name = "tb_visualize")
public class Visualize implements Serializable {
    private static final long serialVersionUID = -4397501842663081746L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vid;
    private String visualizename;
    private String tablename;

    private String visualizedescription;
    private String visualizeshowname;
    private String type;
    private String businesscategory;
    private String xname;
    private String yname;
    private Integer bid;
    private String ytype;

    @OneToMany(mappedBy = "visualize")
    @XStreamOmitField
    private List<DashboardVisualize> dashboardVisualizes;

    public Visualize() {
    }

    public List<DashboardVisualize> getDashboardVisualizes() {
        return dashboardVisualizes;
    }

    public void setDashboardVisualizes(List<DashboardVisualize> dashboardVisualizes) {
        this.dashboardVisualizes = dashboardVisualizes;
    }

    public String getYtype() {
        return ytype;
    }

    public void setYtype(String ytype) {
        this.ytype = ytype;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVisualizename() {
        return visualizename;
    }

    public void setVisualizename(String visualizename) {
        this.visualizename = visualizename;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getVisualizedescription() {
        return visualizedescription;
    }

    public void setVisualizedescription(String visualizedescription) {
        this.visualizedescription = visualizedescription;
    }

    public String getVisualizeshowname() {
        return visualizeshowname;
    }

    public void setVisualizeshowname(String visualizeshowname) {
        this.visualizeshowname = visualizeshowname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBusinesscategory() {
        return businesscategory;
    }

    public void setBusinesscategory(String businesscategory) {
        this.businesscategory = businesscategory;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
    }

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }
}