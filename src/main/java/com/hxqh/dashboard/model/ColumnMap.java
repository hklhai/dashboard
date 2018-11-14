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

    // todo 增加颜色等

    public ColumnMap() {
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
