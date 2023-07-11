-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 11, 2023 at 01:20 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `my computers`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `usersid` bigint(20) NOT NULL,
  `productsid` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `users_id` bigint(20) NOT NULL,
  `products_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` bigint(20) NOT NULL,
  `type` varchar(255) NOT NULL,
  `specs` varchar(255) NOT NULL,
  `cpu` varchar(255) NOT NULL,
  `ram` varchar(255) NOT NULL,
  `gpu` varchar(255) NOT NULL,
  `disk` varchar(255) NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `image` varchar(255) NOT NULL,
  `image2` varchar(255) NOT NULL,
  `image3` varchar(255) NOT NULL,
  `quantity` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `type`, `specs`, `cpu`, `ram`, `gpu`, `disk`, `price`, `image`, `image2`, `image3`, `quantity`) VALUES
(6, 'Asus', 'Asus TUF F17 FX706HE-211.TM17 - Core i5-11260H, 8GB RAM, 512GB NVMe, RTX 3050Ti 4GB, 17.3-inch FHD 144Hz', 'Intel Core i5-11260H, 6 cores 12 threads, up to 4.40GHz, 12MB cache.', '8GB DDR4-3200MHz (supports up to 32GB).', 'Nvidia GeForce RTX 3050Ti 4GB GDDR6', '512GB NVMe SSD.', 1099.00, 'images/Asus.1099.00.1.jpg', 'images/Asus.1099.00.2.jpg', 'images/Asus.1099.00.3.jpg', 7990),
(7, 'Lenovo', 'Lenovo IdeaPad Gaming 3 82K200S3ED - AMD Ryzen 7 5800H, 8GB RAM, 512GB NVMe, RTX 3050Ti 4GB, 15.6-inch FHD 120Hz', 'AMD Ryzen 7 5800H, 8 cores 16 threads, up to 4.4GHz, 20MB cache.', '(x1) 8GB DDR4-3200MHz + additional SODIMM slot (max 16GB).', 'NVIDIA GeForce RTX 3050 Ti 4GB GDDR6, 75W TGP.', '512GB NVMe SSD + additional slot supporting up to 1TB.', 1086.00, 'images/Lenovo.1086.00.1.jpg', 'images/Lenovo.1086.00.2.jpg', 'images/Lenovo.1086.00.3.jpg', 995),
(8, 'Asus ', 'Asus ROG Strix G15 G513Q-HN050T - AMD Ryzen 7 5800H, 16GB RAM, 1TB NVMe, RTX 3070 8GB 15.6-inch FHD 144Hz', 'AMD Ryzen 7 5800H, 8cores 16 threads, up to 4.4 GHz, 20MB cache.', '(x2) 8GB DDR4-3200MHz (16GB total, 2 slots supporting up to 32GB).', 'Nvidia GeForce RTX 3070 8GB GDDR6.', '1TB NVMe SSD.', 1699.00, 'images/Asus.1699.00.1.jpg', 'images/Asus.1699.00.2.jpg', 'images/Asus.1699.00.3.jpg', 965),
(12, 'Dell', 'Dell Vostro 14 3400 YX51W-CI5 - Core i5-1135G7, 4GB RAM, 1TB HDD, 14-inch FHD', 'Intel Core i5-1135G7 (8MB Cache, up to 4.2 GHz).', '4GB DDR4 (2 slots available).', 'Intel Iris Xe Graphics.', '1TB HDD (+ NVME Support).', 603.33, 'images/Dell.603.33.1.jpg', 'images/Dell.603.33.2.jpg', 'images/Dell.603.33.3.jpg', 432),
(15, 'MSI', 'MSIMSI GF65 Thin 10UE-071 - Core i7-10750H, 16GB RAM, 512GB NVMe, RTX 3060, 15.6-inch FHD 144Hz', 'Intel Core i7-10750H, 6 cores 12 threads, up to 4.0GHz, 12MB cache.', '(x2) 8GB DDR4-3200MHz (16GB total).', 'Nvidia GeForce RTX 3060.', '512GB NVMe SSD.', 1359.00, 'images/MSI.1359.00.1.jpg', 'images/MSI.1359.00.2.jpg', 'images/MSI.1359.00.3.jpg', 867),
(3438, 'acer', 'Acer Aspire 3 15.6-inch FHD Core i5 Laptop A315-57G-57DB', 'Intel Core i5-1035G1, 4 cores, 8 threads, 3.60 GHz, 6MB cache.', '8GB DDR4.', 'Nvidia GeForce MX330 2GB GDDR5.', '1TB HDD.', 592.81, 'images/acer.592.81.1.jpg', 'images/acer.592.81.2.jpg', 'images/acer.592.81.3.jpg', 1000),
(3439, 'hp', 'HP Pavilion 15-DK2056NE Core i5 15.6-inch FHD GTX 1650 Gaming Laptop', 'Intel Core i5-11300H, 4 cores 8 threads, up to 4.4 GHz, 8 MB cache.', '8GB DDR4-3200MHz (2 x 4GB).', 'Nvidia GeForce GTX 1650 4GB.', '256GB NVMe SSD + 1TB HDD 7200RPM.', 773.67, 'images/hp.773.67.1.jpg', 'images/hp.773.67.2.jpg', 'images/hp.773.67.3.jpg', 2000),
(3440, 'hp', 'HP 15T-DW300 15.6-inch HD Core i7 Laptop 1A3Y4AV', 'Intel Core™ i7-1165G7, 4 cores 8 threads, up to 4.7GHz, 12MB cache.', '8 GB DDR4, 2666 SDRAM (2x4GB)', 'Integrated Intel Iris Xe Graphics.', '256 GB PCIe NVMe M.2 SSD.', 750.00, 'images/hp.750.00.1.jpg', 'images/hp.750.00.2.jpg', 'images/hp.750.00.3.jpg', 2000),
(3441, 'Asus', 'Asus VivoBook 15.6-inch FHD Touch Screen Core i3 Laptop R564JA-UH31T', 'Intel Core i3-1005G1 up to 3.4Ghz.', '4GB', 'Intel UHD Graphics.', '128GB SSD.', 450.00, 'images/Asus.450.00.1.jpg', 'images/Asus.450.00.2.jpg', 'images/Asus.450.00.3.jpg', 2000),
(3443, 'Asus', 'Asus Zenbook Flip X360 Convertible Laptop UX363EA-HP681W', 'Intel Core i5-1135G7, 4 cores 8 threads, up to 4.2GHz, 8MB cache.', '8GB LPDDR4X (soldered, non-upgradeable).', 'Intel Iris Xe Graphics.', '512GB NVMe SSD with 32GB Intel Optane Memory.', 960.00, 'images/Asus.960.00.1.jpg', 'images/Asus.960.00.2.jpg', 'images/Asus.960.00.3.jpg', 1500),
(3445, 'Lenovo', 'Lenovo IdeaPad Gaming 3 AMD Ryzen7 5800H RTX 3060 15.6-inch FHD - 82K200S5ED', 'AMD Ryzen 7 5800H, 8 cores, 16 Threads, up to 4.4GHz, 20MB cache.', '(2x) 8GB SO-DIMM DDR4-3200 (16GB total, supports up to 32GB).', 'NVIDIA GeForce RTX 3060 6GB GDDR6.', '512GB SSD M.2 2280 + M.2 slot.', 1398.00, 'images/Lenovo.1398.00.1.jpg', 'images/Lenovo.1398.00.2.jpg', 'images/Lenovo.1398.00.3.jpg', 1950),
(3446, 'Lenovo', 'Lenovo IdeaPad Gaming 3 15.6-inch FHD 120Hz RTX 3050 Gaming Laptop 82K200S2ED', 'AMD Ryzen 7 5800H, 8 cores 16 threads, up to 4.4GHz, 20MB cache.', '8GB DDR4-3200MHz + additional SODIMM slot (16GB max).', 'Nvidia GeForce RTX 3050 4GB GDDR6.', '512GB NVMe SSD + additional M.2 Slot (type 2242).', 939.45, 'images/Lenovo.939.45.1.jpg', 'images/Lenovo.939.45.2.jpg', 'images/Lenovo.939.45.3.jpg', 10);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `admin` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `email`, `password`, `admin`) VALUES
(52, 'admin', 'lll@m.com', '12345678', 1),
(53, 'user', 'lmoll@gmail.com', '87654321', 0);

-- --------------------------------------------------------

--
-- Table structure for table `wishlist`
--

CREATE TABLE `wishlist` (
  `users_id` bigint(20) NOT NULL,
  `products_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD KEY `productsid` (`productsid`),
  ADD KEY `usersid` (`usersid`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD KEY `products_id` (`products_id`),
  ADD KEY `users_id` (`users_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD KEY `products` (`products_id`),
  ADD KEY `users` (`users_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3460;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `productsid` FOREIGN KEY (`productsid`) REFERENCES `products` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usersid` FOREIGN KEY (`usersid`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `products_id` FOREIGN KEY (`products_id`) REFERENCES `products` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `users_id` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD CONSTRAINT `products` FOREIGN KEY (`products_id`) REFERENCES `products` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `users` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
