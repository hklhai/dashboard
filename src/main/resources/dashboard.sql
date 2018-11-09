/*
Navicat MySQL Data Transfer

Source Server         : HXQH-spark4-root
Source Server Version : 50722
Source Host           : spark4:3306
Source Database       : dashboard

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-11-09 10:46:30
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
-- Table structure for ab_bar_2
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_2`;
CREATE TABLE `ab_bar_2` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` float(7,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_2
-- ----------------------------
INSERT INTO `ab_bar_2` VALUES ('1', '周一', '49.00');
INSERT INTO `ab_bar_2` VALUES ('2', '周二', '49.00');
INSERT INTO `ab_bar_2` VALUES ('3', '周三', '40.00');
INSERT INTO `ab_bar_2` VALUES ('4', '周四', '13.00');
INSERT INTO `ab_bar_2` VALUES ('5', '周五', '64.00');
INSERT INTO `ab_bar_2` VALUES ('6', '周六', '30.00');
INSERT INTO `ab_bar_2` VALUES ('7', '周日', '23.00');

-- ----------------------------
-- Table structure for ab_bar_3
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_3`;
CREATE TABLE `ab_bar_3` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_3
-- ----------------------------
INSERT INTO `ab_bar_3` VALUES ('1', '周一', '50.00');
INSERT INTO `ab_bar_3` VALUES ('2', '周二', '21.00');
INSERT INTO `ab_bar_3` VALUES ('3', '周三', '39.00');
INSERT INTO `ab_bar_3` VALUES ('4', '周四', '47.00');
INSERT INTO `ab_bar_3` VALUES ('5', '周五', '63.00');
INSERT INTO `ab_bar_3` VALUES ('6', '周六', '21.00');
INSERT INTO `ab_bar_3` VALUES ('7', '周日', '11.00');

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
-- Table structure for ab_line_3
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_3`;
CREATE TABLE `ab_line_3` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` float(7,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_3
-- ----------------------------
INSERT INTO `ab_line_3` VALUES ('1', '周一', '23.00');
INSERT INTO `ab_line_3` VALUES ('2', '周二', '64.00');
INSERT INTO `ab_line_3` VALUES ('3', '周三', '47.00');
INSERT INTO `ab_line_3` VALUES ('4', '周四', '68.00');
INSERT INTO `ab_line_3` VALUES ('5', '周五', '33.00');
INSERT INTO `ab_line_3` VALUES ('6', '周六', '61.00');
INSERT INTO `ab_line_3` VALUES ('7', '周日', '21.00');

-- ----------------------------
-- Table structure for ab_line_4
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_4`;
CREATE TABLE `ab_line_4` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_4
-- ----------------------------
INSERT INTO `ab_line_4` VALUES ('1', '周一', '60.00');
INSERT INTO `ab_line_4` VALUES ('2', '周二', '19.00');
INSERT INTO `ab_line_4` VALUES ('3', '周三', '23.00');
INSERT INTO `ab_line_4` VALUES ('4', '周四', '62.00');
INSERT INTO `ab_line_4` VALUES ('5', '周五', '16.00');
INSERT INTO `ab_line_4` VALUES ('6', '周六', '10.00');
INSERT INTO `ab_line_4` VALUES ('7', '周日', '14.00');

-- ----------------------------
-- Table structure for ab_line_5
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_5`;
CREATE TABLE `ab_line_5` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_5
-- ----------------------------
INSERT INTO `ab_line_5` VALUES ('1', '周一', '17.00');
INSERT INTO `ab_line_5` VALUES ('2', '周二', '36.00');
INSERT INTO `ab_line_5` VALUES ('3', '周三', '33.00');
INSERT INTO `ab_line_5` VALUES ('4', '周四', '47.00');
INSERT INTO `ab_line_5` VALUES ('5', '周五', '16.00');
INSERT INTO `ab_line_5` VALUES ('6', '周六', '43.00');
INSERT INTO `ab_line_5` VALUES ('7', '周日', '13.00');

-- ----------------------------
-- Table structure for ab_line_6
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_6`;
CREATE TABLE `ab_line_6` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_6
-- ----------------------------
INSERT INTO `ab_line_6` VALUES ('1', '周一', '19.00');
INSERT INTO `ab_line_6` VALUES ('2', '周二', '24.00');
INSERT INTO `ab_line_6` VALUES ('3', '周三', '30.00');
INSERT INTO `ab_line_6` VALUES ('4', '周四', '15.00');
INSERT INTO `ab_line_6` VALUES ('5', '周五', '54.00');
INSERT INTO `ab_line_6` VALUES ('6', '周六', '49.00');
INSERT INTO `ab_line_6` VALUES ('7', '周日', '15.00');

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
-- Table structure for ab_pie_3
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_3`;
CREATE TABLE `ab_pie_3` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_3
-- ----------------------------
INSERT INTO `ab_pie_3` VALUES ('1', '直接访问', '36.00');
INSERT INTO `ab_pie_3` VALUES ('2', '邮件营销', '31.00');
INSERT INTO `ab_pie_3` VALUES ('3', '联盟广告', '65.00');
INSERT INTO `ab_pie_3` VALUES ('4', '视频广告', '17.00');
INSERT INTO `ab_pie_3` VALUES ('5', '搜索引擎', '48.00');
INSERT INTO `ab_pie_3` VALUES ('6', '简介访问', '47.00');
INSERT INTO `ab_pie_3` VALUES ('7', '抖音广告', '41.00');

-- ----------------------------
-- Table structure for ab_pie_4
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_4`;
CREATE TABLE `ab_pie_4` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_4
-- ----------------------------
INSERT INTO `ab_pie_4` VALUES ('1', '直接访问input2', '60.00');
INSERT INTO `ab_pie_4` VALUES ('2', '邮件营销input2', '20.00');
INSERT INTO `ab_pie_4` VALUES ('3', '联盟广告input2', '90.90');
INSERT INTO `ab_pie_4` VALUES ('4', '视频广告input2', '89.22');
INSERT INTO `ab_pie_4` VALUES ('5', '搜索引擎input2', '98.11');

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard
-- ----------------------------
INSERT INTO `tb_dashboard` VALUES ('9', '工具校准单', null, '工具校准单', '工具校准单', null);
INSERT INTO `tb_dashboard` VALUES ('10', '物资发放列表', '物资发放', '物资发放', '物资发放业务', null);

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
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard_visualize
-- ----------------------------
INSERT INTO `tb_dashboard_visualize` VALUES ('38', '9', '34', '7', '6', '0', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('39', '9', '33', '7', '6', '6', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('40', '9', '32', '7', '6', '0', '11', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('42', '10', '39', '14', '6', '6', '0', 'demo', 'vertical', 'topRight', '1', '1', null, null, '#FFFFFF', '#000000', 'topCenter');
INSERT INTO `tb_dashboard_visualize` VALUES ('44', '9', '40', '6', '6', '6', '7', null, 'vertical', 'topRight', '1', '1', null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('45', '9', '39', '4', '6', '0', '7', null, 'vertical', 'topLeft', '1', '1', null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('46', '10', '44', '8', '12', '0', '14', 'demo003', null, null, null, null, null, null, '#FFFFFF', '#000000', 'topCenter');
INSERT INTO `tb_dashboard_visualize` VALUES ('47', '10', '43', '7', '6', '0', '7', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('48', '10', '33', '7', '6', '0', '0', null, null, null, null, null, null, null, null, null, null);

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
INSERT INTO `tb_tablemanager` VALUES ('1', 'line', '7', 'ab_line_');
INSERT INTO `tb_tablemanager` VALUES ('2', 'pie', '5', 'ab_pie_');
INSERT INTO `tb_tablemanager` VALUES ('3', 'bar', '4', 'ab_bar_');

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
  PRIMARY KEY (`vid`),
  UNIQUE KEY `IDX_visualizename` (`visualizename`),
  UNIQUE KEY `IDX_tablename` (`tablename`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_visualize
-- ----------------------------
INSERT INTO `tb_visualize` VALUES ('32', '工具校准单', 'ab_line_1', 'line', null, '工具台账页面', null, null, null, 'double', null, null, null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('33', '工具校准单', 'ab_pie_1', 'pie', null, '工具校准单列表', null, null, null, 'double', null, null, null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('34', '工具校准单', 'ab_bar_1', 'bar', null, '工具校准行页面', null, null, null, 'float', null, null, null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('37', '物资发放列表', 'ab_line_3', 'line', null, '物资发放列表', null, null, null, 'float', null, null, null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('38', '物资发放列表', 'ab_bar_2', 'bar', null, '物资发放页面', null, null, null, 'float', 'bar-demo', 'vertical', 'topLeft', '1', '1', '#FFFFFF', '#191818', 'topCenter');
INSERT INTO `tb_visualize` VALUES ('39', '物资发放列表', 'ab_pie_3', 'pie', null, '物资发放行', null, null, null, 'double', 'demo', 'vertical', 'topRight', '1', '1', '#FFFFFF', '#000000', 'topCenter');
INSERT INTO `tb_visualize` VALUES ('40', '物资发放列表', 'ab_pie_4', 'pie', null, '物资审批记录insert Test', null, null, null, 'double', 'demo2', 'vertical', 'topRight', '1', '1', '#FFFFFF', '#000000', 'topLeft');
INSERT INTO `tb_visualize` VALUES ('41', '工具校准单', 'ab_line_4', 'line', null, '开发line', null, null, null, 'double', null, null, null, '0', '1', null, null, null);
INSERT INTO `tb_visualize` VALUES ('42', '工具校准单', 'ab_line_5', 'line', null, '测试001', null, null, null, 'double', null, null, null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('43', '工具校准单', 'ab_bar_3', 'bar', null, '测试002', null, null, null, 'double', null, null, null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('44', '工具校准单', 'ab_line_6', 'line', null, '测试003', null, null, null, 'double', 'demo003', null, null, null, null, '#FFFFFF', '#000000', 'topCenter');

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
