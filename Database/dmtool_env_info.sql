CREATE DATABASE  IF NOT EXISTS `dmtool` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `dmtool`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: dmtool
-- ------------------------------------------------------
-- Server version	5.5.46-log

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
-- Table structure for table `env_info`
--

DROP TABLE IF EXISTS `env_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `env_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(45) DEFAULT NULL,
  `HOST_NAME` varchar(45) DEFAULT NULL,
  `ENTERPRISE_NAME` varchar(45) DEFAULT NULL,
  `SERVER_HOST` varchar(45) DEFAULT NULL,
  `SERVER_NAME` varchar(45) DEFAULT NULL,
  `SERVICE` varchar(45) DEFAULT NULL,
  `SEIBEL_PATH` varchar(45) DEFAULT NULL,
  `ADM_PATH` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `env_info`
--

LOCK TABLES `env_info` WRITE;
/*!40000 ALTER TABLE `env_info` DISABLE KEYS */;
INSERT INTO `env_info` VALUES (5,'QA-2-Punnam','lkjkj','kjk','kj','kjk','jkjk','jk','kjk'),(6,'QA-2','mnmn','mnmn','mnm','nmnm','nmn','mnmn','mnmnm'),(7,'QA-5','bvb','','','','vcbvc','',''),(8,'QA-1m','lkjkjm','kjkhmm','kjm','kjkm','jkjkm','jkm','kjkm'),(9,'UdateQA-1m','lkjkjm','kjkm','kjm','kjkm','jkjkm','jkm','kjkm'),(10,'QA-12','lkjkj','kjk','kj','kjk','jkjk','jk','kjk'),(11,'QA-2',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'QA-12','SDSAD','SADSAD','sadSA','sadsa','sadSA','SDSA','DSADSA');
/*!40000 ALTER TABLE `env_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-10 20:35:30
