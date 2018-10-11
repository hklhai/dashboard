package com.hxqh.dashboard.common;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
public class Account {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public static String encrypt(final String password) {
        return AlgorithmUtils.md5Hex(password == null ? "" : password.trim());
    }

}
