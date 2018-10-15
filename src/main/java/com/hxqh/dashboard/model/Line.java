package com.hxqh.dashboard.model;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_line_001")
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;
    private String key;
    private Double value;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
