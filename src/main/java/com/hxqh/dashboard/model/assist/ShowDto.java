package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.ColumnMap;
import com.hxqh.dashboard.model.OrientY;

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
    private List<List<Object>> showValue;
    private List<String> showLabel;
    private List<ColumnMap> columnList;
    private List<OrientY> orientYList;

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

    private String background;
    private String echartTitPos;
    private String echartTitColor;


    private String xName;
    private String xAxisLabel;
    private Boolean xAxisLine;
    private Boolean xSplitLine;
    private Boolean xInverse;
    private Boolean alignWithLabel;
    private Boolean xToy;
    private Boolean dataZoom;

    private String yAxisLabel;
    private Boolean yAxisLine;
    private Boolean ySplitLine;
    private Boolean yInverse;

    public ShowDto() {
    }

    public List<OrientY> getOrientYList() {
        return orientYList;
    }

    public void setOrientYList(List<OrientY> orientYList) {
        this.orientYList = orientYList;
    }

    public List<ColumnMap> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<ColumnMap> columnList) {
        this.columnList = columnList;
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

    public String getxName() {
        return xName;
    }

    public void setxName(String xName) {
        this.xName = xName;
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

    public List<String> getShowLabel() {
        return showLabel;
    }

    public void setShowLabel(List<String> showLabel) {
        this.showLabel = showLabel;
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

    public List<List<Object>> getShowValue() {
        return showValue;
    }

    public void setShowValue(List<List<Object>> showValue) {
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
