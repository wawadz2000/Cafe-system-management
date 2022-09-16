-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 16, 2022 at 03:40 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coffeedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `billtbl`
--

CREATE TABLE `billtbl` (
  `BillId` int(11) NOT NULL,
  `Seller` varchar(255) NOT NULL,
  `BillDate` varchar(255) NOT NULL,
  `Amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `billtbl`
--

INSERT INTO `billtbl` (`BillId`, `Seller`, `BillDate`, `Amount`) VALUES
(1, 'ggg', '2022-09-09T17:23:13.035655400', 20),
(2, 'ahed', '2022-09-09T17:26:40.643163200', 200),
(3, 'user 1', '2022-09-09T17:48:20.917529500', 600),
(4, 'user 1', '022-09-09', 800),
(5, 'hgj', '2022-09-11T21:00:01.510385200', 13200);

-- --------------------------------------------------------

--
-- Table structure for table `producttbl`
--

CREATE TABLE `producttbl` (
  `ProdID` int(11) NOT NULL,
  `ProdName` varchar(255) NOT NULL,
  `ProdCat` varchar(255) NOT NULL,
  `ProdPrice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `producttbl`
--

INSERT INTO `producttbl` (`ProdID`, `ProdName`, `ProdCat`, `ProdPrice`) VALUES
(4, 'croissant', 'Item 1', 20),
(6, 'croissantss', 'Item 1', 20),
(14, 'Pepsi', 'Item 2', 250),
(17, 'shwenps', 'Item 1', 580),
(18, 'mawi', 'Item 4', 51101),
(19, 'mawik', 'Item 4', 51101),
(20, 'mawiki', 'Item 4', 51101),
(21, 'ahmed', 'Item 2', 200);

-- --------------------------------------------------------

--
-- Table structure for table `sellertbl`
--

CREATE TABLE `sellertbl` (
  `SellerID` int(11) NOT NULL,
  `SellerUsername` varchar(255) NOT NULL,
  `SellerAge` int(11) NOT NULL,
  `Sellerpassword` varchar(255) NOT NULL,
  `Sellerphone` int(20) NOT NULL,
  `SellerGender` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sellertbl`
--

INSERT INTO `sellertbl` (`SellerID`, `SellerUsername`, `SellerAge`, `Sellerpassword`, `Sellerphone`, `SellerGender`) VALUES
(123, 'hgj', 45, '125', 125, 'Item 1'),
(156, 'wawadz2000', 15, '542163242', 159874236, 'Item 1'),
(1253, 'hgj', 12, '125', 125, 'Item 1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billtbl`
--
ALTER TABLE `billtbl`
  ADD PRIMARY KEY (`BillId`);

--
-- Indexes for table `producttbl`
--
ALTER TABLE `producttbl`
  ADD PRIMARY KEY (`ProdID`);

--
-- Indexes for table `sellertbl`
--
ALTER TABLE `sellertbl`
  ADD PRIMARY KEY (`SellerID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `billtbl`
--
ALTER TABLE `billtbl`
  MODIFY `BillId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `producttbl`
--
ALTER TABLE `producttbl`
  MODIFY `ProdID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `sellertbl`
--
ALTER TABLE `sellertbl`
  MODIFY `SellerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1254;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
