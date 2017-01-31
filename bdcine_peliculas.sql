CREATE DATABASE  IF NOT EXISTS `bdcine` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bdcine`;
-- MySQL dump 10.13  Distrib 5.5.53, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: bdcine
-- ------------------------------------------------------
-- Server version	5.5.53-0ubuntu0.14.04.1

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
-- Table structure for table `peliculas`
--

DROP TABLE IF EXISTS `peliculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peliculas` (
  `director` varchar(128) NOT NULL,
  `titulo` varchar(128) NOT NULL,
  `fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peliculas`
--

LOCK TABLES `peliculas` WRITE;
/*!40000 ALTER TABLE `peliculas` DISABLE KEYS */;
INSERT INTO `peliculas` VALUES ('Juan Antonio Bayona','El orfanato','2007-10-15 00:00:00'),('Juan Antonio Bayona','Lo imposible','2012-09-09 00:00:00'),('Juan Antonio Bayona','Un monstruo viene a verme','2016-10-07 00:00:00'),('Antonio Mercero','La cabina','1972-12-13 00:00:00'),('Antonio Mercero','La guerra de papa','1977-12-01 00:00:00'),('Antonio Mercero','Espérame en el cielo','1988-10-14 00:00:00'),('Julio Medem','Vacas','1992-07-02 00:00:00'),('Julio Medem','Tierra','1995-05-23 00:00:00'),('Julio Medem','Ma ma','2015-09-11 00:00:00'),('Emilio Aragon','Pájaros de papel','2010-02-28 00:00:00');
/*!40000 ALTER TABLE `peliculas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-28 13:03:00
