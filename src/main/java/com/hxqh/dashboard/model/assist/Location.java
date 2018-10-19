package com.hxqh.dashboard.model.assist;

/**
 * Created by Ocean lin on 2018/10/19.
 *
 * @author Ocean lin
 */
public class Location {

    private Integer vid;
    private Integer x;
    private Integer y;
    private Integer h;
    private Integer w;
    private Integer did;


    public Location() {
    }

    public Location(Integer vid, Integer x, Integer y, Integer h, Integer w) {
        this.vid = vid;
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
