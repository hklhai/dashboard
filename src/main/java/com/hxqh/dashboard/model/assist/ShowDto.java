package com.hxqh.dashboard.model.assist;

/**
 * Created by Ocean lin on 2018/10/16.
 *
 * @author Ocean lin
 */
public class ShowDto {

    private String visualizename;
    private String xname;
    private String yname;

    private String showKey;
    private String showValue;

    public ShowDto() {
    }

    public ShowDto(String visualizename, String xname, String yname, String showKey, String showValue) {
        this.visualizename = visualizename;
        this.xname = xname;
        this.yname = yname;
        this.showKey = showKey;
        this.showValue = showValue;
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
}
