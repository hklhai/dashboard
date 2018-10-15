package com.hxqh.dashboard.model.assist;

import java.io.Serializable;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
public class IntegerValue implements Serializable {

    private static final long serialVersionUID = 5914172277484650377L;
    private Integer integerId;

    public Integer getIntegerId() {
        return integerId;
    }

    public void setIntegerId(Integer integerId) {
        this.integerId = integerId;
    }
}
