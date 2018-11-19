package com.hxqh.dashboard.model;

import javax.persistence.*;

/**
 * @author Lin
 */

@Entity
@Table(name = "tb_columnmap")
public class ColumnMap {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer columnmid;

    @ManyToOne
    @JoinColumn(name = "VID", referencedColumnName = "vid")
    private Visualize visualize;

    private String field;
    private String type;
    private String columnshow;

    @Transient
    private Integer vid;

    private String colColor;
    private String colLabel;
    private String colLabelPos;
    @Column(name = "col_max", columnDefinition = "bool default false")
    private Boolean colMax;
    @Column(name = "col_min", columnDefinition = "bool default false")
    private Boolean colMin;
    private Integer colYIndex;
    private String colWidth;
    private String colStack;
    private String colName;

    private String colType;
    @Column(name = "col_average", columnDefinition = "bool default false")
    private Boolean colAverage;

    // todo 字段类型确认
//    @Column(name = "col_gradient", columnDefinition = "bool default false")
//    private Boolean  colGradient;
//    private String  colStartColor;
//    private String colEndColor;
//    private String colLabelRotate;


    public ColumnMap() {
    }

    public String getColType() {
        return colType;
    }

    public void setColType(String colType) {
        this.colType = colType;
    }

    public Boolean getColAverage() {
        return colAverage;
    }

    public void setColAverage(Boolean colAverage) {
        this.colAverage = colAverage;
    }

    public String getColColor() {
        return colColor;
    }

    public void setColColor(String colColor) {
        this.colColor = colColor;
    }

    public String getColLabel() {
        return colLabel;
    }

    public void setColLabel(String colLabel) {
        this.colLabel = colLabel;
    }

    public String getColLabelPos() {
        return colLabelPos;
    }

    public void setColLabelPos(String colLabelPos) {
        this.colLabelPos = colLabelPos;
    }

    public Boolean getColMax() {
        return colMax;
    }

    public void setColMax(Boolean colMax) {
        this.colMax = colMax;
    }

    public Boolean getColMin() {
        return colMin;
    }

    public void setColMin(Boolean colMin) {
        this.colMin = colMin;
    }

    public Integer getColYIndex() {
        return colYIndex;
    }

    public void setColYIndex(Integer colYIndex) {
        this.colYIndex = colYIndex;
    }

    public String getColWidth() {
        return colWidth;
    }

    public void setColWidth(String colWidth) {
        this.colWidth = colWidth;
    }

    public String getColStack() {
        return colStack;
    }

    public void setColStack(String colStack) {
        this.colStack = colStack;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getColumnmid() {
        return columnmid;
    }

    public void setColumnmid(Integer columnmid) {
        this.columnmid = columnmid;
    }

    public Visualize getVisualize() {
        return visualize;
    }

    public void setVisualize(Visualize visualize) {
        this.visualize = visualize;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColumnshow() {
        return columnshow;
    }

    public void setColumnshow(String columnshow) {
        this.columnshow = columnshow;
    }
}
