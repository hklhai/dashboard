package com.hxqh.dashboard.model.assist;

/**
 * Created by Ocean lin on 2018/11/13.
 *
 * @author Ocean lin
 */
public class Column {

    private String field;
    private String  type;

    public Column() {
    }

    public Column(String field, String type) {
        this.field = field;
        this.type = type;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
