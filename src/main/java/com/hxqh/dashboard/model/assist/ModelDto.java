package com.hxqh.dashboard.model.assist;

import com.hxqh.dashboard.model.Model;
import com.hxqh.dashboard.model.base.Page;
import com.hxqh.dashboard.model.view.ViewRoleModel;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/19.
 *
 * @author Ocean lin
 */
public class ModelDto extends Page {

    private List<Model> modelList;

    private List<ViewRoleModel> hasModelList;

    public ModelDto(List<Model> modelList) {
        this.modelList = modelList;
    }

    public ModelDto(List<Model> modelList, List<ViewRoleModel> hasModelList) {
        this.modelList = modelList;
        this.hasModelList = hasModelList;
    }

    public ModelDto(Pageable page, Integer totalPages, Long total, List<Model> modelList, List<ViewRoleModel> hasModelList) {
        super(page, totalPages, total);
        this.modelList = modelList;
        this.hasModelList = hasModelList;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }

    public List<ViewRoleModel> getHasModelList() {
        return hasModelList;
    }

    public void setHasModelList(List<ViewRoleModel> hasModelList) {
        this.hasModelList = hasModelList;
    }
}
