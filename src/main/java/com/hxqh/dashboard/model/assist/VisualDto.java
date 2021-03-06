package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.*;

import java.util.List;

/**
 * Created by Ocean lin on 2018/11/14.
 *
 * @author Ocean lin
 */
public class VisualDto {
    private Visualize visualize;
    private List<ColumnDto> columnList;
    private List<ColumnMap> columnMaps;

    private List<OrientY> yList;
    private List<OrientX> xList;

    private List<Integer> deleteColumnList;
    private List<Integer> yDeleteList;
    private List<Integer> xDeleteList;

    private List<ValueColorMap> rangeDesc;
    private List<Integer> colorDeleteList;

    public VisualDto() {
    }

    public List<Integer> getColorDeleteList() {
        return colorDeleteList;
    }

    public void setColorDeleteList(List<Integer> colorDeleteList) {
        this.colorDeleteList = colorDeleteList;
    }

    public List<ValueColorMap> getRangeDesc() {
        return rangeDesc;
    }

    public void setRangeDesc(List<ValueColorMap> rangeDesc) {
        this.rangeDesc = rangeDesc;
    }

    public List<Integer> getxDeleteList() {
        return xDeleteList;
    }

    public void setxDeleteList(List<Integer> xDeleteList) {
        this.xDeleteList = xDeleteList;
    }

    public List<OrientX> getxList() {
        return xList;
    }

    public void setxList(List<OrientX> xList) {
        this.xList = xList;
    }

    public List<OrientY> getyList() {
        return yList;
    }

    public void setyList(List<OrientY> yList) {
        this.yList = yList;
    }

    public List<Integer> getDeleteColumnList() {
        return deleteColumnList;
    }

    public void setDeleteColumnList(List<Integer> deleteColumnList) {
        this.deleteColumnList = deleteColumnList;
    }

    public List<Integer> getyDeleteList() {
        return yDeleteList;
    }

    public void setyDeleteList(List<Integer> yDeleteList) {
        this.yDeleteList = yDeleteList;
    }

    public List<ColumnMap> getColumnMaps() {
        return columnMaps;
    }

    public void setColumnMaps(List<ColumnMap> columnMaps) {
        this.columnMaps = columnMaps;
    }

    public VisualDto(Visualize visualize, List<ColumnDto> columnList) {
        this.visualize = visualize;
        this.columnList = columnList;
    }

    public Visualize getVisualize() {
        return visualize;
    }

    public void setVisualize(Visualize visualize) {
        this.visualize = visualize;
    }

    public List<ColumnDto> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<ColumnDto> columnList) {
        this.columnList = columnList;
    }


}
