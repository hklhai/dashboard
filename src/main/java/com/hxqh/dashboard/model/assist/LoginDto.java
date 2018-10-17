package com.hxqh.dashboard.model.assist;

import java.io.Serializable;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
public class LoginDto implements Serializable {

    private static final long serialVersionUID = 7577854238762425717L;

    private String name;

    private String password;

    public LoginDto() {
    }

    public LoginDto(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
