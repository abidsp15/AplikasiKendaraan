# 🚗 Aplikasi Data Kendaraan

Aplikasi ini merupakan web sederhana untuk mengelola data kendaraan
berbasis fullstack (frontend, backend, dan database).

Tujuan utama dari aplikasi ini adalah mempermudah proses pencatatan data
kendaraan dengan fitur CRUD (Create, Read, Update, Delete) yang
terintegrasi antara frontend dan backend.

------------------------------------------------------------------------

## ✨ Fitur Utama

-   Menampilkan daftar data kendaraan
-   Menambahkan data kendaraan baru
-   Mengedit data kendaraan
-   Menghapus data kendaraan
-   Validasi input sederhana

------------------------------------------------------------------------

## ⚙️ Teknologi yang Digunakan

-   Frontend: React.js\
-   Backend: Spring Boot\
-   Database: MySQL

------------------------------------------------------------------------

## 🗂 Struktur Data

Data kendaraan yang digunakan meliputi:

-   Nomor Registrasi (unik & wajib)
-   Nama Pemilik (wajib)
-   Alamat
-   Merk Kendaraan
-   Tahun Pembuatan
-   Kapasitas Mesin
-   Warna
-   Bahan Bakar

------------------------------------------------------------------------

## 🚀 Cara Menjalankan Aplikasi

### 1. Setup Database

``` sql
CREATE DATABASE kendaraan_db;
```

Sesuaikan konfigurasi database di file:
backend/src/main/resources/application.properties

------------------------------------------------------------------------

### 2. Jalankan Backend

``` bash
cd backend
mvn spring-boot:run
```

Backend akan berjalan di: http://localhost:8080

------------------------------------------------------------------------

### 3. Jalankan Frontend

``` bash
cd frontend
npm install
npm start
```

Frontend akan berjalan di: http://localhost:3000

------------------------------------------------------------------------

## 📝 Catatan

-   Pastikan MySQL sudah berjalan
-   Jalankan backend terlebih dahulu sebelum frontend
-   Pastikan konfigurasi database sudah sesuai

------------------------------------------------------------------------

## 🎯 Tujuan Project

Project ini dibuat untuk menunjukkan kemampuan dasar dalam: -
Pengembangan aplikasi fullstack - Integrasi API antara frontend dan
backend - Pengolahan data CRUD - Struktur project yang rapi dan mudah dikembangkan

------------------------------------------------------------------------

## 👨‍💻 Author

Abidsyach Pramana
