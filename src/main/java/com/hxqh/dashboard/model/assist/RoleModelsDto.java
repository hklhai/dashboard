package com.hxqh.dashboard.model.assist;

import java.util.List;

/**
 * Created by Ocean lin on 2018/10/23.
 *
 * @author Ocean lin
 */
public class RoleModelsDto {

    private Integer roleid;

    private List<RoleModelModelDto> modelDtoList;

    private List<Integer> deleteList;

    public RoleModelsDto() {
    }

    public RoleModelsDto(Integer roleid, List<RoleModelModelDto> roleModelModelDtos, List<Integer> deleteList) {
        this.roleid = roleid;
        this.modelDtoList = roleModelModelDtos;
        this.deleteList = deleteList;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public List<RoleModelModelDto> getModelDtoList() {
        return modelDtoList;
    }

    public void setModelDtoList(List<RoleModelModelDto> modelDtoList) {
        this.modelDtoList = modelDtoList;
    }

    public List<Integer> getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(List<Integer> deleteList) {
        this.deleteList = deleteList;
    }
}
