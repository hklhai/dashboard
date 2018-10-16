package com.hxqh.dashboard.model;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_line_double")
public class LineDouble {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;
    private String showkey;
    private Double showvalue;

    public LineDouble() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getShowkey() {
        return showkey;
    }

    public void setShowkey(String showkey) {
        this.showkey = showkey;
    }

    public Double getShowvalue() {
        return showvalue;
    }

    public void setShowvalue(Double showvalue) {
        this.showvalue = showvalue;
    }
}
