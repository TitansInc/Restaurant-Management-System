-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 29, 2014 at 11:22 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `lospolloshermanos`
--

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE IF NOT EXISTS `rating` (
  `RatingValue` int(11) NOT NULL,
  `MName` varchar(50) NOT NULL,
  `MUserName` varchar(50) NOT NULL,
  PRIMARY KEY (`MName`,`MUserName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rating`
--

INSERT INTO `rating` (`RatingValue`, `MName`, `MUserName`) VALUES
(3, 'GRILLED CHEESE', 'ZUBAIR123'),
(2, 'LATINO BURGER', 'ZUBAIR123'),
(3, 'MEXICAN BURGER', 'ZUBAIR123'),
(3, 'NEW YORK CHEESE', 'ZUBAIR123'),
(3, 'REGULAR BURGER', 'ZUBAIR123');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
