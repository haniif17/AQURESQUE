# AQURESQUE - Sistem Manajemen Distribusi Bantuan Banjir


AQURESQUE adalah aplikasi desktop yang dibangun untuk membantu relawan dan organisasi dalam mengelola dan mendistribusikan bantuan kepada korban bencana banjir secara sistematis, transparan, dan efisien.

---

## 👨‍💻 Tim Pengembang

Proyek kemanusiaan ini dikerjakan dan dikembangkan oleh:

* **Muhammad Daffa Syahdana Haniif** (A11.2023.15284) - *Kerja*
* **Naufal 'Azzah Dhiyaa'** (A11.2023.15272) - *Kelompok*
---

## ✨ Fitur Utama

Aplikasi ini dirancang untuk mengatasi tantangan dalam manajemen bantuan bencana:

* 🔐 **Sistem Otentikasi Relawan:** Dilengkapi form Login dan Pendaftaran untuk memastikan hanya relawan terverifikasi yang dapat mengelola data.
* 📊 **Dashboard Koordinasi:** Halaman utama yang berfungsi sebagai pusat komando, menampilkan menu-menu strategis dan informasi penting terkait status bencana.
* 📦 **Manajemen Logistik (Gudang):** Modul untuk mencatat, mengkategorikan, dan memantau stok barang bantuan yang masuk dan keluar dari posko utama.
* 🚚 **Manajemen Distribusi:** Fitur untuk merencanakan, mencatat, dan melacak proses penyaluran bantuan ke berbagai titik lokasi atau penerima bantuan.
* 📄 **Pelaporan & Akuntabilitas:** Modul untuk menghasilkan laporan terperinci mengenai jumlah bantuan yang diterima dan yang telah disalurkan, demi menjaga transparansi.

---

## 🛠️ Teknologi yang Digunakan

Proyek ini dibangun menggunakan teknologi berikut:

* **Bahasa Pemrograman:** Java (Source 1.8)
* **Framework/Library:** Java Swing (untuk antarmuka pengguna grafis / GUI)
* **IDE:** Apache NetBeans
* **Database:** MySQL (dihubungkan dengan `mysql-connector-j`)
* **Layout Manager:** AbsoluteLayout

---

## 🚀 Cara Menjalankan Proyek

Untuk menjalankan proyek ini di komputermu, ikuti langkah-langkah berikut:

1.  **Prasyarat:**
    * Pastikan **JDK (Java Development Kit)** versi 18 atau lebih baru sudah terinstall.
    * Pastikan **Apache NetBeans IDE** sudah terinstall.
    * Siapkan server database **MySQL** (misalnya menggunakan XAMPP).

2.  **Clone Repository:**
    ```bash
    git clone [https://github.com/haniif17/AQURESQUE.git](https://github.com/haniif17/AQURESQUE.git)
    ```

3.  **Buka Proyek di NetBeans:**
    * Buka NetBeans.
    * Pilih `File` -> `Open Project...`
    * Arahkan ke folder tempat kamu meng-clone repository, lalu klik `Open Project`.

4.  **Konfigurasi Database:**
    * Buat sebuah database baru di MySQL (misalnya dengan nama `db_bantuan_banjir`).
    * Import file `.sql` yang berisi struktur tabel (jika ada).
    * Pastikan file library `mysql-connector-j-9.3.0.jar` sudah ditambahkan ke dalam Libraries proyek di NetBeans.
    * Sesuaikan kode koneksi database di dalam Java agar sesuai dengan host, username, dan password database-mu.

5.  **Jalankan Aplikasi:**
    * Klik kanan pada proyek di NetBeans.
    * Pilih `Run` atau tekan tombol `F6`.

---

## 📸 Buku Panduan

Berikut adalah buku panduan dari aplikasi AQURESQUE:
https://drive.google.com/file/d/1zAhT4HogypY94QngsNMXnfNVcdLCom-5/view?usp=sharing
---

Terima kasih telah mengunjungi repository kami. Semoga aplikasi ini dapat memberikan manfaat.
