/*
Navicat MySQL Data Transfer

Source Server         : HXQH-spark4-root
Source Server Version : 50722
Source Host           : spark4:3306
Source Database       : dashboard

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-11-20 09:43:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ab_bar_10
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_10`;
CREATE TABLE `ab_bar_10` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_10
-- ----------------------------
INSERT INTO `ab_bar_10` VALUES ('1', '类目0', '0.00', '-50.00');
INSERT INTO `ab_bar_10` VALUES ('2', '类目1', '-8.90', '-47.19');
INSERT INTO `ab_bar_10` VALUES ('3', '类目2', '-17.03', '-42.54');
INSERT INTO `ab_bar_10` VALUES ('4', '类目3', '-24.04', '-36.29');
INSERT INTO `ab_bar_10` VALUES ('5', '类目4', '-29.67', '-28.72');
INSERT INTO `ab_bar_10` VALUES ('6', '类目5', '-33.70', '-20.15');
INSERT INTO `ab_bar_10` VALUES ('7', '类目6', '-36.01', '-10.94');
INSERT INTO `ab_bar_10` VALUES ('8', '类目7', '-36.54', '-1.48');
INSERT INTO `ab_bar_10` VALUES ('9', '类目8', '-35.32', '7.89');
INSERT INTO `ab_bar_10` VALUES ('10', '类目9', '-32.43', '16.82');
INSERT INTO `ab_bar_10` VALUES ('11', '类目10', '-28.04', '24.98');
INSERT INTO `ab_bar_10` VALUES ('12', '类目11', '-22.36', '32.12');
INSERT INTO `ab_bar_10` VALUES ('13', '类目12', '-15.67', '38.02');
INSERT INTO `ab_bar_10` VALUES ('14', '类目13', '-8.24', '42.54');
INSERT INTO `ab_bar_10` VALUES ('15', '类目14', '-0.39', '45.59');
INSERT INTO `ab_bar_10` VALUES ('16', '类目15', '7.56', '47.15');
INSERT INTO `ab_bar_10` VALUES ('17', '类目16', '15.32', '47.28');
INSERT INTO `ab_bar_10` VALUES ('18', '类目17', '22.60', '46.07');
INSERT INTO `ab_bar_10` VALUES ('19', '类目18', '29.16', '43.70');
INSERT INTO `ab_bar_10` VALUES ('20', '类目19', '34.80', '40.35');
INSERT INTO `ab_bar_10` VALUES ('21', '类目20', '39.37', '36.28');
INSERT INTO `ab_bar_10` VALUES ('22', '类目21', '42.78', '31.72');
INSERT INTO `ab_bar_10` VALUES ('23', '类目22', '44.98', '26.94');
INSERT INTO `ab_bar_10` VALUES ('24', '类目23', '46.00', '22.19');
INSERT INTO `ab_bar_10` VALUES ('25', '类目24', '45.90', '17.73');
INSERT INTO `ab_bar_10` VALUES ('26', '类目25', '44.81', '13.74');
INSERT INTO `ab_bar_10` VALUES ('27', '类目26', '42.87', '10.42');
INSERT INTO `ab_bar_10` VALUES ('28', '类目27', '40.27', '7.90');
INSERT INTO `ab_bar_10` VALUES ('29', '类目28', '37.22', '6.27');
INSERT INTO `ab_bar_10` VALUES ('30', '类目29', '33.92', '5.57');
INSERT INTO `ab_bar_10` VALUES ('31', '类目30', '30.59', '5.80');
INSERT INTO `ab_bar_10` VALUES ('32', '类目31', '27.41', '6.90');
INSERT INTO `ab_bar_10` VALUES ('33', '类目32', '24.57', '8.79');
INSERT INTO `ab_bar_10` VALUES ('34', '类目33', '22.20', '11.35');
INSERT INTO `ab_bar_10` VALUES ('35', '类目34', '20.43', '14.42');
INSERT INTO `ab_bar_10` VALUES ('36', '类目35', '19.31', '17.86');
INSERT INTO `ab_bar_10` VALUES ('37', '类目36', '18.89', '21.48');
INSERT INTO `ab_bar_10` VALUES ('38', '类目37', '19.15', '25.13');
INSERT INTO `ab_bar_10` VALUES ('39', '类目38', '20.05', '28.65');
INSERT INTO `ab_bar_10` VALUES ('40', '类目39', '21.52', '31.91');
INSERT INTO `ab_bar_10` VALUES ('41', '类目40', '23.44', '34.79');
INSERT INTO `ab_bar_10` VALUES ('42', '类目41', '25.70', '37.22');
INSERT INTO `ab_bar_10` VALUES ('43', '类目42', '28.16', '39.15');
INSERT INTO `ab_bar_10` VALUES ('44', '类目43', '30.69', '40.58');
INSERT INTO `ab_bar_10` VALUES ('45', '类目44', '33.16', '41.53');
INSERT INTO `ab_bar_10` VALUES ('46', '类目45', '35.44', '42.06');
INSERT INTO `ab_bar_10` VALUES ('47', '类目46', '37.44', '42.23');
INSERT INTO `ab_bar_10` VALUES ('48', '类目47', '39.09', '42.17');
INSERT INTO `ab_bar_10` VALUES ('49', '类目48', '40.35', '41.97');
INSERT INTO `ab_bar_10` VALUES ('50', '类目49', '41.20', '41.76');
INSERT INTO `ab_bar_10` VALUES ('51', '类目50', '41.67', '41.67');
INSERT INTO `ab_bar_10` VALUES ('52', '类目51', '41.80', '41.79');
INSERT INTO `ab_bar_10` VALUES ('53', '类目52', '41.68', '42.21');
INSERT INTO `ab_bar_10` VALUES ('54', '类目53', '41.40', '43.01');
INSERT INTO `ab_bar_10` VALUES ('55', '类目54', '41.08', '44.22');
INSERT INTO `ab_bar_10` VALUES ('56', '类目55', '40.83', '45.86');
INSERT INTO `ab_bar_10` VALUES ('57', '类目56', '40.79', '47.88');
INSERT INTO `ab_bar_10` VALUES ('58', '类目57', '41.06', '50.25');
INSERT INTO `ab_bar_10` VALUES ('59', '类目58', '41.75', '52.88');
INSERT INTO `ab_bar_10` VALUES ('60', '类目59', '42.92', '55.65');
INSERT INTO `ab_bar_10` VALUES ('61', '类目60', '44.63', '58.44');
INSERT INTO `ab_bar_10` VALUES ('62', '类目61', '46.89', '61.10');
INSERT INTO `ab_bar_10` VALUES ('63', '类目62', '49.68', '63.50');
INSERT INTO `ab_bar_10` VALUES ('64', '类目63', '52.94', '65.49');
INSERT INTO `ab_bar_10` VALUES ('65', '类目64', '56.57', '66.95');
INSERT INTO `ab_bar_10` VALUES ('66', '类目65', '60.47', '67.78');
INSERT INTO `ab_bar_10` VALUES ('67', '类目66', '64.47', '67.89');
INSERT INTO `ab_bar_10` VALUES ('68', '类目67', '68.42', '67.26');
INSERT INTO `ab_bar_10` VALUES ('69', '类目68', '72.13', '65.88');
INSERT INTO `ab_bar_10` VALUES ('70', '类目69', '75.43', '63.79');
INSERT INTO `ab_bar_10` VALUES ('71', '类目70', '78.15', '61.07');
INSERT INTO `ab_bar_10` VALUES ('72', '类目71', '80.13', '57.85');
INSERT INTO `ab_bar_10` VALUES ('73', '类目72', '81.24', '54.28');
INSERT INTO `ab_bar_10` VALUES ('74', '类目73', '81.41', '50.56');
INSERT INTO `ab_bar_10` VALUES ('75', '类目74', '80.58', '46.90');
INSERT INTO `ab_bar_10` VALUES ('76', '类目75', '78.76', '43.51');
INSERT INTO `ab_bar_10` VALUES ('77', '类目76', '75.98', '40.62');
INSERT INTO `ab_bar_10` VALUES ('78', '类目77', '72.35', '38.44');
INSERT INTO `ab_bar_10` VALUES ('79', '类目78', '68.02', '37.16');
INSERT INTO `ab_bar_10` VALUES ('80', '类目79', '63.17', '36.96');
INSERT INTO `ab_bar_10` VALUES ('81', '类目80', '58.03', '37.94');
INSERT INTO `ab_bar_10` VALUES ('82', '类目81', '52.85', '40.18');
INSERT INTO `ab_bar_10` VALUES ('83', '类目82', '47.91', '43.69');
INSERT INTO `ab_bar_10` VALUES ('84', '类目83', '43.48', '48.45');
INSERT INTO `ab_bar_10` VALUES ('85', '类目84', '39.82', '54.34');
INSERT INTO `ab_bar_10` VALUES ('86', '类目85', '37.18', '61.20');
INSERT INTO `ab_bar_10` VALUES ('87', '类目86', '35.78', '68.83');
INSERT INTO `ab_bar_10` VALUES ('88', '类目87', '35.77', '76.97');
INSERT INTO `ab_bar_10` VALUES ('89', '类目88', '37.28', '85.33');
INSERT INTO `ab_bar_10` VALUES ('90', '类目89', '40.35', '93.59');
INSERT INTO `ab_bar_10` VALUES ('91', '类目90', '44.96', '101.41');
INSERT INTO `ab_bar_10` VALUES ('92', '类目91', '51.04', '108.48');
INSERT INTO `ab_bar_10` VALUES ('93', '类目92', '58.41', '114.49');
INSERT INTO `ab_bar_10` VALUES ('94', '类目93', '66.88', '119.17');
INSERT INTO `ab_bar_10` VALUES ('95', '类目94', '76.15', '122.28');
INSERT INTO `ab_bar_10` VALUES ('96', '类目95', '85.91', '123.66');
INSERT INTO `ab_bar_10` VALUES ('97', '类目96', '95.79', '123.20');
INSERT INTO `ab_bar_10` VALUES ('98', '类目97', '105.42', '120.89');
INSERT INTO `ab_bar_10` VALUES ('99', '类目98', '114.40', '116.77');
INSERT INTO `ab_bar_10` VALUES ('100', '类目99', '122.37', '110.98');

-- ----------------------------
-- Table structure for ab_bar_11
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_11`;
CREATE TABLE `ab_bar_11` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_11
-- ----------------------------
INSERT INTO `ab_bar_11` VALUES ('8', 'Class0', '1.28', '-0.81', '2.12', '0.33');
INSERT INTO `ab_bar_11` VALUES ('9', 'Class1', '1.10', '-0.08', '4.50', '1.26');
INSERT INTO `ab_bar_11` VALUES ('10', 'Class2', '0.71', '-0.17', '1.29', '1.24');
INSERT INTO `ab_bar_11` VALUES ('11', 'Class3', '1.98', '-0.29', '0.64', '0.53');
INSERT INTO `ab_bar_11` VALUES ('12', 'Class4', '1.64', '-0.05', '4.09', '0.85');
INSERT INTO `ab_bar_11` VALUES ('13', 'Class5', '0.70', '-0.61', '0.67', '1.03');
INSERT INTO `ab_bar_11` VALUES ('14', 'Class6', '0.60', '-0.48', '5.00', '0.69');
INSERT INTO `ab_bar_11` VALUES ('15', 'Class7', '0.15', '-0.30', '0.78', '0.31');
INSERT INTO `ab_bar_11` VALUES ('16', 'Class8', '0.23', '-0.93', '2.36', '0.92');
INSERT INTO `ab_bar_11` VALUES ('17', 'Class9', '0.13', '-0.66', '1.56', '0.72');

-- ----------------------------
-- Table structure for ab_bar_12
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_12`;
CREATE TABLE `ab_bar_12` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_12
-- ----------------------------
INSERT INTO `ab_bar_12` VALUES ('8', '点', '220.00');
INSERT INTO `ab_bar_12` VALUES ('9', '击', '182.00');
INSERT INTO `ab_bar_12` VALUES ('10', '柱', '191.00');
INSERT INTO `ab_bar_12` VALUES ('11', '子', '234.00');
INSERT INTO `ab_bar_12` VALUES ('12', '或', '290.00');
INSERT INTO `ab_bar_12` VALUES ('13', '者', '330.00');
INSERT INTO `ab_bar_12` VALUES ('14', '两', '310.00');
INSERT INTO `ab_bar_12` VALUES ('15', '指', '123.00');
INSERT INTO `ab_bar_12` VALUES ('16', '在', '442.00');
INSERT INTO `ab_bar_12` VALUES ('17', '触', '321.00');
INSERT INTO `ab_bar_12` VALUES ('18', '屏', '90.00');
INSERT INTO `ab_bar_12` VALUES ('19', '上', '149.00');
INSERT INTO `ab_bar_12` VALUES ('20', '滑', '210.00');
INSERT INTO `ab_bar_12` VALUES ('21', '动', '122.00');
INSERT INTO `ab_bar_12` VALUES ('22', '能', '133.00');
INSERT INTO `ab_bar_12` VALUES ('23', '够', '334.00');
INSERT INTO `ab_bar_12` VALUES ('24', '自', '198.00');
INSERT INTO `ab_bar_12` VALUES ('25', '动', '123.00');
INSERT INTO `ab_bar_12` VALUES ('26', '缩', '125.00');
INSERT INTO `ab_bar_12` VALUES ('27', '放 ', '220.00');

-- ----------------------------
-- Table structure for ab_bar_13
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_13`;
CREATE TABLE `ab_bar_13` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_13
-- ----------------------------
INSERT INTO `ab_bar_13` VALUES ('8', '2012', '320.00', '220.00', '150.00', '98.00');
INSERT INTO `ab_bar_13` VALUES ('9', '2013', '332.00', '182.00', '232.00', '77.00');
INSERT INTO `ab_bar_13` VALUES ('10', '2014', '301.00', '191.00', '201.00', '101.00');
INSERT INTO `ab_bar_13` VALUES ('11', '2015', '334.00', '234.00', '154.00', '99.00');
INSERT INTO `ab_bar_13` VALUES ('12', '2016', '390.00', '290.00', '190.00', '40.00');

-- ----------------------------
-- Table structure for ab_bar_14
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_14`;
CREATE TABLE `ab_bar_14` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_14
-- ----------------------------
INSERT INTO `ab_bar_14` VALUES ('8', '周一', '200.00', '320.00', '-120.00');
INSERT INTO `ab_bar_14` VALUES ('9', '周二', '170.00', '302.00', '-132.00');
INSERT INTO `ab_bar_14` VALUES ('10', '周三', '240.00', '341.00', '-101.00');
INSERT INTO `ab_bar_14` VALUES ('11', '周四', '244.00', '374.00', '-134.00');
INSERT INTO `ab_bar_14` VALUES ('12', '周五', '200.00', '390.00', '-190.00');
INSERT INTO `ab_bar_14` VALUES ('13', '周六', '220.00', '450.00', '-230.00');
INSERT INTO `ab_bar_14` VALUES ('14', '周日', '210.00', '420.00', '-210.00');

-- ----------------------------
-- Table structure for ab_bar_15
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_15`;
CREATE TABLE `ab_bar_15` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_15
-- ----------------------------
INSERT INTO `ab_bar_15` VALUES ('8', '北京', '5000.00', '10000.00', '6785.71');
INSERT INTO `ab_bar_15` VALUES ('9', '上海', '4000.00', '10000.00', '6825.00');
INSERT INTO `ab_bar_15` VALUES ('10', '深圳', '3000.00', '6500.00', '4463.33');
INSERT INTO `ab_bar_15` VALUES ('11', '广州', '2500.00', '5600.00', '3793.83');
INSERT INTO `ab_bar_15` VALUES ('12', '苏州', '2000.00', '4000.00', '3060.00');
INSERT INTO `ab_bar_15` VALUES ('13', '杭州', '2000.00', '4000.00', '3222.33');
INSERT INTO `ab_bar_15` VALUES ('14', '南京', '2500.00', '4000.00', '3133.33');
INSERT INTO `ab_bar_15` VALUES ('15', '福州', '1800.00', '4000.00', '3100.00');
INSERT INTO `ab_bar_15` VALUES ('16', '青岛', '2000.00', '3500.00', '2750.00');
INSERT INTO `ab_bar_15` VALUES ('17', '济南', '2000.00', '3000.00', '2500.00');
INSERT INTO `ab_bar_15` VALUES ('18', '长春', '1800.00', '3000.00', '2433.33');
INSERT INTO `ab_bar_15` VALUES ('19', '大连', '2000.00', '2700.00', '2375.00');
INSERT INTO `ab_bar_15` VALUES ('20', '温州', '1500.00', '2800.00', '2150.00');
INSERT INTO `ab_bar_15` VALUES ('21', '郑州', '1500.00', '2300.00', '2100.00');
INSERT INTO `ab_bar_15` VALUES ('22', '武汉', '1600.00', '3500.00', '2057.14');
INSERT INTO `ab_bar_15` VALUES ('23', '成都', '1500.00', '2600.00', '2037.50');
INSERT INTO `ab_bar_15` VALUES ('24', '东莞', '1500.00', '2417.54', '1905.85');
INSERT INTO `ab_bar_15` VALUES ('25', '沈阳', '1500.00', '2000.00', '1775.00');
INSERT INTO `ab_bar_15` VALUES ('26', '烟台', '1500.00', '1800.00', '1650.00');

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
) ENGINE=InnoDB AUTO_INCREMENT=163 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_columnmap
-- ----------------------------
INSERT INTO `tb_columnmap` VALUES ('129', 'showkey', null, 'varchar(20)', '76', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_columnmap` VALUES ('130', 'showvalue', null, 'double(10,2)', '76', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('131', 'showvalue1', null, 'double(10,2)', '76', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('132', 'showkey', null, 'varchar(20)', '77', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_columnmap` VALUES ('133', 'showvalue', null, 'double(10,2)', '77', null, null, null, 'false', null, '0', '0', '1号', null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('134', 'showvalue1', null, 'double(10,2)', '77', null, null, null, 'false', null, '0', '0', '2号', null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('135', 'showvalue2', null, 'double(10,2)', '77', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('136', 'showvalue3', null, 'double(10,2)', '77', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('137', 'showkey', null, 'varchar(20)', '78', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_columnmap` VALUES ('138', 'showvalue', null, 'double(10,2)', '78', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('139', 'showkey', null, 'varchar(20)', '79', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_columnmap` VALUES ('140', 'showvalue', null, 'double(10,2)', '79', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('141', 'showvalue1', null, 'double(10,2)', '79', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('142', 'showvalue2', null, 'double(10,2)', '79', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('143', 'showvalue3', null, 'double(10,2)', '79', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('144', 'showkey', null, 'varchar(20)', '80', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_columnmap` VALUES ('145', 'showvalue', null, 'double(10,2)', '80', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('146', 'showvalue1', null, 'double(10,2)', '80', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('147', 'showvalue2', null, 'double(10,2)', '80', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('148', 'showkey', null, 'varchar(20)', '81', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_columnmap` VALUES ('149', 'showvalue', null, 'double(10,2)', '81', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('150', 'showvalue1', null, 'double(10,2)', '81', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);
INSERT INTO `tb_columnmap` VALUES ('151', 'showvalue2', null, 'double(10,2)', '81', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null);

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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard
-- ----------------------------
INSERT INTO `tb_dashboard` VALUES ('16', '', null, '测试', '', null, '0');

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
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard_visualize
-- ----------------------------
INSERT INTO `tb_dashboard_visualize` VALUES ('66', '16', '81', '6', '6', '0', '0', null, 'vertical', 'topRight', '1', '1', null, null, '#1936AD', null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('67', '16', '80', '6', '6', '6', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('68', '16', '79', '6', '6', '0', '6', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('69', '16', '78', '7', '6', '6', '6', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('70', '16', '77', '6', '6', '0', '12', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('71', '16', '76', '5', '6', '6', '13', null, null, null, null, '1', null, null, null, null, null);

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_database
-- ----------------------------
INSERT INTO `tb_database` VALUES ('1', 'spark4', '3306', 'sourcedb', 'root', 'mysql', 'com.mysql.jdbc.Driver', '1', null, 'mysql');
INSERT INTO `tb_database` VALUES ('2', 'hxqh.dev', '1521', 'maxpro', 'scott', 'tiger', 'oracle.jdbc.driver.OracleDriver', '1', null, 'oracle');
INSERT INTO `tb_database` VALUES ('3', 'spark4', '3306', 'sourcedb', 'root', 'mysql', 'oracle.jdbc.driver.OracleDriver', '0', '配饰数据库-update', 'oracle');

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
INSERT INTO `tb_tablemanager` VALUES ('3', 'bar', '21', 'ab_bar_');

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
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_visualize
-- ----------------------------
INSERT INTO `tb_visualize` VALUES ('76', '工具校准单', 'ab_bar_10', 'bar', '', '柱状动态延迟', null, null, null, 'double', null, null, null, null, '1', null, null, null, 'line_source', '3', '1', null, null, null, '1', null, null, null, null, '1', null, null);
INSERT INTO `tb_visualize` VALUES ('77', '', 'ab_bar_11', 'bar', '', '柱状图框选', null, null, null, 'double', null, null, null, null, '1', null, null, null, 'line_source', '5', '1', '1', null, null, '1', null, '1', '0', null, '1', null, '1');
INSERT INTO `tb_visualize` VALUES ('78', '', 'ab_bar_12', 'bar', '', '特性示例 渐变色 ', null, null, null, 'double', null, null, null, null, null, null, null, null, 'line_source', '2', '1', null, null, null, '1', null, '1', null, null, '1', null, '1');
INSERT INTO `tb_visualize` VALUES ('79', '', 'ab_bar_13', 'bar', '', 'Bar Label Rotation', null, null, null, 'double', null, null, null, null, null, null, null, null, 'line_source', '5', '1', null, null, null, '1', null, null, null, null, '1', null, null);
INSERT INTO `tb_visualize` VALUES ('80', '工具校准单', 'ab_bar_14', 'bar', '', '正负条形图', null, null, null, 'double', null, null, null, null, null, null, null, null, 'line_source', '4', '1', null, null, null, '1', null, null, null, null, '1', null, null);
INSERT INTO `tb_visualize` VALUES ('81', '工具校准单', 'ab_bar_15', 'bar', '', '极坐标系下的堆叠柱状图', null, null, null, 'double', null, 'vertical', 'topRight', '1', '1', '#1936AD', null, null, 'line_source', '4', '1', null, null, null, '1', null, null, null, null, '1', null, null);

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
