package com.hxqh.dashboard.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Ocean lin on 2018/10/15.
 *
 * @author Ocean lin
 */
//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
public class CreateTableBySQLTest {

    @Resource
    protected SessionFactory sessionFactory;

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
