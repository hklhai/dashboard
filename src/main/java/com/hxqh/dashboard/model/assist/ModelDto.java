package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.Model;
import com.hxqh.dashboard.model.base.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/19.
 *
 * @author Ocean lin
 */
public class ModelDto extends Page {

    private List<Model> modelList;

    public ModelDto(List<Model> modelList) {
        this.modelList = modelList;
    }

    public ModelDto(Pageable page, Integer totalPages, List<Model> modelList) {
        super(page, totalPages);
        this.modelList = modelList;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }
}
