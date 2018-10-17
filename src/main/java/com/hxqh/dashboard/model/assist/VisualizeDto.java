package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.Visualize;
import com.hxqh.dashboard.model.base.PageDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/17.
 *
 * @author Ocean lin
 */
public class VisualizeDto extends PageDto {

    private List<Visualize> visualizeList;

    public VisualizeDto(Pageable page, Integer totalPages, List<Visualize> visualizeList) {
        super(page, totalPages);
        this.visualizeList = visualizeList;
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
}
