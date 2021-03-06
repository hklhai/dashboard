package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.base.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/17.
 *
 * @author Ocean lin
 */
public class VisualizeDto extends Page {

    private List<Visualize> visualizeList;
    private List<String> distinctBusinesscategory;
    private List<Integer> hasBindList;

    public VisualizeDto(List<Visualize> visualizeList, List<String> distinctBusinesscategory) {
        this.visualizeList = visualizeList;
        this.distinctBusinesscategory = distinctBusinesscategory;
    }

    public VisualizeDto(Pageable page, Integer totalPages, Long total, List<Visualize> visualizeList, List<String> distinctBusinesscategory) {
        super(page, totalPages, total);
        this.visualizeList = visualizeList;
        this.distinctBusinesscategory = distinctBusinesscategory;
    }

    @Override
    public Pageable getPage() {
        return super.getPage();
    }

    @Override
    public void setPage(Pageable page) {
        super.setPage(page);
    }

    @Override
    public Integer getTotalPages() {
        return super.getTotalPages();
    }

    @Override
    public void setTotalPages(Integer totalPages) {
        super.setTotalPages(totalPages);
    }

    public List<Visualize> getVisualizeList() {
        return visualizeList;
    }

    public void setVisualizeList(List<Visualize> visualizeList) {
        this.visualizeList = visualizeList;
    }

    public List<String> getDistinctBusinesscategory() {
        return distinctBusinesscategory;
    }

    public void setDistinctBusinesscategory(List<String> distinctBusinesscategory) {
        this.distinctBusinesscategory = distinctBusinesscategory;
    }

    public List<Integer> getHasBindList() {
        return hasBindList;
    }

    public void setHasBindList(List<Integer> hasBindList) {
        this.hasBindList = hasBindList;
    }
}
