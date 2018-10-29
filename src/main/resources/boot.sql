create database dashboard default character set utf8;

use dashboard;


# 清库脚本
delete * from tb_dashboard;
delete * from tb_visualize;
delete * from tb_dashboard_visualize;