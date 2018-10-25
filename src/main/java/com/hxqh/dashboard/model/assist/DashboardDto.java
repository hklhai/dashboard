package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.Dashboard;
import com.hxqh.dashboard.model.base.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/17.
 *
 * @author Ocean lin
 */
public class DashboardDto extends Page {
    private List<Dashboard> visualizeList;
    List<String> distinctBusinesscategory;

    public DashboardDto(List<Dashboard> visualizeList) {
        this.visualizeList = visualizeList;
    }

    public DashboardDto(Pageable page, Integer totalPages, List<Dashboard> visualizeList) {
        super(page, totalPages);
        this.visualizeList = visualizeList;
    }

    public List<String> getDistinctBusinesscategory() {
        return distinctBusinesscategory;
    }

    public void setDistinctBusinesscategory(List<String> distinctBusinesscategory) {
        this.distinctBusinesscategory = distinctBusinesscategory;
    }

    public List<Dashboard> getVisualizeList() {
        return visualizeList;
    }

    public void setVisualizeList(List<Dashboard> visualizeList) {
        this.visualizeList = visualizeList;
    }
}
