create database dashboard default character set utf8;

use dashboard;


# 清库脚本
delete * from tb_dashboard_visualize;
delete * from tb_dashboard;
delete * from tb_visualize;

delete * from tb_tablemanager;

INSERT INTO `tb_tablemanager` VALUES ('1', 'line', '1', 'ab_line_');
INSERT INTO `tb_tablemanager` VALUES ('2', 'pie', '1', 'ab_pie_');
INSERT INTO `tb_tablemanager` VALUES ('3', 'bar', '1', 'ab_bar_');
