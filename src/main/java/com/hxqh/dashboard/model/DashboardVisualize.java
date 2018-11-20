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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BID")
    private Dashboard dashboard;

    @ManyToOne
    @JoinColumn(name = "VID")
    private Visualize visualize;

    private Integer x;
    private Integer y;
    private Integer h;
    private Integer w;

    private String xname;
    private String yname;

    private String echarttitle;
    @Column(name = "legend_show",columnDefinition="bool default false")
    private Boolean legendShow;
    private String legendPos;
    private String legendOrient;
    @Column(name = "tooltip_show",columnDefinition="bool default false")
    private Boolean tooltipShow;

    private String background;
    private String echartTitPos;
    private String echartTitColor;

    public DashboardVisualize() {
    }

    public DashboardVisualize(Dashboard dashboard, Visualize visualize, Integer x, Integer y, Integer h, Integer w, String xname, String yname, String echarttitle, Boolean legendShow, String legendPos, String legendOrient, Boolean tooltipShow) {
        this.dashboard = dashboard;
        this.visualize = visualize;
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.xname = xname;
        this.yname = yname;
        this.echarttitle = echarttitle;
        this.legendShow = legendShow;
        this.legendPos = legendPos;
        this.legendOrient = legendOrient;
        this.tooltipShow = tooltipShow;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getEchartTitPos() {
        return echartTitPos;
    }

    public void setEchartTitPos(String echartTitPos) {
        this.echartTitPos = echartTitPos;
    }

    public String getEchartTitColor() {
        return echartTitColor;
    }

    public void setEchartTitColor(String echartTitColor) {
        this.echartTitColor = echartTitColor;
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

    public String getEcharttitle() {
        return echarttitle;
    }

    public void setEcharttitle(String echarttitle) {
        this.echarttitle = echarttitle;
    }

    public Boolean getLegendShow() {
        return legendShow;
    }

    public void setLegendShow(Boolean legendShow) {
        this.legendShow = legendShow;
    }

    public String getLegendPos() {
        return legendPos;
    }

    public void setLegendPos(String legendPos) {
        this.legendPos = legendPos;
    }

    public String getLegendOrient() {
        return legendOrient;
    }

    public void setLegendOrient(String legendOrient) {
        this.legendOrient = legendOrient;
    }

    public Boolean getTooltipShow() {
        return tooltipShow;
    }

    public void setTooltipShow(Boolean tooltipShow) {
        this.tooltipShow = tooltipShow;
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
