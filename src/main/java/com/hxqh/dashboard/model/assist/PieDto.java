package com.hxqh.dashboard.model.assist;

/**
 * Created by Ocean lin on 2018/10/25.
 *
 * @author Ocean lin
 */
public class PieDto {
    private String name;
    private Object value;

    public PieDto() {
    }

    public PieDto(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
