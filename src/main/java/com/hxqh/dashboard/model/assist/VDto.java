package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.assist.ColumnDto;

import java.util.List;

/**
 * Created by Ocean lin on 2018/11/14.
 *
 * @author Ocean lin
 */
public class VDto
{
    private Visualize visualize;
    private List<ColumnDto> columnList;

    public VDto() {
    }

    public VDto(Visualize visualize, List<ColumnDto> columnList) {
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
