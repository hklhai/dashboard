# Dashboard
Dashboard

[![Build Status](https://travis-ci.org/hklhai/dashboard.svg?branch=master)](https://travis-ci.org/hklhai/dashboard)


![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s1.png)
---
![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s2.png)
---
![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s3.png)
---
![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s4.png)
---
![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s5.gif)
---
![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s6.png)
---
![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s7.png)
---
![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s9.png)
---
![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s9.png)
---
![image](https://github.com/hklhai/dashboard/blob/master/screenshot/s10.png)

### Associated Projects
https://github.com/aym19900825/Dashboard.git

---
> HK  
> linh@bjhxqh.com

> 小豆苗  
> aiym@bjhxqh.com


1. 配置JDK1.8
2. 配置Tomcat采用JDK1.8启动
  set "JAVA_HOME=C:\Program Files\Java\jdk_1.8_121"
3. 设置MySQL参数
  关闭MySQL
  配置文件中增加
  [mysqld]
  max_allowed_packet = 100M
  启动MySQL，登录MySQL 验证show variables like '%max_allowed_pack%'
  
4. 运行 
    demo数据库
    
    create database sourcedb default character set utf8;
    
    create database dashboard default character set utf8;
  

5.  use dashboard;
   运行resource/sql/basic.sql

6. 拷贝Dashboard、DashboardWeb至webapp启动即可

 
