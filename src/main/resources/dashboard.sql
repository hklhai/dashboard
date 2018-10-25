/*
Navicat MySQL Data Transfer

Source Server         : HXQH-spark4-root
Source Server Version : 50722
Source Host           : spark4:3306
Source Database       : dashboard

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-10-24 13:37:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_bar_1
-- ----------------------------
DROP TABLE IF EXISTS `tb_bar_1`;
CREATE TABLE `tb_bar_1` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_bar_1
-- ----------------------------
INSERT INTO `tb_bar_1` VALUES ('1', '1', '16.00');
INSERT INTO `tb_bar_1` VALUES ('2', '2', '60.00');
INSERT INTO `tb_bar_1` VALUES ('3', '3', '32.00');
INSERT INTO `tb_bar_1` VALUES ('4', '4', '65.00');
INSERT INTO `tb_bar_1` VALUES ('5', '5', '69.00');
INSERT INTO `tb_bar_1` VALUES ('6', '6', '32.00');
INSERT INTO `tb_bar_1` VALUES ('7', '7', '16.00');

-- ----------------------------
-- Table structure for tb_bar_2
-- ----------------------------
DROP TABLE IF EXISTS `tb_bar_2`;
CREATE TABLE `tb_bar_2` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_bar_2
-- ----------------------------
INSERT INTO `tb_bar_2` VALUES ('1', '1', '51.00');
INSERT INTO `tb_bar_2` VALUES ('2', '2', '11.00');
INSERT INTO `tb_bar_2` VALUES ('3', '3', '61.00');
INSERT INTO `tb_bar_2` VALUES ('4', '4', '50.00');
INSERT INTO `tb_bar_2` VALUES ('5', '5', '14.00');
INSERT INTO `tb_bar_2` VALUES ('6', '6', '12.00');
INSERT INTO `tb_bar_2` VALUES ('7', '7', '46.00');

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
  PRIMARY KEY (`bid`),
  UNIQUE KEY `IDX_dashboardname` (`dashboardname`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard
-- ----------------------------
INSERT INTO `tb_dashboard` VALUES ('1', '市场分析', null, '上映电影', 'cpcc-上映电影', null);
INSERT INTO `tb_dashboard` VALUES ('3', '市场分析2-update', null, '上映电影2-update', 'cpcc-上映电影2-update', 'update');
INSERT INTO `tb_dashboard` VALUES ('6', null, null, 'testDashboard', 'testDashboard', null);
INSERT INTO `tb_dashboard` VALUES ('7', null, null, 'test', '测试更新', null);
INSERT INTO `tb_dashboard` VALUES ('8', null, null, '设备管理', '设备管理', null);

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
  PRIMARY KEY (`did`),
  KEY `FKs0u7h9oxeym8pakpfyg3fd8i9` (`bid`),
  KEY `FK3006umesaltsyga8yv3wwixda` (`vid`),
  CONSTRAINT `FK3006umesaltsyga8yv3wwixda` FOREIGN KEY (`vid`) REFERENCES `tb_visualize` (`vid`),
  CONSTRAINT `FKs0u7h9oxeym8pakpfyg3fd8i9` FOREIGN KEY (`bid`) REFERENCES `tb_dashboard` (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard_visualize
-- ----------------------------
INSERT INTO `tb_dashboard_visualize` VALUES ('10', '3', '18', '4', '8', '2', '3');
INSERT INTO `tb_dashboard_visualize` VALUES ('11', '3', '19', '8', '9', '6', '7');
INSERT INTO `tb_dashboard_visualize` VALUES ('12', '1', '20', '6', '6', '0', '0');
INSERT INTO `tb_dashboard_visualize` VALUES ('13', '1', '19', '6', '6', '6', '0');
INSERT INTO `tb_dashboard_visualize` VALUES ('14', '1', '18', '7', '8', '1', '6');
INSERT INTO `tb_dashboard_visualize` VALUES ('24', '8', '27', '6', '6', '6', '0');
INSERT INTO `tb_dashboard_visualize` VALUES ('25', '8', '26', '6', '6', '0', '0');
INSERT INTO `tb_dashboard_visualize` VALUES ('26', '8', '25', '8', '12', '0', '6');

-- ----------------------------
-- Table structure for tb_line_1
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_1`;
CREATE TABLE `tb_line_1` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_1
-- ----------------------------
INSERT INTO `tb_line_1` VALUES ('1', '1', '11.00');
INSERT INTO `tb_line_1` VALUES ('2', '2', '222.00');
INSERT INTO `tb_line_1` VALUES ('3', '3', '3333.00');
INSERT INTO `tb_line_1` VALUES ('4', '4', '444.00');
INSERT INTO `tb_line_1` VALUES ('5', '5', '55.00');

-- ----------------------------
-- Table structure for tb_line_10
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_10`;
CREATE TABLE `tb_line_10` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_10
-- ----------------------------
INSERT INTO `tb_line_10` VALUES ('1', '1', '49.00');
INSERT INTO `tb_line_10` VALUES ('2', '2', '33.00');
INSERT INTO `tb_line_10` VALUES ('3', '3', '45.00');
INSERT INTO `tb_line_10` VALUES ('4', '4', '15.00');
INSERT INTO `tb_line_10` VALUES ('5', '5', '52.00');
INSERT INTO `tb_line_10` VALUES ('6', '6', '30.00');
INSERT INTO `tb_line_10` VALUES ('7', '7', '16.00');

-- ----------------------------
-- Table structure for tb_line_4
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_4`;
CREATE TABLE `tb_line_4` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_4
-- ----------------------------
INSERT INTO `tb_line_4` VALUES ('1', '0', '45.00');
INSERT INTO `tb_line_4` VALUES ('2', '1', '9.00');
INSERT INTO `tb_line_4` VALUES ('3', '2', '13.00');
INSERT INTO `tb_line_4` VALUES ('4', '3', '24.00');
INSERT INTO `tb_line_4` VALUES ('5', '4', '11.00');
INSERT INTO `tb_line_4` VALUES ('6', '5', '32.00');
INSERT INTO `tb_line_4` VALUES ('7', '6', '13.00');
INSERT INTO `tb_line_4` VALUES ('8', '7', '35.00');

-- ----------------------------
-- Table structure for tb_line_5
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_5`;
CREATE TABLE `tb_line_5` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_5
-- ----------------------------
INSERT INTO `tb_line_5` VALUES ('1', '1', '33.00');
INSERT INTO `tb_line_5` VALUES ('2', '2', '55.00');
INSERT INTO `tb_line_5` VALUES ('3', '3', '61.00');
INSERT INTO `tb_line_5` VALUES ('4', '4', '13.00');
INSERT INTO `tb_line_5` VALUES ('5', '5', '50.00');
INSERT INTO `tb_line_5` VALUES ('6', '6', '22.00');
INSERT INTO `tb_line_5` VALUES ('7', '7', '57.00');

-- ----------------------------
-- Table structure for tb_line_6
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_6`;
CREATE TABLE `tb_line_6` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_6
-- ----------------------------
INSERT INTO `tb_line_6` VALUES ('1', '1', '46.00');
INSERT INTO `tb_line_6` VALUES ('2', '2', '67.00');
INSERT INTO `tb_line_6` VALUES ('3', '3', '49.00');
INSERT INTO `tb_line_6` VALUES ('4', '4', '48.00');
INSERT INTO `tb_line_6` VALUES ('5', '5', '36.00');
INSERT INTO `tb_line_6` VALUES ('6', '6', '51.00');
INSERT INTO `tb_line_6` VALUES ('7', '7', '43.00');

-- ----------------------------
-- Table structure for tb_line_7
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_7`;
CREATE TABLE `tb_line_7` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_7
-- ----------------------------
INSERT INTO `tb_line_7` VALUES ('1', '1', '58.00');
INSERT INTO `tb_line_7` VALUES ('2', '2', '46.00');
INSERT INTO `tb_line_7` VALUES ('3', '3', '53.00');
INSERT INTO `tb_line_7` VALUES ('4', '4', '40.00');
INSERT INTO `tb_line_7` VALUES ('5', '5', '49.00');
INSERT INTO `tb_line_7` VALUES ('6', '6', '10.00');
INSERT INTO `tb_line_7` VALUES ('7', '7', '46.00');

-- ----------------------------
-- Table structure for tb_line_8
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_8`;
CREATE TABLE `tb_line_8` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_8
-- ----------------------------
INSERT INTO `tb_line_8` VALUES ('1', '1', '60.00');
INSERT INTO `tb_line_8` VALUES ('2', '2', '42.00');
INSERT INTO `tb_line_8` VALUES ('3', '3', '67.00');
INSERT INTO `tb_line_8` VALUES ('4', '4', '41.00');
INSERT INTO `tb_line_8` VALUES ('5', '5', '36.00');
INSERT INTO `tb_line_8` VALUES ('6', '6', '69.00');
INSERT INTO `tb_line_8` VALUES ('7', '7', '57.00');

-- ----------------------------
-- Table structure for tb_line_9
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_9`;
CREATE TABLE `tb_line_9` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_9
-- ----------------------------
INSERT INTO `tb_line_9` VALUES ('1', '1', '25.00');
INSERT INTO `tb_line_9` VALUES ('2', '2', '44.00');
INSERT INTO `tb_line_9` VALUES ('3', '3', '52.00');
INSERT INTO `tb_line_9` VALUES ('4', '4', '53.00');
INSERT INTO `tb_line_9` VALUES ('5', '5', '44.00');
INSERT INTO `tb_line_9` VALUES ('6', '6', '27.00');
INSERT INTO `tb_line_9` VALUES ('7', '7', '41.00');

-- ----------------------------
-- Table structure for tb_line_double
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_double`;
CREATE TABLE `tb_line_double` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(255) DEFAULT NULL,
  `showvalue` double DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_double
-- ----------------------------

-- ----------------------------
-- Table structure for tb_line_float
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_float`;
CREATE TABLE `tb_line_float` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(255) DEFAULT NULL,
  `showvalue` float DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_float
-- ----------------------------

-- ----------------------------
-- Table structure for tb_line_integer
-- ----------------------------
DROP TABLE IF EXISTS `tb_line_integer`;
CREATE TABLE `tb_line_integer` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(255) DEFAULT NULL,
  `showvalue` int(11) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_line_integer
-- ----------------------------

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
  PRIMARY KEY (`modelid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_model
-- ----------------------------
INSERT INTO `tb_model` VALUES ('1', null, null, '车辆管理descriptionhk', '车辆管理hk', null, null, null, null, null);
INSERT INTO `tb_model` VALUES ('2', null, null, '工具台账', '工具台账', null, null, null, null, null);
INSERT INTO `tb_model` VALUES ('3', null, null, '工单管理', '工单管理', null, null, null, null, null);

-- ----------------------------
-- Table structure for tb_pie_1
-- ----------------------------
DROP TABLE IF EXISTS `tb_pie_1`;
CREATE TABLE `tb_pie_1` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pie_1
-- ----------------------------
INSERT INTO `tb_pie_1` VALUES ('1', '1', '1.10');
INSERT INTO `tb_pie_1` VALUES ('2', '2', '2.40');
INSERT INTO `tb_pie_1` VALUES ('3', '3', '4.70');
INSERT INTO `tb_pie_1` VALUES ('4', '4', '5.80');
INSERT INTO `tb_pie_1` VALUES ('5', '5', '7.90');
INSERT INTO `tb_pie_1` VALUES ('6', '6', '9.90');
INSERT INTO `tb_pie_1` VALUES ('7', '7', '13.50');

-- ----------------------------
-- Table structure for tb_pie_2
-- ----------------------------
DROP TABLE IF EXISTS `tb_pie_2`;
CREATE TABLE `tb_pie_2` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pie_2
-- ----------------------------
INSERT INTO `tb_pie_2` VALUES ('1', '1', '45.00');
INSERT INTO `tb_pie_2` VALUES ('2', '2', '6.00');
INSERT INTO `tb_pie_2` VALUES ('3', '3', '28.00');
INSERT INTO `tb_pie_2` VALUES ('4', '4', '14.00');
INSERT INTO `tb_pie_2` VALUES ('5', '5', '7.00');
INSERT INTO `tb_pie_2` VALUES ('6', '6', '38.00');
INSERT INTO `tb_pie_2` VALUES ('7', '7', '5.00');

-- ----------------------------
-- Table structure for tb_pie_3
-- ----------------------------
DROP TABLE IF EXISTS `tb_pie_3`;
CREATE TABLE `tb_pie_3` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pie_3
-- ----------------------------
INSERT INTO `tb_pie_3` VALUES ('1', '1', '48.00');
INSERT INTO `tb_pie_3` VALUES ('2', '2', '27.00');
INSERT INTO `tb_pie_3` VALUES ('3', '3', '65.00');
INSERT INTO `tb_pie_3` VALUES ('4', '4', '53.00');
INSERT INTO `tb_pie_3` VALUES ('5', '5', '26.00');
INSERT INTO `tb_pie_3` VALUES ('6', '6', '57.00');
INSERT INTO `tb_pie_3` VALUES ('7', '7', '51.00');

-- ----------------------------
-- Table structure for tb_pie_4
-- ----------------------------
DROP TABLE IF EXISTS `tb_pie_4`;
CREATE TABLE `tb_pie_4` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pie_4
-- ----------------------------
INSERT INTO `tb_pie_4` VALUES ('1', '1', '32.00');
INSERT INTO `tb_pie_4` VALUES ('2', '2', '55.00');
INSERT INTO `tb_pie_4` VALUES ('3', '3', '64.00');
INSERT INTO `tb_pie_4` VALUES ('4', '4', '12.00');
INSERT INTO `tb_pie_4` VALUES ('5', '5', '46.00');
INSERT INTO `tb_pie_4` VALUES ('6', '6', '54.00');
INSERT INTO `tb_pie_4` VALUES ('7', '7', '15.00');

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_role
-- ----------------------------
INSERT INTO `tb_role` VALUES ('1', '管理员', 'admin', null, null);
INSERT INTO `tb_role` VALUES ('3', '管理员hk1', 'adminhk1', null, null);

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
INSERT INTO `tb_tablemanager` VALUES ('1', 'line', '11', 'tb_line_');
INSERT INTO `tb_tablemanager` VALUES ('2', 'pie', '5', 'tb_pie_');
INSERT INTO `tb_tablemanager` VALUES ('3', 'bar', '3', 'tb_bar_');

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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'admin', 'E10ADC3949BA59ABBE56E057F20F883E', null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('7', 'hk', 'D41D8CD98F00B204E9800998ECF8427E', null, null, null, null, null, null, null, null);

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_userrole
-- ----------------------------
INSERT INTO `tb_userrole` VALUES ('1', '1', '1');
INSERT INTO `tb_userrole` VALUES ('2', '3', '1');

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
  PRIMARY KEY (`vid`),
  UNIQUE KEY `IDX_visualizename` (`visualizename`),
  UNIQUE KEY `IDX_tablename` (`tablename`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_visualize
-- ----------------------------
INSERT INTO `tb_visualize` VALUES ('15', '工具校准单', 'tb_line_1', 'line', null, 'BNOP-line_test', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('18', null, 'tb_line_4', 'line', null, 'BNOP-line_test5', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('19', null, 'tb_pie_2', 'pie', null, 'BNOP-line_test9', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('20', '设备管理', 'tb_line_5', 'line', null, 'test', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('21', 'test', 'tb_pie_3', 'pie', null, 'test2', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('22', 'test', 'tb_bar_1', 'bar', null, 'test3', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('23', '工具校准单', 'tb_line_6', 'line', null, 'test-bar', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('24', '工具校准单', 'tb_line_7', 'line', null, 'test-line', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('25', '设备管理', 'tb_pie_4', 'pie', null, '设备管理pie', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('26', '设备管理', 'tb_line_8', 'line', null, '设备管理line', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('27', '设备管理', 'tb_bar_2', 'bar', null, '设备管理', null, null, null, 'double', null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('29', null, 'tb_line_10', 'line', null, 'BNOP-line_echart', null, null, null, 'double', 'echarttitle', 'legendOrient', 'legendPos', '1', '1');

-- ----------------------------
-- View structure for v_role_model
-- ----------------------------
DROP VIEW IF EXISTS `v_role_model`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_role_model` AS select `t1`.`roleid` AS `roleid`,`t1`.`rolename` AS `rolename`,`t2`.`rolemodelid` AS `rolemodelid`,`t3`.`modelid` AS `modelid`,`t3`.`modelname` AS `modelname` from ((`tb_role` `t1` join `tb_rolemodel` `t2`) join `tb_model` `t3`) where ((`t1`.`roleid` = `t2`.`roleid`) and (`t2`.`modelid` = `t3`.`modelid`)) ;

-- ----------------------------
-- View structure for v_user_model
-- ----------------------------
DROP VIEW IF EXISTS `v_user_model`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_user_model` AS select (`t3`.`rolemodelid` + `t2`.`userroleid`) AS `usermodelid`,`t1`.`userid` AS `userid`,`t1`.`name` AS `name`,`t4`.`modelid` AS `modelid`,`t4`.`modelname` AS `modelname`,`t4`.`modeldesc` AS `modeldesc`,`t4`.`sortnum` AS `sortnum` from (((`tb_user` `t1` join `tb_userrole` `t2`) join `tb_rolemodel` `t3`) join `tb_model` `t4`) where ((`t1`.`userid` = `t2`.`userid`) and (`t2`.`roleid` = `t3`.`roleid`) and (`t3`.`modelid` = `t4`.`modelid`)) ;

-- ----------------------------
-- View structure for v_user_role
-- ----------------------------
DROP VIEW IF EXISTS `v_user_role`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_user_role` AS select `t1`.`userid` AS `userid`,`t1`.`name` AS `name`,`t2`.`userroleid` AS `userroleid`,`t3`.`roleid` AS `roleid`,`t3`.`rolename` AS `rolename` from ((`tb_user` `t1` join `tb_userrole` `t2`) join `tb_role` `t3`) where ((`t1`.`userid` = `t2`.`userid`) and (`t2`.`roleid` = `t3`.`roleid`)) ;
