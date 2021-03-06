 -- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.12-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para skalada
DROP DATABASE IF EXISTS `skalada`;
CREATE DATABASE IF NOT EXISTS `skalada` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `skalada`;


-- Volcando estructura para tabla skalada.test
DROP TABLE IF EXISTS `test`;
CREATE TABLE IF NOT EXISTS `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla',
  `nombre` varchar(120) NOT NULL COMMENT 'Cadena de texto para el nombre',
  `nota` float NOT NULL DEFAULT '0' COMMENT 'Nota del alumno de 0 a 10',
  `telefono` varchar(50) DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Fecha de inscripción',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='Tabla de pruebas';

-- Volcando datos para la tabla skalada.test: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` (`id`, `nombre`, `nota`, `telefono`, `fecha`) VALUES
	(1, 'pepe2', 0.5, NULL, '2015-09-01 11:43:07'),
	(2, 'pepa', 7.45, '666555444', '2015-09-01 15:45:17');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
