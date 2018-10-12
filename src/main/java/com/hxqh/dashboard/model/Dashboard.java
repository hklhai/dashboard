package com.hxqh.dashboard.model;

/**
 * Created by Ocean lin on 2018/10/12.
 *
 * @author Ocean lin
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_dashboard")
public class Dashboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bid;
    private String dashboardname;
    private String dashboarddescription;
    private String dashboardshowname;
    private String type;
    private String businesscategory;

    public Dashboard() {
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getDashboardname() {
        return dashboardname;
    }

    public void setDashboardname(String dashboardname) {
        this.dashboardname = dashboardname;
    }

    public String getDashboarddescription() {
        return dashboarddescription;
    }

    public void setDashboarddescription(String dashboarddescription) {
        this.dashboarddescription = dashboarddescription;
    }

    public String getDashboardshowname() {
        return dashboardshowname;
    }

    public void setDashboardshowname(String dashboardshowname) {
        this.dashboardshowname = dashboardshowname;
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
}
