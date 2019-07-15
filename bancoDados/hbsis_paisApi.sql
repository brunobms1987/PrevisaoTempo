-- Host: localhost    Database: previsaotempohbsis

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
-- Table structure for table `paisApi`
--

DROP TABLE IF EXISTS `paisApi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paisApi` (
  `sigla` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `paisApi` WRITE;
/*!40000 ALTER TABLE `paisApi` DISABLE KEYS */;
INSERT INTO `paisApi` VALUES ('UA'),('RU'),('NP'),('IN'),('VE'),('IQ'),('DE'),('IL'),('GE'),('NG'),('GB'),('ZA'),('CN'),('TR'),('DO'),('PK'),('LV'),('PL'),('KN'),('JP'),('MM'),('BA'),('AU'),('NA'),('AR'),('US'),('CA'),('FJ'),('ID'),('CG'),('TZ'),('CM'),('CF'),('SS'),('ET'),('SD'),('PT'),('UZ'),('ES'),('FI'),('NL'),('FR'),('NZ'),('IT'),('CU'),('BL'),('AZ'),('IR'),('SL'),('KM'),('HT'),('AT'),('BE'),('BF'),('BO'),('CD'),('CH'),('CI'),('CZ'),('DK'),('DZ'),('FM'),('GH'),('GN'),('GP'),('GR'),('GS'),('GT'),('HN'),('HU'),('JM'),('MZ'),('NO'),('OM'),('PE'),('PR'),('SE'),('TH'),('VC'),('VN'),('MX'),('BD'),('BI'),('BJ'),('BR'),('CL'),('EG'),('ER'),('JO'),('KP'),('KR'),('KW'),('KZ'),('LA'),('LK'),('LR'),('LY'),('PG'),('PH'),('RS'),('TD'),('AM'),('AO'),('AS'),('SN'),('BY'),('BG'),('RO'),('AL'),('MT'),('LT'),('XK'),('EE'),('UY'),('YE'),('ZM'),('ZW'),('AF'),('BW'),('MW'),('EC'),('KE'),('UG'),('CO'),('SR'),('TG'),('PA'),('CR'),('SO'),('NI'),('GW'),('ML'),('SV'),('NE'),('SA'),('TW'),('EH'),('MA'),('KG'),('MK'),('HR'),('SI'),('SK'),('LU'),('IE'),('NC'),('LB'),('TC'),('BZ'),('KY'),('HK'),('AG'),('CV'),('RW'),('LS'),('MU'),('SC'),('RE'),('TN'),('IS'),('TJ'),('MD'),('CW'),('BQ'),('SX'),('SY'),('GD'),('PM'),('GG'),('BT'),('LI'),('FO'),('GL'),('GF'),('YT'),('MN'),('KI'),('VU'),('CC'),('MY'),('BN'),('MP'),('GU'),('AE'),('BH'),('KH'),('MG'),('MQ'),('PF'),('PS'),('PW'),('PY'),('QA'),('TM'),('TT'),('AD'),('AI'),('AQ'),('AX'),('DM'),('CY'),('GI'),('MH'),('NF'),('SZ'),('TO'),('GY'),('ME'),('VI'),('AW'),('BB'),('SM'),('GA'),('MS'),('GM'),('GQ'),('MC'),('MF'),('WF'),('SB'),('NU'),('WS'),('CK'),('CX'),('TL'),('SH'),('DJ'),('JE'),('BM'),('PN'),('TV'),('VA'),('MR'),('SG'),('BS'),('TF'),('MO'),('MV'),('FK'),('VG'),('LC'),('IM'),('ST'),('NR'),('SJ'),('TK');
/*!40000 ALTER TABLE `paisApi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

