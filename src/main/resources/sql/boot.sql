create database dashboard default character set utf8;
use dashboard;

DROP TABLE IF EXISTS `tb_columnmap`;
CREATE TABLE `tb_columnmap` (
  `columnmid` int(11) NOT NULL AUTO_INCREMENT,
  `field` varchar(100) DEFAULT NULL,
  `columnshow` varchar(100) DEFAULT '',
  `type` varchar(100) DEFAULT NULL,
  `vid` int(11) DEFAULT NULL,
  `columnname` varchar(100) DEFAULT NULL,
  `columntype` varchar(50) DEFAULT NULL,
  `col_color` varchar(50) DEFAULT NULL,
  `col_label` varchar(50) DEFAULT NULL,
  `col_label_pos` varchar(50) DEFAULT NULL,
  `col_max` tinyint(1) DEFAULT '0',
  `col_min` tinyint(1) DEFAULT '0',
  `col_name` varchar(50) DEFAULT NULL,
  `col_stack` varchar(50) DEFAULT NULL,
  `col_width` varchar(50) DEFAULT NULL,
  `colyindex` int(11) DEFAULT NULL,
  `col_average` tinyint(1) DEFAULT '0',
  `col_type` varchar(50) DEFAULT NULL,
  `col_end_color` varchar(50) DEFAULT NULL,
  `col_gradient` tinyint(1) DEFAULT '0',
  `col_label_rotate` varchar(50) DEFAULT NULL,
  `col_start_color` varchar(50) DEFAULT NULL,
  `col_area_color` varchar(50) DEFAULT NULL,
  `col_area_style` tinyint(1) DEFAULT '0',
  `col_smooth` tinyint(1) DEFAULT '1',
  `col_step` tinyint(1) DEFAULT '0',
  `sampling` varchar(50) DEFAULT NULL,
  `col_label_line_color` varchar(50) DEFAULT NULL,
  `col_label_line` tinyint(1) DEFAULT '0',
  `col_radius` varchar(50) DEFAULT NULL,
  `col_rose_type` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`columnmid`),
  KEY `FKbffiep48qcfosj6902qx0q2wx` (`vid`),
  CONSTRAINT `FKbffiep48qcfosj6902qx0q2wx` FOREIGN KEY (`vid`) REFERENCES `tb_visualize` (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=261 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_dashboard
-- ----------------------------
DROP TABLE IF EXISTS `tb_dashboard`;
CREATE TABLE `tb_dashboard` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `businesscategory` varchar(50) DEFAULT NULL,
  `dashboarddescription` varchar(250) DEFAULT NULL,
  `dashboardname` varchar(100) DEFAULT NULL,
  `dashboardshowname` varchar(100) DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `refresh` int(6) DEFAULT '0',
  PRIMARY KEY (`bid`),
  UNIQUE KEY `IDX_dashboardname` (`dashboardname`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_dashboard_visualize
-- ----------------------------
DROP TABLE IF EXISTS `tb_dashboard_visualize`;
CREATE TABLE `tb_dashboard_visualize` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `bid` int(11) DEFAULT NULL,
  `vid` int(11) DEFAULT NULL,
  `h` int(11) DEFAULT NULL,
  `w` int(11) DEFAULT NULL,
  `x` int(11) DEFAULT NULL,
  `y` int(11) DEFAULT NULL,
  `echarttitle` varchar(100) DEFAULT NULL,
  `legend_orient` varchar(100) DEFAULT NULL,
  `legend_pos` varchar(100) DEFAULT NULL,
  `legend_show` tinyint(1) DEFAULT '0',
  `tooltip_show` tinyint(1) DEFAULT '0',
  `xname` varchar(100) DEFAULT NULL,
  `yname` varchar(100) DEFAULT NULL,
  `background` varchar(50) DEFAULT NULL,
  `echart_tit_color` varchar(50) DEFAULT NULL,
  `echart_tit_pos` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`did`),
  KEY `FKs0u7h9oxeym8pakpfyg3fd8i9` (`bid`),
  KEY `FK3006umesaltsyga8yv3wwixda` (`vid`),
  CONSTRAINT `FK3006umesaltsyga8yv3wwixda` FOREIGN KEY (`vid`) REFERENCES `tb_visualize` (`vid`),
  CONSTRAINT `FKs0u7h9oxeym8pakpfyg3fd8i9` FOREIGN KEY (`bid`) REFERENCES `tb_dashboard` (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_database
-- ----------------------------
DROP TABLE IF EXISTS `tb_database`;
CREATE TABLE `tb_database` (
  `dbid` int(10) NOT NULL AUTO_INCREMENT,
  `ip` varchar(20) DEFAULT NULL,
  `port` varchar(5) DEFAULT NULL,
  `database` varchar(20) DEFAULT NULL,
  `user` varchar(15) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `drivername` varchar(60) DEFAULT NULL,
  `valid` int(2) DEFAULT '0',
  `datasourcename` varchar(80) DEFAULT NULL,
  `dbtype` varchar(30) DEFAULT NULL,
  `dbstatus` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`dbid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_model
-- ----------------------------
DROP TABLE IF EXISTS `tb_model`;
CREATE TABLE `tb_model` (
  `modelid` int(11) NOT NULL AUTO_INCREMENT,
  `ismdeol` int(11) DEFAULT NULL,
  `isurl` int(11) DEFAULT NULL,
  `modeldesc` varchar(255) DEFAULT NULL,
  `modelname` varchar(255) DEFAULT NULL,
  `modelstatus` int(3) DEFAULT NULL,
  `murl` varchar(255) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `sortnum` int(6) DEFAULT NULL,
  `bid` int(11) DEFAULT NULL,
  PRIMARY KEY (`modelid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_orientx
-- ----------------------------
DROP TABLE IF EXISTS `tb_orientx`;
CREATE TABLE `tb_orientx` (
  `orientxid` int(11) NOT NULL AUTO_INCREMENT,
  `x_axis_label` varchar(50) DEFAULT NULL,
  `xaxisline` tinyint(1) DEFAULT '1',
  `xinverse` tinyint(1) DEFAULT '0',
  `xsplitline` tinyint(1) DEFAULT '1',
  `xaxis_label_pos` varchar(50) DEFAULT NULL,
  `xline_color` varchar(50) DEFAULT NULL,
  `xname` varchar(50) DEFAULT NULL,
  `xname_color` varchar(50) DEFAULT NULL,
  `vid` int(11) DEFAULT NULL,
  PRIMARY KEY (`orientxid`),
  KEY `FKp5co8naog2rtwwktm4k93nggb` (`vid`),
  CONSTRAINT `FKp5co8naog2rtwwktm4k93nggb` FOREIGN KEY (`vid`) REFERENCES `tb_visualize` (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_orienty
-- ----------------------------
DROP TABLE IF EXISTS `tb_orienty`;
CREATE TABLE `tb_orienty` (
  `orientyid` int(11) NOT NULL AUTO_INCREMENT,
  `y_axis_label` varchar(50) DEFAULT NULL,
  `yaxisline` tinyint(1) DEFAULT '1',
  `yinverse` tinyint(1) DEFAULT '0',
  `ysplitline` tinyint(1) DEFAULT '1',
  `yname` varchar(50) DEFAULT NULL,
  `vid` int(11) DEFAULT NULL,
  `yaxis_label_pos` varchar(50) DEFAULT NULL,
  `yline_color` varchar(50) DEFAULT NULL,
  `yname_color` varchar(50) DEFAULT NULL,
  `ytype` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`orientyid`),
  KEY `FK4n37clfwkaehgrwur5u1oo6af` (`vid`),
  CONSTRAINT `FK4n37clfwkaehgrwur5u1oo6af` FOREIGN KEY (`vid`) REFERENCES `tb_visualize` (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role` (
  `roleid` int(11) NOT NULL AUTO_INCREMENT,
  `roledesc` varchar(255) DEFAULT NULL,
  `rolename` varchar(255) DEFAULT NULL,
  `rolestatus` int(11) DEFAULT NULL,
  `sortnum` int(11) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_rolemodel
-- ----------------------------
DROP TABLE IF EXISTS `tb_rolemodel`;
CREATE TABLE `tb_rolemodel` (
  `rolemodelid` int(11) NOT NULL AUTO_INCREMENT,
  `modelid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL,
  PRIMARY KEY (`rolemodelid`),
  KEY `FK7co5jnab1mbgt6ndu4owako1u` (`modelid`),
  KEY `FKhrtbd3wlshwej9tk5awirjqdg` (`roleid`),
  CONSTRAINT `FK7co5jnab1mbgt6ndu4owako1u` FOREIGN KEY (`modelid`) REFERENCES `tb_model` (`modelid`),
  CONSTRAINT `FKhrtbd3wlshwej9tk5awirjqdg` FOREIGN KEY (`roleid`) REFERENCES `tb_role` (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_tablemanager
-- ----------------------------
DROP TABLE IF EXISTS `tb_tablemanager`;
CREATE TABLE `tb_tablemanager` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tablecategory` varchar(10) DEFAULT NULL,
  `tablemaxid` int(5) DEFAULT NULL,
  `tableprefix` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `userid` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `describe` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `userstatus` int(11) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_userrole
-- ----------------------------
DROP TABLE IF EXISTS `tb_userrole`;
CREATE TABLE `tb_userrole` (
  `userroleid` int(11) NOT NULL AUTO_INCREMENT,
  `roleid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`userroleid`),
  KEY `FKsk7136f8vf8p6rvdeus54fax4` (`roleid`),
  KEY `FK7emerf9jq2kwyp8b0656ke75t` (`userid`),
  CONSTRAINT `FK7emerf9jq2kwyp8b0656ke75t` FOREIGN KEY (`userid`) REFERENCES `tb_user` (`userid`),
  CONSTRAINT `FKsk7136f8vf8p6rvdeus54fax4` FOREIGN KEY (`roleid`) REFERENCES `tb_role` (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_visualize
-- ----------------------------
DROP TABLE IF EXISTS `tb_visualize`;
CREATE TABLE `tb_visualize` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `businesscategory` varchar(50) DEFAULT NULL,
  `tablename` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `visualizedescription` varchar(200) DEFAULT NULL,
  `visualizename` varchar(50) DEFAULT NULL,
  `visualizeshowname` varchar(50) DEFAULT NULL,
  `xname` varchar(50) DEFAULT NULL,
  `yname` varchar(50) DEFAULT NULL,
  `ytype` varchar(20) DEFAULT NULL,
  `echarttitle` varchar(50) DEFAULT NULL,
  `legend_orient` varchar(50) DEFAULT NULL,
  `legend_pos` varchar(50) DEFAULT NULL,
  `legend_show` tinyint(1) DEFAULT NULL,
  `tooltip_show` tinyint(1) DEFAULT NULL,
  `background` varchar(50) DEFAULT NULL,
  `echart_tit_color` varchar(50) DEFAULT NULL,
  `echart_tit_pos` varchar(50) DEFAULT NULL,
  `sourcetablename` varchar(60) DEFAULT NULL,
  `columnsnumber` int(2) DEFAULT NULL,
  `dbid` int(10) DEFAULT NULL,
  `alignwithlabel` tinyint(1) DEFAULT '0',
  `datazoom` tinyint(1) DEFAULT '0',
  `x_axis_label` varchar(50) DEFAULT NULL,
  `xaxisline` tinyint(1) DEFAULT '1',
  `xinverse` tinyint(1) DEFAULT '0',
  `xsplitline` tinyint(1) DEFAULT '1',
  `xtoy` tinyint(1) DEFAULT '0',
  `y_axis_label` varchar(50) DEFAULT NULL,
  `yaxisline` tinyint(1) DEFAULT '1',
  `yinverse` tinyint(1) DEFAULT '0',
  `ysplitline` tinyint(1) DEFAULT '1',
  `controller_color` varchar(50) DEFAULT NULL,
  `max` int(11) DEFAULT NULL,
  `min` int(11) DEFAULT NULL,
  `out_of_range_color` varchar(50) DEFAULT NULL,
  `sub_tit` varchar(50) DEFAULT NULL,
  `xaxis_label_pos` varchar(50) DEFAULT NULL,
  `xline_color` varchar(50) DEFAULT NULL,
  `xname_color` varchar(50) DEFAULT NULL,
  `yaxis_label_pos` varchar(50) DEFAULT NULL,
  `yline_color` varchar(50) DEFAULT NULL,
  `yname_color` varchar(50) DEFAULT NULL,
  `xboundarygap` tinyint(1) DEFAULT '0',
  `xend` varchar(50) DEFAULT NULL,
  `xstart` varchar(50) DEFAULT NULL,
  `yend` varchar(50) DEFAULT NULL,
  `ystart` varchar(50) DEFAULT NULL,
  `legend_sel_data` varchar(50) DEFAULT NULL,
  `legend_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`vid`),
  UNIQUE KEY `IDX_visualizename` (`visualizename`),
  UNIQUE KEY `IDX_tablename` (`tablename`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;


INSERT INTO `tb_tablemanager` VALUES (1, 'line', 1, 'ab_line_');
INSERT INTO `tb_tablemanager` VALUES (2, 'pie', 1, 'ab_pie_');
INSERT INTO `tb_tablemanager` VALUES (3, 'bar', 1, 'ab_bar_');


