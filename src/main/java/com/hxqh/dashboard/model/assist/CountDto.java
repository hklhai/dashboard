package com.hxqh.dashboard.model.assist;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ocean lin on 2019/1/10.
 *
 * @author Ocean lin
 */
@Entity
public class CountDto {
    @Id
    private Integer count;

    public CountDto() {
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
