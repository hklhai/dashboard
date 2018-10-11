package com.hxqh.dashboard.common;

/**
 * Created by Ocean lin on 2018/1/16.
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
