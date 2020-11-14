-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Nov 14, 2020 at 05:06 AM
-- Server version: 8.0.18
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hoteldb`
--
--
-- Table structure for table `tbl_customer`
--

DROP TABLE IF EXISTS `tbl_customer`;
CREATE TABLE IF NOT EXISTS `tbl_customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(45) NOT NULL,
  `email_address` varchar(45) NOT NULL,
  `contact_number` int(11) NOT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_customer`
--

INSERT INTO `tbl_customer` (`customer_id`, `customer_name`, `email_address`, `contact_number`) VALUES
(2, 'chatura', 'chatura@gmail.com', 122122333),
(3, 'sjjsj', 'jsjsjsj', 828889);

-- --------------------------------------------------------
-- --------------------------------------------------------

--
-- Table structure for table `tbl_booking`
--

DROP TABLE IF EXISTS `tbl_booking`;
CREATE TABLE IF NOT EXISTS `tbl_booking` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `booking_name` varchar(45) NOT NULL,
  `date` date NOT NULL,
  `booking_type` varchar(45) NOT NULL,
  `tbl_customer_customer_id` int(11) NOT NULL,
  PRIMARY KEY (`booking_id`,`tbl_customer_customer_id`),
  KEY `fk_tbl_booking_tbl_customer` (`tbl_customer_customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_booking`
--

INSERT INTO `tbl_booking` (`booking_id`, `booking_name`, `date`, `booking_type`, `tbl_customer_customer_id`) VALUES
(1, 'normal room', '2020-10-07', 'annana', 2),
(3, 'room', '2020-10-20', 'normal', 3),
(4, 'room', '2020-10-20', 'n', 3);

-- --------------------------------------------------------
--
-- Table structure for table `tbl_item`
--

DROP TABLE IF EXISTS `tbl_item`;
CREATE TABLE IF NOT EXISTS `tbl_item` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) NOT NULL,
  `unit_price` double NOT NULL,
  `qty` int(11) NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_item`
--

INSERT INTO `tbl_item` (`item_id`, `item_name`, `unit_price`, `qty`) VALUES
(1, 'hotel', 585858, 10),
(3, 'romm', 272728, 36),
(4, 'hotel', 585858, 10);

-- --------------------------------------------------------


--
-- Table structure for table `tbl_booking_has_tbl_item`
--

DROP TABLE IF EXISTS `tbl_booking_has_tbl_item`;
CREATE TABLE IF NOT EXISTS `tbl_booking_has_tbl_item` (
  `tbl_booking_booking_id` int(11) NOT NULL,
  `tbl_booking_tbl_customer_customer_id` int(11) NOT NULL,
  `tbl_item_item_id` int(11) NOT NULL,
  PRIMARY KEY (`tbl_booking_booking_id`,`tbl_booking_tbl_customer_customer_id`,`tbl_item_item_id`),
  KEY `fk_tbl_booking_has_tbl_item_tbl_item1` (`tbl_item_item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_login`
--

DROP TABLE IF EXISTS `tbl_login`;
CREATE TABLE IF NOT EXISTS `tbl_login` (
  `login_id` int(11) NOT NULL AUTO_INCREMENT,
  `emailAddress` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE IF NOT EXISTS `tbl_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `last_name` varchar(40) NOT NULL,
  `Date_of_birth` date NOT NULL,
  `Contact` int(11) NOT NULL,
  `Gender` varchar(40) NOT NULL,
  `email_address` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Password` varchar(40) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `first_name`, `last_name`, `Date_of_birth`, `Contact`, `Gender`, `email_address`, `Password`) VALUES
(1, 'Dilki', 'Liyanaarachchi', '1995-05-20', 378282829, 'Female', 'Dil@gmail.com', '464yeeh');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_booking`
--
ALTER TABLE `tbl_booking`
  ADD CONSTRAINT `fk_tbl_booking_tbl_customer` FOREIGN KEY (`tbl_customer_customer_id`) REFERENCES `tbl_customer` (`customer_id`);

--
-- Constraints for table `tbl_booking_has_tbl_item`
--
ALTER TABLE `tbl_booking_has_tbl_item`
  ADD CONSTRAINT `fk_tbl_booking_has_tbl_item_tbl_booking1` FOREIGN KEY (`tbl_booking_booking_id`,`tbl_booking_tbl_customer_customer_id`) REFERENCES `tbl_booking` (`booking_id`, `tbl_customer_customer_id`),
  ADD CONSTRAINT `fk_tbl_booking_has_tbl_item_tbl_item1` FOREIGN KEY (`tbl_item_item_id`) REFERENCES `tbl_item` (`item_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
