package com.hxqh.dashboard.model.assist;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/16.
 *
 * @author Ocean lin
 */
public class ShowDto extends Location {

    private String visualizename;
    private String xname;
    private String yname;

    private List<String> showKey;
    private List<Object> showValue;

    private Integer x;
    private Integer y;
    private Integer h;
    private Integer w;

    private String type;
    private Integer vid;

    private Integer did;

    private String echarttitle;
    private Boolean legendShow;
    private String legendPos;
    private String legendOrient;
    private Boolean tooltipShow;

    public ShowDto() {
    }

    public ShowDto(String visualizename, String xname, String yname, List<String> showKey, List<Object> showValue, String type, Integer vid, Integer bid, Integer did) {
        this.visualizename = visualizename;
        this.xname = xname;
        this.yname = yname;
        this.showKey = showKey;
        this.showValue = showValue;
        this.type = type;
        this.vid = vid;
        this.did = did;
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

    @Override
    public Integer getDid() {
        return did;
    }

    @Override
    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public Integer getX() {
        return x;
    }

    @Override
    public void setX(Integer x) {
        this.x = x;
    }

    @Override
    public Integer getY() {
        return y;
    }

    @Override
    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public Integer getH() {
        return h;
    }

    @Override
    public void setH(Integer h) {
        this.h = h;
    }

    @Override
    public Integer getW() {
        return w;
    }

    @Override
    public void setW(Integer w) {
        this.w = w;
    }

    public String getVisualizename() {
        return visualizename;
    }

    public void setVisualizename(String visualizename) {
        this.visualizename = visualizename;
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

    public List<String> getShowKey() {
        return showKey;
    }

    public void setShowKey(List<String> showKey) {
        this.showKey = showKey;
    }

    public List<Object> getShowValue() {
        return showValue;
    }

    public void setShowValue(List<Object> showValue) {
        this.showValue = showValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Integer getVid() {
        return vid;
    }

    @Override
    public void setVid(Integer vid) {
        this.vid = vid;
    }
}
