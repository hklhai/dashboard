package com.hxqh.dashboard.model.assist;

public class Columns {

    private  String field;
    private String type;

    public Columns() {
    }

    public Columns(String field, String type) {
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
