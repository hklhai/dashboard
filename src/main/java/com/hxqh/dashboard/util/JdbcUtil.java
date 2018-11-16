package com.hxqh.dashboard.util;


import java.sql.*;

/**
 * Created by Ocean lin on 2018/11/13.
 *
 * @author Ocean lin
 */
public class JdbcUtil {

    public static Connection conn = null;

    public static Connection getConnection(String url,String user,String password,String drivername) throws Exception {
        Class.forName(drivername);
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public static void closeConnect(Connection conn) throws SQLException {
        conn.close();
    }

    public static void closeResource(Connection conn, PreparedStatement st) throws SQLException {
        st.close();
        conn.close();
    }

    public static void closeResource(Connection conn, ResultSet rs, PreparedStatement st) throws SQLException {
        st.close();
        rs.close();
        conn.close();
    }
}