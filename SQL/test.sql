/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-05-29 22:48:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `AdminID` bigint(4) NOT NULL AUTO_INCREMENT,
  `AdminAccount` varchar(50) NOT NULL,
  `AdminPwd` varchar(50) NOT NULL,
  PRIMARY KEY (`AdminID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'Alice', 'admin123');

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `FoodID` bigint(4) NOT NULL AUTO_INCREMENT,
  `FoodName` varchar(50) NOT NULL,
  `FoodPrice` double(5,2) DEFAULT NULL,
  `FoodDescribe` varchar(50) DEFAULT NULL,
  `FoodDate` datetime(6) DEFAULT NULL,
  `FoodProtein` bigint(4) NOT NULL,
  `FoodCarbohydrate` bigint(4) NOT NULL,
  `FoodFat` bigint(4) NOT NULL,
  `FoodDietaryFiber` bigint(4) NOT NULL,
  `FoodMoisture` bigint(4) NOT NULL,
  PRIMARY KEY (`FoodID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES ('1', '水果三明治', '6.00', '这款三明治可爱，简单，不会做饭的人也绝对会做，并且喜欢的简单料理！', '2018-05-19 20:23:09.000000', '30', '43', '30', '5', '50');
INSERT INTO `food` VALUES ('2', '陕西擀面皮', '7.50', '擀面皮！擀面皮是陕西关中地区特有的传统名吃，西府宝鸡地区尤为最佳！', '2018-05-19 20:23:54.000000', '54', '67', '64', '36', '30');
INSERT INTO `food` VALUES ('3', '干煸豆角茄子', '7.50', '干煸豆角茄子！素菜美食，不能错过哦！', '2018-05-19 20:25:56.000000', '45', '59', '53', '48', '25');
INSERT INTO `food` VALUES ('4', '红烧鸡翅', '9.00', '一道不放油，不放盐，味精，鸡精的红烧鸡翅，营养健康的美食。', '2018-05-19 20:26:42.000000', '56', '70', '96', '10', '10');
INSERT INTO `food` VALUES ('5', '红烧鱼', '11.50', '鱼富含全面而优质的蛋白质，对肌肤的弹力纤维构成能起到很好的强化作用。', '2018-05-19 20:27:58.000000', '80', '48', '70', '5', '48');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `MemberID` bigint(4) NOT NULL AUTO_INCREMENT,
  `MemberAccount` varchar(50) NOT NULL,
  `MemberPwd` varchar(50) NOT NULL,
  `MemberName` varchar(50) DEFAULT NULL,
  `MemberSex` varchar(10) DEFAULT NULL,
  `MemberEmail` varchar(50) DEFAULT NULL,
  `MemberPhone` varchar(450) DEFAULT NULL,
  `MemberDate` datetime(6) DEFAULT NULL,
  `MemberProtein` bigint(8) NOT NULL,
  `MemberCarbohydrate` bigint(8) NOT NULL,
  `MemberFat` bigint(8) NOT NULL,
  `MemberDietaryFiber` bigint(8) NOT NULL,
  `MemberMoisture` bigint(8) NOT NULL,
  PRIMARY KEY (`MemberID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', '1351300305', 'tx123', '用户甲', '男', '1234568@gmail.com', '13347657903', '2018-05-19 00:00:00.000000', '46', '60', '63', '17', '30');
INSERT INTO `member` VALUES ('2', '1351300306', 'tx234', '用户乙', '女', '7854894@gmail.com', '13835487863', '2018-05-19 20:35:19.000000', '1', '1', '1', '1', '1');
INSERT INTO `member` VALUES ('3', '1351300307', 'tx345', '用户丙', '男', '8465453@gmail.com', '13736745842', '2018-05-19 20:36:30.000000', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `StaffID` bigint(4) NOT NULL AUTO_INCREMENT,
  `StaffAccount` varchar(50) NOT NULL,
  `StaffPwd` varchar(50) NOT NULL,
  `StaffName` varchar(50) DEFAULT NULL,
  `StaffSex` varchar(50) DEFAULT NULL,
  `StaffEmail` varchar(50) DEFAULT NULL,
  `StaffPhone` varchar(50) DEFAULT NULL,
  `StaffDate` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`StaffID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES ('1', '1351300322', 'sf123', '员工甲', '女', '909011299@gmai.com', '13347637902', '2018-05-19 20:38:50.000000');
INSERT INTO `staff` VALUES ('2', '1351300323', 'sf234', '员工乙', '女', '456431238@gmail.com', '18047464334', '2018-05-19 20:39:51.000000');
INSERT INTO `staff` VALUES ('3', '1351300324', 'sf456', '员工丙', '女', '876434345@gmail.acom', '18743543458', '2018-05-19 20:40:44.000000');
