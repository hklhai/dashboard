package com.hxqh.dashboard.model.assist;

/**
 * Created by Ocean lin on 2018/10/16.
 *
 * @author Ocean lin
 */
public class ShowDto extends Location {

    private String visualizename;
    private String xname;
    private String yname;

    private String showKey;
    private String showValue;

    private Integer x;
    private Integer y;
    private Integer h;
    private Integer w;

    private String type;
    private Integer vid;

    private Integer did;

    public ShowDto() {
    }

    public ShowDto(String visualizename, String xname, String yname, String showKey, String showValue, String type, Integer vid, Integer bid, Integer did) {
        this.visualizename = visualizename;
        this.xname = xname;
        this.yname = yname;
        this.showKey = showKey;
        this.showValue = showValue;
        this.type = type;
        this.vid = vid;
        this.did = did;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
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

    public String getShowKey() {
        return showKey;
    }

    public void setShowKey(String showKey) {
        this.showKey = showKey;
    }

    public String getShowValue() {
        return showValue;
    }

    public void setShowValue(String showValue) {
        this.showValue = showValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }
}
