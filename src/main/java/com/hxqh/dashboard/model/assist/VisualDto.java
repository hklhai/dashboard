package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.ColumnMap;
import com.hxqh.dashboard.model.OrientY;
import com.hxqh.dashboard.model.Visualize;

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

    private List<Integer> columnDeleteList;
    private List<Integer> yDeleteList;


    public VisualDto() {
    }

    public List<OrientY> getyList() {
        return yList;
    }

    public void setyList(List<OrientY> yList) {
        this.yList = yList;
    }

    public List<Integer> getColumnDeleteList() {
        return columnDeleteList;
    }

    public void setColumnDeleteList(List<Integer> columnDeleteList) {
        this.columnDeleteList = columnDeleteList;
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
