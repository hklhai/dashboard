/*
Navicat MySQL Data Transfer

Source Server         : HXQH-spark4-root
Source Server Version : 50722
Source Host           : spark4:3306
Source Database       : sourcedb

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-11-23 09:29:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bar_source
-- ----------------------------
DROP TABLE IF EXISTS `bar_source`;
CREATE TABLE `bar_source` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  `showvalue4` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of bar_source
-- ----------------------------
INSERT INTO `bar_source` VALUES ('1', 'Forest', '320.00', '332.00', '301.00', '334.00', '390.00');
INSERT INTO `bar_source` VALUES ('2', 'Steppe', '220.00', '182.00', '191.00', '234.00', '290.00');
INSERT INTO `bar_source` VALUES ('3', 'Desert', '150.00', '232.00', '201.00', '154.00', '190.00');
INSERT INTO `bar_source` VALUES ('4', 'Wetland', '98.00', '77.00', '101.00', '99.00', '40.00');

-- ----------------------------
-- Table structure for line_source
-- ----------------------------
DROP TABLE IF EXISTS `line_source`;
CREATE TABLE `line_source` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue1` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  `showvalue3` double(10,2) DEFAULT NULL,
  `showvalue4` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of line_source
-- ----------------------------
INSERT INTO `line_source` VALUES ('1', 'Forest', '320.00', '332.00', '301.00', '334.00', '390.00');
INSERT INTO `line_source` VALUES ('2', 'Steppe', '220.00', '182.00', '191.00', '234.00', '290.00');
INSERT INTO `line_source` VALUES ('3', 'Desert', '150.00', '232.00', '201.00', '154.00', '190.00');
INSERT INTO `line_source` VALUES ('4', 'Wetland', '98.00', '77.00', '101.00', '99.00', '40.00');

-- ----------------------------
-- Table structure for pie_source
-- ----------------------------
DROP TABLE IF EXISTS `pie_source`;
CREATE TABLE `pie_source` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pie_source
-- ----------------------------
INSERT INTO `pie_source` VALUES ('1', '直接访问', '21.00');
INSERT INTO `pie_source` VALUES ('2', '邮件营销', '16.00');
INSERT INTO `pie_source` VALUES ('3', '联盟广告', '38.00');
INSERT INTO `pie_source` VALUES ('4', '视频广告', '42.00');
INSERT INTO `pie_source` VALUES ('5', '搜索引擎', '12.00');
INSERT INTO `pie_source` VALUES ('6', '简介访问', '35.00');
INSERT INTO `pie_source` VALUES ('7', '抖音广告', '47.00');

-- ----------------------------
-- Table structure for pie_source_double
-- ----------------------------
DROP TABLE IF EXISTS `pie_source_double`;
CREATE TABLE `pie_source_double` (
  `sid` int(20) NOT NULL AUTO_INCREMENT,
  `showkey` varchar(20) DEFAULT NULL,
  `showvalue` double(10,2) DEFAULT NULL,
  `showvalue2` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pie_source_double
-- ----------------------------
INSERT INTO `pie_source_double` VALUES ('1', '直接访问', '21.00', '21.00');
INSERT INTO `pie_source_double` VALUES ('2', '邮件营销', '16.00', '16.00');
INSERT INTO `pie_source_double` VALUES ('3', '联盟广告', '38.00', '38.00');
INSERT INTO `pie_source_double` VALUES ('4', '视频广告', '42.00', '42.00');
INSERT INTO `pie_source_double` VALUES ('5', '搜索引擎', '12.00', '12.00');
INSERT INTO `pie_source_double` VALUES ('6', '简介访问', '35.00', '35.00');
INSERT INTO `pie_source_double` VALUES ('7', '抖音广告', '47.00', '47.00');
