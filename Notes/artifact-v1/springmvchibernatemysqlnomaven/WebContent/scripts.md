CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `customer` VALUES 
	(1,'David','Adams','java@sun.com'),
	(2,'John','Doe','angular@google.com'),
	(3,'Ajay','Rao','hibernate@jboss.com');