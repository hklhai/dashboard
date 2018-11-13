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
    String ADDFAILHASHALREADY = "Already exists!";

    String DELETESUCCESS = "Delete Success!";
    String DELETEFAIL = "Delete Fail!";
    String EDITSUCCESS = "Edit Success!";
    String EDITFAIL = "Edit Fail!";

    String USERNAME_PASSWORD_INCORRECT = "Incorrect username or password";

    Integer EXCEL_EXPORT_SIZE = 100;

    String TABLEPREFIX = "Tables_in_";
    String COLOUMN_PREFIX = "SHOW FULL COLUMNS FROM ";
    String SHOW_TAB_SQL = "SHOW tables";
    String TABLE_COLUMN_NAME = "Field";
    String TABLE_COLUMN_TYPE = "Type";

}
