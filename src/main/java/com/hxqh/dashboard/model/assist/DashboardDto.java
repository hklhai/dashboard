package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.Dashboard;
import com.hxqh.dashboard.model.base.PageDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/17.
 *
 * @author Ocean lin
 */
public class DashboardDto extends PageDto {
    private List<Dashboard> visualizeList;

    public DashboardDto(List<Dashboard> visualizeList) {
        this.visualizeList = visualizeList;
    }

    public DashboardDto(Pageable page, Integer totalPages, List<Dashboard> visualizeList) {
        super(page, totalPages);
        this.visualizeList = visualizeList;
    }

    public List<Dashboard> getVisualizeList() {
        return visualizeList;
    }

    public void setVisualizeList(List<Dashboard> visualizeList) {
        this.visualizeList = visualizeList;
    }
}
