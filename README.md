# AQURESQUE - Sistem Manajemen Inventaris Air Minum

AQURESQUE adalah aplikasi desktop berbasis Java Swing yang dirancang untuk membantu depot atau agen air minum dalam mengelola data inventaris, distribusi, dan pelaporan secara efisien dan terkomputerisasi. Proyek ini dibuat sebagai bagian dari pemenuhan tugas akademis.

---

## 👨‍💻 Tim Pengembang

Proyek ini dikerjakan dan dikembangkan oleh tim yang solid:

* **Muhammad Daffa Syahdana Haniif** (A11.2023.15284) - *Kerja*
* **Naufal 'Azzah Dhiyaa'** (A11.2023.15279) - *Kelompok*

*(Catatan: Silakan sesuaikan peran di atas sesuai dengan kontribusi masing-masing)*

---

## ✨ Fitur Utama

Aplikasi ini dilengkapi dengan berbagai fitur untuk mempermudah manajemen bisnis air minum Anda:

* 🔐 **Sistem Otentikasi:** Terdapat form Login dan Pendaftaran untuk memastikan hanya pengguna terdaftar yang bisa mengakses sistem.
* 📊 **Dashboard Utama:** Halaman utama yang informatif, menampilkan menu-menu utama dan area untuk berita atau informasi terkini.
* 📦 **Manajemen Gudang:** Modul untuk mengelola data stok galon, baik yang masuk maupun yang keluar.
* 🚚 **Manajemen Distribusi:** Modul untuk mencatat dan melacak proses distribusi galon ke pelanggan.
* 📄 **Manajemen Laporan:** Fitur untuk menghasilkan laporan penjualan, stok, dan distribusi untuk analisis bisnis.

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
    * Buat sebuah database baru di MySQL (misalnya dengan nama `db_aquresque`).
    * Import file `.sql` yang berisi struktur tabel (jika ada).
    * Pastikan file library `mysql-connector-j-9.3.0.jar` sudah ditambahkan ke dalam Libraries proyek di NetBeans.
    * Sesuaikan kode koneksi database di dalam Java agar sesuai dengan host, username, dan password database-mu.

5.  **Jalankan Aplikasi:**
    * Klik kanan pada proyek di NetBeans.
    * Pilih `Run` atau tekan tombol `F6`. Aplikasi akan dimulai dari `LoginFrame.java` atau `MainFrame.java` tergantung konfigurasi awal.

---

## 📸 Tampilan Aplikasi

Berikut adalah beberapa cuplikan tampilan dari aplikasi AQURESQUE:

**1. Halaman Login & Pendaftaran**
*(Saran: Ambil screenshot halaman Login dan Daftar lalu letakkan di sini)*

**2. Halaman Utama (Dashboard)**
*(Saran: Ambil screenshot halaman Utama setelah login dan letakkan di sini)*

---

Terima kasih telah mengunjungi repository kami!
