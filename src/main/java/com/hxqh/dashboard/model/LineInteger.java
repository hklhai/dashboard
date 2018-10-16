package com.hxqh.dashboard.model;

import javax.persistence.*;

/**
 * Created by Ocean lin on 2018/10/16.
 *
 * @author Ocean lin
 */

@Entity
@Table(name = "tb_line_integer")
public class LineInteger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;
    private String showkey;
    private Integer showvalue;

    public LineInteger() {
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

    public Integer getShowvalue() {
        return showvalue;
    }

    public void setShowvalue(Integer showvalue) {
        this.showvalue = showvalue;
    }
}
