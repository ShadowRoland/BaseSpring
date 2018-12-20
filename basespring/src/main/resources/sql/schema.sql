create database basespring default character set utf8;
use basespring;
 CREATE TABLE `t_user` (
   `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
   `userName` VARCHAR(50) DEFAULT NULL,
   `password` VARCHAR(200) DEFAULT NULL,
   `age` TINYINT(4) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=INNODB DEFAULT CHARSET=utf8
;
commit;
