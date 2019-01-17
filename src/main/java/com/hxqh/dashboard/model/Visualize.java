package com.hxqh.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private String ytype;

    private String echarttitle;
    @Column(name = "legend_show", columnDefinition = "bool default false")
    private Boolean legendShow;
    private String legendPos;
    private String legendOrient;
    @Column(name = "tooltip_show", columnDefinition = "bool default false")
    private Boolean tooltipShow;

    private String background;
    private String echartTitPos;
    private String echartTitColor;

    @OneToMany(mappedBy = "visualize", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DashboardVisualize> dashboardVisualizes;

    @OneToMany(mappedBy = "visualize", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<ColumnMap> columnMapList;

    @OneToMany(mappedBy = "visualize", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<OrientY> orientYList;

    @OneToMany(mappedBy = "visualize", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<OrientX> orientXList;

    @OneToMany(mappedBy = "visualize", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<ValueColorMap> valueColorMapList;

    @Transient
    private Integer bid;

    private String sourcetablename;
    private Integer columnsnumber;
    private Integer dbid;


    private String xAxisLabel;
    @Column(name = "xaxisline", columnDefinition = "bool default true")
    private Boolean xAxisLine;
    @Column(name = "xsplitline", columnDefinition = "bool default true")
    private Boolean xSplitLine;
    @Column(name = "xinverse", columnDefinition = "bool default false")
    private Boolean xInverse;
    @Column(name = "alignwithlabel", columnDefinition = "bool default false")
    private Boolean alignWithLabel;
    @Column(name = "xtoy", columnDefinition = "bool default false")
    private Boolean xToy;
    @Column(name = "datazoom", columnDefinition = "bool default false")
    private Boolean dataZoom;

    private String yAxisLabel;
    @Column(name = "yaxisline", columnDefinition = "bool default true")
    private Boolean yAxisLine;
    @Column(name = "ysplitline", columnDefinition = "bool default true")
    private Boolean ySplitLine;
    @Column(name = "yinverse", columnDefinition = "bool default false")
    private Boolean yInverse;

    private Integer max;
    private Integer min;
    private String outOfRangeColor;
    private String controllerColor;
    private String subTit;

    private String ylineColor;
    private String ynameColor;
    private String yaxisLabelPos;

    private String xlineColor;
    private String xnameColor;
    private String xaxisLabelPos;

    @Column(name = "xboundarygap", columnDefinition = "bool default false")
    private Boolean xBoundaryGap;

    private String xstart;
    private String xend;
    private String ystart;
    private String yend;

    private String legendType;
    private String legendSelData;

    private String vwhere;
    private String vwheredesc;
    private String prefixwhere;
    private String suffixwhere;


    public Visualize() {
    }

    public List<ValueColorMap> getValueColorMapList() {
        return valueColorMapList;
    }

    public void setValueColorMapList(List<ValueColorMap> valueColorMapList) {
        this.valueColorMapList = valueColorMapList;
    }

    public String getVwhere() {
        return vwhere;
    }

    public void setVwhere(String vwhere) {
        this.vwhere = vwhere;
    }

    public String getVwheredesc() {
        return vwheredesc;
    }

    public void setVwheredesc(String vwheredesc) {
        this.vwheredesc = vwheredesc;
    }

    public String getPrefixwhere() {
        return prefixwhere;
    }

    public void setPrefixwhere(String prefixwhere) {
        this.prefixwhere = prefixwhere;
    }

    public String getSuffixwhere() {
        return suffixwhere;
    }

    public void setSuffixwhere(String suffixwhere) {
        this.suffixwhere = suffixwhere;
    }

    public String getLegendType() {
        return legendType;
    }

    public void setLegendType(String legendType) {
        this.legendType = legendType;
    }

    public String getLegendSelData() {
        return legendSelData;
    }

    public void setLegendSelData(String legendSelData) {
        this.legendSelData = legendSelData;
    }

    public String getXstart() {
        return xstart;
    }

    public void setXstart(String xstart) {
        this.xstart = xstart;
    }

    public String getXend() {
        return xend;
    }

    public void setXend(String xend) {
        this.xend = xend;
    }

    public String getYstart() {
        return ystart;
    }

    public void setYstart(String ystart) {
        this.ystart = ystart;
    }

    public String getYend() {
        return yend;
    }

    public void setYend(String yend) {
        this.yend = yend;
    }

    public Boolean getxBoundaryGap() {
        return xBoundaryGap;
    }

    public void setxBoundaryGap(Boolean xBoundaryGap) {
        this.xBoundaryGap = xBoundaryGap;
    }

    public List<OrientX> getOrientXList() {
        return orientXList;
    }

    public void setOrientXList(List<OrientX> orientXList) {
        this.orientXList = orientXList;
    }

    public String getYlineColor() {
        return ylineColor;
    }

    public void setYlineColor(String ylineColor) {
        this.ylineColor = ylineColor;
    }

    public String getYnameColor() {
        return ynameColor;
    }

    public void setYnameColor(String ynameColor) {
        this.ynameColor = ynameColor;
    }

    public String getYaxisLabelPos() {
        return yaxisLabelPos;
    }

    public void setYaxisLabelPos(String yaxisLabelPos) {
        this.yaxisLabelPos = yaxisLabelPos;
    }

    public String getXlineColor() {
        return xlineColor;
    }

    public void setXlineColor(String xlineColor) {
        this.xlineColor = xlineColor;
    }

    public String getXnameColor() {
        return xnameColor;
    }

    public void setXnameColor(String xnameColor) {
        this.xnameColor = xnameColor;
    }

    public String getXaxisLabelPos() {
        return xaxisLabelPos;
    }

    public void setXaxisLabelPos(String xaxisLabelPos) {
        this.xaxisLabelPos = xaxisLabelPos;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public String getOutOfRangeColor() {
        return outOfRangeColor;
    }

    public void setOutOfRangeColor(String outOfRangeColor) {
        this.outOfRangeColor = outOfRangeColor;
    }

    public String getControllerColor() {
        return controllerColor;
    }

    public void setControllerColor(String controllerColor) {
        this.controllerColor = controllerColor;
    }

    public String getSubTit() {
        return subTit;
    }

    public void setSubTit(String subTit) {
        this.subTit = subTit;
    }

    public List<OrientY> getOrientYList() {
        return orientYList;
    }

    public void setOrientYList(List<OrientY> orientYList) {
        this.orientYList = orientYList;
    }

    public String getyAxisLabel() {
        return yAxisLabel;
    }

    public void setyAxisLabel(String yAxisLabel) {
        this.yAxisLabel = yAxisLabel;
    }

    public Boolean getyAxisLine() {
        return yAxisLine;
    }

    public void setyAxisLine(Boolean yAxisLine) {
        this.yAxisLine = yAxisLine;
    }

    public Boolean getySplitLine() {
        return ySplitLine;
    }

    public void setySplitLine(Boolean ySplitLine) {
        this.ySplitLine = ySplitLine;
    }

    public Boolean getyInverse() {
        return yInverse;
    }

    public void setyInverse(Boolean yInverse) {
        this.yInverse = yInverse;
    }

    public Boolean getxToy() {
        return xToy;
    }

    public void setxToy(Boolean xToy) {
        this.xToy = xToy;
    }

    public Boolean getDataZoom() {
        return dataZoom;
    }

    public void setDataZoom(Boolean dataZoom) {
        this.dataZoom = dataZoom;
    }

    public String getxAxisLabel() {
        return xAxisLabel;
    }

    public void setxAxisLabel(String xAxisLabel) {
        this.xAxisLabel = xAxisLabel;
    }

    public Boolean getxAxisLine() {
        return xAxisLine;
    }

    public void setxAxisLine(Boolean xAxisLine) {
        this.xAxisLine = xAxisLine;
    }

    public Boolean getxSplitLine() {
        return xSplitLine;
    }

    public void setxSplitLine(Boolean xSplitLine) {
        this.xSplitLine = xSplitLine;
    }

    public Boolean getxInverse() {
        return xInverse;
    }

    public void setxInverse(Boolean xInverse) {
        this.xInverse = xInverse;
    }

    public Boolean getAlignWithLabel() {
        return alignWithLabel;
    }

    public void setAlignWithLabel(Boolean alignWithLabel) {
        this.alignWithLabel = alignWithLabel;
    }

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public List<ColumnMap> getColumnMapList() {
        return columnMapList;
    }

    public void setColumnMapList(List<ColumnMap> columnMapList) {
        this.columnMapList = columnMapList;
    }

    public Integer getColumnsnumber() {
        return columnsnumber;
    }

    public void setColumnsnumber(Integer columnsnumber) {
        this.columnsnumber = columnsnumber;
    }

    public String getSourcetablename() {
        return sourcetablename;
    }

    public void setSourcetablename(String sourcetablename) {
        this.sourcetablename = sourcetablename;
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

    public List<DashboardVisualize> getDashboardVisualizes() {
        return dashboardVisualizes;
    }

    public void setDashboardVisualizes(List<DashboardVisualize> dashboardVisualizes) {
        this.dashboardVisualizes = dashboardVisualizes;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
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
}
