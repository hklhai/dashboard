package com.hxqh.dashboard.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@Entity
@Table(name = "tb_tablemanager")
public class TableManager implements Serializable {

    private static final long serialVersionUID = 4635704323927929218L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tid;
    private String tablecategory;
    private Integer tablemaxid;
    private String  tableprefix;

    public TableManager() {
    }

    public String getTableprefix() {
        return tableprefix;
    }

    public void setTableprefix(String tableprefix) {
        this.tableprefix = tableprefix;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTablecategory() {
        return tablecategory;
    }

    public void setTablecategory(String tablecategory) {
        this.tablecategory = tablecategory;
    }

    public Integer getTablemaxid() {
        return tablemaxid;
    }

    public void setTablemaxid(Integer tablemaxid) {
        this.tablemaxid = tablemaxid;
    }
}
