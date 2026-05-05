🚗 Aplikasi Data Kendaraan

Aplikasi ini adalah web sederhana untuk mengelola data kendaraan.
User bisa menambah, melihat, mengubah, dan menghapus data kendaraan melalui tampilan web.

Project ini dibuat sebagai latihan/test dengan konsep fullstack (frontend + backend + database).

⚙️ Teknologi yang Digunakan
Frontend: React.js
Backend: Spring Boot
Database: MySQL
📌 Fitur
Menampilkan data kendaraan
Menambahkan data kendaraan
Edit data kendaraan
Hapus data kendaraan
Validasi input sederhana
🗂 Data yang Digunakan

Data kendaraan yang disimpan meliputi:

Nomor Registrasi (unik & wajib)
Nama Pemilik (wajib)
Alamat
Merk Kendaraan
Tahun Pembuatan
Kapasitas Mesin
Warna
Bahan Bakar
🚀 Cara Menjalankan
1. Setup Database

Buat database di MySQL:

CREATE DATABASE kendaraan_db;
2. Jalankan Backend

Masuk ke folder backend:

cd backend
mvn spring-boot:run

Backend akan berjalan di:
http://localhost:8080

3. Jalankan Frontend

Masuk ke folder frontend:

cd frontend
npm install
npm start

Frontend akan terbuka di:
http://localhost:3000

📝 Catatan
Pastikan MySQL sudah berjalan
Pastikan konfigurasi database di application.properties sudah sesuai
Jalankan backend terlebih dahulu sebelum frontend
🎯 Penutup

Aplikasi ini dibuat untuk menunjukkan dasar kemampuan fullstack, seperti:

penggunaan API
pengolahan data CRUD
integrasi frontend dan backend

Struktur project dibuat sederhana agar mudah dipahami dan bisa dikembangkan lebih lanjut.
