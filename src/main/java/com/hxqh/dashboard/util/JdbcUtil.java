package com.hxqh.dashboard.util;


import java.sql.*;

/**
 * Created by Ocean lin on 2018/11/13.
 *
 * @author Ocean lin
 */
public class JdbcUtil {

    public static Connection conn = null;

    public static Connection getConnection(String URL,String USER,String PASSWORD,String DRIVERNAME) throws Exception {
        if (conn != null) {
            return conn;
        }
        Class.forName(DRIVERNAME);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);

        return conn;
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