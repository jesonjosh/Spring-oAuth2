-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: posdb
-- ------------------------------------------------------
-- Server version	5.7.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `action_history`
--

DROP TABLE IF EXISTS `action_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `action_history` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ACTION_TIME` datetime DEFAULT NULL,
  `ACTION_NAME` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK3F3AF36B3E20AD51` (`USER_ID`),
  CONSTRAINT `FK3F3AF36B3E20AD51` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`AUTO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `action_history`
--

LOCK TABLES `action_history` WRITE;
/*!40000 ALTER TABLE `action_history` DISABLE KEYS */;
INSERT INTO `action_history` VALUES (1,'2016-05-11 17:13:02','NEW CHECK','CHK#: :2',1),(2,'2016-05-11 17:14:57','SETTLE CHECK','CHK#: :2;TOTAL:12.72',1),(3,'2016-05-11 17:17:35','NEW CHECK','CHK#: :3',1),(4,'2016-05-11 17:17:35','EDIT CHECK','CHK#: :3',1),(5,'2016-05-11 18:01:07','SETTLE CHECK','CHK#: :1;TOTAL:0.00',1),(6,'2016-05-11 18:01:07','SETTLE CHECK','CHK#: :3;TOTAL:25.44',1),(7,'2016-05-11 22:47:50','NEW CHECK','CHK#: :4',1),(8,'2016-05-11 22:47:53','EDIT CHECK','CHK#: :4',1),(9,'2016-05-11 22:48:19','EDIT CHECK','CHK#: :4',1),(10,'2016-05-11 22:48:56','EDIT CHECK','CHK#: :4',1);
/*!40000 ALTER TABLE `action_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendence_history`
--

DROP TABLE IF EXISTS `attendence_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendence_history` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CLOCK_IN_TIME` datetime DEFAULT NULL,
  `CLOCK_OUT_TIME` datetime DEFAULT NULL,
  `CLOCK_IN_HOUR` smallint(6) DEFAULT NULL,
  `CLOCK_OUT_HOUR` smallint(6) DEFAULT NULL,
  `CLOCKED_OUT` bit(1) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `SHIFT_ID` int(11) DEFAULT NULL,
  `TERMINAL_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKDFE829A3E20AD51` (`USER_ID`),
  KEY `FKDFE829A7660A5E3` (`SHIFT_ID`),
  KEY `FKDFE829A2AD2D031` (`TERMINAL_ID`),
  CONSTRAINT `FKDFE829A2AD2D031` FOREIGN KEY (`TERMINAL_ID`) REFERENCES `terminal` (`ID`),
  CONSTRAINT `FKDFE829A3E20AD51` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`AUTO_ID`),
  CONSTRAINT `FKDFE829A7660A5E3` FOREIGN KEY (`SHIFT_ID`) REFERENCES `shift` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendence_history`
--

LOCK TABLES `attendence_history` WRITE;
/*!40000 ALTER TABLE `attendence_history` DISABLE KEYS */;
INSERT INTO `attendence_history` VALUES (1,'2016-05-11 16:45:38',NULL,16,NULL,'\0',1,1,4263);
/*!40000 ALTER TABLE `attendence_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cash_drawer_reset_history`
--

DROP TABLE IF EXISTS `cash_drawer_reset_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cash_drawer_reset_history` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `RESET_TIME` datetime DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK719418223E20AD51` (`USER_ID`),
  CONSTRAINT `FK719418223E20AD51` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`AUTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cash_drawer_reset_history`
--

LOCK TABLES `cash_drawer_reset_history` WRITE;
/*!40000 ALTER TABLE `cash_drawer_reset_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `cash_drawer_reset_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cooking_instruction`
--

DROP TABLE IF EXISTS `cooking_instruction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cooking_instruction` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cooking_instruction`
--

LOCK TABLES `cooking_instruction` WRITE;
/*!40000 ALTER TABLE `cooking_instruction` DISABLE KEYS */;
/*!40000 ALTER TABLE `cooking_instruction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coupon_and_discount`
--

DROP TABLE IF EXISTS `coupon_and_discount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coupon_and_discount` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(120) DEFAULT NULL,
  `TYPE` int(11) DEFAULT NULL,
  `BARCODE` varchar(120) DEFAULT NULL,
  `QUALIFICATION_TYPE` int(11) DEFAULT NULL,
  `APPLY_TO_ALL` bit(1) DEFAULT NULL,
  `MINIMUM_BUY` int(11) DEFAULT NULL,
  `MAXIMUM_OFF` int(11) DEFAULT NULL,
  `VALUE` double DEFAULT NULL,
  `EXPIRY_DATE` datetime DEFAULT NULL,
  `ENABLED` bit(1) DEFAULT NULL,
  `AUTO_APPLY` bit(1) DEFAULT NULL,
  `MODIFIABLE` bit(1) DEFAULT NULL,
  `NEVER_EXPIRE` bit(1) DEFAULT NULL,
  `UUID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UUID` (`UUID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coupon_and_discount`
--

LOCK TABLES `coupon_and_discount` WRITE;
/*!40000 ALTER TABLE `coupon_and_discount` DISABLE KEYS */;
INSERT INTO `coupon_and_discount` VALUES (1,'Buy 1 and get 1 free',1,NULL,0,'',2,0,100,NULL,'','\0','\0','',NULL),(2,'Buy 2 and get 1 free',1,NULL,0,'',3,0,100,NULL,'','','\0','',NULL),(3,'10% Off',1,NULL,0,'',1,0,10,NULL,'','\0','\0','',NULL);
/*!40000 ALTER TABLE `coupon_and_discount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `custom_payment`
--

DROP TABLE IF EXISTS `custom_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `custom_payment` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) DEFAULT NULL,
  `REQUIRED_REF_NUMBER` bit(1) DEFAULT NULL,
  `REF_NUMBER_FIELD_NAME` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `custom_payment`
--

LOCK TABLES `custom_payment` WRITE;
/*!40000 ALTER TABLE `custom_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `custom_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `AUTO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `LOYALTY_NO` varchar(30) DEFAULT NULL,
  `LOYALTY_POINT` int(11) DEFAULT NULL,
  `SOCIAL_SECURITY_NUMBER` varchar(60) DEFAULT NULL,
  `PICTURE` blob,
  `HOMEPHONE_NO` varchar(30) DEFAULT NULL,
  `MOBILE_NO` varchar(30) DEFAULT NULL,
  `WORKPHONE_NO` varchar(30) DEFAULT NULL,
  `EMAIL` varchar(40) DEFAULT NULL,
  `SALUTATION` varchar(60) DEFAULT NULL,
  `FIRST_NAME` varchar(60) DEFAULT NULL,
  `LAST_NAME` varchar(60) DEFAULT NULL,
  `DOB` varchar(16) DEFAULT NULL,
  `SSN` varchar(30) DEFAULT NULL,
  `ADDRESS` varchar(220) DEFAULT NULL,
  `CITY` varchar(30) DEFAULT NULL,
  `STATE` varchar(30) DEFAULT NULL,
  `ZIP_CODE` varchar(10) DEFAULT NULL,
  `COUNTRY` varchar(30) DEFAULT NULL,
  `VIP` bit(1) DEFAULT NULL,
  `CREDIT_LIMIT` double DEFAULT NULL,
  `CREDIT_SPENT` double DEFAULT NULL,
  `CREDIT_CARD_NO` varchar(30) DEFAULT NULL,
  `NOTE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`AUTO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,NULL,0,NULL,NULL,NULL,'971526710657',NULL,NULL,NULL,'Joshua','Joseph',NULL,NULL,'Discovery 202,53','','','',NULL,'\0',0,0,NULL,NULL),(2,NULL,0,NULL,NULL,NULL,'971526710657',NULL,NULL,NULL,'Joshua','Joseph',NULL,NULL,'','','','',NULL,'\0',0,0,NULL,NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_properties`
--

DROP TABLE IF EXISTS `customer_properties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_properties` (
  `id` int(11) NOT NULL,
  `property_value` varchar(255) DEFAULT NULL,
  `property_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`,`property_name`),
  KEY `FKD43068347BBCCF0` (`id`),
  CONSTRAINT `FKD43068347BBCCF0` FOREIGN KEY (`id`) REFERENCES `customer` (`AUTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_properties`
--

LOCK TABLES `customer_properties` WRITE;
/*!40000 ALTER TABLE `customer_properties` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_properties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data_update_info`
--

DROP TABLE IF EXISTS `data_update_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_update_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `LAST_UPDATE_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_update_info`
--

LOCK TABLES `data_update_info` WRITE;
/*!40000 ALTER TABLE `data_update_info` DISABLE KEYS */;
INSERT INTO `data_update_info` VALUES (1,'2016-05-11 22:48:56');
/*!40000 ALTER TABLE `data_update_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drawer_assigned_history`
--

DROP TABLE IF EXISTS `drawer_assigned_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drawer_assigned_history` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TIME` datetime DEFAULT NULL,
  `OPERATION` varchar(60) DEFAULT NULL,
  `A_USER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK5A823C91F1DD782B` (`A_USER`),
  CONSTRAINT `FK5A823C91F1DD782B` FOREIGN KEY (`A_USER`) REFERENCES `users` (`AUTO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drawer_assigned_history`
--

LOCK TABLES `drawer_assigned_history` WRITE;
/*!40000 ALTER TABLE `drawer_assigned_history` DISABLE KEYS */;
INSERT INTO `drawer_assigned_history` VALUES (1,'2016-05-11 17:13:01','ASSIGN',1);
/*!40000 ALTER TABLE `drawer_assigned_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drawer_pull_report`
--

DROP TABLE IF EXISTS `drawer_pull_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drawer_pull_report` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `REPORT_TIME` datetime DEFAULT NULL,
  `REG` varchar(15) DEFAULT NULL,
  `TICKET_COUNT` int(11) DEFAULT NULL,
  `BEGIN_CASH` double DEFAULT NULL,
  `NET_SALES` double DEFAULT NULL,
  `SALES_TAX` double DEFAULT NULL,
  `CASH_TAX` double DEFAULT NULL,
  `TOTAL_REVENUE` double DEFAULT NULL,
  `GROSS_RECEIPTS` double DEFAULT NULL,
  `GIFTCERTRETURNCOUNT` int(11) DEFAULT NULL,
  `GIFTCERTRETURNAMOUNT` double DEFAULT NULL,
  `GIFTCERTCHANGEAMOUNT` double DEFAULT NULL,
  `CASH_RECEIPT_NO` int(11) DEFAULT NULL,
  `CASH_RECEIPT_AMOUNT` double DEFAULT NULL,
  `CREDIT_CARD_RECEIPT_NO` int(11) DEFAULT NULL,
  `CREDIT_CARD_RECEIPT_AMOUNT` double DEFAULT NULL,
  `DEBIT_CARD_RECEIPT_NO` int(11) DEFAULT NULL,
  `DEBIT_CARD_RECEIPT_AMOUNT` double DEFAULT NULL,
  `REFUND_RECEIPT_COUNT` int(11) DEFAULT NULL,
  `REFUND_AMOUNT` double DEFAULT NULL,
  `RECEIPT_DIFFERENTIAL` double DEFAULT NULL,
  `CASH_BACK` double DEFAULT NULL,
  `CASH_TIPS` double DEFAULT NULL,
  `CHARGED_TIPS` double DEFAULT NULL,
  `TIPS_PAID` double DEFAULT NULL,
  `TIPS_DIFFERENTIAL` double DEFAULT NULL,
  `PAY_OUT_NO` int(11) DEFAULT NULL,
  `PAY_OUT_AMOUNT` double DEFAULT NULL,
  `DRAWER_BLEED_NO` int(11) DEFAULT NULL,
  `DRAWER_BLEED_AMOUNT` double DEFAULT NULL,
  `DRAWER_ACCOUNTABLE` double DEFAULT NULL,
  `CASH_TO_DEPOSIT` double DEFAULT NULL,
  `VARIANCE` double DEFAULT NULL,
  `totalVoidWst` double DEFAULT NULL,
  `totalVoid` double DEFAULT NULL,
  `totalDiscountCount` int(11) DEFAULT NULL,
  `totalDiscountAmount` double DEFAULT NULL,
  `totalDiscountSales` double DEFAULT NULL,
  `totalDiscountGuest` int(11) DEFAULT NULL,
  `totalDiscountPartySize` int(11) DEFAULT NULL,
  `totalDiscountCheckSize` int(11) DEFAULT NULL,
  `totalDiscountPercentage` double DEFAULT NULL,
  `totalDiscountRatio` double DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `TERMINAL_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `drawer_report_time` (`REPORT_TIME`),
  KEY `FKAEC362203E20AD51` (`USER_ID`),
  KEY `FKAEC362202AD2D031` (`TERMINAL_ID`),
  CONSTRAINT `FKAEC362202AD2D031` FOREIGN KEY (`TERMINAL_ID`) REFERENCES `terminal` (`ID`),
  CONSTRAINT `FKAEC362203E20AD51` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`AUTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drawer_pull_report`
--

LOCK TABLES `drawer_pull_report` WRITE;
/*!40000 ALTER TABLE `drawer_pull_report` DISABLE KEYS */;
/*!40000 ALTER TABLE `drawer_pull_report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drawer_pull_report_voidtickets`
--

DROP TABLE IF EXISTS `drawer_pull_report_voidtickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drawer_pull_report_voidtickets` (
  `DPREPORT_ID` int(11) NOT NULL,
  `code` int(11) DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `hast` varchar(255) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  KEY `FK98CF9B143EF4CD9B` (`DPREPORT_ID`),
  CONSTRAINT `FK98CF9B143EF4CD9B` FOREIGN KEY (`DPREPORT_ID`) REFERENCES `drawer_pull_report` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drawer_pull_report_voidtickets`
--

LOCK TABLES `drawer_pull_report_voidtickets` WRITE;
/*!40000 ALTER TABLE `drawer_pull_report_voidtickets` DISABLE KEYS */;
/*!40000 ALTER TABLE `drawer_pull_report_voidtickets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gratuity`
--

DROP TABLE IF EXISTS `gratuity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gratuity` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AMOUNT` double DEFAULT NULL,
  `PAID` bit(1) DEFAULT NULL,
  `TICKET_ID` int(11) DEFAULT NULL,
  `OWNER_ID` int(11) DEFAULT NULL,
  `TERMINAL_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK34E4E377AA075D69` (`OWNER_ID`),
  KEY `FK34E4E3771DF2D7F1` (`TICKET_ID`),
  KEY `FK34E4E3772AD2D031` (`TERMINAL_ID`),
  CONSTRAINT `FK34E4E3771DF2D7F1` FOREIGN KEY (`TICKET_ID`) REFERENCES `ticket` (`ID`),
  CONSTRAINT `FK34E4E3772AD2D031` FOREIGN KEY (`TERMINAL_ID`) REFERENCES `terminal` (`ID`),
  CONSTRAINT `FK34E4E377AA075D69` FOREIGN KEY (`OWNER_ID`) REFERENCES `users` (`AUTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gratuity`
--

LOCK TABLES `gratuity` WRITE;
/*!40000 ALTER TABLE `gratuity` DISABLE KEYS */;
/*!40000 ALTER TABLE `gratuity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_group`
--

DROP TABLE IF EXISTS `inventory_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_group` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) NOT NULL,
  `VISIBLE` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_group`
--

LOCK TABLES `inventory_group` WRITE;
/*!40000 ALTER TABLE `inventory_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_item`
--

DROP TABLE IF EXISTS `inventory_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_item` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CREATE_TIME` datetime DEFAULT NULL,
  `LAST_UPDATE_DATE` datetime DEFAULT NULL,
  `NAME` varchar(60) DEFAULT NULL,
  `PACKAGE_BARCODE` varchar(30) DEFAULT NULL,
  `UNIT_BARCODE` varchar(30) DEFAULT NULL,
  `UNIT_PER_PACKAGE` double DEFAULT NULL,
  `SORT_ORDER` int(11) DEFAULT NULL,
  `PACKAGE_REORDER_LEVEL` int(11) DEFAULT NULL,
  `PACKAGE_REPLENISH_LEVEL` int(11) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `AVERAGE_PACKAGE_PRICE` double DEFAULT NULL,
  `TOTAL_PACKAGES` int(11) DEFAULT NULL,
  `TOTAL_RECEPIE_UNITS` double DEFAULT NULL,
  `UNIT_PURCHASE_PRICE` double DEFAULT NULL,
  `UNIT_SELLING_PRICE` double DEFAULT NULL,
  `VISIBLE` bit(1) DEFAULT NULL,
  `PUNIT_ID` int(11) DEFAULT NULL,
  `ITEM_GROUP_ID` int(11) DEFAULT NULL,
  `ITEM_LOCATION_ID` int(11) DEFAULT NULL,
  `ITEM_VENDOR_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK7DC968369E60C333` (`ITEM_VENDOR_ID`),
  KEY `FK7DC968362CD583C1` (`ITEM_GROUP_ID`),
  KEY `FK7DC968363525E956` (`PUNIT_ID`),
  KEY `FK7DC9683695E455D3` (`ITEM_LOCATION_ID`),
  CONSTRAINT `FK7DC968362CD583C1` FOREIGN KEY (`ITEM_GROUP_ID`) REFERENCES `inventory_group` (`ID`),
  CONSTRAINT `FK7DC968363525E956` FOREIGN KEY (`PUNIT_ID`) REFERENCES `packaging_unit` (`ID`),
  CONSTRAINT `FK7DC9683695E455D3` FOREIGN KEY (`ITEM_LOCATION_ID`) REFERENCES `inventory_location` (`ID`),
  CONSTRAINT `FK7DC968369E60C333` FOREIGN KEY (`ITEM_VENDOR_ID`) REFERENCES `inventory_vendor` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_item`
--

LOCK TABLES `inventory_item` WRITE;
/*!40000 ALTER TABLE `inventory_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_location`
--

DROP TABLE IF EXISTS `inventory_location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_location` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) NOT NULL,
  `SORT_ORDER` int(11) DEFAULT NULL,
  `VISIBLE` bit(1) DEFAULT NULL,
  `WAREHOUSE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK59073B58C46A9C15` (`WAREHOUSE_ID`),
  CONSTRAINT `FK59073B58C46A9C15` FOREIGN KEY (`WAREHOUSE_ID`) REFERENCES `inventory_warehouse` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_location`
--

LOCK TABLES `inventory_location` WRITE;
/*!40000 ALTER TABLE `inventory_location` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_meta_code`
--

DROP TABLE IF EXISTS `inventory_meta_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_meta_code` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TYPE` varchar(255) DEFAULT NULL,
  `CODE_TEXT` varchar(255) DEFAULT NULL,
  `CODE_NO` int(11) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_meta_code`
--

LOCK TABLES `inventory_meta_code` WRITE;
/*!40000 ALTER TABLE `inventory_meta_code` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_meta_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_transaction`
--

DROP TABLE IF EXISTS `inventory_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_transaction` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TRANSACTION_DATE` datetime DEFAULT NULL,
  `QUANTITY` int(11) DEFAULT NULL,
  `UNIT_PRICE` double DEFAULT NULL,
  `REMARK` varchar(255) DEFAULT NULL,
  `TRAN_TYPE` int(11) DEFAULT NULL,
  `REFERENCE_ID` int(11) DEFAULT NULL,
  `ITEM_ID` int(11) DEFAULT NULL,
  `VENDOR_ID` int(11) DEFAULT NULL,
  `FROM_WAREHOUSE_ID` int(11) DEFAULT NULL,
  `TO_WAREHOUSE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKAF48F43BFF3F328A` (`FROM_WAREHOUSE_ID`),
  KEY `FKAF48F43B5B397C5` (`REFERENCE_ID`),
  KEY `FKAF48F43B96A3D6BF` (`ITEM_ID`),
  KEY `FKAF48F43BEDA09759` (`TO_WAREHOUSE_ID`),
  KEY `FKAF48F43BD152C95F` (`VENDOR_ID`),
  CONSTRAINT `FKAF48F43B5B397C5` FOREIGN KEY (`REFERENCE_ID`) REFERENCES `purchase_order` (`ID`),
  CONSTRAINT `FKAF48F43B96A3D6BF` FOREIGN KEY (`ITEM_ID`) REFERENCES `inventory_item` (`ID`),
  CONSTRAINT `FKAF48F43BD152C95F` FOREIGN KEY (`VENDOR_ID`) REFERENCES `inventory_vendor` (`ID`),
  CONSTRAINT `FKAF48F43BEDA09759` FOREIGN KEY (`TO_WAREHOUSE_ID`) REFERENCES `inventory_warehouse` (`ID`),
  CONSTRAINT `FKAF48F43BFF3F328A` FOREIGN KEY (`FROM_WAREHOUSE_ID`) REFERENCES `inventory_warehouse` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_transaction`
--

LOCK TABLES `inventory_transaction` WRITE;
/*!40000 ALTER TABLE `inventory_transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_unit`
--

DROP TABLE IF EXISTS `inventory_unit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_unit` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SHORT_NAME` varchar(255) DEFAULT NULL,
  `LONG_NAME` varchar(255) DEFAULT NULL,
  `ALT_NAME` varchar(255) DEFAULT NULL,
  `CONV_FACTOR1` varchar(255) DEFAULT NULL,
  `CONV_FACTOR2` varchar(255) DEFAULT NULL,
  `CONV_FACTOR3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_unit`
--

LOCK TABLES `inventory_unit` WRITE;
/*!40000 ALTER TABLE `inventory_unit` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_unit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_vendor`
--

DROP TABLE IF EXISTS `inventory_vendor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_vendor` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) NOT NULL,
  `VISIBLE` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_vendor`
--

LOCK TABLES `inventory_vendor` WRITE;
/*!40000 ALTER TABLE `inventory_vendor` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_vendor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_warehouse`
--

DROP TABLE IF EXISTS `inventory_warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_warehouse` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) NOT NULL,
  `VISIBLE` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_warehouse`
--

LOCK TABLES `inventory_warehouse` WRITE;
/*!40000 ALTER TABLE `inventory_warehouse` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_warehouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_order_type`
--

DROP TABLE IF EXISTS `item_order_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_order_type` (
  `MENU_ITEM_ID` int(11) NOT NULL,
  `ORDER_TYPE` varchar(255) DEFAULT NULL,
  KEY `FKE2B8465789FE23F0` (`MENU_ITEM_ID`),
  CONSTRAINT `FKE2B8465789FE23F0` FOREIGN KEY (`MENU_ITEM_ID`) REFERENCES `menu_item` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_order_type`
--

LOCK TABLES `item_order_type` WRITE;
/*!40000 ALTER TABLE `item_order_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_order_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kit_ticket_table_num`
--

DROP TABLE IF EXISTS `kit_ticket_table_num`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kit_ticket_table_num` (
  `kit_ticket_id` int(11) NOT NULL,
  `TABLE_ID` int(11) DEFAULT NULL,
  KEY `FK5696584BB73E273E` (`kit_ticket_id`),
  CONSTRAINT `FK5696584BB73E273E` FOREIGN KEY (`kit_ticket_id`) REFERENCES `kitchen_ticket` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kit_ticket_table_num`
--

LOCK TABLES `kit_ticket_table_num` WRITE;
/*!40000 ALTER TABLE `kit_ticket_table_num` DISABLE KEYS */;
INSERT INTO `kit_ticket_table_num` VALUES (1,18);
/*!40000 ALTER TABLE `kit_ticket_table_num` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kitchen_ticket`
--

DROP TABLE IF EXISTS `kitchen_ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kitchen_ticket` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TICKET_ID` int(11) DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `CLOSE_DATE` datetime DEFAULT NULL,
  `VOIDED` bit(1) DEFAULT NULL,
  `STATUS` varchar(30) DEFAULT NULL,
  `SERVER_NAME` varchar(30) DEFAULT NULL,
  `TICKET_TYPE` varchar(20) DEFAULT NULL,
  `PG_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK341CBC275CF1375F` (`PG_ID`),
  CONSTRAINT `FK341CBC275CF1375F` FOREIGN KEY (`PG_ID`) REFERENCES `printer_group` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kitchen_ticket`
--

LOCK TABLES `kitchen_ticket` WRITE;
/*!40000 ALTER TABLE `kitchen_ticket` DISABLE KEYS */;
INSERT INTO `kitchen_ticket` VALUES (1,4,'2016-05-11 22:47:50','2016-05-11 22:49:58','\0','VOID','Administrator','DINE IN',NULL);
/*!40000 ALTER TABLE `kitchen_ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kitchen_ticket_item`
--

DROP TABLE IF EXISTS `kitchen_ticket_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kitchen_ticket_item` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `COOKABLE` bit(1) DEFAULT NULL,
  `MENU_ITEM_CODE` varchar(255) DEFAULT NULL,
  `MENU_ITEM_NAME` varchar(120) DEFAULT NULL,
  `MENU_ITEM_GROUP_ID` int(11) DEFAULT NULL,
  `MENU_ITEM_GROUP_NAME` varchar(120) DEFAULT NULL,
  `QUANTITY` int(11) DEFAULT NULL,
  `FRACTIONAL_QUANTITY` double DEFAULT NULL,
  `FRACTIONAL_UNIT` bit(1) DEFAULT NULL,
  `UNIT_NAME` varchar(20) DEFAULT NULL,
  `SORT_ORDER` int(11) DEFAULT NULL,
  `VOIDED` bit(1) DEFAULT NULL,
  `STATUS` varchar(30) DEFAULT NULL,
  `KITHEN_TICKET_ID` int(11) DEFAULT NULL,
  `ITEM_ORDER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK1462F02BCB07FAA3` (`KITHEN_TICKET_ID`),
  CONSTRAINT `FK1462F02BCB07FAA3` FOREIGN KEY (`KITHEN_TICKET_ID`) REFERENCES `kitchen_ticket` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kitchen_ticket_item`
--

LOCK TABLES `kitchen_ticket_item` WRITE;
/*!40000 ALTER TABLE `kitchen_ticket_item` DISABLE KEYS */;
INSERT INTO `kitchen_ticket_item` VALUES (1,'','34','OATMEAL ',2,'CEREALS & MUFF',4,0,'\0',NULL,9999,'\0','VOID',1,0),(2,'','13','CHICK TENDER KIDS MEAL',8,'KIDS MEAL',1,0,'\0',NULL,9999,'\0','VOID',1,1);
/*!40000 ALTER TABLE `kitchen_ticket_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_category`
--

DROP TABLE IF EXISTS `menu_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_category` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(120) NOT NULL,
  `TRANSLATED_NAME` varchar(120) DEFAULT NULL,
  `VISIBLE` bit(1) DEFAULT NULL,
  `BEVERAGE` bit(1) DEFAULT NULL,
  `SORT_ORDER` int(11) DEFAULT NULL,
  `BTN_COLOR` int(11) DEFAULT NULL,
  `TEXT_COLOR` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `food_category_visible` (`VISIBLE`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_category`
--

LOCK TABLES `menu_category` WRITE;
/*!40000 ALTER TABLE `menu_category` DISABLE KEYS */;
INSERT INTO `menu_category` VALUES (1,'APPETIZERS',NULL,'','\0',9999,0,0),(2,'BEER & WINE',NULL,'','',9999,0,0),(3,'BEVERAGE & DRINKS',NULL,'','',9999,0,0),(4,'BREAKFAST',NULL,'','\0',9999,0,0),(5,'BUFFET',NULL,'\0','\0',9999,0,0),(6,'DESSERT & ICECRM',NULL,'','\0',9999,0,0),(7,'FAVORITES',NULL,'','\0',9999,0,0),(8,'KIDS ',NULL,'','\0',9999,0,0),(9,'LUNCH N DINNER',NULL,'','\0',9999,0,0),(10,'SIDES',NULL,'','\0',9999,0,0);
/*!40000 ALTER TABLE `menu_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_group`
--

DROP TABLE IF EXISTS `menu_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_group` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(120) NOT NULL,
  `TRANSLATED_NAME` varchar(120) DEFAULT NULL,
  `VISIBLE` bit(1) DEFAULT NULL,
  `SORT_ORDER` int(11) DEFAULT NULL,
  `BTN_COLOR` int(11) DEFAULT NULL,
  `TEXT_COLOR` int(11) DEFAULT NULL,
  `CATEGORY_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `menugroupvisible` (`VISIBLE`),
  KEY `FK4DC1AB7F2E347FF0` (`CATEGORY_ID`),
  CONSTRAINT `FK4DC1AB7F2E347FF0` FOREIGN KEY (`CATEGORY_ID`) REFERENCES `menu_category` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_group`
--

LOCK TABLES `menu_group` WRITE;
/*!40000 ALTER TABLE `menu_group` DISABLE KEYS */;
INSERT INTO `menu_group` VALUES (1,'BEERS',NULL,'',9999,0,0,2),(2,'CEREALS & MUFF',NULL,'',9999,0,0,4),(3,'COLD BEVERAGE',NULL,'',9999,0,0,3),(4,'FAVOURITE',NULL,'',9999,0,0,4),(5,'FRENCH FRIES',NULL,'',9999,0,0,1),(6,'HOT DRINKS',NULL,'',9999,0,0,3),(7,'JUICES',NULL,'',9999,0,0,3),(8,'KIDS MEAL',NULL,'',9999,0,0,8),(9,'ONION RINGS',NULL,'\0',9999,0,0,1),(10,'PANCAKE N SUCH',NULL,'',9999,0,0,4),(11,'REDS',NULL,'',9999,0,0,2),(12,'SANDWITCH PLATTER',NULL,'',9999,0,0,9),(13,'SIDES',NULL,'',9999,0,0,10),(14,'SILE PLATES',NULL,'',9999,0,0,4),(15,'TRADITIONAL B.FAST',NULL,'',9999,0,0,4),(16,'WHITES',NULL,'',9999,0,0,2),(17,'WHOLESOME',NULL,'',9999,0,0,4);
/*!40000 ALTER TABLE `menu_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_item`
--

DROP TABLE IF EXISTS `menu_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_item` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(120) NOT NULL,
  `DESCRIPTION` varchar(120) DEFAULT NULL,
  `UNIT_NAME` varchar(20) DEFAULT NULL,
  `TRANSLATED_NAME` varchar(120) DEFAULT NULL,
  `BARCODE` varchar(120) DEFAULT NULL,
  `BUY_PRICE` double NOT NULL,
  `STOCK_AMOUNT` double DEFAULT NULL,
  `PRICE` double NOT NULL,
  `DISCOUNT_RATE` double DEFAULT NULL,
  `VISIBLE` bit(1) DEFAULT NULL,
  `DISABLE_WHEN_STOCK_AMOUNT_IS_ZERO` bit(1) DEFAULT NULL,
  `SORT_ORDER` int(11) DEFAULT NULL,
  `BTN_COLOR` int(11) DEFAULT NULL,
  `TEXT_COLOR` int(11) DEFAULT NULL,
  `IMAGE` blob,
  `SHOW_IMAGE_ONLY` bit(1) DEFAULT NULL,
  `FRACTIONAL_UNIT` bit(1) DEFAULT NULL,
  `GROUP_ID` int(11) DEFAULT NULL,
  `TAX_ID` int(11) DEFAULT NULL,
  `RECEPIE` int(11) DEFAULT NULL,
  `PG_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK4CD5A1F35188AA24` (`GROUP_ID`),
  KEY `FK4CD5A1F3F3B77C57` (`RECEPIE`),
  KEY `FK4CD5A1F35CF1375F` (`PG_ID`),
  KEY `FK4CD5A1F3A4802F83` (`TAX_ID`),
  CONSTRAINT `FK4CD5A1F35188AA24` FOREIGN KEY (`GROUP_ID`) REFERENCES `menu_group` (`ID`),
  CONSTRAINT `FK4CD5A1F35CF1375F` FOREIGN KEY (`PG_ID`) REFERENCES `printer_group` (`ID`),
  CONSTRAINT `FK4CD5A1F3A4802F83` FOREIGN KEY (`TAX_ID`) REFERENCES `tax` (`ID`),
  CONSTRAINT `FK4CD5A1F3F3B77C57` FOREIGN KEY (`RECEPIE`) REFERENCES `recepie` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_item`
--

LOCK TABLES `menu_item` WRITE;
/*!40000 ALTER TABLE `menu_item` DISABLE KEYS */;
INSERT INTO `menu_item` VALUES (1,'1 EGG BREAKFAST',NULL,NULL,NULL,NULL,0,0,1,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',4,1,NULL,NULL),(2,'2 EGG N BISCUIT',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',4,NULL,NULL,NULL),(3,'2 EGG SANDWITCH',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',4,NULL,NULL,NULL),(4,'4 VINES CALIF',NULL,NULL,NULL,NULL,0,0,0,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',11,NULL,NULL,NULL),(5,'A 2 Z CHARDONNAY',NULL,NULL,NULL,NULL,0,0,3,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',16,1,NULL,NULL),(6,'APPLE DIPPER',NULL,NULL,NULL,NULL,0,0,1,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',13,1,NULL,NULL),(7,'APPLE JUICE',NULL,NULL,NULL,NULL,0,0,0.5,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',7,1,NULL,NULL),(8,'ASSORT CEREAL',NULL,NULL,NULL,NULL,0,0,1.5,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',2,1,NULL,NULL),(9,'AVALON NAPA',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',11,1,NULL,NULL),(10,'BELLYS SEASONAL',NULL,NULL,NULL,NULL,0,0,4,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',1,1,NULL,NULL),(11,'CEASAR SALAD',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',13,1,NULL,NULL),(12,'CHICK BLT',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',12,1,NULL,NULL),(13,'CHICK TENDER KIDS MEAL',NULL,NULL,NULL,NULL,0,0,4,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',8,1,NULL,NULL),(14,'CHOC MILK',NULL,NULL,NULL,NULL,0,0,2.25,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',3,1,NULL,NULL),(15,'CUPPOCINO',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',6,1,NULL,NULL),(16,'DBL MEAT BRK',NULL,NULL,NULL,NULL,0,0,3,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',15,1,NULL,NULL),(17,'DISENO MALBEC',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',11,1,NULL,NULL),(18,'FELLUGO ITALY',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',11,1,NULL,NULL),(19,'FIRESTEED OREGON',NULL,NULL,NULL,NULL,0,0,4,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',16,1,NULL,NULL),(20,'GO GO SQUEEZE',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',13,1,NULL,NULL),(21,'GRANDPA CNTRY B.FAST',NULL,NULL,NULL,NULL,0,0,3,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',15,1,NULL,NULL),(22,'GRAVY N BISCUIT',NULL,NULL,NULL,NULL,0,0,1,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',4,1,NULL,NULL),(23,'GRILLED CHICKEN',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',12,1,NULL,NULL),(24,'HAMBURGER HALFPOUND',NULL,NULL,NULL,NULL,0,0,3,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',12,1,NULL,NULL),(25,'HAMMER COFFEE',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',6,1,NULL,NULL),(26,'HASHBROWN COMBO',NULL,NULL,NULL,NULL,0,0,1,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',4,1,NULL,NULL),(27,'ICE TEA',NULL,NULL,NULL,NULL,0,0,0,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',3,1,NULL,NULL),(28,'KENWOOD YULUPA',NULL,NULL,NULL,NULL,0,0,3,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',16,1,NULL,NULL),(29,'LEMONADE',NULL,NULL,NULL,NULL,0,0,1,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',3,1,NULL,NULL),(30,'MEAT BISCUIT N HASHBROWN',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',4,1,NULL,NULL),(31,'MICHELOB GOLDEN',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',1,1,NULL,NULL),(32,'MNT DEW',NULL,NULL,NULL,NULL,0,0,1,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',3,1,NULL,NULL),(33,'MOZZARELLA STICK',NULL,NULL,NULL,NULL,0,0,0,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',13,1,NULL,NULL),(34,'OATMEAL ',NULL,NULL,NULL,NULL,0,0,1.5,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',2,1,NULL,NULL),(35,'OLD TIMER B.FAST',NULL,NULL,NULL,NULL,0,0,2.5,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',15,1,NULL,NULL),(36,'OVN ROAST TURKEY',NULL,NULL,NULL,NULL,0,0,3,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',12,1,NULL,NULL),(37,'SCHELLS FIREBRICH AMBER',NULL,NULL,NULL,NULL,0,0,4,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',1,1,NULL,NULL),(38,'SMK HOUS B.FAST',NULL,NULL,NULL,NULL,0,0,2.5,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',15,1,NULL,NULL),(39,'SODA',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',3,1,NULL,NULL),(40,'SOURDOUGH TOAST',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',4,1,NULL,NULL),(41,'STEELHEAD',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',11,1,NULL,NULL),(42,'STELLA ARTOIS ',NULL,NULL,NULL,NULL,0,0,3,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',1,1,NULL,NULL),(43,'SUMMIT PALE ALE',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',1,1,NULL,NULL),(44,'SUNRISE SAMPLER',NULL,NULL,NULL,NULL,0,0,3.5,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',15,1,NULL,NULL),(45,'SURLY FURIOUS',NULL,NULL,NULL,NULL,0,0,4,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',1,1,NULL,NULL),(46,'TANGLE OAKS',NULL,NULL,NULL,NULL,0,0,3,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',16,1,NULL,NULL),(47,'TRIADE ITALIAN',NULL,NULL,NULL,NULL,0,0,3,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',16,1,NULL,NULL),(48,'VANILLA YOUGURT',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',13,1,NULL,NULL),(49,'VIENNA DECAF',NULL,NULL,NULL,NULL,0,0,1,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',6,1,NULL,NULL),(50,'VINA MAYOR',NULL,NULL,NULL,NULL,0,0,2,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',11,1,NULL,NULL),(51,'WAIRAU RIVER',NULL,NULL,NULL,NULL,0,0,4,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',16,1,NULL,NULL),(52,'YOGURT PRF',NULL,NULL,NULL,NULL,0,0,2.5,0,'','\0',9999,NULL,NULL,NULL,'\0','\0',2,1,NULL,NULL);
/*!40000 ALTER TABLE `menu_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_item_properties`
--

DROP TABLE IF EXISTS `menu_item_properties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_item_properties` (
  `MENU_ITEM_ID` int(11) NOT NULL,
  `PROPERTY_VALUE` varchar(100) DEFAULT NULL,
  `PROPERTY_NAME` varchar(255) NOT NULL,
  PRIMARY KEY (`MENU_ITEM_ID`,`PROPERTY_NAME`),
  KEY `FKF94186FF89FE23F0` (`MENU_ITEM_ID`),
  CONSTRAINT `FKF94186FF89FE23F0` FOREIGN KEY (`MENU_ITEM_ID`) REFERENCES `menu_item` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_item_properties`
--

LOCK TABLES `menu_item_properties` WRITE;
/*!40000 ALTER TABLE `menu_item_properties` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu_item_properties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_item_terminal_ref`
--

DROP TABLE IF EXISTS `menu_item_terminal_ref`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_item_terminal_ref` (
  `MENU_ITEM_ID` int(11) NOT NULL,
  `TERMINAL_ID` int(11) NOT NULL,
  KEY `FK9EA1AFC89FE23F0` (`MENU_ITEM_ID`),
  KEY `FK9EA1AFC2AD2D031` (`TERMINAL_ID`),
  CONSTRAINT `FK9EA1AFC2AD2D031` FOREIGN KEY (`TERMINAL_ID`) REFERENCES `terminal` (`ID`),
  CONSTRAINT `FK9EA1AFC89FE23F0` FOREIGN KEY (`MENU_ITEM_ID`) REFERENCES `menu_item` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_item_terminal_ref`
--

LOCK TABLES `menu_item_terminal_ref` WRITE;
/*!40000 ALTER TABLE `menu_item_terminal_ref` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu_item_terminal_ref` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_modifier`
--

DROP TABLE IF EXISTS `menu_modifier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_modifier` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(120) DEFAULT NULL,
  `TRANSLATED_NAME` varchar(120) DEFAULT NULL,
  `PRICE` double DEFAULT NULL,
  `EXTRA_PRICE` double DEFAULT NULL,
  `SORT_ORDER` int(11) DEFAULT NULL,
  `BTN_COLOR` int(11) DEFAULT NULL,
  `TEXT_COLOR` int(11) DEFAULT NULL,
  `ENABLE` bit(1) DEFAULT NULL,
  `PRINT_TO_KITCHEN` bit(1) DEFAULT NULL,
  `GROUP_ID` int(11) DEFAULT NULL,
  `TAX_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `modifierenabled` (`ENABLE`),
  KEY `FK59B6B1B75E0C7B8D` (`GROUP_ID`),
  KEY `FK59B6B1B7A4802F83` (`TAX_ID`),
  CONSTRAINT `FK59B6B1B75E0C7B8D` FOREIGN KEY (`GROUP_ID`) REFERENCES `menu_modifier_group` (`ID`),
  CONSTRAINT `FK59B6B1B7A4802F83` FOREIGN KEY (`TAX_ID`) REFERENCES `tax` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_modifier`
--

LOCK TABLES `menu_modifier` WRITE;
/*!40000 ALTER TABLE `menu_modifier` DISABLE KEYS */;
INSERT INTO `menu_modifier` VALUES (1,'AMERICAN',NULL,0,0.5,2147483647,NULL,NULL,'\0','',5,1),(2,'BACON',NULL,0.5,0,2147483647,NULL,NULL,'\0','',2,1),(3,'BLEU CHEESE',NULL,0,0.5,2147483647,NULL,NULL,'\0','',5,1),(4,'Energy Plus',NULL,0,0,2147483647,NULL,NULL,'\0','',3,1),(5,'FRIED APPLE',NULL,0,0,2147483647,NULL,NULL,'\0','',2,1),(6,'FRIED EGG',NULL,0,0.5,2147483647,NULL,NULL,'\0','',6,1),(7,'HASHB CASSEROLE',NULL,0,0,2147483647,NULL,NULL,'\0','',2,1),(8,'HASHBROWN',NULL,0,0.5,2147483647,NULL,NULL,'\0','',8,1),(9,'OMLETTE',NULL,0,0.5,2147483647,NULL,NULL,'\0','',6,1),(10,'PAPER JACK',NULL,0,0.5,2147483647,NULL,NULL,'\0','',5,1),(11,'PROVOLON',NULL,0.5,0,2147483647,NULL,NULL,'\0','',5,1),(12,'SAUSAGE',NULL,0,0.5,2147483647,NULL,NULL,'\0','',2,1),(13,'SCRAMBLED',NULL,0,0.5,2147483647,NULL,NULL,'\0','',6,1),(14,'SMOKY SAUSAGE',NULL,0,0,2147483647,NULL,NULL,'\0','',2,1),(15,'SUN SIDE UP',NULL,0,0.5,2147483647,NULL,NULL,'\0','',6,1),(16,'THICK BACON',NULL,0,0,2147483647,NULL,NULL,'\0','',2,1);
/*!40000 ALTER TABLE `menu_modifier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_modifier_group`
--

DROP TABLE IF EXISTS `menu_modifier_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_modifier_group` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) DEFAULT NULL,
  `TRANSLATED_NAME` varchar(60) DEFAULT NULL,
  `ENABLED` bit(1) DEFAULT NULL,
  `EXCLUSIVED` bit(1) DEFAULT NULL,
  `REQUIRED` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `mg_enable` (`ENABLED`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_modifier_group`
--

LOCK TABLES `menu_modifier_group` WRITE;
/*!40000 ALTER TABLE `menu_modifier_group` DISABLE KEYS */;
INSERT INTO `menu_modifier_group` VALUES (1,'APPLE SLICE',NULL,'\0','\0','\0'),(2,'BACON & SAUSAGE',NULL,'\0','\0','\0'),(3,'BISCUITS',NULL,'\0','\0','\0'),(4,'BUTTER',NULL,'\0','\0','\0'),(5,'CHEESE',NULL,'\0','\0','\0'),(6,'EGGS',NULL,'\0','\0','\0'),(7,'MEAT',NULL,'\0','\0','\0'),(8,'POTATO',NULL,'\0','\0','\0'),(9,'WHEAT',NULL,'\0','\0','\0');
/*!40000 ALTER TABLE `menu_modifier_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_modifier_properties`
--

DROP TABLE IF EXISTS `menu_modifier_properties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_modifier_properties` (
  `MENU_MODIFIER_ID` int(11) NOT NULL,
  `PROPERTY_VALUE` varchar(100) DEFAULT NULL,
  `PROPERTY_NAME` varchar(255) NOT NULL,
  PRIMARY KEY (`MENU_MODIFIER_ID`,`PROPERTY_NAME`),
  KEY `FK1273B4BBB79C6270` (`MENU_MODIFIER_ID`),
  CONSTRAINT `FK1273B4BBB79C6270` FOREIGN KEY (`MENU_MODIFIER_ID`) REFERENCES `menu_modifier` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_modifier_properties`
--

LOCK TABLES `menu_modifier_properties` WRITE;
/*!40000 ALTER TABLE `menu_modifier_properties` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu_modifier_properties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menucategory_discount`
--

DROP TABLE IF EXISTS `menucategory_discount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menucategory_discount` (
  `DISCOUNT_ID` int(11) NOT NULL,
  `MENUCATEGORY_ID` int(11) NOT NULL,
  KEY `FK4F8523E38D9EA931` (`MENUCATEGORY_ID`),
  KEY `FK4F8523E3D3E91E11` (`DISCOUNT_ID`),
  CONSTRAINT `FK4F8523E38D9EA931` FOREIGN KEY (`MENUCATEGORY_ID`) REFERENCES `menu_category` (`ID`),
  CONSTRAINT `FK4F8523E3D3E91E11` FOREIGN KEY (`DISCOUNT_ID`) REFERENCES `coupon_and_discount` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menucategory_discount`
--

LOCK TABLES `menucategory_discount` WRITE;
/*!40000 ALTER TABLE `menucategory_discount` DISABLE KEYS */;
/*!40000 ALTER TABLE `menucategory_discount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menugroup_discount`
--

DROP TABLE IF EXISTS `menugroup_discount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menugroup_discount` (
  `DISCOUNT_ID` int(11) NOT NULL,
  `MENUGROUP_ID` int(11) NOT NULL,
  KEY `FKE3790E40113BF083` (`MENUGROUP_ID`),
  KEY `FKE3790E40D3E91E11` (`DISCOUNT_ID`),
  CONSTRAINT `FKE3790E40113BF083` FOREIGN KEY (`MENUGROUP_ID`) REFERENCES `menu_group` (`ID`),
  CONSTRAINT `FKE3790E40D3E91E11` FOREIGN KEY (`DISCOUNT_ID`) REFERENCES `coupon_and_discount` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menugroup_discount`
--

LOCK TABLES `menugroup_discount` WRITE;
/*!40000 ALTER TABLE `menugroup_discount` DISABLE KEYS */;
/*!40000 ALTER TABLE `menugroup_discount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menuitem_discount`
--

DROP TABLE IF EXISTS `menuitem_discount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menuitem_discount` (
  `DISCOUNT_ID` int(11) NOT NULL,
  `MENUITEM_ID` int(11) NOT NULL,
  KEY `FKD89CCDEE33662891` (`MENUITEM_ID`),
  KEY `FKD89CCDEED3E91E11` (`DISCOUNT_ID`),
  CONSTRAINT `FKD89CCDEE33662891` FOREIGN KEY (`MENUITEM_ID`) REFERENCES `menu_item` (`ID`),
  CONSTRAINT `FKD89CCDEED3E91E11` FOREIGN KEY (`DISCOUNT_ID`) REFERENCES `coupon_and_discount` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menuitem_discount`
--

LOCK TABLES `menuitem_discount` WRITE;
/*!40000 ALTER TABLE `menuitem_discount` DISABLE KEYS */;
/*!40000 ALTER TABLE `menuitem_discount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menuitem_modifiergroup`
--

DROP TABLE IF EXISTS `menuitem_modifiergroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menuitem_modifiergroup` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MIN_QUANTITY` int(11) DEFAULT NULL,
  `MAX_QUANTITY` int(11) DEFAULT NULL,
  `SORT_ORDER` int(11) DEFAULT NULL,
  `MODIFIER_GROUP` int(11) DEFAULT NULL,
  `MENUITEM_MODIFIERGROUP_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK312B355B40FDA3C9` (`MODIFIER_GROUP`),
  KEY `FK312B355B6E7B8B68` (`MENUITEM_MODIFIERGROUP_ID`),
  CONSTRAINT `FK312B355B40FDA3C9` FOREIGN KEY (`MODIFIER_GROUP`) REFERENCES `menu_modifier_group` (`ID`),
  CONSTRAINT `FK312B355B6E7B8B68` FOREIGN KEY (`MENUITEM_MODIFIERGROUP_ID`) REFERENCES `menu_item` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menuitem_modifiergroup`
--

LOCK TABLES `menuitem_modifiergroup` WRITE;
/*!40000 ALTER TABLE `menuitem_modifiergroup` DISABLE KEYS */;
INSERT INTO `menuitem_modifiergroup` VALUES (1,1,1,0,6,1),(2,1,2,0,2,1),(3,1,2,0,6,2),(4,1,0,0,3,2),(5,0,1,0,4,2),(6,0,1,0,1,26),(7,0,2,0,2,26),(8,2,2,0,6,3),(9,0,1,0,5,3);
/*!40000 ALTER TABLE `menuitem_modifiergroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menuitem_shift`
--

DROP TABLE IF EXISTS `menuitem_shift`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menuitem_shift` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SHIFT_PRICE` double DEFAULT NULL,
  `SHIFT_ID` int(11) DEFAULT NULL,
  `MENUITEM_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKE03C92D533662891` (`MENUITEM_ID`),
  KEY `FKE03C92D57660A5E3` (`SHIFT_ID`),
  CONSTRAINT `FKE03C92D533662891` FOREIGN KEY (`MENUITEM_ID`) REFERENCES `menu_item` (`ID`),
  CONSTRAINT `FKE03C92D57660A5E3` FOREIGN KEY (`SHIFT_ID`) REFERENCES `shift` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menuitem_shift`
--

LOCK TABLES `menuitem_shift` WRITE;
/*!40000 ALTER TABLE `menuitem_shift` DISABLE KEYS */;
/*!40000 ALTER TABLE `menuitem_shift` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_sub_type`
--

DROP TABLE IF EXISTS `order_sub_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_sub_type` (
  `ORDER_TYPE_ID` int(11) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  KEY `FK3F9E27EA3AC1D2E0` (`ORDER_TYPE_ID`),
  CONSTRAINT `FK3F9E27EA3AC1D2E0` FOREIGN KEY (`ORDER_TYPE_ID`) REFERENCES `order_type` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_sub_type`
--

LOCK TABLES `order_sub_type` WRITE;
/*!40000 ALTER TABLE `order_sub_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_sub_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_type`
--

DROP TABLE IF EXISTS `order_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_type` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(120) NOT NULL,
  `ENABLED` bit(1) DEFAULT NULL,
  `SHOW_TABLE_SELECTION` bit(1) DEFAULT NULL,
  `SHOW_GUEST_SELECTION` bit(1) DEFAULT NULL,
  `SHOULD_PRINT_TO_KITCHEN` bit(1) DEFAULT NULL,
  `PREPAID` bit(1) DEFAULT NULL,
  `CLOSE_ON_PAID` bit(1) DEFAULT NULL,
  `REQUIRED_CUSTOMER_DATA` bit(1) DEFAULT NULL,
  `REQUIRED_DELIVERY_DATA` bit(1) DEFAULT NULL,
  `ASSIGN_DRIVER` bit(1) DEFAULT NULL,
  `SHOW_ITEM_BARCODE` bit(1) DEFAULT NULL,
  `SHOW_IN_LOGIN_SCREEN` bit(1) DEFAULT NULL,
  `CONSOLIDATE_TIEMS_IN_RECEIPT` bit(1) DEFAULT NULL,
  `HIDE_ITEM_WITH_EMPTY_INVENTORY` bit(1) DEFAULT NULL,
  `HAS_FORHERE_AND_TOGO` bit(1) DEFAULT NULL,
  `PRE_AUTH_CREDIT_CARD` bit(1) DEFAULT NULL,
  `BAR_TAB` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NAME` (`NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_type`
--

LOCK TABLES `order_type` WRITE;
/*!40000 ALTER TABLE `order_type` DISABLE KEYS */;
INSERT INTO `order_type` VALUES (1,'DINE IN','','','\0','','\0','','\0','\0','\0','\0','','\0','\0','\0','\0','\0'),(2,'TAKE OUT','','\0','\0','','','','\0','\0','\0','\0','','\0','\0','\0','\0','\0'),(3,'RETAIL','','\0','\0','\0','\0','','\0','\0','\0','\0','','\0','\0','\0','\0','\0'),(4,'PICKUP','','\0','\0','','\0','','','\0','\0','\0','','\0','\0','\0','\0','\0'),(5,'HOME DELIVERY','','\0','\0','','\0','\0','','','','\0','','\0','\0','\0','\0','\0');
/*!40000 ALTER TABLE `order_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packaging_unit`
--

DROP TABLE IF EXISTS `packaging_unit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packaging_unit` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(30) DEFAULT NULL,
  `SHORT_NAME` varchar(10) DEFAULT NULL,
  `FACTOR` double DEFAULT NULL,
  `BASEUNIT` bit(1) DEFAULT NULL,
  `DIMENSION` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NAME` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packaging_unit`
--

LOCK TABLES `packaging_unit` WRITE;
/*!40000 ALTER TABLE `packaging_unit` DISABLE KEYS */;
/*!40000 ALTER TABLE `packaging_unit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payout_reasons`
--

DROP TABLE IF EXISTS `payout_reasons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payout_reasons` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `REASON` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payout_reasons`
--

LOCK TABLES `payout_reasons` WRITE;
/*!40000 ALTER TABLE `payout_reasons` DISABLE KEYS */;
/*!40000 ALTER TABLE `payout_reasons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payout_recepients`
--

DROP TABLE IF EXISTS `payout_recepients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payout_recepients` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payout_recepients`
--

LOCK TABLES `payout_recepients` WRITE;
/*!40000 ALTER TABLE `payout_recepients` DISABLE KEYS */;
/*!40000 ALTER TABLE `payout_recepients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `printer_configuration`
--

DROP TABLE IF EXISTS `printer_configuration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `printer_configuration` (
  `ID` int(11) NOT NULL,
  `RECEIPT_PRINTER` varchar(255) DEFAULT NULL,
  `KITCHEN_PRINTER` varchar(255) DEFAULT NULL,
  `PRWTS` bit(1) DEFAULT NULL,
  `PRWTP` bit(1) DEFAULT NULL,
  `PKWTS` bit(1) DEFAULT NULL,
  `PKWTP` bit(1) DEFAULT NULL,
  `UNPFT` bit(1) DEFAULT NULL,
  `UNPFK` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `printer_configuration`
--

LOCK TABLES `printer_configuration` WRITE;
/*!40000 ALTER TABLE `printer_configuration` DISABLE KEYS */;
/*!40000 ALTER TABLE `printer_configuration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `printer_group`
--

DROP TABLE IF EXISTS `printer_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `printer_group` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) NOT NULL,
  `IS_DEFAULT` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NAME` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `printer_group`
--

LOCK TABLES `printer_group` WRITE;
/*!40000 ALTER TABLE `printer_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `printer_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `printer_group_printers`
--

DROP TABLE IF EXISTS `printer_group_printers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `printer_group_printers` (
  `printer_id` int(11) NOT NULL,
  `PRINTER_NAME` varchar(255) DEFAULT NULL,
  KEY `FKC05B805E5F31265C` (`printer_id`),
  CONSTRAINT `FKC05B805E5F31265C` FOREIGN KEY (`printer_id`) REFERENCES `printer_group` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `printer_group_printers`
--

LOCK TABLES `printer_group_printers` WRITE;
/*!40000 ALTER TABLE `printer_group_printers` DISABLE KEYS */;
/*!40000 ALTER TABLE `printer_group_printers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_order`
--

DROP TABLE IF EXISTS `purchase_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_order` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ORDER_ID` varchar(30) DEFAULT NULL,
  `NAME` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_order`
--

LOCK TABLES `purchase_order` WRITE;
/*!40000 ALTER TABLE `purchase_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recepie`
--

DROP TABLE IF EXISTS `recepie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recepie` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MENU_ITEM` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK6B4E177764931EFC` (`MENU_ITEM`),
  CONSTRAINT `FK6B4E177764931EFC` FOREIGN KEY (`MENU_ITEM`) REFERENCES `menu_item` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recepie`
--

LOCK TABLES `recepie` WRITE;
/*!40000 ALTER TABLE `recepie` DISABLE KEYS */;
/*!40000 ALTER TABLE `recepie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recepie_item`
--

DROP TABLE IF EXISTS `recepie_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recepie_item` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PERCENTAGE` double DEFAULT NULL,
  `INVENTORY_DEDUCTABLE` bit(1) DEFAULT NULL,
  `INVENTORY_ITEM` int(11) DEFAULT NULL,
  `RECEPIE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK855626DBCAE89B83` (`RECEPIE_ID`),
  KEY `FK855626DB1682B10E` (`INVENTORY_ITEM`),
  CONSTRAINT `FK855626DB1682B10E` FOREIGN KEY (`INVENTORY_ITEM`) REFERENCES `inventory_item` (`ID`),
  CONSTRAINT `FK855626DBCAE89B83` FOREIGN KEY (`RECEPIE_ID`) REFERENCES `recepie` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recepie_item`
--

LOCK TABLES `recepie_item` WRITE;
/*!40000 ALTER TABLE `recepie_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `recepie_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant` (
  `ID` int(11) NOT NULL,
  `UNIQUE_ID` int(11) DEFAULT NULL,
  `NAME` varchar(120) DEFAULT NULL,
  `ADDRESS_LINE1` varchar(60) DEFAULT NULL,
  `ADDRESS_LINE2` varchar(60) DEFAULT NULL,
  `ADDRESS_LINE3` varchar(60) DEFAULT NULL,
  `ZIP_CODE` varchar(10) DEFAULT NULL,
  `TELEPHONE` varchar(16) DEFAULT NULL,
  `CAPACITY` int(11) DEFAULT NULL,
  `TABLES` int(11) DEFAULT NULL,
  `CNAME` varchar(20) DEFAULT NULL,
  `CSYMBOL` varchar(10) DEFAULT NULL,
  `SC_PERCENTAGE` double DEFAULT NULL,
  `GRATUITY_PERCENTAGE` double DEFAULT NULL,
  `TICKET_FOOTER` varchar(60) DEFAULT NULL,
  `PRICE_INCLUDES_TAX` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1,1994140099,'Sample Restaurant','Somewhere',NULL,NULL,NULL,'+0123456789',0,0,'Sample Currency','$',0,0,NULL,'\0');
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shift`
--

DROP TABLE IF EXISTS `shift`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shift` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) NOT NULL,
  `START_TIME` datetime DEFAULT NULL,
  `END_TIME` datetime DEFAULT NULL,
  `SHIFT_LEN` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NAME` (`NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shift`
--

LOCK TABLES `shift` WRITE;
/*!40000 ALTER TABLE `shift` DISABLE KEYS */;
INSERT INTO `shift` VALUES (1,'General','1970-01-01 00:00:00','1970-01-01 23:59:00',86340000);
/*!40000 ALTER TABLE `shift` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop_floor`
--

DROP TABLE IF EXISTS `shop_floor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop_floor` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) DEFAULT NULL,
  `OCCUPIED` bit(1) DEFAULT NULL,
  `IMAGE` mediumblob,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_floor`
--

LOCK TABLES `shop_floor` WRITE;
/*!40000 ALTER TABLE `shop_floor` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop_floor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop_table`
--

DROP TABLE IF EXISTS `shop_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop_table` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(20) DEFAULT NULL,
  `DESCRIPTION` varchar(60) DEFAULT NULL,
  `CAPACITY` int(11) DEFAULT NULL,
  `X` int(11) DEFAULT NULL,
  `Y` int(11) DEFAULT NULL,
  `FREE` bit(1) DEFAULT NULL,
  `SERVING` bit(1) DEFAULT NULL,
  `BOOKED` bit(1) DEFAULT NULL,
  `DIRTY` bit(1) DEFAULT NULL,
  `DISABLE` bit(1) DEFAULT NULL,
  `FLOOR_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK2458E9258979C3CD` (`FLOOR_ID`),
  CONSTRAINT `FK2458E9258979C3CD` FOREIGN KEY (`FLOOR_ID`) REFERENCES `shop_floor` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_table`
--

LOCK TABLES `shop_table` WRITE;
/*!40000 ALTER TABLE `shop_table` DISABLE KEYS */;
INSERT INTO `shop_table` VALUES (1,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(2,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(3,NULL,NULL,4,0,0,'','\0','\0','\0','\0',NULL),(4,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(5,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(6,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(7,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(8,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(9,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(10,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(11,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(12,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(13,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(14,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(15,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(16,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(17,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(18,NULL,NULL,4,0,0,'\0','','\0','\0','\0',NULL),(19,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(20,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(21,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(22,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(23,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(24,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(25,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(26,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(27,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(28,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(29,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(30,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(31,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(32,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(33,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(34,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(35,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(36,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(37,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(38,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(39,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(40,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(41,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(42,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(43,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(44,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(45,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(46,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(47,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(48,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(49,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(50,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(51,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(52,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(53,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(54,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(55,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(56,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(57,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(58,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(59,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(60,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(61,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(62,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(63,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(64,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(65,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(66,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(67,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(68,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(69,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(70,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(71,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(72,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(73,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(74,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(75,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(76,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(77,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(78,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(79,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(80,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(81,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(82,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(83,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(84,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(85,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(86,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(87,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(88,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(89,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(90,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(91,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(92,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(93,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(94,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(95,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(96,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(97,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(98,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(99,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(100,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(101,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(102,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(103,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(104,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(105,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(106,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(107,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(108,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(109,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(110,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(111,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(112,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(113,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(114,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(115,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(116,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(117,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(118,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(119,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(120,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(121,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(122,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(123,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(124,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(125,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(126,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(127,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(128,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(129,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(130,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(131,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(132,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(133,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(134,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(135,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(136,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(137,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(138,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(139,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(140,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(141,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(142,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(143,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(144,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(145,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(146,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(147,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(148,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(149,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(150,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(151,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(152,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(153,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(154,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(155,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(156,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(157,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(158,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(159,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(160,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(161,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(162,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(163,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(164,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(165,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(166,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(167,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(168,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(169,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(170,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(171,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(172,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(173,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(174,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(175,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(176,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(177,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(178,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(179,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(180,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(181,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(182,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(183,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(184,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(185,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(186,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(187,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(188,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(189,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(190,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(191,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(192,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(193,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(194,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(195,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(196,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(197,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(198,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(199,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(200,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(201,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(202,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(203,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(204,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(205,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(206,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(207,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(208,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(209,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(210,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(211,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(212,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(213,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(214,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(215,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(216,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(217,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(218,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(219,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(220,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(221,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(222,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(223,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(224,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(225,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(226,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(227,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(228,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(229,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(230,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(231,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(232,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(233,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(234,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(235,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(236,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(237,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(238,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(239,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(240,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(241,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(242,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(243,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(244,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(245,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(246,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(247,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(248,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(249,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(250,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(251,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(252,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(253,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(254,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(255,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(256,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(257,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(258,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(259,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(260,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(261,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(262,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(263,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(264,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(265,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(266,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(267,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(268,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(269,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(270,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(271,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(272,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(273,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(274,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(275,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(276,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(277,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(278,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(279,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(280,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(281,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(282,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(283,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(284,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(285,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(286,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(287,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(288,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(289,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(290,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(291,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(292,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(293,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(294,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(295,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(296,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(297,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(298,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(299,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(300,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(301,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(302,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(303,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(304,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(305,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(306,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(307,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(308,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(309,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(310,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(311,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(312,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(313,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(314,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(315,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(316,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(317,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(318,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(319,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(320,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(321,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(322,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(323,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(324,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(325,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(326,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(327,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(328,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(329,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(330,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(331,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(332,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(333,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(334,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(335,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(336,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(337,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(338,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(339,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(340,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(341,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(342,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(343,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(344,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(345,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(346,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(347,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(348,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(349,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(350,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(351,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(352,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(353,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(354,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(355,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(356,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(357,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(358,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(359,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(360,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(361,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(362,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(363,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(364,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(365,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(366,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(367,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(368,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(369,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(370,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(371,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(372,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(373,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(374,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(375,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(376,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(377,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(378,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(379,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(380,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(381,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(382,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(383,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(384,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(385,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(386,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(387,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(388,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(389,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(390,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(391,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(392,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(393,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(394,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(395,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(396,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(397,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(398,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(399,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(400,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(401,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(402,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(403,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(404,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(405,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(406,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(407,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(408,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(409,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(410,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(411,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(412,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(413,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(414,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(415,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(416,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(417,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(418,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(419,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(420,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(421,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(422,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(423,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(424,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(425,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(426,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(427,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(428,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(429,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(430,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(431,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(432,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(433,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(434,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(435,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(436,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(437,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(438,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(439,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(440,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(441,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(442,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(443,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(444,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(445,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(446,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(447,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(448,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(449,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(450,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(451,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(452,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(453,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(454,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(455,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(456,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(457,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(458,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(459,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(460,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(461,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(462,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(463,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(464,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(465,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(466,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(467,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(468,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(469,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(470,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(471,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(472,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(473,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(474,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(475,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(476,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(477,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(478,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(479,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(480,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(481,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(482,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(483,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(484,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(485,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(486,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(487,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(488,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(489,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(490,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(491,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(492,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(493,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(494,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(495,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(496,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(497,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(498,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(499,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(500,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(501,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(502,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(503,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(504,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(505,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(506,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(507,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(508,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(509,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(510,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(511,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(512,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(513,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(514,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(515,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(516,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(517,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(518,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(519,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(520,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(521,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(522,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(523,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(524,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(525,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(526,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(527,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(528,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(529,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(530,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(531,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(532,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(533,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(534,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(535,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(536,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(537,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(538,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(539,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(540,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(541,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(542,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(543,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(544,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(545,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(546,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(547,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(548,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(549,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(550,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(551,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(552,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(553,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(554,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(555,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(556,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(557,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(558,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(559,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(560,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(561,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(562,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(563,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(564,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(565,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(566,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(567,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(568,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(569,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(570,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(571,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(572,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(573,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(574,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(575,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(576,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(577,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(578,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(579,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(580,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(581,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(582,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(583,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(584,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(585,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(586,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(587,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(588,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(589,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(590,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(591,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(592,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(593,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(594,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(595,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(596,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(597,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(598,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(599,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(600,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(601,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(602,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(603,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(604,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(605,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(606,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(607,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(608,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(609,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(610,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(611,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(612,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(613,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(614,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(615,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(616,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(617,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(618,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(619,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(620,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(621,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(622,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(623,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(624,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(625,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(626,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(627,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(628,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(629,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(630,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(631,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(632,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(633,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(634,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(635,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(636,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(637,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(638,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(639,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(640,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(641,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(642,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(643,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(644,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(645,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(646,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(647,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(648,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(649,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(650,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(651,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(652,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(653,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(654,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(655,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(656,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(657,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(658,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(659,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(660,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(661,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(662,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(663,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(664,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(665,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(666,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(667,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(668,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(669,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(670,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(671,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(672,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(673,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(674,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(675,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(676,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(677,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(678,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(679,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(680,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(681,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(682,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(683,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(684,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(685,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(686,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(687,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(688,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(689,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(690,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(691,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(692,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(693,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(694,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(695,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(696,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(697,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(698,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(699,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(700,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(701,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(702,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(703,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(704,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(705,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(706,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(707,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(708,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(709,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(710,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(711,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(712,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(713,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(714,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(715,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(716,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(717,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(718,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(719,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(720,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(721,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(722,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(723,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(724,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(725,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(726,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(727,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(728,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(729,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(730,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(731,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(732,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(733,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(734,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(735,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(736,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(737,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(738,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(739,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(740,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(741,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(742,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(743,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(744,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(745,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(746,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(747,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(748,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(749,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(750,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(751,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(752,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(753,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(754,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(755,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(756,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(757,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(758,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(759,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(760,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(761,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(762,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(763,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(764,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(765,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(766,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(767,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(768,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(769,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(770,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(771,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(772,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(773,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(774,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(775,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(776,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(777,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(778,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(779,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(780,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(781,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(782,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(783,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(784,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(785,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(786,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(787,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(788,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(789,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(790,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(791,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(792,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(793,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(794,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(795,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(796,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(797,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(798,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(799,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(800,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(801,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(802,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(803,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(804,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(805,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(806,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(807,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(808,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(809,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(810,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(811,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(812,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(813,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(814,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(815,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(816,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(817,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(818,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(819,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(820,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(821,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(822,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(823,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(824,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(825,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(826,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(827,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(828,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(829,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(830,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(831,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(832,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(833,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(834,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(835,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(836,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(837,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(838,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(839,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(840,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(841,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(842,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(843,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(844,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(845,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(846,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(847,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(848,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(849,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(850,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(851,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(852,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(853,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(854,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(855,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(856,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(857,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(858,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(859,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(860,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(861,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(862,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(863,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(864,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(865,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(866,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(867,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(868,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(869,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(870,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(871,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(872,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(873,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(874,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(875,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(876,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(877,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(878,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(879,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(880,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(881,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(882,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(883,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(884,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(885,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(886,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(887,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(888,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(889,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(890,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(891,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(892,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(893,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(894,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(895,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(896,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(897,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(898,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(899,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(900,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(901,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(902,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(903,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(904,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(905,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(906,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(907,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(908,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(909,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(910,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(911,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(912,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(913,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(914,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(915,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(916,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(917,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(918,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(919,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(920,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(921,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(922,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(923,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(924,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(925,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(926,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(927,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(928,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(929,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(930,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(931,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(932,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(933,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(934,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(935,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(936,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(937,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(938,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(939,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(940,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(941,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(942,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(943,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(944,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(945,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(946,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(947,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(948,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(949,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(950,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(951,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(952,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(953,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(954,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(955,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(956,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(957,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(958,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(959,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(960,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(961,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(962,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(963,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(964,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(965,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(966,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(967,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(968,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(969,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(970,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(971,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(972,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(973,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(974,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(975,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(976,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(977,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(978,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(979,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(980,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(981,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(982,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(983,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(984,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(985,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(986,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(987,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(988,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(989,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(990,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(991,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(992,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(993,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(994,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(995,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(996,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(997,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(998,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(999,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1000,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1001,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1002,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1003,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1004,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1005,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1006,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1007,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1008,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1009,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1010,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1011,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1012,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1013,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1014,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1015,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1016,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1017,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1018,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1019,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1020,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1021,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1022,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1023,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1024,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1025,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1026,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1027,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1028,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1029,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1030,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1031,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1032,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1033,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1034,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1035,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1036,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1037,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1038,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1039,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1040,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1041,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1042,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1043,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1044,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1045,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1046,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1047,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1048,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1049,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1050,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1051,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1052,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1053,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1054,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1055,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1056,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1057,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1058,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1059,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1060,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1061,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1062,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1063,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1064,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1065,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1066,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1067,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1068,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1069,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1070,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1071,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1072,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1073,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1074,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1075,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1076,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1077,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1078,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1079,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1080,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1081,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1082,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1083,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1084,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1085,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1086,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1087,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1088,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1089,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1090,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1091,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1092,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1093,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1094,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1095,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1096,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1097,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1098,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1099,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1100,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1101,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1102,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1103,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1104,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1105,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1106,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1107,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1108,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1109,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1110,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL),(1111,NULL,NULL,4,0,0,'\0','\0','\0','\0','\0',NULL);
/*!40000 ALTER TABLE `shop_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop_table_type`
--

DROP TABLE IF EXISTS `shop_table_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop_table_type` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(120) DEFAULT NULL,
  `NAME` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_table_type`
--

LOCK TABLES `shop_table_type` WRITE;
/*!40000 ALTER TABLE `shop_table_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop_table_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_booking_info`
--

DROP TABLE IF EXISTS `table_booking_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `table_booking_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FROM_DATE` datetime DEFAULT NULL,
  `TO_DATE` datetime DEFAULT NULL,
  `GUEST_COUNT` int(11) DEFAULT NULL,
  `STATUS` varchar(30) DEFAULT NULL,
  `PAYMENT_STATUS` varchar(30) DEFAULT NULL,
  `BOOKING_CONFIRM` varchar(30) DEFAULT NULL,
  `BOOKING_CHARGE` double DEFAULT NULL,
  `REMAINING_BALANCE` double DEFAULT NULL,
  `PAID_AMOUNT` double DEFAULT NULL,
  `BOOKING_TYPE` varchar(30) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fromDate` (`FROM_DATE`),
  KEY `toDate` (`TO_DATE`),
  KEY `FK301C4DE53E20AD51` (`user_id`),
  KEY `FK301C4DE59E1C3CF1` (`customer_id`),
  CONSTRAINT `FK301C4DE53E20AD51` FOREIGN KEY (`user_id`) REFERENCES `users` (`AUTO_ID`),
  CONSTRAINT `FK301C4DE59E1C3CF1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`AUTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_booking_info`
--

LOCK TABLES `table_booking_info` WRITE;
/*!40000 ALTER TABLE `table_booking_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `table_booking_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_booking_mapping`
--

DROP TABLE IF EXISTS `table_booking_mapping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `table_booking_mapping` (
  `BOOKING_ID` int(11) NOT NULL,
  `TABLE_ID` int(11) NOT NULL,
  KEY `FK6BC51417160DE3B1` (`BOOKING_ID`),
  KEY `FK6BC51417DC46948D` (`TABLE_ID`),
  CONSTRAINT `FK6BC51417160DE3B1` FOREIGN KEY (`BOOKING_ID`) REFERENCES `table_booking_info` (`ID`),
  CONSTRAINT `FK6BC51417DC46948D` FOREIGN KEY (`TABLE_ID`) REFERENCES `shop_table` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_booking_mapping`
--

LOCK TABLES `table_booking_mapping` WRITE;
/*!40000 ALTER TABLE `table_booking_mapping` DISABLE KEYS */;
/*!40000 ALTER TABLE `table_booking_mapping` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_type_relation`
--

DROP TABLE IF EXISTS `table_type_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `table_type_relation` (
  `TABLE_ID` int(11) NOT NULL,
  `TYPE_ID` int(11) NOT NULL,
  KEY `FK93802290F5D6E47B` (`TYPE_ID`),
  KEY `FK93802290DC46948D` (`TABLE_ID`),
  CONSTRAINT `FK93802290DC46948D` FOREIGN KEY (`TABLE_ID`) REFERENCES `shop_table` (`ID`),
  CONSTRAINT `FK93802290F5D6E47B` FOREIGN KEY (`TYPE_ID`) REFERENCES `shop_table_type` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_type_relation`
--

LOCK TABLES `table_type_relation` WRITE;
/*!40000 ALTER TABLE `table_type_relation` DISABLE KEYS */;
/*!40000 ALTER TABLE `table_type_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tax`
--

DROP TABLE IF EXISTS `tax`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tax` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) NOT NULL,
  `RATE` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tax`
--

LOCK TABLES `tax` WRITE;
/*!40000 ALTER TABLE `tax` DISABLE KEYS */;
INSERT INTO `tax` VALUES (1,'US',6);
/*!40000 ALTER TABLE `tax` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `terminal`
--

DROP TABLE IF EXISTS `terminal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `terminal` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(60) DEFAULT NULL,
  `OPENING_BALANCE` double DEFAULT NULL,
  `CURRENT_BALANCE` double DEFAULT NULL,
  `HAS_CASH_DRAWER` bit(1) DEFAULT NULL,
  `ASSIGNED_USER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKE83D827C969C6DE` (`ASSIGNED_USER`),
  CONSTRAINT `FKE83D827C969C6DE` FOREIGN KEY (`ASSIGNED_USER`) REFERENCES `users` (`AUTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terminal`
--

LOCK TABLES `terminal` WRITE;
/*!40000 ALTER TABLE `terminal` DISABLE KEYS */;
INSERT INTO `terminal` VALUES (4263,'4263',500,112.72,'',1);
/*!40000 ALTER TABLE `terminal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `terminal_printers`
--

DROP TABLE IF EXISTS `terminal_printers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `terminal_printers` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TERMINAL_ID` int(11) DEFAULT NULL,
  `PRINTER_NAME` varchar(60) DEFAULT NULL,
  `VIRTUAL_PRINTER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK99EDE5FCC433E65A` (`VIRTUAL_PRINTER_ID`),
  KEY `FK99EDE5FC2AD2D031` (`TERMINAL_ID`),
  CONSTRAINT `FK99EDE5FC2AD2D031` FOREIGN KEY (`TERMINAL_ID`) REFERENCES `terminal` (`ID`),
  CONSTRAINT `FK99EDE5FCC433E65A` FOREIGN KEY (`VIRTUAL_PRINTER_ID`) REFERENCES `virtual_printer` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terminal_printers`
--

LOCK TABLES `terminal_printers` WRITE;
/*!40000 ALTER TABLE `terminal_printers` DISABLE KEYS */;
/*!40000 ALTER TABLE `terminal_printers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CREATE_DATE` datetime DEFAULT NULL,
  `CLOSING_DATE` datetime DEFAULT NULL,
  `ACTIVE_DATE` datetime DEFAULT NULL,
  `DELIVEERY_DATE` datetime DEFAULT NULL,
  `CREATION_HOUR` int(11) DEFAULT NULL,
  `PAID` bit(1) DEFAULT NULL,
  `VOIDED` bit(1) DEFAULT NULL,
  `VOID_REASON` varchar(255) DEFAULT NULL,
  `WASTED` bit(1) DEFAULT NULL,
  `REFUNDED` bit(1) DEFAULT NULL,
  `SETTLED` bit(1) DEFAULT NULL,
  `DRAWER_RESETTED` bit(1) DEFAULT NULL,
  `SUB_TOTAL` double DEFAULT NULL,
  `TOTAL_DISCOUNT` double DEFAULT NULL,
  `TOTAL_TAX` double DEFAULT NULL,
  `TOTAL_PRICE` double DEFAULT NULL,
  `PAID_AMOUNT` double DEFAULT NULL,
  `DUE_AMOUNT` double DEFAULT NULL,
  `ADVANCE_AMOUNT` double DEFAULT NULL,
  `NUMBER_OF_GUESTS` int(11) DEFAULT NULL,
  `STATUS` varchar(30) DEFAULT NULL,
  `IS_TAX_EXEMPT` bit(1) DEFAULT NULL,
  `IS_RE_OPENED` bit(1) DEFAULT NULL,
  `SERVICE_CHARGE` double DEFAULT NULL,
  `DELIVERY_CHARGE` double DEFAULT NULL,
  `DELIVERY_ADDRESS` varchar(120) DEFAULT NULL,
  `CUSTOMER_PICKEUP` bit(1) DEFAULT NULL,
  `DELIVERY_EXTRA_INFO` varchar(255) DEFAULT NULL,
  `TICKET_TYPE` varchar(20) DEFAULT NULL,
  `SHIFT_ID` int(11) DEFAULT NULL,
  `OWNER_ID` int(11) DEFAULT NULL,
  `DRIVER_ID` int(11) DEFAULT NULL,
  `GRATUITY_ID` int(11) DEFAULT NULL,
  `VOID_BY_USER` int(11) DEFAULT NULL,
  `TERMINAL_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `creationHour` (`CREATION_HOUR`),
  KEY `ticketpaid` (`PAID`),
  KEY `ticketactiveDate` (`ACTIVE_DATE`),
  KEY `ticketcreateDate` (`CREATE_DATE`),
  KEY `ticketsettled` (`SETTLED`),
  KEY `deliveryDate` (`DELIVEERY_DATE`),
  KEY `ticketclosingDate` (`CLOSING_DATE`),
  KEY `drawerresetted` (`DRAWER_RESETTED`),
  KEY `ticketvoided` (`VOIDED`),
  KEY `FK937B5F0CF575C7D4` (`DRIVER_ID`),
  KEY `FK937B5F0CAA075D69` (`OWNER_ID`),
  KEY `FK937B5F0C7660A5E3` (`SHIFT_ID`),
  KEY `FK937B5F0CC188EA51` (`GRATUITY_ID`),
  KEY `FK937B5F0C1F6A9A4A` (`VOID_BY_USER`),
  KEY `FK937B5F0C2AD2D031` (`TERMINAL_ID`),
  CONSTRAINT `FK937B5F0C1F6A9A4A` FOREIGN KEY (`VOID_BY_USER`) REFERENCES `users` (`AUTO_ID`),
  CONSTRAINT `FK937B5F0C2AD2D031` FOREIGN KEY (`TERMINAL_ID`) REFERENCES `terminal` (`ID`),
  CONSTRAINT `FK937B5F0C7660A5E3` FOREIGN KEY (`SHIFT_ID`) REFERENCES `shift` (`ID`),
  CONSTRAINT `FK937B5F0CAA075D69` FOREIGN KEY (`OWNER_ID`) REFERENCES `users` (`AUTO_ID`),
  CONSTRAINT `FK937B5F0CC188EA51` FOREIGN KEY (`GRATUITY_ID`) REFERENCES `gratuity` (`ID`),
  CONSTRAINT `FK937B5F0CF575C7D4` FOREIGN KEY (`DRIVER_ID`) REFERENCES `users` (`AUTO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,'2016-05-11 16:50:20','2016-05-11 18:01:07','2016-05-11 18:01:07','2016-05-11 17:00:20',16,'','\0',NULL,'\0','\0','','\0',0,0,0,0,0,0,0,1,NULL,'\0','\0',0,0,NULL,'\0',NULL,'DINE IN',1,4,NULL,NULL,NULL,4263),(2,'2016-05-11 17:11:20','2016-05-11 17:14:57','2016-05-11 17:14:57','2016-05-11 17:21:20',17,'','\0',NULL,'\0','\0','','\0',12,0,0.72,12.72,12.72,0,0,1,NULL,'\0','\0',0,0,NULL,'\0',NULL,'TAKE OUT',1,1,NULL,NULL,NULL,4263),(3,'2016-05-11 17:15:03','2016-05-11 18:01:07','2016-05-11 18:01:07','2016-05-11 17:25:03',17,'','\0',NULL,'\0','\0','','\0',24,0,1.44,25.44,25.44,0,0,1,NULL,'\0','\0',0,0,NULL,'\0',NULL,'TAKE OUT',1,1,NULL,NULL,NULL,4263),(4,'2016-05-11 22:47:10',NULL,'2016-05-11 22:48:56','2016-05-11 22:57:10',22,'\0','\0',NULL,'\0','\0','\0','\0',10,0,0.6,10.6,0,10.6,0,5,NULL,'\0','\0',0,0,NULL,'\0',NULL,'DINE IN',1,1,NULL,NULL,NULL,4263);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_discount`
--

DROP TABLE IF EXISTS `ticket_discount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_discount` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DISCOUNT_ID` int(11) DEFAULT NULL,
  `NAME` varchar(30) DEFAULT NULL,
  `TYPE` int(11) DEFAULT NULL,
  `AUTO_APPLY` bit(1) DEFAULT NULL,
  `MINIMUM_AMOUNT` int(11) DEFAULT NULL,
  `VALUE` double DEFAULT NULL,
  `TICKET_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK1FA465141DF2D7F1` (`TICKET_ID`),
  CONSTRAINT `FK1FA465141DF2D7F1` FOREIGN KEY (`TICKET_ID`) REFERENCES `ticket` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_discount`
--

LOCK TABLES `ticket_discount` WRITE;
/*!40000 ALTER TABLE `ticket_discount` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket_discount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_item`
--

DROP TABLE IF EXISTS `ticket_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_item` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ITEM_ID` int(11) DEFAULT NULL,
  `ITEM_COUNT` int(11) DEFAULT NULL,
  `ITEM_QUANTITY` double DEFAULT NULL,
  `ITEM_NAME` varchar(120) DEFAULT NULL,
  `ITEM_UNIT_NAME` varchar(20) DEFAULT NULL,
  `GROUP_NAME` varchar(120) DEFAULT NULL,
  `CATEGORY_NAME` varchar(120) DEFAULT NULL,
  `ITEM_PRICE` double DEFAULT NULL,
  `ITEM_TAX_RATE` double DEFAULT NULL,
  `SUB_TOTAL` double DEFAULT NULL,
  `SUB_TOTAL_WITHOUT_MODIFIERS` double DEFAULT NULL,
  `DISCOUNT` double DEFAULT NULL,
  `TAX_AMOUNT` double DEFAULT NULL,
  `TAX_AMOUNT_WITHOUT_MODIFIERS` double DEFAULT NULL,
  `TOTAL_PRICE` double DEFAULT NULL,
  `TOTAL_PRICE_WITHOUT_MODIFIERS` double DEFAULT NULL,
  `BEVERAGE` bit(1) DEFAULT NULL,
  `INVENTORY_HANDLED` bit(1) DEFAULT NULL,
  `PRINT_TO_KITCHEN` bit(1) DEFAULT NULL,
  `FRACTIONAL_UNIT` bit(1) DEFAULT NULL,
  `HAS_MODIIERS` bit(1) DEFAULT NULL,
  `PRINTED_TO_KITCHEN` bit(1) DEFAULT NULL,
  `STOCK_AMOUNT_ADJUSTED` bit(1) DEFAULT NULL,
  `TICKET_ID` int(11) DEFAULT NULL,
  `PG_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK979F54665CF1375F` (`PG_ID`),
  KEY `FK979F54661DF2D7F1` (`TICKET_ID`),
  CONSTRAINT `FK979F54661DF2D7F1` FOREIGN KEY (`TICKET_ID`) REFERENCES `ticket` (`ID`),
  CONSTRAINT `FK979F54665CF1375F` FOREIGN KEY (`PG_ID`) REFERENCES `printer_group` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_item`
--

LOCK TABLES `ticket_item` WRITE;
/*!40000 ALTER TABLE `ticket_item` DISABLE KEYS */;
INSERT INTO `ticket_item` VALUES (1,10,3,0,'BELLYS SEASONAL',NULL,'BEERS','BEER & WINE',4,6,12,12,0,0.72,0.72,12.72,12.72,'','\0','\0','\0','\0','\0','',2,NULL),(2,10,6,0,'BELLYS SEASONAL',NULL,'BEERS','BEER & WINE',4,6,24,24,0,1.44,1.44,25.44,25.44,'','\0','\0','\0','\0','\0','',3,NULL),(3,13,1,0,'CHICK TENDER KIDS MEAL',NULL,'KIDS MEAL','KIDS ',4,6,4,4,0,0.24,0.24,4.24,4.24,'\0','\0','','\0','\0','','',4,NULL),(4,34,4,0,'OATMEAL ',NULL,'CEREALS & MUFF','BREAKFAST',1.5,6,6,6,0,0.36,0.36,6.36,6.36,'\0','\0','','\0','\0','','',4,NULL);
/*!40000 ALTER TABLE `ticket_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_item_cooking_instruction`
--

DROP TABLE IF EXISTS `ticket_item_cooking_instruction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_item_cooking_instruction` (
  `TICKET_ITEM_ID` int(11) NOT NULL,
  `description` varchar(60) DEFAULT NULL,
  `printedToKitchen` bit(1) DEFAULT NULL,
  `ITEM_ORDER` int(11) NOT NULL,
  PRIMARY KEY (`TICKET_ITEM_ID`,`ITEM_ORDER`),
  KEY `FK3825F9D0DEC6120A` (`TICKET_ITEM_ID`),
  CONSTRAINT `FK3825F9D0DEC6120A` FOREIGN KEY (`TICKET_ITEM_ID`) REFERENCES `ticket_item` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_item_cooking_instruction`
--

LOCK TABLES `ticket_item_cooking_instruction` WRITE;
/*!40000 ALTER TABLE `ticket_item_cooking_instruction` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket_item_cooking_instruction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_item_discount`
--

DROP TABLE IF EXISTS `ticket_item_discount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_item_discount` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DISCOUNT_ID` int(11) DEFAULT NULL,
  `NAME` varchar(30) DEFAULT NULL,
  `TYPE` int(11) DEFAULT NULL,
  `AUTO_APPLY` bit(1) DEFAULT NULL,
  `MINIMUM_QUANTITY` int(11) DEFAULT NULL,
  `VALUE` double DEFAULT NULL,
  `AMOUNT` double DEFAULT NULL,
  `TICKET_ITEMID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK3DF5D4FAB9276E77` (`TICKET_ITEMID`),
  CONSTRAINT `FK3DF5D4FAB9276E77` FOREIGN KEY (`TICKET_ITEMID`) REFERENCES `ticket_item` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_item_discount`
--

LOCK TABLES `ticket_item_discount` WRITE;
/*!40000 ALTER TABLE `ticket_item_discount` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket_item_discount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_item_modifier`
--

DROP TABLE IF EXISTS `ticket_item_modifier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_item_modifier` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ITEM_ID` int(11) DEFAULT NULL,
  `GROUP_ID` int(11) DEFAULT NULL,
  `ITEM_COUNT` int(11) DEFAULT NULL,
  `MODIFIER_NAME` varchar(30) DEFAULT NULL,
  `MODIFIER_PRICE` double DEFAULT NULL,
  `MODIFIER_TAX_RATE` double DEFAULT NULL,
  `MODIFIER_TYPE` int(11) DEFAULT NULL,
  `SUBTOTAL_PRICE` double DEFAULT NULL,
  `TOTAL_PRICE` double DEFAULT NULL,
  `TAX_AMOUNT` double DEFAULT NULL,
  `PRINT_TO_KITCHEN` bit(1) DEFAULT NULL,
  `PRINTED_TO_KITCHEN` bit(1) DEFAULT NULL,
  `ModifierGroup_ID` int(11) DEFAULT NULL,
  `TICKET_ITEM_ID` int(11) DEFAULT NULL,
  `ADDON_TICKET_ITEM_ID` int(11) DEFAULT NULL,
  `ADDON_ORDER` int(11) DEFAULT NULL,
  `TICKETITEMMODIFIERGROUP_ID` int(11) DEFAULT NULL,
  `ITEM_ORDER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK8FD6290DEC6120A` (`TICKET_ITEM_ID`),
  KEY `FK8FD6290163D5E9` (`ADDON_TICKET_ITEM_ID`),
  KEY `FK8FD6290C04D31C4` (`ModifierGroup_ID`),
  KEY `FK8FD6290267493E3` (`TICKETITEMMODIFIERGROUP_ID`),
  CONSTRAINT `FK8FD6290163D5E9` FOREIGN KEY (`ADDON_TICKET_ITEM_ID`) REFERENCES `ticket_item` (`ID`),
  CONSTRAINT `FK8FD6290267493E3` FOREIGN KEY (`TICKETITEMMODIFIERGROUP_ID`) REFERENCES `ticketitem_modifiergroup` (`ID`),
  CONSTRAINT `FK8FD6290C04D31C4` FOREIGN KEY (`ModifierGroup_ID`) REFERENCES `ticketitem_modifiergroup` (`ID`),
  CONSTRAINT `FK8FD6290DEC6120A` FOREIGN KEY (`TICKET_ITEM_ID`) REFERENCES `ticket_item` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_item_modifier`
--

LOCK TABLES `ticket_item_modifier` WRITE;
/*!40000 ALTER TABLE `ticket_item_modifier` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket_item_modifier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_properties`
--

DROP TABLE IF EXISTS `ticket_properties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_properties` (
  `id` int(11) NOT NULL,
  `property_value` text,
  `property_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`,`property_name`),
  KEY `FK70ECD046223049DE` (`id`),
  CONSTRAINT `FK70ECD046223049DE` FOREIGN KEY (`id`) REFERENCES `ticket` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_properties`
--

LOCK TABLES `ticket_properties` WRITE;
/*!40000 ALTER TABLE `ticket_properties` DISABLE KEYS */;
INSERT INTO `ticket_properties` VALUES (1,'1','CUSTOMER_ID'),(1,'971526710657','CUSTOMER_MOBILE'),(1,'Joshua','CUSTOMER_NAME');
/*!40000 ALTER TABLE `ticket_properties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_table_num`
--

DROP TABLE IF EXISTS `ticket_table_num`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_table_num` (
  `ticket_id` int(11) NOT NULL,
  `TABLE_ID` int(11) DEFAULT NULL,
  KEY `FK65AF15E21DF2D7F1` (`ticket_id`),
  CONSTRAINT `FK65AF15E21DF2D7F1` FOREIGN KEY (`ticket_id`) REFERENCES `ticket` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_table_num`
--

LOCK TABLES `ticket_table_num` WRITE;
/*!40000 ALTER TABLE `ticket_table_num` DISABLE KEYS */;
INSERT INTO `ticket_table_num` VALUES (1,3),(4,18);
/*!40000 ALTER TABLE `ticket_table_num` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticketitem_modifiergroup`
--

DROP TABLE IF EXISTS `ticketitem_modifiergroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticketitem_modifiergroup` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MIN_QUANTITY` int(11) DEFAULT NULL,
  `MAX_QUANTITY` int(11) DEFAULT NULL,
  `parent` int(11) DEFAULT NULL,
  `GROUP_ID` int(11) DEFAULT NULL,
  `TICKETITEM_ID` int(11) DEFAULT NULL,
  `ITEM_ORDER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK21D455C8A73C1B20` (`parent`),
  KEY `FK21D455C8DC1B1BB1` (`TICKETITEM_ID`),
  KEY `FK21D455C874D5923A` (`GROUP_ID`),
  CONSTRAINT `FK21D455C874D5923A` FOREIGN KEY (`GROUP_ID`) REFERENCES `menuitem_modifiergroup` (`ID`),
  CONSTRAINT `FK21D455C8A73C1B20` FOREIGN KEY (`parent`) REFERENCES `ticket_item` (`ID`),
  CONSTRAINT `FK21D455C8DC1B1BB1` FOREIGN KEY (`TICKETITEM_ID`) REFERENCES `ticket_item` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticketitem_modifiergroup`
--

LOCK TABLES `ticketitem_modifiergroup` WRITE;
/*!40000 ALTER TABLE `ticketitem_modifiergroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticketitem_modifiergroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction_properties`
--

DROP TABLE IF EXISTS `transaction_properties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction_properties` (
  `id` int(11) NOT NULL,
  `property_value` varchar(255) DEFAULT NULL,
  `property_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`,`property_name`),
  KEY `FKE3DE65548E8203BC` (`id`),
  CONSTRAINT `FKE3DE65548E8203BC` FOREIGN KEY (`id`) REFERENCES `transactions` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction_properties`
--

LOCK TABLES `transaction_properties` WRITE;
/*!40000 ALTER TABLE `transaction_properties` DISABLE KEYS */;
/*!40000 ALTER TABLE `transaction_properties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transactions` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PAYMENT_TYPE` varchar(30) NOT NULL,
  `TRANSACTION_TIME` datetime DEFAULT NULL,
  `AMOUNT` double DEFAULT NULL,
  `TIPS_AMOUNT` double DEFAULT NULL,
  `TENDER_AMOUNT` double DEFAULT NULL,
  `TRANSACTION_TYPE` varchar(20) NOT NULL,
  `CUSTOM_PAYMENT_NAME` varchar(60) DEFAULT NULL,
  `CUSTOM_PAYMENT_REF` varchar(120) DEFAULT NULL,
  `CUSTOM_PAYMENT_FIELD_NAME` varchar(60) DEFAULT NULL,
  `PAYMENT_SUB_TYPE` varchar(40) NOT NULL,
  `CAPTURED` bit(1) DEFAULT NULL,
  `AUTHORIZABLE` bit(1) DEFAULT NULL,
  `CARD_NUMBER` varchar(40) DEFAULT NULL,
  `CARD_AUTH_CODE` varchar(30) DEFAULT NULL,
  `CARD_TYPE` varchar(20) DEFAULT NULL,
  `CARD_TRANSACTION_ID` varchar(255) DEFAULT NULL,
  `CARD_MERCHANT_GATEWAY` varchar(60) DEFAULT NULL,
  `CARD_READER` varchar(20) DEFAULT NULL,
  `GIFT_CERT_NUMBER` varchar(64) DEFAULT NULL,
  `GIFT_CERT_FACE_VALUE` double DEFAULT NULL,
  `GIFT_CERT_PAID_AMOUNT` double DEFAULT NULL,
  `GIFT_CERT_CASH_BACK_AMOUNT` double DEFAULT NULL,
  `DRAWER_RESETTED` bit(1) DEFAULT NULL,
  `NOTE` varchar(255) DEFAULT NULL,
  `TERMINAL_ID` int(11) DEFAULT NULL,
  `TICKET_ID` int(11) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `PAYOUT_REASON_ID` int(11) DEFAULT NULL,
  `PAYOUT_RECEPIENT_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `tran_drawer_resetted` (`DRAWER_RESETTED`),
  KEY `FKFE9871553E20AD51` (`USER_ID`),
  KEY `FKFE987155FC697D9E` (`PAYOUT_REASON_ID`),
  KEY `FKFE987155CA43B6` (`PAYOUT_RECEPIENT_ID`),
  KEY `FKFE9871551DF2D7F1` (`TICKET_ID`),
  KEY `FKFE9871552AD2D031` (`TERMINAL_ID`),
  CONSTRAINT `FKFE9871551DF2D7F1` FOREIGN KEY (`TICKET_ID`) REFERENCES `ticket` (`ID`),
  CONSTRAINT `FKFE9871552AD2D031` FOREIGN KEY (`TERMINAL_ID`) REFERENCES `terminal` (`ID`),
  CONSTRAINT `FKFE9871553E20AD51` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`AUTO_ID`),
  CONSTRAINT `FKFE987155CA43B6` FOREIGN KEY (`PAYOUT_RECEPIENT_ID`) REFERENCES `payout_recepients` (`ID`),
  CONSTRAINT `FKFE987155FC697D9E` FOREIGN KEY (`PAYOUT_REASON_ID`) REFERENCES `payout_reasons` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES (1,'CASH','2016-05-11 17:14:57',12.72,0,12.72,'CREDIT',NULL,NULL,NULL,'CASH','','\0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,0,0,'\0',NULL,4263,2,1,NULL,NULL),(2,'GIFT_CERT','2016-05-11 18:01:07',0,0,0,'CREDIT',NULL,NULL,NULL,'GIFT_CERTIFICATE','','\0',NULL,NULL,NULL,NULL,NULL,NULL,'123445',10,10,0,'\0',NULL,4263,1,1,NULL,NULL),(3,'GIFT_CERT','2016-05-11 18:01:07',25.44,0,26,'CREDIT',NULL,NULL,NULL,'GIFT_CERTIFICATE','','\0',NULL,NULL,NULL,NULL,NULL,NULL,'123445',10,10,0,'\0',NULL,4263,3,1,NULL,NULL);
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_permission`
--

DROP TABLE IF EXISTS `user_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_permission` (
  `NAME` varchar(40) NOT NULL,
  PRIMARY KEY (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_permission`
--

LOCK TABLES `user_permission` WRITE;
/*!40000 ALTER TABLE `user_permission` DISABLE KEYS */;
INSERT INTO `user_permission` VALUES ('Add Discount'),('All Functions'),('Authorize Tickets'),('Booking'),('Create New Ticket'),('Drawer Assignment'),('Drawer Pull'),('Hold Ticket'),('Kitchen Display'),('Manage Table Layout'),('Modify Printed Ticket'),('Pay Out'),('Perform Administrative Task'),('Perform Manager Task'),('Refund'),('Reopen Ticket'),('Settle Ticket'),('Shut Down'),('Split Ticket'),('Transfer Ticket'),('View All Close Tickets'),('View All Open Ticket'),('View Back Office'),('View Explorers'),('View Reports'),('Void Ticket');
/*!40000 ALTER TABLE `user_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_type`
--

DROP TABLE IF EXISTS `user_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_type` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `P_NAME` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_type`
--

LOCK TABLES `user_type` WRITE;
/*!40000 ALTER TABLE `user_type` DISABLE KEYS */;
INSERT INTO `user_type` VALUES (1,'Administrator'),(2,'MANAGER'),(3,'CASHIER'),(4,'SR. CASHIER');
/*!40000 ALTER TABLE `user_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_user_permission`
--

DROP TABLE IF EXISTS `user_user_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_user_permission` (
  `permissionId` int(11) NOT NULL,
  `elt` varchar(40) NOT NULL,
  PRIMARY KEY (`permissionId`,`elt`),
  KEY `FK2DBEAA4F283ECC6` (`permissionId`),
  KEY `FK2DBEAA4F8F23F5E` (`elt`),
  CONSTRAINT `FK2DBEAA4F283ECC6` FOREIGN KEY (`permissionId`) REFERENCES `user_type` (`ID`),
  CONSTRAINT `FK2DBEAA4F8F23F5E` FOREIGN KEY (`elt`) REFERENCES `user_permission` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_user_permission`
--

LOCK TABLES `user_user_permission` WRITE;
/*!40000 ALTER TABLE `user_user_permission` DISABLE KEYS */;
INSERT INTO `user_user_permission` VALUES (1,'Add Discount'),(1,'All Functions'),(1,'Authorize Tickets'),(1,'Booking'),(1,'Create New Ticket'),(1,'Drawer Assignment'),(1,'Drawer Pull'),(1,'Hold Ticket'),(1,'Kitchen Display'),(1,'Manage Table Layout'),(1,'Modify Printed Ticket'),(1,'Pay Out'),(1,'Perform Administrative Task'),(1,'Perform Manager Task'),(1,'Refund'),(1,'Reopen Ticket'),(1,'Settle Ticket'),(1,'Shut Down'),(1,'Split Ticket'),(1,'Transfer Ticket'),(1,'View All Close Tickets'),(1,'View All Open Ticket'),(1,'View Back Office'),(1,'View Explorers'),(1,'View Reports'),(1,'Void Ticket'),(2,'Add Discount'),(2,'All Functions'),(2,'Authorize Tickets'),(2,'Booking'),(2,'Create New Ticket'),(2,'Drawer Assignment'),(2,'Drawer Pull'),(2,'Hold Ticket'),(2,'Kitchen Display'),(2,'Manage Table Layout'),(2,'Modify Printed Ticket'),(2,'Pay Out'),(2,'Perform Administrative Task'),(2,'Perform Manager Task'),(2,'Refund'),(2,'Reopen Ticket'),(2,'Settle Ticket'),(2,'Shut Down'),(2,'Split Ticket'),(2,'Transfer Ticket'),(2,'View All Close Tickets'),(2,'View All Open Ticket'),(2,'View Back Office'),(2,'View Explorers'),(2,'View Reports'),(2,'Void Ticket'),(3,'Create New Ticket'),(3,'Settle Ticket'),(3,'Split Ticket'),(3,'View All Open Ticket'),(4,'Create New Ticket'),(4,'Settle Ticket'),(4,'Split Ticket');
/*!40000 ALTER TABLE `user_user_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `AUTO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `USER_PASS` varchar(16) NOT NULL,
  `FIRST_NAME` varchar(30) DEFAULT NULL,
  `LAST_NAME` varchar(30) DEFAULT NULL,
  `SSN` varchar(30) DEFAULT NULL,
  `COST_PER_HOUR` double DEFAULT NULL,
  `CLOCKED_IN` bit(1) DEFAULT NULL,
  `LAST_CLOCK_IN_TIME` datetime DEFAULT NULL,
  `PHONE_NO` varchar(20) DEFAULT NULL,
  `IS_DRIVER` bit(1) DEFAULT NULL,
  `AVAILABLE_FOR_DELIVERY` bit(1) DEFAULT NULL,
  `ACTIVE` bit(1) DEFAULT NULL,
  `SHIFT_ID` int(11) DEFAULT NULL,
  `currentTerminal` int(11) DEFAULT NULL,
  `N_USER_TYPE` int(11) DEFAULT NULL,
  PRIMARY KEY (`AUTO_ID`),
  UNIQUE KEY `USER_PASS` (`USER_PASS`),
  UNIQUE KEY `USER_ID` (`USER_ID`),
  KEY `FK4D495E87660A5E3` (`SHIFT_ID`),
  KEY `FK4D495E8D9409968` (`currentTerminal`),
  KEY `FK4D495E8897B1E39` (`N_USER_TYPE`),
  CONSTRAINT `FK4D495E87660A5E3` FOREIGN KEY (`SHIFT_ID`) REFERENCES `shift` (`ID`),
  CONSTRAINT `FK4D495E8897B1E39` FOREIGN KEY (`N_USER_TYPE`) REFERENCES `user_type` (`ID`),
  CONSTRAINT `FK4D495E8D9409968` FOREIGN KEY (`currentTerminal`) REFERENCES `terminal` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,123,'1111','Administrator','System','123',0,'','2016-05-11 16:45:38',NULL,'\0','\0','',1,4263,1),(2,124,'2222','X','Y','124',0,'\0',NULL,NULL,'\0','\0','',NULL,NULL,2),(3,125,'3333','C','D','125',0,'\0',NULL,NULL,'\0','\0','',NULL,NULL,3),(4,126,'7777','John','Doe','126',0,'\0',NULL,NULL,'\0','\0','',NULL,NULL,4);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `virtual_printer`
--

DROP TABLE IF EXISTS `virtual_printer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `virtual_printer` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(60) NOT NULL,
  `TYPE` int(11) DEFAULT NULL,
  `PRIORITY` int(11) DEFAULT NULL,
  `ENABLED` bit(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NAME` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `virtual_printer`
--

LOCK TABLES `virtual_printer` WRITE;
/*!40000 ALTER TABLE `virtual_printer` DISABLE KEYS */;
/*!40000 ALTER TABLE `virtual_printer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `virtualprinter_order_type`
--

DROP TABLE IF EXISTS `virtualprinter_order_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `virtualprinter_order_type` (
  `printer_id` int(11) NOT NULL,
  `ORDER_TYPE` varchar(255) DEFAULT NULL,
  KEY `FK9AF7853BCF15F4A6` (`printer_id`),
  CONSTRAINT `FK9AF7853BCF15F4A6` FOREIGN KEY (`printer_id`) REFERENCES `virtual_printer` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `virtualprinter_order_type`
--

LOCK TABLES `virtualprinter_order_type` WRITE;
/*!40000 ALTER TABLE `virtualprinter_order_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `virtualprinter_order_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `void_reasons`
--

DROP TABLE IF EXISTS `void_reasons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `void_reasons` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `REASON_TEXT` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `void_reasons`
--

LOCK TABLES `void_reasons` WRITE;
/*!40000 ALTER TABLE `void_reasons` DISABLE KEYS */;
/*!40000 ALTER TABLE `void_reasons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zip_code_vs_delivery_charge`
--

DROP TABLE IF EXISTS `zip_code_vs_delivery_charge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zip_code_vs_delivery_charge` (
  `AUTO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ZIP_CODE` varchar(10) NOT NULL,
  `DELIVERY_CHARGE` double NOT NULL,
  PRIMARY KEY (`AUTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zip_code_vs_delivery_charge`
--

LOCK TABLES `zip_code_vs_delivery_charge` WRITE;
/*!40000 ALTER TABLE `zip_code_vs_delivery_charge` DISABLE KEYS */;
/*!40000 ALTER TABLE `zip_code_vs_delivery_charge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'posdb'
--

--
-- Dumping routines for database 'posdb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-11 23:17:10
