package com.hxqh.dashboard.model.view;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.IOException;
import java.util.List;

/**
 * Created by Ocean lin on 2018/10/24.
 *
 * @author Ocean lin
 */

@Entity
@Table(name = "v_user_model")
public class ViewUserModel extends JsonDeserializer<List> {

    @Id
    private Integer usermodeluid;
    private Integer rolemodelid;
    private Integer userroleid;
    private Integer userid;
    private String name;
    private Integer modelid;
    private String modelname;
    private String modeldesc;

    private Integer parentid;

    private Integer bid;

    @Transient
    private List<ViewUserModel> viewUserModelList;

    public ViewUserModel() {
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public List<ViewUserModel> getViewUserModelList() {
        return viewUserModelList;
    }

    @JsonDeserialize(using = ViewUserModel.class, as = List.class, contentAs = String.class)
    public void setViewUserModelList(List<ViewUserModel> viewUserModelList) {
        this.viewUserModelList = viewUserModelList;
    }

    public Integer getUsermodeluid() {
        return usermodeluid;
    }

    public void setUsermodeluid(Integer usermodeluid) {
        this.usermodeluid = usermodeluid;
    }

    public Integer getRolemodelid() {
        return rolemodelid;
    }

    public void setRolemodelid(Integer rolemodelid) {
        this.rolemodelid = rolemodelid;
    }

    public Integer getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getModeldesc() {
        return modeldesc;
    }

    public void setModeldesc(String modeldesc) {
        this.modeldesc = modeldesc;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Override
    public List deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Object value = jsonParser.readValueAs(Object.class);
        if (value instanceof List) {
            return (List) value;
        } else {
            return null;
        }
    }
}
