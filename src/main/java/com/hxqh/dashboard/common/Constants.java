package com.hxqh.dashboard.common;

import java.util.HashMap;
import java.util.Map;

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
    String CONNECTION_SUCCESSFUL = "Connection successful!";
    String CONNECTION_FAILED = "connection failed!";
    String FIRST_NOT_VARCHAR = "首列必须为varchar类型";
    String TAIL_MUST_NUMBER = "首列必须为数值类型";


    String ADDSUCCESS = "Add Success!";
    String ADDFAIL = "Add Fail!";
    String ADDFAILHASHALREADY = "Already exists!";

    String SQL_INVALID = "SQL语句不合法！";
    String SQL_VALID = "SQL语句合法！";


    String DELETESUCCESS = "Delete Success!";
    String HASUSED = "仪表板正在使用，请先接解除与仪表板绑定关系！";
    String DELETEFAIL = "Delete Fail!";
    String EDITSUCCESS = "Edit Success!";
    String EDITFAIL = "Edit Fail!";

    String USERNAME_PASSWORD_INCORRECT = "Incorrect username or password";

    Integer EXCEL_EXPORT_SIZE = 100;

    String TABLEPREFIX = "Tables_in_";
    String ORACLE_TABLE_NAME = "TABLE_NAME";
    String COLOUMN_PREFIX = "SHOW FULL COLUMNS FROM ";
    String ORACLE_COLOUMN_PREFIX = "SELECT T1.COLUMN_NAME as field, decode(T1.DATA_TYPE, 'VARCHAR2', T1.DATA_TYPE || '(' || T1.DATA_LENGTH || ')', 'NUMBER', decode(T1.DATA_SCALE, 0, T1.DATA_TYPE || '(' || T1.DATA_PRECISION || ')', T1.DATA_TYPE || '(' || T1.DATA_PRECISION || ',' || T1.DATA_SCALE || ')')) as type FROM USER_TAB_COLS T1 where T1.TABLE_NAME = '";
    String ORACLE_COLOUMN_SUFFIX = "' and T1.COLUMN_NAME not like '%ID'";

    String TABLE_COLUMN_NAME = "Field";
    String TABLE_COLUMN_TYPE = "Type";
    String URL_SUFFIX = "?characterEncoding=utf8&useSSL=false";
    String ORACLE = "oracle";
    String MYSQL = "mysql";
    String JDBC = "jdbc:";
    String TYPE_VARCHAR2 = "VARCHAR2";
    String TYPE_VARCHAR = "varchar";
    String TYPE_NUMBER = "NUMBER";
    String TYPE_DOUBLE = "double";
    String SUFFIX = "' ";
    String UNION = " union all select view_name as  from user_views";
    String TABLE_NAME = " and table_name = ";
    String VIEW_NAME = " where view_name = ";

    String INSERT_SQL = "insert into ";
    String VALUE_SQL = ") values ('";

    String CREATE_TABLE = "create table ";
    String CREATE_TABLE_ID = " (`sid` int(20) NOT NULL AUTO_INCREMENT,";
    String CREATE_TABLE_DEFAULT = " DEFAULT NULL, ";
    String CREATE_TABLE_PRIMARY = " PRIMARY KEY (`sid`))";

    Map<String, String> SHOW_TAB_SQL_MAP = new HashMap<String, String>() {{
        put("oracle", "select table_name  from all_tables where owner='");
        put("mysql", "SHOW tables");
    }};

    String SQL_WHERE = " where 1=1 ";
    String COUNT_SQL = "select count(1) as count from ";
    String SQL_AND = " and 1<>2";
    String AND = " and ";

    String PIE = "pie";
    String LIST = "list";
    String MAP = "map";
    String TEXT = "text";
    String NUMBER = "number";

    String CON_SUCCESS = "连接成功";
    String CON_FAIL = "连接失败";

    String SELECT_SQL = "select * from ";
    String DROP_TABLE_SQL = " drop table ";
    String DOUBLE_TYPE = "value";
    Integer START_NUM = 1;
    Integer END_NUM = 8;
    Integer MAP_END_NUM = 35;

    Map<String, String> dbType = new HashMap<String, String>() {{
        put("oracle", ":thin:@");
        put("mysql", "://");
    }};


    Map<String, String> dbMap = new HashMap<String, String>() {{
        put("mysql", "com.mysql.jdbc.Driver");
        put("oracle", "oracle.jdbc.driver.OracleDriver");
    }};

    Map<Integer, String> dbStatusMap = new HashMap<Integer, String>() {{
        put(0, "连接失败");
        put(1, "连接成功");
    }};


    Map<String, String> typeC2EMap = new HashMap<String, String>() {{
        put("饼图", "pie");
        put("条形图", "bar");
        put("折线图", "line");
        put("中国地图", "map");
        put("列表", "list");
    }};


    Map<String, String> typeE2CMap = new HashMap<String, String>() {{
        put("pie", "饼图");
        put("bar", "条形图");
        put("line", "折线图");
        put("text", "文本");
        put("number", "数值");
        put("map", "中国地图");
        put("list", "列表");
    }};



}
