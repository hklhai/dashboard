package com.hxqh.dashboard.test;

import com.hxqh.dashboard.service.ShowService;
import com.hxqh.dashboard.util.JdbcUtil;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CreateTableBySQLTest {

    @Resource
    protected SessionFactory sessionFactory;
    @Autowired
    private ShowService showService;

    @Test
    public void testSearch() throws Exception {
        //1.获取连接
        Connection conn = JdbcUtil.getConnection(
                "jdbc:mysql://spark4:3306/dashboard", "root", "mysql", "com.mysql.jdbc.Driver"
        );
        // 3.sql语句
//        String tab = "SHOW FULL COLUMNS FROM hk";
        String tab = "SHOW tables";
        // 3.获取SQL执行者
        PreparedStatement st = conn.prepareStatement(tab);
        // 5.执行sql语句
        ResultSet rs = st.executeQuery();
        // 6.处理数据
//        while (rs.next()) {
//            System.out.println(rs.getString("Field") + ":" + rs.getString("Type"));
//        }
        while (rs.next()) {
            System.out.println(rs.getString("Tables_in_dashboard"));
        }
        // 7.释放资源
        JdbcUtil.closeResource(conn, rs, st);
    }


//    @Transactional
//    @Test
//    public void createTable() {
//        String sql = "create table  \ttb_line_011\t(`sid` int(20) NOT NULL AUTO_INCREMENT,  `key` varchar(20) DEFAULT NULL,  `value` double(10,2) DEFAULT NULL, PRIMARY KEY (`sid`))\n";
//        int i = sessionFactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
//        // 0 表示建表成功
//        System.out.println(i);
//    }
//
//
//    @Transactional
//    @Test
//    public void dropTable() {
//        String sql = "drop table  \ttb_line_011\t";
//        int i = sessionFactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
//        // 0 表示删除表成功
//        System.out.println(i);
//    }
}
