CREATE DATABASE  IF NOT EXISTS `hms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hms`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: hms
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` varchar(6) NOT NULL DEFAULT 'A10000',
  `name` varchar(20) NOT NULL,
  `surname` varchar(20) NOT NULL,
  `title` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `departments_id` varchar(6) NOT NULL,
  `users_id` varchar(6) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_admin_departments1_idx` (`departments_id`),
  CONSTRAINT `fk_admin_departments1` FOREIGN KEY (`departments_id`) REFERENCES `departments` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('A10000','Oguzhan','Akbulut','Manager','oakbulutt@outlook.com','796146119','DEP000',''),('A10001','Dominika','Minkiewicz','Manager','dasdas@dasdas.com','897954613','DEP000',''),('A10002','Murat','Akbulut','IT Tech','da@asd.com','897564123','DEP000','A10002'),('A10003','Ahmet','Admin','IT Tech','sas@dfg.com','897568883','DEP000','A10003'),('A10004','Mehmet','Admin','IT Tech','sasdas@dfg.com','897999883','DEP000','A10004');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appointments`
--

DROP TABLE IF EXISTS `appointments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointments` (
  `id` varchar(6) NOT NULL DEFAULT 'AA1000',
  `patients_id` varchar(6) NOT NULL,
  `doctors_id` varchar(6) NOT NULL,
  `appointment_date` date NOT NULL,
  `appointment_status` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_appointments_patients_idx` (`patients_id`),
  KEY `fk_appointments_doctors1_idx` (`doctors_id`),
  CONSTRAINT `fk_appointments_doctors1` FOREIGN KEY (`doctors_id`) REFERENCES `doctors` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_appointments_patients` FOREIGN KEY (`patients_id`) REFERENCES `patients` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointments`
--

LOCK TABLES `appointments` WRITE;
/*!40000 ALTER TABLE `appointments` DISABLE KEYS */;
INSERT INTO `appointments` VALUES ('APP000','PAT000','D10000','2020-02-12','Accepted'),('APP001','PAT001','D10002','2020-02-13','Accepted'),('APP002','PAT002','D10002','2020-02-12','Accepted');
/*!40000 ALTER TABLE `appointments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departments` (
  `id` varchar(6) NOT NULL DEFAULT 'D10000',
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` VALUES ('DEP000','IT'),('DEP001','Cardiology'),('DEP002','Neurology'),('DEP003','Physiotherapy'),('DEP004','Urology'),('DEP005','General Surgery'),('DEP006','Renal Unit'),('DEP007','Gynecology'),('DEP008','ENT'),('DEP009','Gastroenterology'),('DEP010','Orthopedics'),('DEP011','Test');
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctors`
--

DROP TABLE IF EXISTS `doctors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctors` (
  `id` varchar(6) NOT NULL DEFAULT 'D10000',
  `name` varchar(20) NOT NULL,
  `surname` varchar(20) NOT NULL,
  `title` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `departments_id` varchar(6) NOT NULL,
  `users_id` varchar(6) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_doctors_departments1_idx` (`departments_id`),
  CONSTRAINT `fk_doctors_departments1` FOREIGN KEY (`departments_id`) REFERENCES `departments` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctors`
--

LOCK TABLES `doctors` WRITE;
/*!40000 ALTER TABLE `doctors` DISABLE KEYS */;
INSERT INTO `doctors` VALUES ('D10000','Ahmet','Kara','Surgeon','asdas@asda.com','54645316','DEP001','D10000'),('D10001','John','Carter','Prof.','dasdas@dsa.com','65465423','DEP002','D10001'),('D10002','Mehmet','Kaya','Dr.','asda@asd.com','21598456','DEP003','D10002'),('D10003','Kemal','Mazlum','Dr.','asdas@adas.com','12345678','DEP004','D10003'),('D10004','Ali','Kas','Surgeon','asd@wer.com','98756412','DEP005','D10004'),('D10005','Martin','Kirec','Dr.','asdasg@fadaf.com','65489731','DEP006','D10005'),('D10006','Sevgi','Kardes','Dr.','asdvb@asdfa.com','64218479','DEP007','D10006'),('D10007','Yeliz','Mus','Dr.','asdasd@agfh.com','89756423','DEP008','D10007'),('D10008','Baran','Misli','Dr.','asdhn@iosjf.com','65468791','DEP009','D10008'),('D10009','Selim','Ilgaz','Dr.','ha@rsgs.com','51613218','DEP010','D10009');
/*!40000 ALTER TABLE `doctors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patients`
--

DROP TABLE IF EXISTS `patients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patients` (
  `id` varchar(6) NOT NULL DEFAULT 'P10000',
  `name` varchar(20) NOT NULL,
  `surname` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `birthdate` date NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `anamnesis` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patients`
--

LOCK TABLES `patients` WRITE;
/*!40000 ALTER TABLE `patients` DISABLE KEYS */;
INSERT INTO `patients` VALUES ('PAT000','Hakan','Altun','Male','1970-10-15','asdasd@asd.com','789556421','sdfgasdgaha'),('PAT001','Fatih','Gesr','Male','1980-02-20','ggg@asd.com','999888555',''),('PAT002','Ayse','Gul','Female','1996-02-14','gdasdg@asd.com','993338555','test');
/*!40000 ALTER TABLE `patients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescriptions`
--

DROP TABLE IF EXISTS `prescriptions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prescriptions` (
  `id` varchar(6) NOT NULL,
  `patients_id` varchar(6) NOT NULL,
  `doctors_id` varchar(6) NOT NULL,
  `name_of_medicine` varchar(45) DEFAULT NULL,
  `dose_mg` int DEFAULT NULL,
  `number_of_tablets` int DEFAULT NULL,
  `daily_dose` int DEFAULT NULL,
  `explanation` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_prescriptions_patients1_idx` (`patients_id`),
  KEY `fk_prescriptions_doctors1_idx` (`doctors_id`),
  CONSTRAINT `fk_prescriptions_doctors1` FOREIGN KEY (`doctors_id`) REFERENCES `doctors` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_prescriptions_patients1` FOREIGN KEY (`patients_id`) REFERENCES `patients` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescriptions`
--

LOCK TABLES `prescriptions` WRITE;
/*!40000 ALTER TABLE `prescriptions` DISABLE KEYS */;
INSERT INTO `prescriptions` VALUES ('PRE000','PAT000','D10000','ARVALES',2,16,1,'SADGFASasdfa'),('PRE001','PAT001','D10002','asd',12,21,1,'asd'),('PRE002','PAT002','D10002','sadasd',555,55,444,'dsa');
/*!40000 ALTER TABLE `prescriptions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receptionists`
--

DROP TABLE IF EXISTS `receptionists`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receptionists` (
  `id` varchar(6) NOT NULL DEFAULT 'R10000',
  `name` varchar(20) NOT NULL,
  `surname` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `users_id` varchar(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receptionists`
--

LOCK TABLES `receptionists` WRITE;
/*!40000 ALTER TABLE `receptionists` DISABLE KEYS */;
INSERT INTO `receptionists` VALUES ('R10000','Gokhan','Namli','dad@afas.com','984252125','R10000'),('R10001','Olga','Slav','ad@afads.com','984999125','R10001');
/*!40000 ALTER TABLE `receptionists` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` varchar(6) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('A10000','admin'),('A10001','admin'),('D10000','doctor'),('D10001','doctor'),('D10002','doctor'),('D10003','doctor'),('D10004','doctor'),('D10005','doctor'),('D10006','doctor'),('D10007','doctor'),('D10008','doctor'),('D10009','doctor'),('R10000','receptionist'),('R10001','receptionist');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-02 15:10:35
