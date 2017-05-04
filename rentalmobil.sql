-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 01 Mei 2017 pada 16.05
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalmobil`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan`
--

CREATE TABLE `karyawan` (
  `kodepegawai` varchar(20) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `nomoridentitasktp` varchar(20) NOT NULL,
  `namakaryawan` varchar(255) NOT NULL,
  `alamatkaryawan` varchar(255) NOT NULL,
  `notelpkaryawan` varchar(20) NOT NULL,
  `nomoridentitassim` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `karyawan`
--

INSERT INTO `karyawan` (`kodepegawai`, `jabatan`, `nomoridentitasktp`, `namakaryawan`, `alamatkaryawan`, `notelpkaryawan`, `nomoridentitassim`) VALUES
('ADM01', 'Admin', '000000000001', 'Asep', 'Jalan Batu No 8', '08123432789', '100000000001'),
('ADM02', 'Admin', '000000000002', 'Asup', 'Jalan Batu No 9', '08123782135', '100000000002'),
('ADM03', 'Admin', '000000000003', 'Asap', 'Jalan Batu No 10', '0812912381', '100000000003'),
('ADM04', 'Admin', '000000000004', 'Asip', 'Jalan Batu No 11', '0812398232', '100000000004'),
('ADM05', 'Admin', '000000000005', 'Beo', 'Jalan Batu No 12', '0812634961', '100000000005'),
('PGW01', 'Pegawai', '000000000006', 'Bea', 'Jalan Batu No 13', '0812312384', '100000000006'),
('PGW02', 'Pegawai', '000000000007', 'Bei', 'Jalan Batu No 14', '0812349302', '100000000007'),
('PGW03', 'Pegawai', '000000000008', 'Beu', 'Jalan Batu No 15', '0812348293', '100000000008'),
('PGW04', 'Pegawai', '000000000009', 'Cai', 'Jalan Batu No 16', '0817839421', '100000000009'),
('PGW05', 'Pegawai', '000000000010', 'Cau', 'Jalan Batu No 17', '0813212433', '100000000010');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kelolaresiko`
--

CREATE TABLE `kelolaresiko` (
  `kodeasuransi` int(5) NOT NULL,
  `namaasuransi` varchar(255) NOT NULL,
  `tanggalkecelakaan` date NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  `nomoridentitas` varchar(20) NOT NULL,
  `kodemobil` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kelolaresiko`
--

INSERT INTO `kelolaresiko` (`kodeasuransi`, `namaasuransi`, `tanggalkecelakaan`, `keterangan`, `nomoridentitas`, `kodemobil`) VALUES
(1, 'AAA', '2017-04-14', 'Kecelakaan', '0000000000000011', 'MB01'),
(2, 'BBB', '2017-04-28', 'Dent', '1000000000000011', 'MB08'),
(3, 'BBB', '2017-04-13', 'sdsfsf', '0000000000000013', 'MB03'),
(9, 'BBB', '2017-04-13', 'asdsa', '0000000000000012', 'MB02'),
(11, 'BBB', '2017-04-06', 'sdaf', '0000000000000014', 'MB04');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE `mobil` (
  `kodemobil` varchar(20) NOT NULL,
  `platnomor` varchar(9) NOT NULL,
  `tipemobil` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mobil`
--

INSERT INTO `mobil` (`kodemobil`, `platnomor`, `tipemobil`) VALUES
('MB01', 'D 234 JF', 'MPV'),
('MB02', 'D 999 JK', 'MPV'),
('MB03', 'D 645 GR', 'SUV'),
('MB04', 'D 555 XAS', 'MPV'),
('MB05', 'D 212 SDF', 'CCR'),
('MB06', 'D 3423 DS', 'MPV'),
('MB07', 'D 2314 JS', 'CCR'),
('MB08', 'D 2324 JW', 'MPV'),
('MB09', 'D 2374 JH', 'SUV'),
('MB10', 'D 2345 DF', 'CCR');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjam`
--

CREATE TABLE `peminjam` (
  `nomoridentitas` varchar(20) NOT NULL,
  `jenisidentitas` varchar(3) NOT NULL,
  `namalengkap` varchar(255) NOT NULL,
  `alamatpeminjam` varchar(255) NOT NULL,
  `nomorteleponpeminjam` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `peminjam`
--

INSERT INTO `peminjam` (`nomoridentitas`, `jenisidentitas`, `namalengkap`, `alamatpeminjam`, `nomorteleponpeminjam`) VALUES
('0000000000000011', 'KTP', 'Bai Nemisik', 'Jalan Empang no 43', '08236821731'),
('0000000000000012', 'KTP', 'Bou Christian', 'Jalan Empang no 42', '0823746211'),
('0000000000000013', 'KTP', 'Boe Kristian', 'Jalan Empang no 75', '0897462533'),
('0000000000000014', 'KTP', 'Boek John', 'Jalan Empang no 53', '0892361837'),
('0000000000000015', 'KTP', 'Boas Khristian', 'Jalan Empang no 94', '0892361836'),
('1000000000000011', 'SIM', 'Acar Kusnandar', 'Jalan Sawah no 9', '082318374481'),
('1000000000000012', 'SIM', 'Acir Kajaras', 'Jalan Sawah no 10', '082318312888'),
('1000000000000013', 'SIM', 'Acur Kucurin', 'Jalan Sawah no 11', '081238689121'),
('1000000000000014', 'SIM', 'Acer Bakasih', 'Jalan Sawah no 12', '081232894712'),
('1000000000000015', 'SIM', 'Boa Jakasare', 'Jalan Sawah no 13', '08239127616');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjamdanpengembalian`
--

CREATE TABLE `peminjamdanpengembalian` (
  `kodepeminjaman` int(5) NOT NULL,
  `tanggalpeminjaman` date NOT NULL,
  `tanggalpengembalian` date NOT NULL,
  `kodemobil` varchar(20) NOT NULL,
  `nomoridentitas` varchar(20) NOT NULL,
  `kodepegawai` varchar(20) DEFAULT NULL,
  `status` varchar(255) NOT NULL,
  `lamaterlambat` varchar(3) DEFAULT NULL,
  `dendaterlambat` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `peminjamdanpengembalian`
--

INSERT INTO `peminjamdanpengembalian` (`kodepeminjaman`, `tanggalpeminjaman`, `tanggalpengembalian`, `kodemobil`, `nomoridentitas`, `kodepegawai`, `status`, `lamaterlambat`, `dendaterlambat`) VALUES
(1, '2017-05-10', '2017-05-17', 'MB01', '0000000000000011', NULL, 'Telah Kembali', NULL, '1.500.000'),
(3, '2017-05-20', '2017-05-26', 'MB03', '0000000000000013', 'ADM02', 'Dipinjam', NULL, NULL),
(5, '2017-05-01', '2017-05-03', 'MB02', '0000000000000015', 'ADM01', 'Dipinjam', NULL, NULL),
(9, '2017-05-12', '2017-05-20', 'MB06', '0000000000000014', 'ADM04', 'Dipinjam', NULL, NULL),
(11, '2017-05-01', '2017-05-02', 'MB10', '1000000000000011', 'PGW05', 'Dipinjam', NULL, NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `penggajian`
--

CREATE TABLE `penggajian` (
  `kodepenggajian` int(5) NOT NULL,
  `kodepegawai` varchar(20) NOT NULL,
  `totalgaji` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penggajian`
--

INSERT INTO `penggajian` (`kodepenggajian`, `kodepegawai`, `totalgaji`) VALUES
(1, 'ADM01', '3500123.0'),
(3, 'ADM04', '3487687.0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`kodepegawai`);

--
-- Indexes for table `kelolaresiko`
--
ALTER TABLE `kelolaresiko`
  ADD PRIMARY KEY (`kodeasuransi`),
  ADD UNIQUE KEY `KodeMobil` (`kodemobil`),
  ADD UNIQUE KEY `KodePeminjam` (`nomoridentitas`);

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`kodemobil`);

--
-- Indexes for table `peminjam`
--
ALTER TABLE `peminjam`
  ADD PRIMARY KEY (`nomoridentitas`);

--
-- Indexes for table `peminjamdanpengembalian`
--
ALTER TABLE `peminjamdanpengembalian`
  ADD PRIMARY KEY (`kodepeminjaman`),
  ADD UNIQUE KEY `Kode Mobil` (`kodemobil`),
  ADD UNIQUE KEY `Nomor Identitas` (`nomoridentitas`),
  ADD UNIQUE KEY `Kode Pegawai` (`kodepegawai`);

--
-- Indexes for table `penggajian`
--
ALTER TABLE `penggajian`
  ADD PRIMARY KEY (`kodepenggajian`),
  ADD UNIQUE KEY `KodePegawai` (`kodepegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kelolaresiko`
--
ALTER TABLE `kelolaresiko`
  MODIFY `kodeasuransi` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `peminjamdanpengembalian`
--
ALTER TABLE `peminjamdanpengembalian`
  MODIFY `kodepeminjaman` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `penggajian`
--
ALTER TABLE `penggajian`
  MODIFY `kodepenggajian` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `kelolaresiko`
--
ALTER TABLE `kelolaresiko`
  ADD CONSTRAINT `kelolaresiko_ibfk_1` FOREIGN KEY (`kodemobil`) REFERENCES `mobil` (`kodemobil`),
  ADD CONSTRAINT `kelolaresiko_ibfk_2` FOREIGN KEY (`nomoridentitas`) REFERENCES `peminjam` (`nomoridentitas`),
  ADD CONSTRAINT `kelolaresiko_ibfk_3` FOREIGN KEY (`kodemobil`) REFERENCES `mobil` (`kodemobil`);

--
-- Ketidakleluasaan untuk tabel `peminjamdanpengembalian`
--
ALTER TABLE `peminjamdanpengembalian`
  ADD CONSTRAINT `peminjamdanpengembalian_ibfk_1` FOREIGN KEY (`kodepegawai`) REFERENCES `karyawan` (`kodepegawai`),
  ADD CONSTRAINT `peminjamdanpengembalian_ibfk_2` FOREIGN KEY (`kodemobil`) REFERENCES `mobil` (`kodemobil`),
  ADD CONSTRAINT `peminjamdanpengembalian_ibfk_3` FOREIGN KEY (`nomoridentitas`) REFERENCES `peminjam` (`nomoridentitas`);

--
-- Ketidakleluasaan untuk tabel `penggajian`
--
ALTER TABLE `penggajian`
  ADD CONSTRAINT `penggajian_ibfk_1` FOREIGN KEY (`kodepegawai`) REFERENCES `karyawan` (`kodepegawai`),
  ADD CONSTRAINT `penggajian_ibfk_2` FOREIGN KEY (`kodepegawai`) REFERENCES `karyawan` (`kodepegawai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
