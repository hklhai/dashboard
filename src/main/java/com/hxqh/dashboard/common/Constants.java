package com.hxqh.dashboard.common;

/**
 * Created by Ocean Lin on 2018/10/11.
 *
 * @author Lin
 */
public interface Constants {

    String OS = System.getProperty("os.name");

    // String CHROMEDRIVER = OS.toLowerCase().startsWith("win") == true ? "E:\\Program\\chromedriver.exe" : "/usr/bin/chromedriver";

    Integer SUCCESS = 1;
    Integer FAIL = 0;

    String ADDSUCCESS = "Add Success!";
    String ADDFAIL = "Add Fail!";


}
