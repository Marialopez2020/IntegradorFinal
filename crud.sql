DROP DATABASE IF EXISTS crud;
CREATE DATABASE crud CHARACTER SET utf8mb4;
USE crud;

DROP TABLE IF EXISTS `cargo`;
CREATE TABLE `cargo` (
  `IDCARGO` int NOT NULL AUTO_INCREMENT,
  `NOMBRECARGO` varchar(20) DEFAULT NULL,
  `ESTADO` bit(1) DEFAULT NULL,
  PRIMARY KEY (`IDCARGO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `cargo` WRITE;
INSERT INTO `cargo` VALUES (1,'ADMINISTRADOR',_binary ''),(2,'VENDEDOR',_binary '');
UNLOCK TABLES;

DROP TABLE IF EXISTS `persona`;
CREATE TABLE `persona` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `tematica` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=253 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `IDUSUARIO` int NOT NULL AUTO_INCREMENT,
  `NOMBREUSUARIO` varchar(20) DEFAULT NULL,
  `CLAVE` varchar(10) DEFAULT NULL,
  `ESTADO` bit(1) DEFAULT NULL,
  `IDCARGO` int DEFAULT NULL,
  PRIMARY KEY (`IDUSUARIO`),
  KEY `FK_USUARIO_CARGO` (`IDCARGO`),
  CONSTRAINT `FK_USUARIO_CARGO` FOREIGN KEY (`IDCARGO`) REFERENCES `cargo` (`IDCARGO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

LOCK TABLES `usuario` WRITE;
INSERT INTO `usuario` VALUES (1,'MATIAS','5555',_binary '',1),(2,'MARIA','2222',_binary '',2),(3,'CATALINA','3333',_binary '',2),(4,'USER','4444',_binary '',2);

UNLOCK TABLES;
