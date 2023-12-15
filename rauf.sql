-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Des 2023 pada 02.12
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rauf`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `acc`
--

CREATE TABLE `acc` (
  `id` int(11) NOT NULL,
  `no_beli` varchar(30) NOT NULL,
  `kodea` varchar(20) NOT NULL,
  `j_beli` int(30) NOT NULL,
  `tgl_beli` date NOT NULL,
  `kodesup` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `acc`
--

INSERT INTO `acc` (`id`, `no_beli`, `kodea`, `j_beli`, `tgl_beli`, `kodesup`) VALUES
(1, 'BACC1', 'MB03', 5, '2023-12-01', 'AR-56'),
(2, 'BACC2', 'MB01', 3, '2023-12-05', 'KO-23'),
(3, 'BACC3', 'MB04', 3, '2023-12-05', 'RF-13'),
(4, 'BACC7', 'MB05', 4, '2023-12-08', 'IT-50'),
(5, 'BACC5', 'MB06', 4, '2023-12-06', 'OP-52'),
(6, 'BACC6', 'MB07', 6, '2023-12-07', 'VR-76'),
(7, 'BACC4', 'MB01', 8, '2023-12-06', 'UI-54'),
(14, 'BACC8', 'MB08', 12, '2023-12-10', 'BR-90'),
(15, 'BACC9', 'MB10', 15, '2023-12-10', 'KO-23'),
(16, 'BACC10', 'MB09', 7, '2023-12-07', 'OP-52');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `kode_barang` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `harga_beli` int(11) NOT NULL,
  `harga_jual` int(11) NOT NULL,
  `stok` int(11) NOT NULL,
  `saham` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kode_barang`, `nama`, `harga_beli`, `harga_jual`, `stok`, `saham`) VALUES
('MB01', 'Mouse', 140000, 200000, 27, 3780000),
('MB02', 'Jam', 20000, 25000, 11, 220000),
('MB03', 'Headset', 50000, 100000, 44, 2200000),
('MB04', 'Xbox 360 Controller', 80000, 100000, 60, 4800000),
('MB05', 'Razer Cobra', 500000, 600000, 20, 10000000),
('MB06', 'Vortex VX7', 400000, 500000, 15, 6000000),
('MB07', 'Logitech MP01', 125000, 200000, 20, 2500000),
('MB08', 'Logitech Cam V2', 500000, 750000, 69, 34500000),
('MB09', 'FinalAudio TX2', 80000, 100000, 67, 5360000),
('MB10', 'Vention HDMI Cable', 25000, 50000, 100, 2500000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `jualacc`
--

CREATE TABLE `jualacc` (
  `id` int(11) NOT NULL,
  `kodea` varchar(30) NOT NULL,
  `qty` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `tgl_jual` date NOT NULL,
  `profit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `jualacc`
--

INSERT INTO `jualacc` (`id`, `kodea`, `qty`, `total`, `tgl_jual`, `profit`) VALUES
(1, 'MB02', 3, 75000, '2023-12-07', 15000),
(2, 'MB02', 6, 150000, '2023-12-07', 30000),
(3, 'MB02', 7, 175000, '2023-12-05', 35000),
(4, 'MB02', 3, 75000, '2023-12-06', 15000),
(5, 'MB02', 2, 50000, '2023-12-04', 10000),
(6, 'MB10', 15, 750000, '2023-12-11', 375000),
(7, 'MB09', 14, 1400000, '2023-12-10', 280000),
(8, 'MB07', 4, 800000, '2023-12-08', 300000),
(9, 'MB01', 23, 4600000, '2023-12-06', 1380000),
(10, 'MB09', 13, 1300000, '2023-12-05', 260000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `namadepan` varchar(100) NOT NULL,
  `namabelakang` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `namadepan`, `namabelakang`) VALUES
(1, 'admin', 'password', '', ''),
(2, 'eunzoo', 'wahai', 'Abdur', 'Rauf');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `no_identitas` varchar(20) NOT NULL,
  `j_identitas` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jk` varchar(10) NOT NULL,
  `nohp` varchar(13) NOT NULL,
  `tgl_plg` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`no_identitas`, `j_identitas`, `nama`, `alamat`, `jk`, `nohp`, `tgl_plg`) VALUES
('1123447', 'SIM', 'Danny', 'Jl. Mawar', 'Laki-laki', '089732416574', '2023-12-01'),
('12345678', 'KTP', 'Abdur Rauf', 'Jl. Buana', 'Laki-laki', '085673218756', '2023-12-02'),
('123978', 'KTP', 'Dudi', 'Jl. Merak', 'Laki-laki', '081294837221', '2023-12-05'),
('132323', 'KTP', 'Fadhil', 'Jl. Alucard', 'Laki-laki', '085632415632', '2023-12-03'),
('235421', 'SIM', 'Fauzie', 'Jl. Rakyat', 'Laki-laki', '082115227844', '2023-12-05'),
('442317', 'SIM', 'Furina', 'Jl. Ludex', 'Perempuan', '081354627452', '2023-12-06'),
('653212', 'KTP', 'Jean', 'Jl. Monstadt', 'Perempuan', '081365438246', '2023-12-09'),
('771332', 'SIM', 'Zhongli', 'Jl. Liyue', 'Laki-laki', '089933225511', '2023-12-08'),
('987652', 'KTP', 'Faren', 'Jl. Villa Dago', 'Laki-laki', '089723645275', '2023-12-04'),
('992456', 'KTP', 'Jean', 'Jl. Monstadt', 'Perempuan', '081365438246', '2023-12-09'),
('998717', 'KTP', 'Ayaka', 'Jl. Inazuma', 'Perempuan', '088712134452', '2023-12-07');

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `kode_supplier` varchar(20) NOT NULL,
  `namasup` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `notelp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `supplier`
--

INSERT INTO `supplier` (`kode_supplier`, `namasup`, `alamat`, `notelp`) VALUES
('AR-56', 'Air Reality', 'Jl. Wedang 4', '021775223'),
('BR-90', 'Bremen Rails', 'Jl. Fansite 10', '021555223'),
('IT-50', 'InterTech', 'Jl. Aria 10', '021322112'),
('IU-10', 'InterUnion', 'Jl. Galaxy 5', '021166722'),
('KO-23', 'Korean Outline', 'Jl. Gangnam 70', '071223632'),
('KR-24', 'Korean Rails', 'Jl. Druid 80', '081345224'),
('OP-52', 'Orland Pit Tech', 'Jl. Nippon 19', '021187298'),
('RF-13', 'Raw Force', 'Jl. Sultan 3', '0211455201'),
('UI-54', 'Urinoguri Internal', 'Jl. Fought 32', '021887554'),
('VR-76', 'Virtual Resignature', 'Jl. Melati 32', '087443145');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `acc`
--
ALTER TABLE `acc`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indeks untuk tabel `jualacc`
--
ALTER TABLE `jualacc`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`no_identitas`);

--
-- Indeks untuk tabel `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`kode_supplier`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `acc`
--
ALTER TABLE `acc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT untuk tabel `jualacc`
--
ALTER TABLE `jualacc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
