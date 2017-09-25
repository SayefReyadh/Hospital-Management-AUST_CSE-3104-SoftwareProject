-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 25, 2017 at 09:23 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `appoint_id` int(11) NOT NULL,
  `doctor_id` int(11) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `appoint_time` time NOT NULL,
  `appoint_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`appoint_id`, `doctor_id`, `patient_id`, `appoint_time`, `appoint_date`) VALUES
(134, 2467, 2, '02:35:10', '2017-04-27');

-- --------------------------------------------------------

--
-- Table structure for table `ask`
--

CREATE TABLE `ask` (
  `appoint_id` int(11) NOT NULL,
  `ward_id` int(11) NOT NULL,
  `test_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ask`
--

INSERT INTO `ask` (`appoint_id`, `ward_id`, `test_id`) VALUES
(134, 4, 2);

-- --------------------------------------------------------

--
-- Table structure for table `assign`
--

CREATE TABLE `assign` (
  `patient_id` int(11) NOT NULL,
  `ward_id` int(11) NOT NULL,
  `entry_date` date NOT NULL,
  `entry_time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assign`
--

INSERT INTO `assign` (`patient_id`, `ward_id`, `entry_date`, `entry_time`) VALUES
(2, 1, '2016-09-27', '05:55:50');

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `bill_id` int(11) NOT NULL,
  `bill_date` date NOT NULL,
  `bill_time` time NOT NULL,
  `bill_amount` int(11) NOT NULL,
  `bill_info` text NOT NULL,
  `patient_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `doctor_id` int(11) NOT NULL,
  `designation` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`doctor_id`, `designation`) VALUES
(2345, 'cardiologist'),
(2467, 'eye specialist');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL,
  `employee_name` varchar(70) NOT NULL,
  `employee_gender` varchar(10) NOT NULL,
  `employee_contact_no` varchar(15) NOT NULL,
  `employee_address` varchar(150) NOT NULL,
  `salary` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employee_id`, `employee_name`, `employee_gender`, `employee_contact_no`, `employee_address`, `salary`) VALUES
(12, 'Sayef Reyadh', 'male', '01723738', 'Rayerbag, Jatrabari', 12000),
(28, 'Sudipta Rumu', 'Female', '016567', 'South Bashabo , Dhaka', 7000),
(2345, 'Dr.Asif Imtiaz', 'Female', '01523456', 'Shegun Bagicha , Dhaka', 100000),
(2467, 'Dr.Sanjana Khan', 'Female', '0151515515', 'Poribag , Dhaka', 120000),
(10234, 'Farzana', 'Female', '019666223', '215 East Rampura , Dhaka', 5000),
(21001, 'Salvi', 'male', '0183245', 'Farmgate , Dhaka', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `laboratory`
--

CREATE TABLE `laboratory` (
  `patient_id` int(11) NOT NULL,
  `doctor_id` int(11) NOT NULL,
  `report_sub` varchar(50) NOT NULL,
  `report_details` text NOT NULL,
  `report_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laboratory`
--

INSERT INTO `laboratory` (`patient_id`, `doctor_id`, `report_sub`, `report_details`, `report_id`) VALUES
(2, 2345, 'General', 'All is Well!!', 9);

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

CREATE TABLE `nurse` (
  `nurse_id` int(11) NOT NULL,
  `working_time` time NOT NULL,
  `ending_time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nurse`
--

INSERT INTO `nurse` (`nurse_id`, `working_time`, `ending_time`) VALUES
(10234, '04:00:00', '10:30:00'),
(21001, '10:31:00', '06:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patient_id` int(11) NOT NULL,
  `patient_name` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `patient_age` int(11) NOT NULL,
  `patient_address` varchar(100) NOT NULL,
  `contact_no` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patient_id`, `patient_name`, `gender`, `patient_age`, `patient_address`, `contact_no`) VALUES
(2, 'Ms Brown', 'Female', 21, '141 & 142 Love Road, Dhaka 1208', '01999999'),
(3, 'sayef', 'Male', 19, 'Dhaka', '01928'),
(4, 'sayef', 'Male', 10, 'Ctg\n', '0199'),
(5, 'Farzana Eva', 'Female', 21, '215/3 East Rampura , Dhaka - 1219', '01966227939');

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `recep_id` int(11) NOT NULL,
  `recep_starting_time` time NOT NULL,
  `recep_ending_time` time NOT NULL,
  `recep_type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`recep_id`, `recep_starting_time`, `recep_ending_time`, `recep_type`) VALUES
(12, '09:00:00', '05:00:00', 'full time'),
(28, '05:30:00', '09:00:00', 'part time');

-- --------------------------------------------------------

--
-- Table structure for table `ward`
--

CREATE TABLE `ward` (
  `ward_id` int(11) NOT NULL,
  `ward_incharge_id` int(11) NOT NULL,
  `ward_capacity` int(11) NOT NULL,
  `ward_type` varchar(30) NOT NULL,
  `ward_cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ward`
--

INSERT INTO `ward` (`ward_id`, `ward_incharge_id`, `ward_capacity`, `ward_type`, `ward_cost`) VALUES
(1, 10234, 20, 'Cardiology', 500),
(4, 21001, 15, 'general', 30);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`appoint_id`,`doctor_id`,`patient_id`),
  ADD KEY `doctor_id` (`doctor_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indexes for table `ask`
--
ALTER TABLE `ask`
  ADD PRIMARY KEY (`appoint_id`,`ward_id`,`test_id`),
  ADD KEY `ward_id` (`ward_id`);

--
-- Indexes for table `assign`
--
ALTER TABLE `assign`
  ADD PRIMARY KEY (`patient_id`,`ward_id`),
  ADD KEY `ward_id` (`ward_id`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`bill_id`,`patient_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`doctor_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employee_id`);

--
-- Indexes for table `laboratory`
--
ALTER TABLE `laboratory`
  ADD PRIMARY KEY (`patient_id`,`doctor_id`,`report_id`),
  ADD KEY `report_id` (`report_id`),
  ADD KEY `doctor_id` (`doctor_id`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`nurse_id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patient_id`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`recep_id`);

--
-- Indexes for table `ward`
--
ALTER TABLE `ward`
  ADD PRIMARY KEY (`ward_id`,`ward_incharge_id`),
  ADD KEY `ward-incharge_id` (`ward_incharge_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `laboratory`
--
ALTER TABLE `laboratory`
  MODIFY `report_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `patient_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ask`
--
ALTER TABLE `ask`
  ADD CONSTRAINT `ask_ibfk_1` FOREIGN KEY (`appoint_id`) REFERENCES `appointment` (`appoint_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ask_ibfk_2` FOREIGN KEY (`ward_id`) REFERENCES `ward` (`ward_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `assign`
--
ALTER TABLE `assign`
  ADD CONSTRAINT `assign_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `assign_ibfk_2` FOREIGN KEY (`ward_id`) REFERENCES `ward` (`ward_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`doctor_id`) REFERENCES `employee` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `laboratory`
--
ALTER TABLE `laboratory`
  ADD CONSTRAINT `laboratory_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `laboratory_ibfk_2` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `nurse`
--
ALTER TABLE `nurse`
  ADD CONSTRAINT `nurse_ibfk_1` FOREIGN KEY (`nurse_id`) REFERENCES `employee` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD CONSTRAINT `receptionist_ibfk_1` FOREIGN KEY (`recep_id`) REFERENCES `employee` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ward`
--
ALTER TABLE `ward`
  ADD CONSTRAINT `ward_ibfk_1` FOREIGN KEY (`ward_incharge_id`) REFERENCES `nurse` (`nurse_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
