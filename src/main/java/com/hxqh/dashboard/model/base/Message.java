package com.hxqh.dashboard.model.base;

import com.hxqh.dashboard.model.view.ViewUserModel;

import java.util.List;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
public class Message {

    private int code;
    private String message;
    private List<ViewUserModel> modelList;

    public Message() {
    }

    public Message(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public List<ViewUserModel> getModelList() {
        return modelList;
    }

    public void setModelList(List<ViewUserModel> modelList) {
        this.modelList = modelList;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
