create database dashboard default character set utf8;

use dashboard;

CREATE TABLE `tb_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `tb_user` VALUES ('1', 'xdm', 'E10ADC3949BA59ABBE56E057F20F883E');

CREATE TABLE `tb_visualize` (
  `vid` int(20) NOT NULL AUTO_INCREMENT,
  `visualizename` varchar(100) DEFAULT NULL,
  `tablename` varchar(100) DEFAULT NULL,
  `visualizedescription` varchar(200) DEFAULT NULL,
  `visualizeshowname` varchar(100) DEFAULT NULL,
  `type` varchar(200) DEFAULT NULL,
  `businesscategory` varchar(200) DEFAULT NULL,
  `xname` varchar(50) DEFAULT NULL,
  `yname` varchar(50) DEFAULT NULL,
  `bid` int(20),
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


CREATE TABLE `tb_dashboard` (
  `bid` int(20) NOT NULL AUTO_INCREMENT,
  `dashboardname` varchar(100) DEFAULT NULL,
  `dashboarddescription` varchar(200) DEFAULT NULL,
  `dashboardshowname` varchar(100) DEFAULT NULL,
  `type` varchar(200) DEFAULT NULL,
  `businesscategory` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

create table  	tb_line_001 	(`sid` int(20) NOT NULL AUTO_INCREMENT,  `key` varchar(20) DEFAULT NULL,  `value` double(10,2) DEFAULT NULL, PRIMARY KEY (`sid`))
