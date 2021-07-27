CREATE DATABASE  IF NOT EXISTS `emple_dep` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `emple_dep`;
-- MySQL dump 10.13  Distrib 8.0.26, for macos11 (x86_64)
--
-- Host: localhost    Database: emple_dep
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamento` (
  `id` int NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamento`
--

LOCK TABLES `departamento` WRITE;
/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` VALUES (1,'Compras','Calle 123, Buenos Aires.'),(2,'Finanzas','Avenida siempre viva 123.'),(3,'Deposito','Alem 52, Chaco.'),(4,'Atencion al publico','Rivadavia 5, Jujuy.'),(5,'Marketing','Palmer 89, Mendoza');
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `legajo` int NOT NULL,
  `dni` varchar(20) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `fecha_incorporacion` date NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `sueldo` decimal(18,2) NOT NULL,
  `departamento_id` int DEFAULT NULL,
  PRIMARY KEY (`legajo`),
  KEY `fk_empleado_departamento` (`departamento_id`),
  CONSTRAINT `fk_empleado_departamento` FOREIGN KEY (`departamento_id`) REFERENCES `departamento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'40978360','Heredia','Marcos','1998-03-23','2021-04-22','Vendedor',3000.45,4),(2,'921485122','Messi','Lionel','1935-05-30','2021-04-06','Jugador',45000.95,4),(3,'849565232','Manrique','Karen','1998-03-23','2021-05-04','Marketing',9999.90,5),(4,'54852','Gandini','Paula','1998-03-23','2021-05-22','Deposito',85555.85,3),(5,'1561556','Edwing','Vesga','1998-03-23','2021-06-12','Contador',45555.89,2),(6,'295315663','Guada','Taborda','1998-04-25','2021-06-13','Compras',78895.45,1),(7,'1561526','Miriam','Gutierrez','1998-04-25','2021-06-16','Compras',795151635.47,1);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-27 16:37:03
