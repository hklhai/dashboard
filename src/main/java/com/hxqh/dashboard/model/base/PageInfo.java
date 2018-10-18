package com.hxqh.dashboard.model.base;

/**
 * Created by Ocean lin on 2018/10/18.
 *
 * @author Ocean lin
 */
public class PageInfo {

    private Integer page;
    private Integer size;

    public PageInfo() {
    }

    public PageInfo(Integer page, Integer size) {
        this.page = page;
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
