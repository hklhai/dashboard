/*
Navicat MySQL Data Transfer

Source Server         : HXQH-spark4-root
Source Server Version : 50722
Source Host           : spark4:3306
Source Database       : dashboard

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-11-15 13:30:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ab_bar_1
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_1`;
CREATE TABLE `ab_bar_1` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` float(7,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_1
-- ----------------------------
INSERT INTO `ab_bar_1` VALUES ('1', '周一', '13.00');
INSERT INTO `ab_bar_1` VALUES ('2', '周二', '61.00');
INSERT INTO `ab_bar_1` VALUES ('3', '周三', '58.00');
INSERT INTO `ab_bar_1` VALUES ('4', '周四', '35.00');
INSERT INTO `ab_bar_1` VALUES ('5', '周五', '29.00');
INSERT INTO `ab_bar_1` VALUES ('6', '周六', '61.00');
INSERT INTO `ab_bar_1` VALUES ('7', '周日', '67.00');

-- ----------------------------
-- Table structure for ab_bar_4
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_4`;
CREATE TABLE `ab_bar_4` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_4
-- ----------------------------
INSERT INTO `ab_bar_4` VALUES ('1', '周一', '257.00', '12.00', '26.00');
INSERT INTO `ab_bar_4` VALUES ('2', '周二', '35.00', '100.00', '6.00');
INSERT INTO `ab_bar_4` VALUES ('3', '周三', '136.00', '204.00', '18.00');
INSERT INTO `ab_bar_4` VALUES ('4', '周四', '73.00', '188.00', '28.00');
INSERT INTO `ab_bar_4` VALUES ('5', '周五', '46.00', '118.00', '13.00');
INSERT INTO `ab_bar_4` VALUES ('6', '周六', '81.00', '166.00', '5.00');
INSERT INTO `ab_bar_4` VALUES ('7', '周日', '132.00', '121.00', '9.00');

-- ----------------------------
-- Table structure for ab_bar_5
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_5`;
CREATE TABLE `ab_bar_5` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  `showvalue4` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_5
-- ----------------------------
INSERT INTO `ab_bar_5` VALUES ('1', '周一', '58.00', '13.00');
INSERT INTO `ab_bar_5` VALUES ('2', '周二', '204.00', '17.00');
INSERT INTO `ab_bar_5` VALUES ('3', '周三', '111.00', '25.00');
INSERT INTO `ab_bar_5` VALUES ('4', '周四', '253.00', '2.00');
INSERT INTO `ab_bar_5` VALUES ('5', '周五', '43.00', '21.00');
INSERT INTO `ab_bar_5` VALUES ('6', '周六', '198.00', '24.00');
INSERT INTO `ab_bar_5` VALUES ('7', '周日', '133.00', '16.00');

-- ----------------------------
-- Table structure for ab_bar_6
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_6`;
CREATE TABLE `ab_bar_6` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  `showvalue4` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_6
-- ----------------------------
INSERT INTO `ab_bar_6` VALUES ('1', '周一', '135.00', '145.00', '213.00', '196.00', '27.00');
INSERT INTO `ab_bar_6` VALUES ('2', '周二', '269.00', '17.00', '209.00', '233.00', '2.00');
INSERT INTO `ab_bar_6` VALUES ('3', '周三', '285.00', '56.00', '239.00', '21.00', '25.00');
INSERT INTO `ab_bar_6` VALUES ('4', '周四', '87.00', '197.00', '156.00', '65.00', '28.00');
INSERT INTO `ab_bar_6` VALUES ('5', '周五', '112.00', '44.00', '214.00', '126.00', '28.00');
INSERT INTO `ab_bar_6` VALUES ('6', '周六', '183.00', '153.00', '166.00', '148.00', '3.00');
INSERT INTO `ab_bar_6` VALUES ('7', '周日', '133.00', '10.00', '174.00', '244.00', '18.00');

-- ----------------------------
-- Table structure for ab_bar_7
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_7`;
CREATE TABLE `ab_bar_7` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  `showvalue4` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_7
-- ----------------------------
INSERT INTO `ab_bar_7` VALUES ('1', '周一', '28.00', '149.00', '72.00', '124.00', '7.00');
INSERT INTO `ab_bar_7` VALUES ('2', '周二', '251.00', '133.00', '138.00', '38.00', '20.00');
INSERT INTO `ab_bar_7` VALUES ('3', '周三', '180.00', '12.00', '164.00', '168.00', '4.00');
INSERT INTO `ab_bar_7` VALUES ('4', '周四', '106.00', '140.00', '237.00', '273.00', '20.00');
INSERT INTO `ab_bar_7` VALUES ('5', '周五', '266.00', '148.00', '122.00', '64.00', '14.00');
INSERT INTO `ab_bar_7` VALUES ('6', '周六', '177.00', '17.00', '25.00', '264.00', '5.00');
INSERT INTO `ab_bar_7` VALUES ('7', '周日', '113.00', '277.00', '276.00', '262.00', '12.00');

-- ----------------------------
-- Table structure for ab_line_1
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_1`;
CREATE TABLE `ab_line_1` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_1
-- ----------------------------
INSERT INTO `ab_line_1` VALUES ('1', '周一', '28.00');
INSERT INTO `ab_line_1` VALUES ('2', '周二', '27.00');
INSERT INTO `ab_line_1` VALUES ('3', '周三', '58.00');
INSERT INTO `ab_line_1` VALUES ('4', '周四', '18.00');
INSERT INTO `ab_line_1` VALUES ('5', '周五', '69.00');
INSERT INTO `ab_line_1` VALUES ('6', '周六', '49.00');
INSERT INTO `ab_line_1` VALUES ('7', '周日', '60.00');

-- ----------------------------
-- Table structure for ab_pie_1
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_1`;
CREATE TABLE `ab_pie_1` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_1
-- ----------------------------
INSERT INTO `ab_pie_1` VALUES ('1', '直接访问', '37.00');
INSERT INTO `ab_pie_1` VALUES ('2', '邮件营销', '23.00');
INSERT INTO `ab_pie_1` VALUES ('3', '联盟广告', '16.00');
INSERT INTO `ab_pie_1` VALUES ('4', '视频广告', '23.00');
INSERT INTO `ab_pie_1` VALUES ('5', '搜索引擎', '48.00');
INSERT INTO `ab_pie_1` VALUES ('6', '简介访问', '51.00');
INSERT INTO `ab_pie_1` VALUES ('7', '抖音广告', '26.00');

-- ----------------------------
-- Table structure for ab_pie_7
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_7`;
CREATE TABLE `ab_pie_7` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_7
-- ----------------------------
INSERT INTO `ab_pie_7` VALUES ('1', '直接访问', '21.00');
INSERT INTO `ab_pie_7` VALUES ('2', '邮件营销', '16.00');
INSERT INTO `ab_pie_7` VALUES ('3', '联盟广告', '38.00');
INSERT INTO `ab_pie_7` VALUES ('4', '视频广告', '42.00');
INSERT INTO `ab_pie_7` VALUES ('5', '搜索引擎', '12.00');
INSERT INTO `ab_pie_7` VALUES ('6', '简介访问', '35.00');
INSERT INTO `ab_pie_7` VALUES ('7', '抖音广告', '47.00');

-- ----------------------------
-- Table structure for tb_columnmap
-- ----------------------------
DROP TABLE IF EXISTS `tb_columnmap`;
CREATE TABLE `tb_columnmap` (
  `columnmid` int(11) NOT NULL AUTO_INCREMENT,
  `field` varchar(100) DEFAULT NULL,
  `columnshow` varchar(100) DEFAULT '',
  `type` varchar(100) DEFAULT NULL,
  `vid` int(11) DEFAULT NULL,
  `columnname` varchar(255) DEFAULT NULL,
  `columntype` varchar(255) DEFAULT NULL,
  `col_color` varchar(255) DEFAULT NULL,
  `col_label` varchar(255) DEFAULT NULL,
  `col_label_pos` varchar(255) DEFAULT NULL,
  `col_max` tinyint(1) DEFAULT '0',
  `col_min` tinyint(1) DEFAULT '0',
  `col_name` varchar(255) DEFAULT NULL,
  `col_stack` varchar(255) DEFAULT NULL,
  `col_width` varchar(255) DEFAULT NULL,
  `colyindex` int(11) DEFAULT NULL,
  `col_average` tinyint(1) DEFAULT '0',
  `col_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`columnmid`),
  KEY `FKbffiep48qcfosj6902qx0q2wx` (`vid`),
  CONSTRAINT `FKbffiep48qcfosj6902qx0q2wx` FOREIGN KEY (`vid`) REFERENCES `tb_visualize` (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=118 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_columnmap
-- ----------------------------
INSERT INTO `tb_columnmap` VALUES ('55', 'showkey', null, 'varchar(20)', '62', null, null, null, null, null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('56', 'showvalue', null, 'double(10,2)', '62', null, null, null, null, null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('57', 'showvalue1', null, 'double(10,2)', '62', null, null, null, null, null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('58', 'showvalue2', null, 'double(10,2)', '62', null, null, null, null, null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('59', 'showkey', null, 'varchar(20)', '63', null, null, null, null, null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('60', 'showvalue3', null, 'double(10,2)', '63', null, null, null, null, null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('61', 'showvalue4', null, 'double(10,2)', '63', null, null, null, null, null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('62', 'showkey', null, 'varchar(20)', '64', null, null, null, null, null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('63', 'showvalue', null, 'double(10,2)', '64', null, null, null, 'true', null, '1', '1', '销量1', null, '30', null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('64', 'showvalue1', null, 'double(10,2)', '64', null, null, null, 'false', null, '0', '0', '销量2', null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('65', 'showvalue2', null, 'double(10,2)', '64', null, null, null, 'false', null, '0', '0', '销量3', null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('66', 'showvalue3', null, 'double(10,2)', '64', null, null, null, 'false', null, '0', '0', '销量4', null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('67', 'showvalue4', null, 'double(10,2)', '64', null, null, null, 'false', null, '0', '0', '销量5', null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('106', 'showkey', null, 'varchar(20)', '72', null, null, null, null, null, null, null, null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('107', 'showvalue', null, 'double(10,2)', '72', null, null, null, null, null, null, null, null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('108', 'showvalue1', null, 'double(10,2)', '72', null, null, null, null, null, null, null, null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('109', 'showvalue2', null, 'double(10,2)', '72', null, null, null, null, null, null, null, null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('110', 'showvalue3', null, 'double(10,2)', '72', null, null, null, null, null, null, null, null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('111', 'showvalue4', null, 'double(10,2)', '72', null, null, null, null, null, null, null, null, null, null, null, '0', null);

-- ----------------------------
-- Table structure for tb_dashboard
-- ----------------------------
DROP TABLE IF EXISTS `tb_dashboard`;
CREATE TABLE `tb_dashboard` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `businesscategory` varchar(255) DEFAULT NULL,
  `dashboarddescription` varchar(255) DEFAULT NULL,
  `dashboardname` varchar(255) DEFAULT NULL,
  `dashboardshowname` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `refresh` int(6) DEFAULT '0',
  PRIMARY KEY (`bid`),
  UNIQUE KEY `IDX_dashboardname` (`dashboardname`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard
-- ----------------------------
INSERT INTO `tb_dashboard` VALUES ('14', '', null, 'line多列测试', '', null, '0');

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
  `echarttitle` varchar(255) DEFAULT NULL,
  `legend_orient` varchar(255) DEFAULT NULL,
  `legend_pos` varchar(255) DEFAULT NULL,
  `legend_show` tinyint(1) DEFAULT '0',
  `tooltip_show` tinyint(1) DEFAULT '0',
  `xname` varchar(255) DEFAULT NULL,
  `yname` varchar(255) DEFAULT NULL,
  `background` varchar(255) DEFAULT NULL,
  `echart_tit_color` varchar(255) DEFAULT NULL,
  `echart_tit_pos` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`did`),
  KEY `FKs0u7h9oxeym8pakpfyg3fd8i9` (`bid`),
  KEY `FK3006umesaltsyga8yv3wwixda` (`vid`),
  CONSTRAINT `FK3006umesaltsyga8yv3wwixda` FOREIGN KEY (`vid`) REFERENCES `tb_visualize` (`vid`),
  CONSTRAINT `FKs0u7h9oxeym8pakpfyg3fd8i9` FOREIGN KEY (`bid`) REFERENCES `tb_dashboard` (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard_visualize
-- ----------------------------
INSERT INTO `tb_dashboard_visualize` VALUES ('54', '14', '64', '7', '7', '0', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('57', '14', '72', '4', '6', '0', '7', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('58', '14', '72', '11', '7', '0', '7', null, null, null, null, null, null, null, null, null, null);

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
  `password` varchar(15) DEFAULT NULL,
  `drivername` varchar(60) DEFAULT NULL,
  `valid` int(2) DEFAULT '0',
  `datasourcename` varchar(80) DEFAULT NULL,
  `dbtype` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`dbid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_database
-- ----------------------------
INSERT INTO `tb_database` VALUES ('1', 'spark4', '3306', 'sourcedb', 'root', 'mysql', 'com.mysql.jdbc.Driver', '1', null, 'mysql');
INSERT INTO `tb_database` VALUES ('2', 'hxqh.dev', '1521', 'iocdb', 'ioc_user', 'ioc#1234', 'oracle.jdbc.driver.OracleDriver', '0', null, 'oracle');

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
-- Records of tb_model
-- ----------------------------
INSERT INTO `tb_model` VALUES ('1', null, null, '车辆管理descriptionhk', '车辆管理hk', null, null, '0', null, null, null);
INSERT INTO `tb_model` VALUES ('2', null, null, '工具台账', '工具台账', null, null, '0', null, null, null);
INSERT INTO `tb_model` VALUES ('3', null, null, '工单管理', '工单管理', null, null, '1', null, null, null);

-- ----------------------------
-- Table structure for tb_orienty
-- ----------------------------
DROP TABLE IF EXISTS `tb_orienty`;
CREATE TABLE `tb_orienty` (
  `orientyid` int(11) NOT NULL AUTO_INCREMENT,
  `y_axis_label` varchar(255) DEFAULT NULL,
  `yaxisline` tinyint(1) DEFAULT '1',
  `yinverse` tinyint(1) DEFAULT '0',
  `ysplitline` tinyint(1) DEFAULT '1',
  `yname` varchar(255) DEFAULT NULL,
  `vid` int(11) DEFAULT NULL,
  PRIMARY KEY (`orientyid`),
  KEY `FK4n37clfwkaehgrwur5u1oo6af` (`vid`),
  CONSTRAINT `FK4n37clfwkaehgrwur5u1oo6af` FOREIGN KEY (`vid`) REFERENCES `tb_visualize` (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_orienty
-- ----------------------------

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
-- Records of tb_role
-- ----------------------------
INSERT INTO `tb_role` VALUES ('1', '管理员', 'admin', null, null);
INSERT INTO `tb_role` VALUES ('3', '管理员hk1', 'adminhk1', null, null);
INSERT INTO `tb_role` VALUES ('4', '测试', '测试', null, null);
INSERT INTO `tb_role` VALUES ('5', '测试', '测试002', null, null);
INSERT INTO `tb_role` VALUES ('6', '', '测试003', null, null);
INSERT INTO `tb_role` VALUES ('7', '', '测试004', null, null);

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
-- Records of tb_rolemodel
-- ----------------------------
INSERT INTO `tb_rolemodel` VALUES ('1', '1', '1');
INSERT INTO `tb_rolemodel` VALUES ('2', '2', '1');
INSERT INTO `tb_rolemodel` VALUES ('3', '3', '1');

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
-- Records of tb_tablemanager
-- ----------------------------
INSERT INTO `tb_tablemanager` VALUES ('1', 'line', '17', 'ab_line_');
INSERT INTO `tb_tablemanager` VALUES ('2', 'pie', '10', 'ab_pie_');
INSERT INTO `tb_tablemanager` VALUES ('3', 'bar', '8', 'ab_bar_');

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
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'admin', 'E10ADC3949BA59ABBE56E057F20F883E', null, null, null, null, null, null, '管理员', null);
INSERT INTO `tb_user` VALUES ('13', '测试用户', 'D41D8CD98F00B204E9800998ECF8427E', 'asassa', '', '', 'jlkasjdkflajdsf', '', '', '', null);

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
-- Records of tb_userrole
-- ----------------------------
INSERT INTO `tb_userrole` VALUES ('1', '1', '1');
INSERT INTO `tb_userrole` VALUES ('2', '3', '1');
INSERT INTO `tb_userrole` VALUES ('3', '6', '13');
INSERT INTO `tb_userrole` VALUES ('10', '7', '13');

-- ----------------------------
-- Table structure for tb_visualize
-- ----------------------------
DROP TABLE IF EXISTS `tb_visualize`;
CREATE TABLE `tb_visualize` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `businesscategory` varchar(50) DEFAULT NULL,
  `tablename` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `visualizedescription` varchar(255) DEFAULT NULL,
  `visualizename` varchar(255) DEFAULT NULL,
  `visualizeshowname` varchar(255) DEFAULT NULL,
  `xname` varchar(50) DEFAULT NULL,
  `yname` varchar(50) DEFAULT NULL,
  `ytype` varchar(20) DEFAULT NULL,
  `echarttitle` varchar(255) DEFAULT NULL,
  `legend_orient` varchar(255) DEFAULT NULL,
  `legend_pos` varchar(255) DEFAULT NULL,
  `legend_show` tinyint(1) DEFAULT NULL,
  `tooltip_show` tinyint(1) DEFAULT NULL,
  `background` varchar(255) DEFAULT NULL,
  `echart_tit_color` varchar(255) DEFAULT NULL,
  `echart_tit_pos` varchar(255) DEFAULT NULL,
  `sourcetablename` varchar(60) DEFAULT NULL,
  `columnsnumber` int(2) DEFAULT NULL,
  `dbid` int(10) DEFAULT NULL,
  `alignwithlabel` tinyint(1) DEFAULT '0',
  `datazoom` tinyint(1) DEFAULT '0',
  `x_axis_label` varchar(255) DEFAULT NULL,
  `xaxisline` tinyint(1) DEFAULT '1',
  `xinverse` tinyint(1) DEFAULT '0',
  `xsplitline` tinyint(1) DEFAULT '1',
  `xtoy` tinyint(1) DEFAULT '0',
  `y_axis_label` varchar(255) DEFAULT NULL,
  `yaxisline` tinyint(1) DEFAULT '1',
  `yinverse` tinyint(1) DEFAULT '0',
  `ysplitline` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`vid`),
  UNIQUE KEY `IDX_visualizename` (`visualizename`),
  UNIQUE KEY `IDX_tablename` (`tablename`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_visualize
-- ----------------------------
INSERT INTO `tb_visualize` VALUES ('62', '工具校准单', 'ab_bar_4', 'bar', '新增接口测试003', '新增接口测试003', null, null, null, 'double', null, null, null, null, null, null, null, null, 'line_source', '4', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1');
INSERT INTO `tb_visualize` VALUES ('63', '工具校准单', 'ab_bar_5', 'bar', '新增接口测试004', '新增接口测试004', null, null, null, 'double', null, null, null, null, null, null, null, null, 'line_source', '3', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1');
INSERT INTO `tb_visualize` VALUES ('64', '工具校准单', 'ab_bar_6', 'bar', '新增接口', '新增接口', null, null, '销量', 'double', '测试数据', 'horizontal', 'topRight', '1', '1', '#FFFFFF', '#D62C2C', 'topLeft', 'line_source', '6', '1', '0', '1', null, '1', '0', '1', '0', '（顿）', '1', '0', '1');
INSERT INTO `tb_visualize` VALUES ('72', '工具校准单', 'ab_bar_7', 'bar', '11212', 'hktest22', null, null, null, 'double', null, null, null, null, null, null, null, null, 'line_source', '6', '1', null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for test_table
-- ----------------------------
DROP TABLE IF EXISTS `test_table`;
CREATE TABLE `test_table` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  `showvalue4` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_table
-- ----------------------------
INSERT INTO `test_table` VALUES ('1', '周一', '135.00', '145.00', '213.00', '196.00', '27.00');
INSERT INTO `test_table` VALUES ('2', '周二', '269.00', '17.00', '209.00', '233.00', '2.00');
INSERT INTO `test_table` VALUES ('3', '周三', '285.00', '56.00', '239.00', '21.00', '25.00');
INSERT INTO `test_table` VALUES ('4', '周四', '87.00', '197.00', '156.00', '65.00', '28.00');
INSERT INTO `test_table` VALUES ('5', '周五', '112.00', '44.00', '214.00', '126.00', '28.00');
INSERT INTO `test_table` VALUES ('6', '周六', '183.00', '153.00', '166.00', '148.00', '3.00');
INSERT INTO `test_table` VALUES ('7', '周日', '133.00', '10.00', '174.00', '244.00', '18.00');

-- ----------------------------
-- View structure for v_role_model
-- ----------------------------
DROP VIEW IF EXISTS `v_role_model`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_role_model` AS select `t1`.`roleid` AS `roleid`,`t1`.`rolename` AS `rolename`,`t2`.`rolemodelid` AS `rolemodelid`,`t3`.`modelid` AS `modelid`,`t3`.`modelname` AS `modelname` from ((`tb_role` `t1` join `tb_rolemodel` `t2`) join `tb_model` `t3`) where ((`t1`.`roleid` = `t2`.`roleid`) and (`t2`.`modelid` = `t3`.`modelid`)) ;

-- ----------------------------
-- View structure for v_user_model
-- ----------------------------
DROP VIEW IF EXISTS `v_user_model`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_user_model` AS select (`t3`.`rolemodelid` + `t2`.`userroleid`) AS `usermodeluid`,`t3`.`rolemodelid` AS `rolemodelid`,`t2`.`userroleid` AS `userroleid`,`t1`.`userid` AS `userid`,`t1`.`name` AS `name`,`t4`.`modelid` AS `modelid`,`t4`.`modelname` AS `modelname`,`t4`.`modeldesc` AS `modeldesc`,`t4`.`sortnum` AS `sortnum`,`t4`.`parentid` AS `parentid`,`t4`.`bid` AS `bid` from (((`tb_user` `t1` join `tb_userrole` `t2`) join `tb_rolemodel` `t3`) join `tb_model` `t4`) where ((`t1`.`userid` = `t2`.`userid`) and (`t2`.`roleid` = `t3`.`roleid`) and (`t3`.`modelid` = `t4`.`modelid`)) ;

-- ----------------------------
-- View structure for v_user_role
-- ----------------------------
DROP VIEW IF EXISTS `v_user_role`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_user_role` AS select `t1`.`userid` AS `userid`,`t1`.`name` AS `name`,`t2`.`userroleid` AS `userroleid`,`t3`.`roleid` AS `roleid`,`t3`.`rolename` AS `rolename` from ((`tb_user` `t1` join `tb_userrole` `t2`) join `tb_role` `t3`) where ((`t1`.`userid` = `t2`.`userid`) and (`t2`.`roleid` = `t3`.`roleid`)) ;
