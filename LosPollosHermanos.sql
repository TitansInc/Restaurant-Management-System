-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 01, 2015 at 04:22 PM
-- Server version: 5.5.34
-- PHP Version: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `LosPollosHermanos`
--

-- --------------------------------------------------------

--
-- Table structure for table `Delivery`
--

CREATE TABLE IF NOT EXISTS `Delivery` (
  `OrderNo` varchar(30) NOT NULL,
  `Receiver` varchar(30) NOT NULL,
  `CPhoneNo` text,
  `DAddress` text,
  `DTime` time DEFAULT NULL,
  PRIMARY KEY (`OrderNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Delivery`
--

INSERT INTO `Delivery` (`OrderNo`, `Receiver`, `CPhoneNo`, `DAddress`, `DTime`) VALUES
('LPH2752833165', 'Zubair', '9177042711', '221-B, BakerStreet', '12:17:55'),
('LPH2939155770', 'Zubaeyr', '9177042711', '', '00:45:08'),
('LPH5933211354', 'Zubair', '9177042711', '221B, Bakerstreet', '00:45:05'),
('LPH8740526014', 'zubair', '99999', '', '12:18:00');

-- --------------------------------------------------------

--
-- Table structure for table `Feedback`
--

CREATE TABLE IF NOT EXISTS `Feedback` (
  `FNo` varchar(20) NOT NULL,
  `VFoodDrinks` float DEFAULT NULL,
  `VCustomerService` float DEFAULT NULL,
  `VStaffBehaviour` float DEFAULT NULL,
  `VAmbiance` float DEFAULT NULL,
  `VMenu` float DEFAULT NULL,
  `VPrice` float DEFAULT NULL,
  `Comment` text,
  `FDate` date NOT NULL,
  `MemberID` text NOT NULL,
  PRIMARY KEY (`FNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Feedback`
--

INSERT INTO `Feedback` (`FNo`, `VFoodDrinks`, `VCustomerService`, `VStaffBehaviour`, `VAmbiance`, `VMenu`, `VPrice`, `Comment`, `FDate`, `MemberID`) VALUES
('1', 2.75, 1.95, 2.35, 3.75, 3.95, 2.5, 'See, the point is I dont give a damn about your restaurant! It''s 3 am in the morning and i''ve slept yet cuz i wanted to finish this project!', '2014-12-31', 'Zubaeyr%40iiiT-B');

-- --------------------------------------------------------

--
-- Table structure for table `MealCategory`
--

CREATE TABLE IF NOT EXISTS `MealCategory` (
  `CName` varchar(30) NOT NULL,
  `CImage` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`CName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `MealCategory`
--

INSERT INTO `MealCategory` (`CName`, `CImage`) VALUES
('Biryani', 'bir1.jpeg'),
('Burgers', 'b5.jpeg'),
('Chineese', 'c3.jpeg'),
('Pizzas', 'p7.jpeg'),
('Salad', 's2.jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `Meals`
--

CREATE TABLE IF NOT EXISTS `Meals` (
  `MName` varchar(30) NOT NULL DEFAULT '',
  `MImage` varchar(200) DEFAULT NULL,
  `Price` float DEFAULT NULL,
  `Description` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `CName` varchar(20) NOT NULL,
  PRIMARY KEY (`MName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Meals`
--

INSERT INTO `Meals` (`MName`, `MImage`, `Price`, `Description`, `CName`) VALUES
('Barbeque', 'b4.jpeg', 6, 'Cheesy and Saucy', 'Burgers'),
('Biryani2', 'bir6.jpeg', 10, 'xxxxx', 'Biryani'),
('Chicken Biryani', 'bir6.jpeg', 5, 'Yummy and Tasty', 'Biryani'),
('Country Pizza', 'p3.jpeg', 5, 'Classical Italian!', 'Pizzas'),
('Grilled Cheese', 'b8.jpeg', 10, 'Grilled and Spicy', 'Burgers'),
('Indian Salad', 's7.jpeg', 3, 'Regular and Boring', 'Salad'),
('Indiana Grill', 'p9.jpeg', 6, 'Topped with Cheese', 'Pizzas'),
('Latino Burger', 'b5.jpeg', 9, 'Chilly and Spicy', 'Burgers'),
('Latino Heat', 'p5.jpeg', 7, 'Blend of Salsa & Corn', 'Pizzas'),
('Manchuria', 'c1.jpeg', 3, 'Yummy Manchuria', 'Chineese'),
('Margherita', 'p4.jpeg', 4, 'First baked in 1899', 'Pizzas'),
('Mexican Burger', 'b10.jpeg', 6, 'South Latino Mexican', 'Burgers'),
('Mexican Salad', 's6.jpeg', 2, 'Mexicanos~~!', 'Salad'),
('Mutton Biryani', 'bir2.jpeg', 5, 'Fine Meat!!', 'Biryani'),
('Noodles', 'c2.jpeg', 4, 'Noodle Doodle', 'Chineese'),
('NY Cheese', 'b11.jpeg', 5, 'Burger with Mushroom', 'Burgers'),
('Regular Burger', 'b9.jpeg', 4, 'tasty', 'Burgers'),
('Spanish Salad', 's4.jpeg', 3, 'Spanish blend!!', 'Salad'),
('Veg Biryani', 'bir3.jpeg', 4, 'Veggie Biryani!', 'Biryani');

-- --------------------------------------------------------

--
-- Table structure for table `Member`
--

CREATE TABLE IF NOT EXISTS `Member` (
  `MCardNo` varchar(20) DEFAULT NULL,
  `MFirstName` varchar(30) DEFAULT NULL,
  `MLastName` varchar(30) DEFAULT NULL,
  `Gender` varchar(6) DEFAULT NULL,
  `MMobile` varchar(10) DEFAULT NULL,
  `MHomeNo` varchar(20) DEFAULT NULL,
  `MSuburb` varchar(20) DEFAULT NULL,
  `MBlock` varchar(10) DEFAULT NULL,
  `MCity` varchar(30) DEFAULT NULL,
  `MState` varchar(30) DEFAULT NULL,
  `MZip` int(11) DEFAULT NULL,
  `MEmail` varchar(30) DEFAULT NULL,
  `EntryDate` date DEFAULT NULL,
  `MUserName` varchar(30) NOT NULL DEFAULT '',
  `MPassword` varchar(30) DEFAULT NULL,
  `MSecurityQuestion` varchar(50) DEFAULT NULL,
  `MSecurityAnswer` varchar(50) DEFAULT NULL,
  `MDOB` date DEFAULT NULL,
  PRIMARY KEY (`MUserName`),
  UNIQUE KEY `MCardNo` (`MCardNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Member`
--

INSERT INTO `Member` (`MCardNo`, `MFirstName`, `MLastName`, `Gender`, `MMobile`, `MHomeNo`, `MSuburb`, `MBlock`, `MCity`, `MState`, `MZip`, `MEmail`, `EntryDate`, `MUserName`, `MPassword`, `MSecurityQuestion`, `MSecurityAnswer`, `MDOB`) VALUES
('9999888877776666', 'Zubaeyr', 'Mohammed', 'Male', '9177042711', '5-15', 'XXXX', 'XXXX', 'XXXX', 'Telangana', 506367, 'wisestofall@gmail.com', '2014-12-31', 'Zubaeyr-iiiTB', 'ODE1NDIxOTQ0OQ==', 'fav actors?', 'Daniel Day Lewis and Robert Downey Jr.', '1996-01-31');

-- --------------------------------------------------------

--
-- Table structure for table `OrderDetails`
--

CREATE TABLE IF NOT EXISTS `OrderDetails` (
  `OrderNo` varchar(30) NOT NULL,
  `MName` varchar(30) NOT NULL,
  `Quantity` int(11) NOT NULL DEFAULT '0',
  `SubTotal` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`OrderNo`,`MName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `OrderDetails`
--

INSERT INTO `OrderDetails` (`OrderNo`, `MName`, `Quantity`, `SubTotal`) VALUES
('LPH00000000010', 'LATINO BURGER', 1, 9),
('LPH1860865214', 'Margherita', 4, 16),
('LPH1860865214', 'Mexican Burger', 5, 30),
('LPH1860865214', 'Mutton Biryani', 3, 15),
('LPH1860865214', 'Noodles', 3, 12),
('LPH1860865214', 'NY Cheese', 3, 15),
('LPH1860865214', 'Regular Burger', 3, 12),
('LPH2159019044', 'Mexican Burger', 1, 6),
('LPH2505899620', 'Grilled Cheese', 1, 10),
('LPH2752833165', 'Barbeque', 6, 36),
('LPH2752833165', 'Country Pizza', 5, 25),
('LPH2752833165', 'Grilled Cheese', 2, 20),
('LPH2752833165', 'Latino Burger', 3, 27),
('LPH2752833165', 'Latino Heat', 4, 28),
('LPH2752833165', 'Manchuria', 5, 15),
('LPH2752833165', 'Margherita', 3, 12),
('LPH2939155770', 'Barbeque', 1, 6),
('LPH3740193649', 'Mexican Burger', 9, 54.87),
('LPH3764775872', 'Latino Burger', 2, 18),
('LPH3764775872', 'Mexican Burger', 2, 12),
('LPH4237781870', 'Mexican Burger', 8, 48),
('LPH425874977', 'Grilled Cheese', 3, 30),
('LPH425874977', 'Latino Burger', 11, 99),
('LPH425874977', 'Mexican Burger', 1, 6),
('LPH425874977', 'New York Cheese', 12, 720),
('LPH425874977', 'Regular Burger', 3, 12),
('LPH4770296469', 'Barbeque', 3, 18),
('LPH4770296469', 'Grilled Cheese', 1, 10),
('LPH5754615913', 'Latino Burger', 1, 9),
('LPH5933211354', 'Grilled Cheese', 2, 20),
('LPH6638552625', 'Latino Burger', 1, 9),
('LPH6638552625', 'Latino Heat', 2, 14),
('LPH6988481222', 'Barbeque', 1, 6),
('LPH7374604676', 'Grilled Cheese', 5, 50),
('LPH7528120116', 'Mexican Burger', 9, 54),
('LPH8185749546', 'Mexican Burger', 8, 48),
('LPH8740526014', 'Barbeque', 2, 12),
('LPH9112142183', 'Barbeque', 6, 36),
('LPH9112142183', 'Chicken Biryani', 4, 20),
('LPH9112142183', 'Country Pizza', 3, 15),
('LPH9112142183', 'Grilled Cheese', 2, 20),
('LPH9112142183', 'Indian Salad', 1, 3),
('LPH9112142183', 'Indiana Grill', 2, 12),
('LPH9112142183', 'Latino Burger', 7, 63),
('LPH9112142183', 'Latino Heat', 8, 56),
('LPH9112142183', 'Manchuria', 3, 9),
('LPH9112142183', 'Margherita', 7, 28),
('LPH9112142183', 'Mexican Burger', 9, 54),
('LPH9112142183', 'Mexican Salad', 1, 2),
('LPH9112142183', 'Mutton Biryani', 1, 5),
('LPH9112142183', 'Noodles', 2, 8),
('LPH9112142183', 'NY Cheese', 6, 30),
('LPH9112142183', 'Regular Burger', 2, 8),
('LPH9112142183', 'Spanish Salad', 6, 18),
('LPH9112142183', 'Veg Biryani', 5, 20);

-- --------------------------------------------------------

--
-- Table structure for table `Orders`
--

CREATE TABLE IF NOT EXISTS `Orders` (
  `OrderNo` varchar(30) NOT NULL,
  `TotalAmount` float NOT NULL DEFAULT '0',
  `ODate` date NOT NULL,
  `OTime` time NOT NULL,
  `ServiceType` varchar(30) NOT NULL,
  `CookStatus` varchar(30) NOT NULL,
  `MemberID` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`OrderNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Orders`
--

INSERT INTO `Orders` (`OrderNo`, `TotalAmount`, `ODate`, `OTime`, `ServiceType`, `CookStatus`, `MemberID`) VALUES
('LPH1860865214', 100, '2014-01-09', '17:02:01', 'EG02', 'finished', ''),
('LPH2752833165', 163, '2015-01-02', '17:13:04', 'Delivery', 'finished', 'Zubaeyr@iiiT-B'),
('LPH2939155770', 6, '2014-01-09', '17:06:13', 'CollectMyself', 'finished', 'Zubaeyr@iiiT-B'),
('LPH4770296469', 28, '2015-01-06', '12:16:13', '21', 'finished', ''),
('LPH5933211354', 20, '2014-01-09', '17:06:50', 'Delivery', 'finished', 'Zubaeyr@iiiT-B'),
('LPH6638552625', 23, '2015-01-02', '17:16:34', 'EG03', 'finished', ''),
('LPH6988481222', 6, '2015-01-15', '00:45:43', 'EG01', 'finished', ''),
('LPH8740526014', 12, '2015-01-06', '12:16:37', 'CollectMyself', 'finished', 'B101559'),
('LPH9112142183', 408.8, '2014-12-31', '23:26:29', 'NG01', 'finished', '');

-- --------------------------------------------------------

--
-- Table structure for table `Rating`
--

CREATE TABLE IF NOT EXISTS `Rating` (
  `RatingValue` int(11) NOT NULL,
  `MName` varchar(50) NOT NULL,
  `MUserName` varchar(50) NOT NULL,
  PRIMARY KEY (`MName`,`MUserName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Rating`
--

INSERT INTO `Rating` (`RatingValue`, `MName`, `MUserName`) VALUES
(3, 'GRILLED CHEESE', 'ZUBAIR123'),
(2, 'LATINO BURGER', 'ZUBAIR123'),
(3, 'MEXICAN BURGER', 'ZUBAIR123'),
(3, 'NEW YORK CHEESE', 'ZUBAIR123'),
(3, 'REGULAR BURGER', 'ZUBAIR123');

-- --------------------------------------------------------

--
-- Table structure for table `Reservation`
--

CREATE TABLE IF NOT EXISTS `Reservation` (
  `ResID` varchar(30) NOT NULL,
  `ResTableNo` varchar(20) NOT NULL,
  `ResName` text NOT NULL,
  `ResContactNo` text,
  `ResDate` date NOT NULL,
  `ResSTime` time NOT NULL,
  `ResETime` time NOT NULL,
  `MemberID` text,
  PRIMARY KEY (`ResID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Reservation`
--

INSERT INTO `Reservation` (`ResID`, `ResTableNo`, `ResName`, `ResContactNo`, `ResDate`, `ResSTime`, `ResETime`, `MemberID`) VALUES
('532743366', 'EG01', 'Zubair', '9177042711', '2015-01-02', '17:00:00', '18:00:00', 'Zubaeyr@iiiT-B'),
('641981391', 'NG01', 'Zubair', '9177042711', '2015-01-10', '00:00:00', '01:00:00', 'Zubaeyr@iiiT-B');

-- --------------------------------------------------------

--
-- Table structure for table `StaffDetails`
--

CREATE TABLE IF NOT EXISTS `StaffDetails` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `fullname` text NOT NULL,
  `position` text NOT NULL,
  `email` text,
  `phone` text,
  `address` text,
  `status` text,
  `SImage` text,
  `salary` text,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `StaffDetails`
--

INSERT INTO `StaffDetails` (`username`, `password`, `fullname`, `position`, `email`, `phone`, `address`, `status`, `SImage`, `salary`) VALUES
('Bilal', 'bilal', 'Bilal Mohammed', 'Staff', 'bilal@gmail.com', '9989254748', 'Warangal,Telangana\nPin : 506367	', 'Active', 'vlcsnap-2011-12-04-15h17m57s63.png', '3000'),
('Sumair', 'sumair', 'Sumair Mohammed', 'Chef', 'sumair@gmail.com', '9989254747', 'warangal, India', 'Active', 'vlcsnap-2014-04-30-23h19m54s57.png', '3000'),
('Zubaeyr@iiiT-B', '8154219449', 'Zubairuddin Muhammed', 'Manager', 'wisestofall@gmail.com', '9177042711', 'Zubairuddin Muhammed,\r\nBH-II, RGUKT IIIT-Basar,\r\nBasar, Adilabad. ', 'Active', 'vlcsnap-2013-03-08-08h16m54s157.png', '5000');

-- --------------------------------------------------------

--
-- Table structure for table `Tables`
--

CREATE TABLE IF NOT EXISTS `Tables` (
  `TableNo` varchar(20) NOT NULL,
  `Size` int(11) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`TableNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Tables`
--

INSERT INTO `Tables` (`TableNo`, `Size`, `Status`) VALUES
('EG01', 4, 'unoccupied'),
('EG02', 4, 'unoccupied'),
('EG03', 4, 'unoccupied'),
('EG04', 4, 'UnOccupied'),
('NG01', 4, 'unoccupied'),
('NG02', 4, 'UnOccupied'),
('NG03', 4, 'UnOccupied'),
('NG04', 4, 'UnOccupied'),
('NS02', 4, 'UnOccupied'),
('SG01', 4, 'UnOccupied'),
('SG02', 4, 'UnOccupied'),
('SG03', 4, 'UnOccupied'),
('SG04', 4, 'UnOccupied'),
('WG01', 4, 'UnOccupied'),
('WG02', 4, 'UnOccupied'),
('WG03', 4, 'UnOccupied'),
('WG04', 4, 'UnOccupied');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
