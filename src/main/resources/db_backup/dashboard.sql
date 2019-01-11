/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : dashboard

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2019-01-10 11:34:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ab_bar_10`
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
-- Table structure for `ab_bar_11`
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
-- Table structure for `ab_bar_12`
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
-- Table structure for `ab_bar_13`
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
-- Table structure for `ab_bar_14`
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
-- Table structure for `ab_bar_22`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_22`;
CREATE TABLE `ab_bar_22` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_22
-- ----------------------------
INSERT INTO `ab_bar_22` VALUES ('1', '周一', '233.00', '26.00');
INSERT INTO `ab_bar_22` VALUES ('2', '周二', '296.00', '8.00');
INSERT INTO `ab_bar_22` VALUES ('3', '周三', '115.00', '27.00');
INSERT INTO `ab_bar_22` VALUES ('4', '周四', '180.00', '19.00');
INSERT INTO `ab_bar_22` VALUES ('5', '周五', '191.00', '20.00');
INSERT INTO `ab_bar_22` VALUES ('6', '周六', '158.00', '26.00');
INSERT INTO `ab_bar_22` VALUES ('7', '周日', '102.00', '3.00');

-- ----------------------------
-- Table structure for `ab_bar_23`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_23`;
CREATE TABLE `ab_bar_23` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `SHOWKEY` varchar(20) DEFAULT NULL,
  `COMPLETE` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_23
-- ----------------------------
INSERT INTO `ab_bar_23` VALUES ('1', '0100304', '147.00');
INSERT INTO `ab_bar_23` VALUES ('2', '0100302', '104.00');
INSERT INTO `ab_bar_23` VALUES ('3', '0100303', '62.00');
INSERT INTO `ab_bar_23` VALUES ('4', '0100301', '26.00');
INSERT INTO `ab_bar_23` VALUES ('5', '0100202', '97.00');
INSERT INTO `ab_bar_23` VALUES ('6', '0100201', '54.00');
INSERT INTO `ab_bar_23` VALUES ('7', '0100104', '8.00');
INSERT INTO `ab_bar_23` VALUES ('8', '0100102', '132.00');
INSERT INTO `ab_bar_23` VALUES ('9', '0100103', '56.00');
INSERT INTO `ab_bar_23` VALUES ('10', '0100101', '51.00');
INSERT INTO `ab_bar_23` VALUES ('11', '01003', '31.00');
INSERT INTO `ab_bar_23` VALUES ('12', '01002', '37.00');
INSERT INTO `ab_bar_23` VALUES ('13', '01001', '1.00');

-- ----------------------------
-- Table structure for `ab_bar_24`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_24`;
CREATE TABLE `ab_bar_24` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `SHOWKEY` varchar(20) DEFAULT NULL,
  `COMPLETE` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_24
-- ----------------------------
INSERT INTO `ab_bar_24` VALUES ('8', '0100202', '0.96');
INSERT INTO `ab_bar_24` VALUES ('9', '01002', '0.97');
INSERT INTO `ab_bar_24` VALUES ('10', '0100101', '0.89');
INSERT INTO `ab_bar_24` VALUES ('11', '0100303', '0.70');
INSERT INTO `ab_bar_24` VALUES ('12', '0100104', '0.47');
INSERT INTO `ab_bar_24` VALUES ('13', '0100102', '0.89');
INSERT INTO `ab_bar_24` VALUES ('14', '0100103', '0.72');
INSERT INTO `ab_bar_24` VALUES ('15', '0100304', '0.94');
INSERT INTO `ab_bar_24` VALUES ('16', '0100302', '0.90');
INSERT INTO `ab_bar_24` VALUES ('17', '0100201', '0.76');
INSERT INTO `ab_bar_24` VALUES ('18', '01001', '0.20');
INSERT INTO `ab_bar_24` VALUES ('19', '0100301', '0.74');
INSERT INTO `ab_bar_24` VALUES ('20', '01003', '0.76');

-- ----------------------------
-- Table structure for `ab_bar_25`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_25`;
CREATE TABLE `ab_bar_25` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `COMP` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_25
-- ----------------------------
INSERT INTO `ab_bar_25` VALUES ('8', '0104', '21.00');
INSERT INTO `ab_bar_25` VALUES ('9', '0101', '518.00');
INSERT INTO `ab_bar_25` VALUES ('10', '0103', '267.00');

-- ----------------------------
-- Table structure for `ab_bar_26`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_26`;
CREATE TABLE `ab_bar_26` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `COMP` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_26
-- ----------------------------
INSERT INTO `ab_bar_26` VALUES ('8', '0104', '0.60');
INSERT INTO `ab_bar_26` VALUES ('9', '0101', '0.83');
INSERT INTO `ab_bar_26` VALUES ('10', '0103', '0.90');

-- ----------------------------
-- Table structure for `ab_bar_27`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_27`;
CREATE TABLE `ab_bar_27` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `SHOWKEY` varchar(20) DEFAULT NULL,
  `COMPLETE` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_27
-- ----------------------------
INSERT INTO `ab_bar_27` VALUES ('1', '0100304', '710.90');
INSERT INTO `ab_bar_27` VALUES ('2', '0100302', '646.07');
INSERT INTO `ab_bar_27` VALUES ('3', '0100303', '690.38');
INSERT INTO `ab_bar_27` VALUES ('4', '0100301', '734.06');
INSERT INTO `ab_bar_27` VALUES ('5', '0100202', '732.23');
INSERT INTO `ab_bar_27` VALUES ('6', '0100201', '664.03');
INSERT INTO `ab_bar_27` VALUES ('7', '0100104', '687.36');
INSERT INTO `ab_bar_27` VALUES ('8', '0100102', '686.83');
INSERT INTO `ab_bar_27` VALUES ('9', '0100103', '688.26');
INSERT INTO `ab_bar_27` VALUES ('10', '0100101', '742.02');
INSERT INTO `ab_bar_27` VALUES ('11', '01003', '637.59');
INSERT INTO `ab_bar_27` VALUES ('12', '01002', '735.32');
INSERT INTO `ab_bar_27` VALUES ('13', '01001', '722.96');

-- ----------------------------
-- Table structure for `ab_bar_28`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_28`;
CREATE TABLE `ab_bar_28` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `SHOWKEY` varchar(20) DEFAULT NULL,
  `COMPLETE` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_28
-- ----------------------------
INSERT INTO `ab_bar_28` VALUES ('1', '0100304', '2.15');
INSERT INTO `ab_bar_28` VALUES ('2', '0100302', '5.11');
INSERT INTO `ab_bar_28` VALUES ('3', '0100303', '3.83');
INSERT INTO `ab_bar_28` VALUES ('4', '0100301', '0.47');
INSERT INTO `ab_bar_28` VALUES ('5', '0100202', '0.41');
INSERT INTO `ab_bar_28` VALUES ('6', '0100201', '3.05');
INSERT INTO `ab_bar_28` VALUES ('7', '0100104', '4.38');
INSERT INTO `ab_bar_28` VALUES ('8', '0100102', '1.94');
INSERT INTO `ab_bar_28` VALUES ('9', '0100103', '1.76');
INSERT INTO `ab_bar_28` VALUES ('10', '0100101', '0.06');
INSERT INTO `ab_bar_28` VALUES ('11', '01003', '3.99');
INSERT INTO `ab_bar_28` VALUES ('12', '01002', '0.46');
INSERT INTO `ab_bar_28` VALUES ('13', '01001', '1.64');

-- ----------------------------
-- Table structure for `ab_bar_29`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_29`;
CREATE TABLE `ab_bar_29` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `SHOWKEY` varchar(20) DEFAULT NULL,
  `COMPLETE` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_29
-- ----------------------------
INSERT INTO `ab_bar_29` VALUES ('1', '0100304', '2.30');
INSERT INTO `ab_bar_29` VALUES ('2', '0100302', '8.05');
INSERT INTO `ab_bar_29` VALUES ('3', '0100303', '3.38');
INSERT INTO `ab_bar_29` VALUES ('4', '0100301', '0.87');
INSERT INTO `ab_bar_29` VALUES ('5', '0100202', '1.17');
INSERT INTO `ab_bar_29` VALUES ('6', '0100201', '7.70');
INSERT INTO `ab_bar_29` VALUES ('7', '0100104', '3.23');
INSERT INTO `ab_bar_29` VALUES ('8', '0100102', '5.74');
INSERT INTO `ab_bar_29` VALUES ('9', '0100103', '5.73');
INSERT INTO `ab_bar_29` VALUES ('10', '0100101', '0.21');
INSERT INTO `ab_bar_29` VALUES ('11', '01003', '10.31');
INSERT INTO `ab_bar_29` VALUES ('12', '01002', '0.71');
INSERT INTO `ab_bar_29` VALUES ('13', '01001', '1.19');

-- ----------------------------
-- Table structure for `ab_bar_30`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_30`;
CREATE TABLE `ab_bar_30` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `SHOWKEY` varchar(20) DEFAULT NULL,
  `COMPLETE` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_30
-- ----------------------------
INSERT INTO `ab_bar_30` VALUES ('1', '0100304', '16.00');
INSERT INTO `ab_bar_30` VALUES ('2', '0100302', '38.02');
INSERT INTO `ab_bar_30` VALUES ('3', '0100303', '28.50');
INSERT INTO `ab_bar_30` VALUES ('4', '0100301', '3.50');
INSERT INTO `ab_bar_30` VALUES ('5', '0100202', '3.05');
INSERT INTO `ab_bar_30` VALUES ('6', '0100201', '22.69');
INSERT INTO `ab_bar_30` VALUES ('7', '0100104', '32.59');
INSERT INTO `ab_bar_30` VALUES ('8', '0100102', '14.43');
INSERT INTO `ab_bar_30` VALUES ('9', '0100103', '13.09');
INSERT INTO `ab_bar_30` VALUES ('10', '0100101', '0.45');
INSERT INTO `ab_bar_30` VALUES ('11', '01003', '29.69');
INSERT INTO `ab_bar_30` VALUES ('12', '01002', '3.42');
INSERT INTO `ab_bar_30` VALUES ('13', '01001', '12.20');

-- ----------------------------
-- Table structure for `ab_bar_31`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_31`;
CREATE TABLE `ab_bar_31` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `SHOWKEY` varchar(20) DEFAULT NULL,
  `COMPLETE` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_31
-- ----------------------------
INSERT INTO `ab_bar_31` VALUES ('1', '0100304', '17.11');
INSERT INTO `ab_bar_31` VALUES ('2', '0100302', '59.89');
INSERT INTO `ab_bar_31` VALUES ('3', '0100303', '25.15');
INSERT INTO `ab_bar_31` VALUES ('4', '0100301', '6.47');
INSERT INTO `ab_bar_31` VALUES ('5', '0100202', '8.70');
INSERT INTO `ab_bar_31` VALUES ('6', '0100201', '57.29');
INSERT INTO `ab_bar_31` VALUES ('7', '0100104', '24.03');
INSERT INTO `ab_bar_31` VALUES ('8', '0100102', '42.71');
INSERT INTO `ab_bar_31` VALUES ('9', '0100103', '42.63');
INSERT INTO `ab_bar_31` VALUES ('10', '0100101', '1.56');
INSERT INTO `ab_bar_31` VALUES ('11', '01003', '76.71');
INSERT INTO `ab_bar_31` VALUES ('12', '01002', '5.28');
INSERT INTO `ab_bar_31` VALUES ('13', '01001', '8.85');

-- ----------------------------
-- Table structure for `ab_bar_32`
-- ----------------------------
DROP TABLE IF EXISTS `ab_bar_32`;
CREATE TABLE `ab_bar_32` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `100304` double(10,2) DEFAULT NULL,
  `100302` double(10,2) DEFAULT NULL,
  `100303` double(10,2) DEFAULT NULL,
  `100301` double(10,2) DEFAULT NULL,
  `100202` double(10,2) DEFAULT NULL,
  `100201` double(10,2) DEFAULT NULL,
  `100104` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_bar_32
-- ----------------------------

-- ----------------------------
-- Table structure for `ab_line_17`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_17`;
CREATE TABLE `ab_line_17` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  `showvalue4` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_17
-- ----------------------------
INSERT INTO `ab_line_17` VALUES ('8', '周一', '120.00', '220.00', '150.00', '320.00', '820.00');
INSERT INTO `ab_line_17` VALUES ('9', '周二', '132.00', '182.00', '232.00', '332.00', '932.00');
INSERT INTO `ab_line_17` VALUES ('10', '周三', '101.00', '191.00', '201.00', '301.00', '901.00');
INSERT INTO `ab_line_17` VALUES ('11', '周四', '134.00', '234.00', '154.00', '334.00', '934.00');
INSERT INTO `ab_line_17` VALUES ('12', '周五', '90.00', '290.00', '190.00', '390.00', '1290.00');
INSERT INTO `ab_line_17` VALUES ('13', '周六', '230.00', '330.00', '330.00', '330.00', '1330.00');
INSERT INTO `ab_line_17` VALUES ('14', '周日', '210.00', '310.00', '410.00', '320.00', '1320.00');

-- ----------------------------
-- Table structure for `ab_line_18`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_18`;
CREATE TABLE `ab_line_18` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  `showvalue4` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_18
-- ----------------------------
INSERT INTO `ab_line_18` VALUES ('8', '周一', '120.00', '220.00', '150.00', '320.00', '820.00');
INSERT INTO `ab_line_18` VALUES ('9', '周二', '132.00', '182.00', '232.00', '332.00', '932.00');
INSERT INTO `ab_line_18` VALUES ('10', '周三', '101.00', '191.00', '201.00', '301.00', '901.00');
INSERT INTO `ab_line_18` VALUES ('11', '周四', '134.00', '234.00', '154.00', '334.00', '934.00');
INSERT INTO `ab_line_18` VALUES ('12', '周五', '90.00', '290.00', '190.00', '390.00', '1290.00');
INSERT INTO `ab_line_18` VALUES ('13', '周六', '230.00', '330.00', '330.00', '330.00', '1330.00');
INSERT INTO `ab_line_18` VALUES ('14', '周日', '210.00', '310.00', '410.00', '320.00', '1320.00');

-- ----------------------------
-- Table structure for `ab_line_19`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_19`;
CREATE TABLE `ab_line_19` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_19
-- ----------------------------
INSERT INTO `ab_line_19` VALUES ('107', '0', '22.00');
INSERT INTO `ab_line_19` VALUES ('108', '1968/10/4', '165.00');
INSERT INTO `ab_line_19` VALUES ('109', '1968/10/5', '161.00');
INSERT INTO `ab_line_19` VALUES ('110', '1968/10/6', '159.00');
INSERT INTO `ab_line_19` VALUES ('111', '1968/10/7', '164.00');
INSERT INTO `ab_line_19` VALUES ('112', '1968/10/8', '170.00');
INSERT INTO `ab_line_19` VALUES ('113', '1968/10/9', '167.00');
INSERT INTO `ab_line_19` VALUES ('114', '1968/10/10', '171.00');
INSERT INTO `ab_line_19` VALUES ('115', '1968/10/11', '174.00');
INSERT INTO `ab_line_19` VALUES ('116', '1968/10/12', '182.00');
INSERT INTO `ab_line_19` VALUES ('117', '1968/10/13', '186.00');
INSERT INTO `ab_line_19` VALUES ('118', '1968/10/14', '182.00');
INSERT INTO `ab_line_19` VALUES ('119', '1968/10/15', '191.00');
INSERT INTO `ab_line_19` VALUES ('120', '1968/10/16', '187.00');
INSERT INTO `ab_line_19` VALUES ('121', '1968/10/17', '181.00');
INSERT INTO `ab_line_19` VALUES ('122', '1968/10/18', '186.00');
INSERT INTO `ab_line_19` VALUES ('123', '1968/10/19', '195.00');
INSERT INTO `ab_line_19` VALUES ('124', '1968/10/20', '196.00');
INSERT INTO `ab_line_19` VALUES ('125', '1968/10/21', '205.00');
INSERT INTO `ab_line_19` VALUES ('126', '1968/10/22', '214.00');
INSERT INTO `ab_line_19` VALUES ('127', '1968/10/23', '221.00');
INSERT INTO `ab_line_19` VALUES ('128', '1968/10/24', '212.00');
INSERT INTO `ab_line_19` VALUES ('129', '1968/10/25', '217.00');
INSERT INTO `ab_line_19` VALUES ('130', '1968/10/26', '216.00');
INSERT INTO `ab_line_19` VALUES ('131', '1968/10/27', '214.00');
INSERT INTO `ab_line_19` VALUES ('132', '1968/10/28', '217.00');
INSERT INTO `ab_line_19` VALUES ('133', '1968/10/29', '211.00');
INSERT INTO `ab_line_19` VALUES ('134', '1968/10/30', '214.00');
INSERT INTO `ab_line_19` VALUES ('135', '1968/10/31', '219.00');
INSERT INTO `ab_line_19` VALUES ('136', '1968/11/1', '223.00');
INSERT INTO `ab_line_19` VALUES ('137', '1968/11/2', '220.00');
INSERT INTO `ab_line_19` VALUES ('138', '1968/11/3', '216.00');
INSERT INTO `ab_line_19` VALUES ('139', '1968/11/4', '217.00');
INSERT INTO `ab_line_19` VALUES ('140', '1968/11/5', '217.00');
INSERT INTO `ab_line_19` VALUES ('141', '1968/11/6', '212.00');
INSERT INTO `ab_line_19` VALUES ('142', '1968/11/7', '222.00');
INSERT INTO `ab_line_19` VALUES ('143', '1968/11/8', '225.00');
INSERT INTO `ab_line_19` VALUES ('144', '1968/11/9', '216.00');
INSERT INTO `ab_line_19` VALUES ('145', '1968/11/10', '210.00');
INSERT INTO `ab_line_19` VALUES ('146', '1968/11/11', '201.00');
INSERT INTO `ab_line_19` VALUES ('147', '1968/11/12', '203.00');
INSERT INTO `ab_line_19` VALUES ('148', '1968/11/13', '203.00');
INSERT INTO `ab_line_19` VALUES ('149', '1968/11/14', '195.00');
INSERT INTO `ab_line_19` VALUES ('150', '1968/11/15', '188.00');
INSERT INTO `ab_line_19` VALUES ('151', '1968/11/16', '183.00');
INSERT INTO `ab_line_19` VALUES ('152', '1968/11/17', '191.00');
INSERT INTO `ab_line_19` VALUES ('153', '1968/11/18', '193.00');
INSERT INTO `ab_line_19` VALUES ('154', '1968/11/19', '192.00');
INSERT INTO `ab_line_19` VALUES ('155', '1968/11/20', '185.00');
INSERT INTO `ab_line_19` VALUES ('156', '1968/11/21', '189.00');
INSERT INTO `ab_line_19` VALUES ('157', '1968/11/22', '183.00');
INSERT INTO `ab_line_19` VALUES ('158', '1968/11/23', '177.00');
INSERT INTO `ab_line_19` VALUES ('159', '1968/11/24', '181.00');
INSERT INTO `ab_line_19` VALUES ('160', '1968/11/25', '191.00');
INSERT INTO `ab_line_19` VALUES ('161', '1968/11/26', '199.00');
INSERT INTO `ab_line_19` VALUES ('162', '1968/11/27', '190.00');
INSERT INTO `ab_line_19` VALUES ('163', '1968/11/28', '193.00');
INSERT INTO `ab_line_19` VALUES ('164', '1968/11/29', '183.00');
INSERT INTO `ab_line_19` VALUES ('165', '1968/11/30', '179.00');
INSERT INTO `ab_line_19` VALUES ('166', '1968/12/1', '188.00');
INSERT INTO `ab_line_19` VALUES ('167', '1968/12/2', '196.00');
INSERT INTO `ab_line_19` VALUES ('168', '1968/12/3', '194.00');
INSERT INTO `ab_line_19` VALUES ('169', '1968/12/4', '194.00');
INSERT INTO `ab_line_19` VALUES ('170', '1968/12/5', '201.00');
INSERT INTO `ab_line_19` VALUES ('171', '1968/12/6', '208.00');
INSERT INTO `ab_line_19` VALUES ('172', '1968/12/7', '216.00');
INSERT INTO `ab_line_19` VALUES ('173', '1968/12/8', '210.00');
INSERT INTO `ab_line_19` VALUES ('174', '1968/12/9', '205.00');
INSERT INTO `ab_line_19` VALUES ('175', '1968/12/10', '196.00');
INSERT INTO `ab_line_19` VALUES ('176', '1968/12/11', '188.00');
INSERT INTO `ab_line_19` VALUES ('177', '1968/12/12', '186.00');
INSERT INTO `ab_line_19` VALUES ('178', '1968/12/13', '187.00');
INSERT INTO `ab_line_19` VALUES ('179', '1968/12/14', '194.00');
INSERT INTO `ab_line_19` VALUES ('180', '1968/12/15', '187.00');
INSERT INTO `ab_line_19` VALUES ('181', '1968/12/16', '180.00');
INSERT INTO `ab_line_19` VALUES ('182', '1968/12/17', '189.00');
INSERT INTO `ab_line_19` VALUES ('183', '1968/12/18', '191.00');
INSERT INTO `ab_line_19` VALUES ('184', '1968/12/19', '194.00');
INSERT INTO `ab_line_19` VALUES ('185', '1968/12/20', '192.00');
INSERT INTO `ab_line_19` VALUES ('186', '1968/12/21', '190.00');
INSERT INTO `ab_line_19` VALUES ('187', '1968/12/22', '185.00');
INSERT INTO `ab_line_19` VALUES ('188', '1968/12/23', '190.00');
INSERT INTO `ab_line_19` VALUES ('189', '1968/12/24', '185.00');
INSERT INTO `ab_line_19` VALUES ('190', '1968/12/25', '176.00');
INSERT INTO `ab_line_19` VALUES ('191', '1968/12/26', '179.00');
INSERT INTO `ab_line_19` VALUES ('192', '1968/12/27', '175.00');
INSERT INTO `ab_line_19` VALUES ('193', '1968/12/28', '177.00');
INSERT INTO `ab_line_19` VALUES ('194', '1968/12/29', '174.00');
INSERT INTO `ab_line_19` VALUES ('195', '1968/12/30', '182.00');
INSERT INTO `ab_line_19` VALUES ('196', '1968/12/31', '188.00');
INSERT INTO `ab_line_19` VALUES ('197', '1969/1/1', '188.00');
INSERT INTO `ab_line_19` VALUES ('198', '1969/1/2', '196.00');
INSERT INTO `ab_line_19` VALUES ('199', '1969/1/3', '198.00');
INSERT INTO `ab_line_19` VALUES ('200', '1969/1/4', '196.00');
INSERT INTO `ab_line_19` VALUES ('201', '1969/1/5', '202.00');
INSERT INTO `ab_line_19` VALUES ('202', '1969/1/6', '207.00');
INSERT INTO `ab_line_19` VALUES ('203', '1969/1/7', '200.00');
INSERT INTO `ab_line_19` VALUES ('204', '1969/1/8', '196.00');
INSERT INTO `ab_line_19` VALUES ('205', '1969/1/9', '187.00');
INSERT INTO `ab_line_19` VALUES ('206', '1969/1/10', '192.00');

-- ----------------------------
-- Table structure for `ab_line_20`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_20`;
CREATE TABLE `ab_line_20` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_20
-- ----------------------------
INSERT INTO `ab_line_20` VALUES ('8', '一', '1.00', '1.00', '12.00');
INSERT INTO `ab_line_20` VALUES ('9', '二', '3.00', '2.00', '14.00');
INSERT INTO `ab_line_20` VALUES ('10', '三', '9.00', '4.00', '18.00');
INSERT INTO `ab_line_20` VALUES ('11', '四', '27.00', '8.00', '116.00');
INSERT INTO `ab_line_20` VALUES ('12', '五', '81.00', '16.00', '132.00');
INSERT INTO `ab_line_20` VALUES ('13', '六', '247.00', '32.00', '164.00');
INSERT INTO `ab_line_20` VALUES ('14', '七', '741.00', '64.00', '1128.00');
INSERT INTO `ab_line_20` VALUES ('15', '八', '2223.00', '128.00', '1256.00');
INSERT INTO `ab_line_20` VALUES ('16', '九', '6669.00', '256.00', '1512.00');

-- ----------------------------
-- Table structure for `ab_line_21`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_21`;
CREATE TABLE `ab_line_21` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_21
-- ----------------------------
INSERT INTO `ab_line_21` VALUES ('8', '周一', '11.00', '1.00');
INSERT INTO `ab_line_21` VALUES ('9', '周二', '11.00', '-2.00');
INSERT INTO `ab_line_21` VALUES ('10', '周三', '15.00', '2.00');
INSERT INTO `ab_line_21` VALUES ('11', '周四', '13.00', '5.00');
INSERT INTO `ab_line_21` VALUES ('12', '周五', '12.00', '3.00');
INSERT INTO `ab_line_21` VALUES ('13', '周六', '13.00', '2.00');
INSERT INTO `ab_line_21` VALUES ('14', '周日', '10.00', '0.00');

-- ----------------------------
-- Table structure for `ab_line_22`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_22`;
CREATE TABLE `ab_line_22` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `100304` double(10,2) DEFAULT NULL,
  `100302` double(10,2) DEFAULT NULL,
  `100303` double(10,2) DEFAULT NULL,
  `100301` double(10,2) DEFAULT NULL,
  `100202` double(10,2) DEFAULT NULL,
  `100201` double(10,2) DEFAULT NULL,
  `100104` double(10,2) DEFAULT NULL,
  `100102` double(10,2) DEFAULT NULL,
  `100103` double(10,2) DEFAULT NULL,
  `100101` double(10,2) DEFAULT NULL,
  `1003` double(10,2) DEFAULT NULL,
  `1002` double(10,2) DEFAULT NULL,
  `1001` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_22
-- ----------------------------

-- ----------------------------
-- Table structure for `ab_line_23`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_23`;
CREATE TABLE `ab_line_23` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `100304` double(10,2) DEFAULT NULL,
  `100302` double(10,2) DEFAULT NULL,
  `100303` double(10,2) DEFAULT NULL,
  `100301` double(10,2) DEFAULT NULL,
  `100202` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_23
-- ----------------------------

-- ----------------------------
-- Table structure for `ab_line_24`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_24`;
CREATE TABLE `ab_line_24` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `100304` double(10,2) DEFAULT NULL,
  `100302` double(10,2) DEFAULT NULL,
  `100303` double(10,2) DEFAULT NULL,
  `100301` double(10,2) DEFAULT NULL,
  `100202` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_24
-- ----------------------------

-- ----------------------------
-- Table structure for `ab_line_26`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_26`;
CREATE TABLE `ab_line_26` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `GTA-Shymkent` double(10,2) DEFAULT NULL,
  `GTA-Taraz` double(10,2) DEFAULT NULL,
  `GTA-Almaty` double(10,2) DEFAULT NULL,
  `CS6` double(10,2) DEFAULT NULL,
  `CS7` double(10,2) DEFAULT NULL,
  `CCS6` double(10,2) DEFAULT NULL,
  `CCS8` double(10,2) DEFAULT NULL,
  `CS4` double(10,2) DEFAULT NULL,
  `CCS4` double(10,2) DEFAULT NULL,
  `CS1` double(10,2) DEFAULT NULL,
  `CS2` double(10,2) DEFAULT NULL,
  `CCS2` double(10,2) DEFAULT NULL,
  `KUMS` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_26
-- ----------------------------

-- ----------------------------
-- Table structure for `ab_line_27`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_27`;
CREATE TABLE `ab_line_27` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `GTA-Shymkent` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_27
-- ----------------------------

-- ----------------------------
-- Table structure for `ab_line_28`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_28`;
CREATE TABLE `ab_line_28` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `GTA-Shymkent` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_28
-- ----------------------------

-- ----------------------------
-- Table structure for `ab_line_30`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_30`;
CREATE TABLE `ab_line_30` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `GTA-Shymkent` double(10,2) DEFAULT NULL,
  `GTA-Taraz` double(10,2) DEFAULT NULL,
  `GTA-Almaty` double(10,2) DEFAULT NULL,
  `CS6` double(10,2) DEFAULT NULL,
  `CS7` double(10,2) DEFAULT NULL,
  `CCS6` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_30
-- ----------------------------

-- ----------------------------
-- Table structure for `ab_line_32`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_32`;
CREATE TABLE `ab_line_32` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `CS6` double(10,2) DEFAULT NULL,
  `CS7` double(10,2) DEFAULT NULL,
  `CS4` double(10,2) DEFAULT NULL,
  `CS1` double(10,2) DEFAULT NULL,
  `CS2` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_32
-- ----------------------------
INSERT INTO `ab_line_32` VALUES ('1', '1', '6.60', '0.40', '4.60', '1.80', '8.80');
INSERT INTO `ab_line_32` VALUES ('2', '2', '1.60', '8.30', '1.70', '5.10', '4.30');
INSERT INTO `ab_line_32` VALUES ('3', '3', '5.90', '4.90', '4.00', '1.90', '9.80');
INSERT INTO `ab_line_32` VALUES ('4', '4', '1.20', '8.90', '10.00', '8.40', '3.90');
INSERT INTO `ab_line_32` VALUES ('5', '5', '4.50', '4.20', '4.00', '2.30', '1.50');
INSERT INTO `ab_line_32` VALUES ('6', '6', '5.60', '3.70', '4.40', '7.30', '4.60');
INSERT INTO `ab_line_32` VALUES ('7', '7', '8.20', '6.40', '0.40', '1.80', '7.80');
INSERT INTO `ab_line_32` VALUES ('8', '8', '3.50', '9.90', '3.90', '2.00', '6.30');
INSERT INTO `ab_line_32` VALUES ('9', '9', '4.30', '2.40', '1.50', '7.00', '4.40');
INSERT INTO `ab_line_32` VALUES ('10', '10', '6.10', '4.10', '1.40', '5.20', '8.30');
INSERT INTO `ab_line_32` VALUES ('11', '11', '1.40', '9.60', '1.60', '6.10', '5.30');
INSERT INTO `ab_line_32` VALUES ('12', '12', '4.50', '0.20', '3.00', '2.80', '1.80');

-- ----------------------------
-- Table structure for `ab_line_33`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_33`;
CREATE TABLE `ab_line_33` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `GTAShymkent` double(10,2) DEFAULT NULL,
  `GTATaraz` double(10,2) DEFAULT NULL,
  `GTAAlmaty` double(10,2) DEFAULT NULL,
  `CS6` double(10,2) DEFAULT NULL,
  `CS7` double(10,2) DEFAULT NULL,
  `CCS6` double(10,2) DEFAULT NULL,
  `CCS8` double(10,2) DEFAULT NULL,
  `CCS4` double(10,2) DEFAULT NULL,
  `CS4` double(10,2) DEFAULT NULL,
  `CS1` double(10,2) DEFAULT NULL,
  `CS2` double(10,2) DEFAULT NULL,
  `CCS2` double(10,2) DEFAULT NULL,
  `KUMS` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_33
-- ----------------------------
INSERT INTO `ab_line_33` VALUES ('1', '1', '2.20', '6.30', '9.90', '2.30', '3.00', '3.40', '3.50', '0.40', '1.80', '3.30', '7.50', '2.60', '9.80');
INSERT INTO `ab_line_33` VALUES ('2', '2', '8.30', '0.40', '7.20', '9.70', '1.20', '8.20', '1.50', '3.70', '8.00', '3.10', '1.70', '8.30', '7.80');
INSERT INTO `ab_line_33` VALUES ('3', '3', '7.70', '2.80', '2.70', '4.40', '2.10', '1.00', '3.00', '5.60', '7.50', '4.60', '6.10', '4.70', '2.70');
INSERT INTO `ab_line_33` VALUES ('4', '4', '6.90', '3.40', '0.60', '4.80', '3.00', '3.00', '6.30', '5.50', '9.80', '9.60', '5.60', '4.60', '9.00');
INSERT INTO `ab_line_33` VALUES ('5', '5', '9.90', '0.50', '4.90', '3.10', '7.70', '1.70', '7.30', '1.40', '7.10', '3.80', '8.90', '1.70', '5.10');
INSERT INTO `ab_line_33` VALUES ('6', '6', '2.70', '3.00', '4.20', '10.00', '5.80', '8.70', '2.10', '6.50', '1.60', '8.60', '4.10', '6.70', '3.50');
INSERT INTO `ab_line_33` VALUES ('7', '7', '1.90', '7.10', '8.50', '6.80', '1.30', '6.30', '5.10', '6.20', '8.20', '2.80', '7.40', '1.30', '2.80');
INSERT INTO `ab_line_33` VALUES ('8', '8', '7.60', '3.80', '9.20', '0.40', '7.90', '6.70', '8.40', '9.40', '3.50', '1.80', '2.70', '1.00', '2.60');
INSERT INTO `ab_line_33` VALUES ('9', '9', '6.80', '4.90', '9.40', '0.30', '9.90', '1.30', '0.70', '8.30', '1.30', '3.80', '7.60', '5.50', '1.20');
INSERT INTO `ab_line_33` VALUES ('10', '10', '0.20', '6.70', '9.80', '5.10', '5.10', '5.60', '8.00', '1.00', '8.00', '9.60', '0.90', '8.50', '8.20');
INSERT INTO `ab_line_33` VALUES ('11', '11', '6.80', '4.50', '6.10', '3.70', '2.10', '1.70', '0.10', '7.10', '4.20', '0.30', '8.40', '1.10', '4.60');
INSERT INTO `ab_line_33` VALUES ('12', '12', '7.40', '0.90', '6.80', '3.30', '9.40', '8.90', '4.60', '5.30', '0.50', '6.20', '1.00', '8.20', '3.50');

-- ----------------------------
-- Table structure for `ab_line_34`
-- ----------------------------
DROP TABLE IF EXISTS `ab_line_34`;
CREATE TABLE `ab_line_34` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `GTAShymkent` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_line_34
-- ----------------------------
INSERT INTO `ab_line_34` VALUES ('8', '0', '0.00');
INSERT INTO `ab_line_34` VALUES ('9', 'Jan', '8.00');
INSERT INTO `ab_line_34` VALUES ('10', 'Feb', '18.00');
INSERT INTO `ab_line_34` VALUES ('11', 'Mar', '24.00');
INSERT INTO `ab_line_34` VALUES ('12', 'Apr', '29.00');
INSERT INTO `ab_line_34` VALUES ('13', 'May', '40.00');
INSERT INTO `ab_line_34` VALUES ('14', 'Jun', '46.00');
INSERT INTO `ab_line_34` VALUES ('15', 'Jul', '53.00');
INSERT INTO `ab_line_34` VALUES ('16', 'Aug', '60.00');
INSERT INTO `ab_line_34` VALUES ('17', 'Sep', '61.00');
INSERT INTO `ab_line_34` VALUES ('18', 'Oct', '64.00');
INSERT INTO `ab_line_34` VALUES ('19', 'Nov', '70.00');
INSERT INTO `ab_line_34` VALUES ('20', 'Dec', '80.00');

-- ----------------------------
-- Table structure for `ab_pie_10`
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_10`;
CREATE TABLE `ab_pie_10` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_10
-- ----------------------------
INSERT INTO `ab_pie_10` VALUES ('1', '直接访问', '235.00', '24.00');
INSERT INTO `ab_pie_10` VALUES ('2', '邮件营销', '285.00', '9.00');
INSERT INTO `ab_pie_10` VALUES ('3', '联盟广告', '35.00', '14.00');
INSERT INTO `ab_pie_10` VALUES ('4', '视频广告', '258.00', '8.00');
INSERT INTO `ab_pie_10` VALUES ('5', '搜索引擎', '17.00', '5.00');
INSERT INTO `ab_pie_10` VALUES ('6', '简介访问', '206.00', '6.00');
INSERT INTO `ab_pie_10` VALUES ('7', '抖音广告', '13.00', '2.00');

-- ----------------------------
-- Table structure for `ab_pie_11`
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_11`;
CREATE TABLE `ab_pie_11` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_11
-- ----------------------------
INSERT INTO `ab_pie_11` VALUES ('1', '直接访问', '29.00');
INSERT INTO `ab_pie_11` VALUES ('2', '邮件营销', '23.00');
INSERT INTO `ab_pie_11` VALUES ('3', '联盟广告', '20.00');
INSERT INTO `ab_pie_11` VALUES ('4', '视频广告', '6.00');
INSERT INTO `ab_pie_11` VALUES ('5', '搜索引擎', '22.00');
INSERT INTO `ab_pie_11` VALUES ('6', '简介访问', '1.00');
INSERT INTO `ab_pie_11` VALUES ('7', '抖音广告', '27.00');

-- ----------------------------
-- Table structure for `ab_pie_12`
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_12`;
CREATE TABLE `ab_pie_12` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_12
-- ----------------------------
INSERT INTO `ab_pie_12` VALUES ('8', '直接访问', '335.00');
INSERT INTO `ab_pie_12` VALUES ('9', '邮件营销', '310.00');
INSERT INTO `ab_pie_12` VALUES ('10', '联盟广告', '274.00');
INSERT INTO `ab_pie_12` VALUES ('11', '视频广告', '235.00');
INSERT INTO `ab_pie_12` VALUES ('12', '搜索引擎', '400.00');

-- ----------------------------
-- Table structure for `ab_pie_13`
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_13`;
CREATE TABLE `ab_pie_13` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_13
-- ----------------------------
INSERT INTO `ab_pie_13` VALUES ('8', '直接访问', '335.00');
INSERT INTO `ab_pie_13` VALUES ('9', '邮件营销', '310.00');
INSERT INTO `ab_pie_13` VALUES ('10', '联盟广告', '274.00');
INSERT INTO `ab_pie_13` VALUES ('11', '视频广告', '235.00');
INSERT INTO `ab_pie_13` VALUES ('12', '搜索引擎', '400.00');

-- ----------------------------
-- Table structure for `ab_pie_14`
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_14`;
CREATE TABLE `ab_pie_14` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_14
-- ----------------------------
INSERT INTO `ab_pie_14` VALUES ('8', '魏陈', '63.00');
INSERT INTO `ab_pie_14` VALUES ('9', '戚项章·康吕', '76.00');
INSERT INTO `ab_pie_14` VALUES ('10', '赵魏苗', '23.00');
INSERT INTO `ab_pie_14` VALUES ('11', '郑张', '17.00');
INSERT INTO `ab_pie_14` VALUES ('12', '韦顾蒋尹乐·席郝米', '36.00');
INSERT INTO `ab_pie_14` VALUES ('13', '傅宋郎·穆金董', '97.00');
INSERT INTO `ab_pie_14` VALUES ('14', '茅平郝明袁·范贾凤', '79.00');
INSERT INTO `ab_pie_14` VALUES ('15', '蒋费喻娄·奚云尤', '79.00');
INSERT INTO `ab_pie_14` VALUES ('16', '严褚何张·伍郑', '98.00');
INSERT INTO `ab_pie_14` VALUES ('17', '唐蒋', '61.00');
INSERT INTO `ab_pie_14` VALUES ('18', '郝祁贺·华袁唐', '66.00');
INSERT INTO `ab_pie_14` VALUES ('19', '邹阮纪·彭米余', '95.00');
INSERT INTO `ab_pie_14` VALUES ('20', '凤滕', '92.00');
INSERT INTO `ab_pie_14` VALUES ('21', '陶毕', '41.00');
INSERT INTO `ab_pie_14` VALUES ('22', '姚于闵', '14.00');
INSERT INTO `ab_pie_14` VALUES ('23', '韦屈', '22.00');
INSERT INTO `ab_pie_14` VALUES ('24', '倪酆', '63.00');
INSERT INTO `ab_pie_14` VALUES ('25', '韦陶苏花汪·王葛', '75.00');
INSERT INTO `ab_pie_14` VALUES ('26', '邹危·孟吕', '89.00');
INSERT INTO `ab_pie_14` VALUES ('27', '彭屈毛马周·曹潘唐', '19.00');
INSERT INTO `ab_pie_14` VALUES ('28', '陶凤苗', '93.00');
INSERT INTO `ab_pie_14` VALUES ('29', '卫蒋', '60.00');
INSERT INTO `ab_pie_14` VALUES ('30', '尹闵', '62.00');
INSERT INTO `ab_pie_14` VALUES ('31', '狄路毛·平', '90.00');
INSERT INTO `ab_pie_14` VALUES ('32', '汤朱康', '32.00');
INSERT INTO `ab_pie_14` VALUES ('33', '贝花', '88.00');
INSERT INTO `ab_pie_14` VALUES ('34', '狄罗顾', '18.00');
INSERT INTO `ab_pie_14` VALUES ('35', '元明水', '38.00');
INSERT INTO `ab_pie_14` VALUES ('36', '阮傅乐', '3.00');
INSERT INTO `ab_pie_14` VALUES ('37', '梁明·孟伏', '25.00');
INSERT INTO `ab_pie_14` VALUES ('38', '花祝', '66.00');
INSERT INTO `ab_pie_14` VALUES ('39', '禹尤金', '97.00');
INSERT INTO `ab_pie_14` VALUES ('40', '卜何蒋', '7.00');
INSERT INTO `ab_pie_14` VALUES ('41', '康安潘', '84.00');
INSERT INTO `ab_pie_14` VALUES ('42', '柳金', '91.00');
INSERT INTO `ab_pie_14` VALUES ('43', '陶苏安廉路·贝', '92.00');
INSERT INTO `ab_pie_14` VALUES ('44', '乐陶·罗褚谢', '60.00');
INSERT INTO `ab_pie_14` VALUES ('45', '奚阮葛', '23.00');
INSERT INTO `ab_pie_14` VALUES ('46', '尤许柳魏韩·臧', '93.00');
INSERT INTO `ab_pie_14` VALUES ('47', '平岑·路乐冯', '89.00');
INSERT INTO `ab_pie_14` VALUES ('48', '伍傅尤·方冯明', '32.00');
INSERT INTO `ab_pie_14` VALUES ('49', '康孟', '80.00');
INSERT INTO `ab_pie_14` VALUES ('50', '蓝唐', '41.00');
INSERT INTO `ab_pie_14` VALUES ('51', '庞阮', '72.00');
INSERT INTO `ab_pie_14` VALUES ('52', '伏廉金·臧魏', '54.00');
INSERT INTO `ab_pie_14` VALUES ('53', '路沈皮·鲁窦曹', '32.00');
INSERT INTO `ab_pie_14` VALUES ('54', '茅邹章·郑强', '53.00');
INSERT INTO `ab_pie_14` VALUES ('55', '冯曹平冯·邬秦', '97.00');
INSERT INTO `ab_pie_14` VALUES ('56', '杨常麻', '35.00');
INSERT INTO `ab_pie_14` VALUES ('57', '安窦', '76.00');

-- ----------------------------
-- Table structure for `ab_pie_15`
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_15`;
CREATE TABLE `ab_pie_15` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_15
-- ----------------------------
INSERT INTO `ab_pie_15` VALUES ('8', 'rose1', '10.00', '10.00');
INSERT INTO `ab_pie_15` VALUES ('9', 'rose2', '5.00', '5.00');
INSERT INTO `ab_pie_15` VALUES ('10', 'rose3', '15.00', '15.00');
INSERT INTO `ab_pie_15` VALUES ('11', 'rose4', '25.00', '25.00');
INSERT INTO `ab_pie_15` VALUES ('12', 'rose5', '20.00', '20.00');
INSERT INTO `ab_pie_15` VALUES ('13', 'rose6', '35.00', '35.00');
INSERT INTO `ab_pie_15` VALUES ('14', 'rose7', '30.00', '30.00');
INSERT INTO `ab_pie_15` VALUES ('15', 'rose8', '40.00', '40.00');

-- ----------------------------
-- Table structure for `ab_pie_16`
-- ----------------------------
DROP TABLE IF EXISTS `ab_pie_16`;
CREATE TABLE `ab_pie_16` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ab_pie_16
-- ----------------------------
INSERT INTO `ab_pie_16` VALUES ('8', '直接访问', '335.00');
INSERT INTO `ab_pie_16` VALUES ('9', '邮件营销', '310.00');
INSERT INTO `ab_pie_16` VALUES ('10', '联盟广告', '234.00');
INSERT INTO `ab_pie_16` VALUES ('11', '视频广告', '135.00');
INSERT INTO `ab_pie_16` VALUES ('12', '搜索引擎', '1548.00');

-- ----------------------------
-- Table structure for `tb_columnmap`
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=265 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_columnmap
-- ----------------------------
INSERT INTO `tb_columnmap` VALUES ('129', 'showkey', null, 'varchar(20)', '76', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('130', 'showvalue', null, 'double(10,2)', '76', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('131', 'showvalue1', null, 'double(10,2)', '76', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('132', 'showkey', null, 'varchar(20)', '77', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('133', 'showvalue', null, 'double(10,2)', '77', null, null, '#2950D2', 'true', 'right', '1', '1', '1号', null, null, null, '1', 'line', null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('134', 'showvalue1', null, 'double(10,2)', '77', null, null, null, 'false', null, '0', '0', '2号', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('135', 'showvalue2', null, 'double(10,2)', '77', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('136', 'showvalue3', null, 'double(10,2)', '77', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('137', 'showkey', null, 'varchar(20)', '78', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('138', 'showvalue', null, 'double(10,2)', '78', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('139', 'showkey', null, 'varchar(20)', '79', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('140', 'showvalue', null, 'double(10,2)', '79', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('141', 'showvalue1', null, 'double(10,2)', '79', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('142', 'showvalue2', null, 'double(10,2)', '79', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('143', 'showvalue3', null, 'double(10,2)', '79', null, null, null, 'false', null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('144', 'showkey', null, 'varchar(20)', '80', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('145', 'showvalue', null, 'double(10,2)', '80', null, null, null, 'false', null, '0', '0', '类别A', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('146', 'showvalue1', null, 'double(10,2)', '80', null, null, null, 'false', null, '0', '0', '类别B', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('147', 'showvalue2', null, 'double(10,2)', '80', null, null, null, 'false', null, '0', '0', '类别C', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('166', 'showkey', null, 'varchar(20)', '86', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('167', 'showvalue', null, 'double(10,2)', '86', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('168', 'showvalue1', null, 'double(10,2)', '86', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('169', 'showvalue2', null, 'double(10,2)', '86', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('170', 'showvalue3', null, 'double(10,2)', '86', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('171', 'showvalue4', null, 'double(10,2)', '86', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('172', 'showkey', null, 'varchar(20)', '87', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('173', 'showvalue', null, 'double(10,2)', '87', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('174', 'showvalue1', null, 'double(10,2)', '87', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('175', 'showvalue2', null, 'double(10,2)', '87', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('176', 'showvalue3', null, 'double(10,2)', '87', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('177', 'showvalue4', null, 'double(10,2)', '87', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('178', 'showkey', null, 'varchar(20)', '88', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('179', 'showvalue', null, 'double(10,2)', '88', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('180', 'showkey', null, 'varchar(20)', '89', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('181', 'showvalue', null, 'double(10,2)', '89', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('182', 'showvalue1', null, 'double(10,2)', '89', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('183', 'showvalue2', null, 'double(10,2)', '89', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('184', 'showkey', null, 'varchar(20)', '90', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('185', 'showvalue', null, 'double(10,2)', '90', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('186', 'showvalue1', null, 'double(10,2)', '90', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('187', 'showkey', null, 'varchar(20)', '91', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('188', 'showvalue', null, 'double(10,2)', '91', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('189', 'showvalue1', null, 'double(10,2)', '91', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('190', 'showkey', null, 'varchar(20)', '92', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('191', 'showvalue', null, 'double(10,2)', '92', null, null, '#46BE39', 'true', 'left', '1', '1', '体重', null, null, null, '0', 'line', null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('192', 'showvalue1', null, 'double(10,2)', '92', null, null, null, 'false', null, '1', '1', '身高', null, null, null, '0', 'bar', null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('193', 'showkey', null, 'varchar(20)', '93', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('194', 'showvalue', null, 'double(10,2)', '93', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('195', 'showkey', null, 'varchar(20)', '94', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('196', 'showvalue', null, 'double(10,2)', '94', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('197', 'showkey', null, 'varchar(20)', '95', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('198', 'showvalue', null, 'double(10,2)', '95', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('199', 'showkey', null, 'varchar(20)', '96', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('200', 'showvalue', null, 'double(10,2)', '96', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('201', 'showkey', null, 'varchar(20)', '97', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('202', 'showvalue', null, 'double(10,2)', '97', null, null, null, 'false', null, '0', '0', 'showvalue', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('203', 'showvalue2', null, 'double(10,2)', '97', null, null, null, 'false', null, '0', '0', 'showvalue2', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('204', 'showkey', null, 'varchar(20)', '98', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('205', 'showvalue', null, 'double(10,2)', '98', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('206', 'SHOWKEY', null, 'varchar(20)', '99', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('207', 'COMPLETE', null, 'double(10,2)', '99', null, null, '#1B3389', 'true', 'top', '0', '0', 'COMPLETE', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('208', 'SHOWKEY', null, 'varchar(20)', '100', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('209', 'COMPLETE', null, 'double(10,2)', '100', null, null, '#001EFF', 'true', 'top', '0', '0', 'COMPLETE', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('210', 'showkey', null, 'varchar(20)', '101', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('211', 'COMP', null, 'double(10,2)', '101', null, null, '#0400FF', 'true', 'top', '0', '0', 'COMP', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('212', 'showkey', null, 'varchar(20)', '102', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('213', 'COMP', null, 'double(10,2)', '102', null, null, '#00FF40', 'true', 'top', '0', '0', 'COMP', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('214', 'SHOWKEY', null, 'varchar(20)', '103', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('215', 'COMPLETE', null, 'double(10,2)', '103', null, null, '#0051FF', 'true', 'top', '0', '0', 'COMPLETE', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('216', 'SHOWKEY', null, 'varchar(20)', '104', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('217', 'COMPLETE', null, 'double(10,2)', '104', null, null, '#0014F2', 'true', 'top', '0', '0', 'COMPLETE', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('218', 'SHOWKEY', null, 'varchar(20)', '105', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('219', 'COMPLETE', null, 'double(10,2)', '105', null, null, '#0074F1', 'true', 'top', '0', '0', 'COMPLETE', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('220', 'SHOWKEY', null, 'varchar(20)', '106', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('221', 'COMPLETE', null, 'double(10,2)', '106', null, null, '#FF003C', 'true', 'top', '0', '0', 'COMPLETE', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('222', 'SHOWKEY', null, 'varchar(20)', '107', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('223', 'COMPLETE', null, 'double(10,2)', '107', null, null, '#FFF200', 'true', 'top', '0', '0', 'COMPLETE', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('235', 'showkey', null, 'varchar(20)', '111', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('239', 'CS6', null, 'double(10,2)', '111', null, null, null, 'false', null, '0', '0', 'CS6', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('240', 'CS7', null, 'double(10,2)', '111', null, null, null, 'false', null, '0', '0', 'CS7', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('243', 'CS4', null, 'double(10,2)', '111', null, null, null, 'false', null, '0', '0', 'CS4', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('245', 'CS1', null, 'double(10,2)', '111', null, null, null, 'false', null, '0', '0', 'CS1', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('246', 'CS2', null, 'double(10,2)', '111', null, null, null, 'false', null, '0', '0', 'CS2', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('249', 'showkey', null, 'varchar(20)', '112', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('250', 'GTAShymkent', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'GTAShymkent', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('251', 'GTATaraz', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'GTATaraz', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('252', 'GTAAlmaty', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'GTAAlmaty', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('253', 'CS6', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'CS6', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('254', 'CS7', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'CS7', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('255', 'CCS6', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'CCS6', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('256', 'CCS8', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'CCS8', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('257', 'CCS4', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'CCS4', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('258', 'CS4', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'CS4', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('259', 'CS1', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'CS1', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('260', 'CS2', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'CS2', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('261', 'CCS2', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'CCS2', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('262', 'KUMS', null, 'double(10,2)', '112', null, null, null, 'false', null, '0', '0', 'KUMS', null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('263', 'showkey', null, 'varchar(20)', '113', null, null, null, null, null, '0', '0', null, null, null, null, '0', null, null, '0', null, null, null, '0', '1', '0', null, null, '0', null, '0');
INSERT INTO `tb_columnmap` VALUES ('264', 'GTAShymkent', null, 'double(10,2)', '113', null, null, '#00FFD4', 'false', null, '0', '0', 'GTAShymkent', null, null, null, '0', null, null, '0', null, null, '#00FFE5', '0', '1', '0', null, null, '0', null, '0');

-- ----------------------------
-- Table structure for `tb_dashboard`
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
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard
-- ----------------------------
INSERT INTO `tb_dashboard` VALUES ('16', '', null, '柱状图', '', null, '0');
INSERT INTO `tb_dashboard` VALUES ('17', '松姐演示', null, '张松演示', '', null, '0');
INSERT INTO `tb_dashboard` VALUES ('18', '工具校准单', null, '折线图测试', '折线图测试', null, '0');
INSERT INTO `tb_dashboard` VALUES ('20', '工具校准单', null, '测试视图新增', '测试视图新增', null, '0');
INSERT INTO `tb_dashboard` VALUES ('21', '松姐演示', '工单完成率', 'AGP-工单完成率', 'AGP-各站场工单完成率', null, '0');
INSERT INTO `tb_dashboard` VALUES ('22', '松姐演示', null, 'AGP-各站场故障维护停机率', '各站场故障维护停机率', null, '0');
INSERT INTO `tb_dashboard` VALUES ('23', '松姐演示', null, '年度故障停机率', '年度故障停机率', null, '0');

-- ----------------------------
-- Table structure for `tb_dashboard_visualize`
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
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dashboard_visualize
-- ----------------------------
INSERT INTO `tb_dashboard_visualize` VALUES ('67', '16', '80', '8', '12', '0', '9', null, null, null, null, null, '日期', '销量', null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('68', '16', '79', '7', '12', '0', '25', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('69', '16', '78', '8', '12', '0', '17', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('70', '16', '77', '6', '12', '0', '32', null, null, null, null, '1', null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('73', '16', '76', '9', '12', '0', '0', null, null, null, null, '1', null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('74', '17', '92', '10', '7', '5', '0', null, 'vertical', 'topRight', '1', '1', '星期', '体重', '#606465', null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('75', '17', '79', '10', '5', '0', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('76', '17', '80', '13', '12', '0', '10', null, 'horizontal', 'topRight', '1', null, '日期', '销量', null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('77', '18', '90', '7', '6', '0', '28', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('78', '18', '89', '8', '6', '0', '20', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('79', '18', '88', '8', '6', '6', '20', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('80', '18', '87', '10', '7', '0', '10', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('81', '18', '86', '10', '7', '0', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('82', '21', '100', '8', '8', '4', '0', '各站场工单完成率', null, null, '0', '1', null, null, '#FFFFFF', '#000000', 'topLeft');
INSERT INTO `tb_dashboard_visualize` VALUES ('83', '21', '99', '8', '8', '4', '8', '各站场工单完成数量', null, null, '0', '1', null, null, null, '#000000', 'topLeft');
INSERT INTO `tb_dashboard_visualize` VALUES ('84', '21', '102', '8', '4', '0', '0', '各部门工单完成率', null, null, null, '1', null, null, '#FFFFFF', '#000000', 'topLeft');
INSERT INTO `tb_dashboard_visualize` VALUES ('85', '21', '101', '8', '4', '0', '8', '各部门工单完成数量', null, null, null, null, null, null, null, '#000000', 'topLeft');
INSERT INTO `tb_dashboard_visualize` VALUES ('86', '22', '107', '8', '4', '8', '7', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('87', '22', '106', '8', '4', '4', '7', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('88', '22', '105', '7', '6', '6', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('89', '22', '104', '7', '6', '0', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_dashboard_visualize` VALUES ('90', '22', '103', '8', '4', '0', '7', '各站场运行小时数', null, null, null, '1', null, null, null, '#000000', 'topLeft');
INSERT INTO `tb_dashboard_visualize` VALUES ('91', '23', '112', '8', '12', '0', '8', '年度维修停机率跟踪', 'horizontal', 'bottomCenter', '1', '1', null, null, '#FFFFFF', '#030303', 'topLeft');
INSERT INTO `tb_dashboard_visualize` VALUES ('92', '23', '111', '8', '12', '0', '0', '年度故障停机率跟踪', 'horizontal', 'bottomCenter', '1', '1', null, null, null, '#000000', 'topLeft');

-- ----------------------------
-- Table structure for `tb_database`
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
  PRIMARY KEY (`dbid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tb_database
-- ----------------------------
INSERT INTO `tb_database` VALUES ('1', '127.0.0.1', '3306', 'sourcedb', 'root', 'PyCEEmyp9tIi+jLM9zTzeQ==', 'com.mysql.jdbc.Driver', '1', 'MySQL数据源', 'mysql', '连接失败');
INSERT INTO `tb_database` VALUES ('2', 'hxqh.dev', '1521', 'maxpro', 'scott', 'ZslYHFgjOAHaCooyJPnO6w==', 'oracle.jdbc.driver.OracleDriver', '1', 'Oracle数据源', 'oracle', '连接成功');
INSERT INTO `tb_database` VALUES ('5', 'hxqh.dev', '1521', 'maxpro', 'scott', 'ZslYHFgjOAHaCooyJPnO6w==', 'oracle.jdbc.driver.OracleDriver', '1', '松', 'oracle', '连接失败');

-- ----------------------------
-- Table structure for `tb_model`
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
-- Table structure for `tb_orientx`
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_orientx
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_orienty`
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_orienty
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_role`
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
-- Table structure for `tb_rolemodel`
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
-- Table structure for `tb_tablemanager`
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
INSERT INTO `tb_tablemanager` VALUES ('1', 'line', '35', 'ab_line_');
INSERT INTO `tb_tablemanager` VALUES ('2', 'pie', '17', 'ab_pie_');
INSERT INTO `tb_tablemanager` VALUES ('3', 'bar', '33', 'ab_bar_');

-- ----------------------------
-- Table structure for `tb_user`
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
-- Table structure for `tb_userrole`
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
-- Table structure for `tb_visualize`
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
  `legend_sel_data` varchar(500) DEFAULT NULL,
  `legend_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`vid`),
  UNIQUE KEY `IDX_visualizename` (`visualizename`),
  UNIQUE KEY `IDX_tablename` (`tablename`)
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_visualize
-- ----------------------------
INSERT INTO `tb_visualize` VALUES ('76', '工具校准单', 'ab_bar_10', 'bar', '', '柱状动态延迟', null, null, null, 'value', null, null, null, null, '1', null, null, null, 'line_source', '3', '1', null, null, null, '1', null, null, null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('77', '工具校准单', 'ab_bar_11', 'bar', '', '柱状图框选', null, null, null, 'value', null, null, null, null, '1', null, null, null, 'line_source', '5', '1', '1', null, null, '1', null, '1', '0', null, '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('78', '工具校准单', 'ab_bar_12', 'bar', '', '特性示例 渐变色 ', null, null, null, 'value', null, null, null, null, null, null, null, null, 'line_source', '2', '1', null, null, null, '1', null, '1', null, null, '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('79', '工具校准单', 'ab_bar_13', 'bar', '', 'Bar Label Rotation', null, null, null, 'value', null, null, null, null, null, null, null, null, 'line_source', '5', '1', null, null, null, '1', null, null, null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('80', '工具校准单', 'ab_bar_14', 'bar', '', '正负条形图', null, '日期', '销量', 'value', null, 'horizontal', 'topRight', '1', null, null, null, null, 'line_source', '4', '1', null, null, '', '1', null, null, null, '（吨）', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('86', '折线图样例', 'ab_line_17', 'line', '', '堆叠区域图', null, null, null, 'value', null, null, null, null, null, null, null, null, 'line_source', '6', '1', null, null, null, '1', null, '1', null, null, '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('87', '折线图样例', 'ab_line_18', 'line', '', '折线图堆叠', null, null, null, 'value', null, null, null, null, null, null, null, null, 'line_source', '6', '1', null, null, null, '1', null, '1', null, null, '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('88', '折线图样例', 'ab_line_19', 'line', '', '大数据量面积图', null, null, null, 'value', null, null, null, null, null, null, null, null, 'line_source', '2', '1', null, null, null, '1', null, '1', null, null, '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('89', '折线图样例', 'ab_line_20', 'line', '', '对数轴示例', null, null, null, 'value', null, null, null, null, null, null, null, null, 'line_source', '4', '1', null, null, null, '1', null, '1', null, null, '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('90', '折线图样例', 'ab_line_21', 'line', '', '未来一周气温变化', null, null, null, 'value', null, null, null, null, null, null, null, null, 'line_source', '3', '1', null, null, null, '1', null, '1', null, null, '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('91', '饼图样例', 'ab_pie_10', 'pie', '', 'pie多列', null, null, null, 'double', null, null, null, null, null, null, null, null, 'line_source', '3', '1', null, null, null, '1', null, '1', null, null, '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('92', '松姐演示', 'ab_bar_22', 'bar', '', '松-1', null, '星期', '体重', 'double', null, 'vertical', 'topRight', '1', '1', '#606465', null, null, 'LINE_SOURCE', '3', '5', null, null, '天', '1', null, '1', null, 'KG', '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('93', '饼图样例', 'ab_pie_11', 'pie', '', 'pie单列', null, null, null, 'double', null, null, null, null, null, null, null, null, 'pie_source', '2', '1', null, null, null, '1', null, '1', null, null, '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('94', '饼图样例', 'ab_pie_12', 'pie', '', 'Customized Pie', null, null, null, 'double', null, null, null, null, null, null, null, null, 'pie_source', '2', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('95', '饼图样例', 'ab_pie_13', 'pie', '', 'Doughnut-Chart', null, null, null, 'double', null, null, null, null, null, null, null, null, 'pie_source', '2', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('96', '饼图样例', 'ab_pie_14', 'pie', '', '同名数量统计', null, null, null, 'double', null, null, null, null, null, null, null, null, 'pie_source', '2', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('97', '饼图样例', 'ab_pie_15', 'pie', '', '南丁格尔玫瑰图', null, null, null, 'double', null, null, null, null, null, null, null, null, 'pie_source_double', '3', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, 'rose1,rose3,rose4,rose2', null);
INSERT INTO `tb_visualize` VALUES ('98', '饼图样例', 'ab_pie_16', 'pie', '', '某站点用户访问来源', null, null, null, 'double', null, null, null, null, null, null, null, null, 'pie_source', '2', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('99', '松姐演示', 'ab_bar_23', 'bar', '工单完成率', 'AGP-工单完成数量', null, null, null, 'value', '各站场工单完成数量', null, null, '0', '1', null, '#000000', 'topLeft', 'workorderkpi', '2', '1', '0', '0', '', '1', '0', '1', '0', '个', '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('100', '松姐演示', 'ab_bar_24', 'bar', '工单完成率', 'AGP-工单完成率', null, null, null, 'value', '各站场工单完成率', null, null, '0', '1', '#FFFFFF', '#000000', 'topLeft', 'workorderkpi', '2', '1', '0', '0', '', '1', '0', '1', '0', '%', '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('101', '松姐演示', 'ab_bar_25', 'bar', '各部门工单完成数量', 'AGP-各部门工单完成数量', null, null, null, 'value', '各部门工单完成数量', null, null, null, null, null, '#000000', 'topLeft', 'workorderdeptkpi', '2', '1', '0', '0', null, '1', '0', '1', '0', '个 ', '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('102', '松姐演示', 'ab_bar_26', 'bar', '各部门工单完成率', 'AGP各部门工单完成率', null, null, null, 'value', '各部门工单完成率', null, null, null, '1', '#FFFFFF', '#000000', 'topLeft', 'workorderdeptkpi', '2', '1', '0', '0', null, '1', '0', '1', '0', '%', '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('103', '松姐演示', 'ab_bar_27', 'bar', '各站场运行小时数', 'AGP-各站场运行小时数', null, null, null, 'value', '各站场运行小时数', null, null, null, '1', null, '#000000', 'topLeft', 'workorderkpi', '2', '1', '0', '0', null, '1', '0', '1', '0', 'h', '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('104', '松姐演示', 'ab_bar_28', 'bar', '各站场故障停机率', 'AGP-各站场故障停机率', null, null, null, 'value', '故障停机率', null, null, '0', '1', null, '#000000', 'topLeft', 'workorderkpi', '2', '1', '0', '0', null, '1', '0', '1', '0', '%', '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('105', '松姐演示', 'ab_bar_29', 'bar', '各站场维护停机率', 'AGP-各站场维护停机率', null, null, null, 'value', '维护停机率', null, null, '0', '1', null, '#000000', 'topLeft', 'workorderkpi', '2', '1', '0', '0', null, '1', '0', '1', '0', '%', '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('106', '松姐演示', 'ab_bar_30', 'bar', '各站场故障停机时长', 'AGP-各站场故障停机时长', null, null, null, 'value', '故障停机时长', null, null, '0', '1', null, '#000000', 'topLeft', 'workorderkpi', '2', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('107', '松姐演示', 'ab_bar_31', 'bar', '各站场维保停机时长', 'AGP-各站场维保停机时长', null, null, null, 'value', '维保停机时长', null, null, null, null, '#FFFFFF', '#000000', 'topLeft', 'workorderkpi', '2', '1', '0', '0', null, '1', '0', '1', '0', 'H', '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('111', '松姐演示', 'ab_line_32', 'line', '年度故障停机率跟踪', 'AGP-年度故障停机率跟踪', null, null, null, 'value', '年度故障停机率跟踪', 'horizontal', 'bottomCenter', '1', '1', null, '#000000', 'topLeft', 'persent', '6', '1', '0', '0', null, '1', '0', '1', '0', '%', '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('112', '松姐演示', 'ab_line_33', 'line', '年度维修停机率跟踪', 'AGP-年度维修停机率跟踪', null, null, null, 'value', '年度维修停机率跟踪', 'horizontal', 'bottomCenter', '1', '1', '#FFFFFF', '#030303', 'topLeft', 'persent', '14', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);
INSERT INTO `tb_visualize` VALUES ('113', '松姐演示', 'ab_line_34', 'line', '年度故障停机时长跟踪', 'AGP-年度故障停机时长跟踪', null, null, null, 'value', null, null, null, null, null, null, null, null, 'persent', '2', '1', '0', '0', null, '1', '0', '1', '0', null, '1', '0', '1', null, null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `workorderkpi`
-- ----------------------------
DROP TABLE IF EXISTS `workorderkpi`;
CREATE TABLE `workorderkpi` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `SHOWKEY` varchar(20) DEFAULT NULL,
  `COMPLETE` double(10,2) DEFAULT NULL,
  `CP` double(10,2) DEFAULT NULL,
  `PM` double(10,2) DEFAULT NULL,
  `CM` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of workorderkpi
-- ----------------------------
