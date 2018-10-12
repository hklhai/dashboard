create database dashboard default character set utf8;

use dashboard;

CREATE TABLE `tb_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `tb_user` VALUES ('1', 'xdm', '123456');

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