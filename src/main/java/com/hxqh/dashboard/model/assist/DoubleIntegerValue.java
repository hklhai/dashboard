package com.hxqh.dashboard.model.assist;

import java.io.Serializable;

/**
 * Created by Ocean lin on 2018/10/17.
 *
 * @author Ocean lin
 */
public class DoubleIntegerValue  implements Serializable {


    private static final long serialVersionUID = -8660809140651525041L;
    private Integer integerId1;
    private Integer integerId2;

    public DoubleIntegerValue(Integer integerId1, Integer integerId2) {
        this.integerId1 = integerId1;
        this.integerId2 = integerId2;
    }

    public Integer getIntegerId1() {
        return integerId1;
    }

    public void setIntegerId1(Integer integerId1) {
        this.integerId1 = integerId1;
    }

    public Integer getIntegerId2() {
        return integerId2;
    }

    public void setIntegerId2(Integer integerId2) {
        this.integerId2 = integerId2;
    }
}
