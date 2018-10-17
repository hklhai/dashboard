package com.hxqh.dashboard.model.base;

import org.springframework.data.domain.Pageable;

/**
 * Created by Ocean lin on 2018/10/17.
 *
 * @author Ocean lin
 */
public class PageDto {

    private Pageable page;
    private Integer totalPages;

    public PageDto(Pageable page, Integer totalPages) {
        this.page = page;
        this.totalPages = totalPages;
    }

    public Pageable getPage() {
        return page;
    }

    public void setPage(Pageable page) {
        this.page = page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
