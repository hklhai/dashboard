package com.hxqh.dashboard.model;

/**
 * Created by Ocean lin on 2018/10/16.
 *
 * @author Ocean lin
 */
import javax.persistence.*;

@Entity
@Table(name = "tb_line_float")
public class LineFloat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;
    private String showkey;
    private Float showvalue;

    public LineFloat() {
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

    public Float getShowvalue() {
        return showvalue;
    }

    public void setShowvalue(Float showvalue) {
        this.showvalue = showvalue;
    }
}
