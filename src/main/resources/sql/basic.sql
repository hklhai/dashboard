# 清库脚本
delete from tb_dashboard_visualize;
delete from tb_dashboard;
delete from tb_visualize;
delete from tb_tablemanager;

INSERT INTO `tb_tablemanager` VALUES (1, 'line', 1, 'ab_line_');
INSERT INTO `tb_tablemanager` VALUES (2, 'pie', 1, 'ab_pie_');
INSERT INTO `tb_tablemanager` VALUES (3, 'bar', 1, 'ab_bar_');

# demo数据库
create database sourcedb default character set utf8;
use sourcedb;

create database dashboard default character set utf8;
use dashboard;

GRANT ALL PRIVILEGES ON *.* TO root @'%' IDENTIFIED BY "mysql";
FLUSH PRIVILEGES;


-- modify
ALTER TABLE `tb_visualize`
ADD COLUMN `vwhere`  varchar(200) NULL AFTER `legend_type`,
ADD COLUMN `vwheredesc`  varchar(150) NULL AFTER `vwhere`,
ADD COLUMN `prefixwhere`  varchar(100) NULL AFTER `vwheredesc`,
ADD COLUMN `suffixwhere`  varchar(100) NULL AFTER `prefixwhere`;
