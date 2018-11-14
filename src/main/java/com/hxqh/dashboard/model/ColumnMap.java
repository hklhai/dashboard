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
    private Integer columnmapid;

    @ManyToOne
    @JoinColumn(name = "VID")
    private Visualize visualize;

    private String columnname;
    private String columntype;
    private String columnshow;


    public ColumnMap() {
    }


    public Integer getColumnmapid() {
        return columnmapid;
    }

    public void setColumnmapid(Integer columnmapid) {
        this.columnmapid = columnmapid;
    }

    public Visualize getVisualize() {
        return visualize;
    }

    public void setVisualize(Visualize visualize) {
        this.visualize = visualize;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public String getColumntype() {
        return columntype;
    }

    public void setColumntype(String columntype) {
        this.columntype = columntype;
    }

    public String getColumnshow() {
        return columnshow;
    }

    public void setColumnshow(String columnshow) {
        this.columnshow = columnshow;
    }
}
