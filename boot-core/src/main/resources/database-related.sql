CREATE DATABASE `spring_boot`;
USE `spring_boot`;

CREATE TABLE `product_details` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `brand` varchar(100) DEFAULT NULL,
  `product` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `price` double DEFAULT '0',
  `discounted_price` double DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

INSERT INTO `product_details` (`id`, `brand`, `product`, `url`, `price`, `discounted_price`)
VALUES
	(1, 'Nike', 'Casual Shoes', 'https://nike.image/', 1799, 899);
