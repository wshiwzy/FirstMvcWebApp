create database employeebd;
USE  employeebd;
CREATE TABLE `employee` (
  `employeeid` int(11) AUTO_INCREMENT NOT NULL,
  `name` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `isenable` bit(1) DEFAULT NULL,
  `address` varchar(100) NOT NULL,
  `tel` varchar(20) NOT NULL,
  PRIMARY KEY (`employeeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8