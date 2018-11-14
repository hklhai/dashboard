package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.Visualize;

import java.util.List;

/**
 * Created by Ocean lin on 2018/11/14.
 *
 * @author Ocean lin
 */
public class VisualDto
{
    private Visualize visualize;
    private List<ColumnDto> columnList;

    public VisualDto() {
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
