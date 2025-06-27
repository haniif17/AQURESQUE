/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquresque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
/**
 *
 * @author ACER
 */
public class DatabaseController {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/aquresque_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

    // --- FUNGSI UNTUK MANAJEMEN USERS ---

    public static boolean loginUser(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat login: " + e.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean registerUser(String username, String password) {
        String checkSql = "SELECT * FROM users WHERE username = ?";
        String insertSql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try (Connection conn = getConnection()) {
            try (PreparedStatement checkPstmt = conn.prepareStatement(checkSql)) {
                checkPstmt.setString(1, username);
                try (ResultSet rs = checkPstmt.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Username sudah terdaftar.", "Registrasi Gagal", JOptionPane.WARNING_MESSAGE);
                        return false;
                    }
                }
            }
            try (PreparedStatement insertPstmt = conn.prepareStatement(insertSql)) {
                insertPstmt.setString(1, username);
                insertPstmt.setString(2, password);
                int affectedRows = insertPstmt.executeUpdate();
                return affectedRows > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat registrasi: " + e.getMessage(), "Registrasi Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // --- FUNGSI UNTUK MANAJEMEN LOGISTIK (GUDANG) ---

    public static ResultSet getAllBantuan() {
        String sql = "SELECT id, kode_brg, jenis_brg, nama_brg, jumlah, satuan, status FROM logistik ORDER BY id ASC";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat mengambil data: " + e.getMessage());
            return null;
        }
    }

    public static boolean tambahBantuan(String kode, String jenis, String nama, int jumlah, String satuan) {
        String sql = "INSERT INTO logistik (kode_brg, jenis_brg, nama_brg, jumlah, satuan) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, kode);
            pstmt.setString(2, jenis);
            pstmt.setString(3, nama);
            pstmt.setInt(4, jumlah);
            pstmt.setString(5, satuan);

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            if (e.getSQLState().equals("23000")) {
                 JOptionPane.showMessageDialog(null, "Gagal: Kode Barang '" + kode + "' sudah ada.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else {
                 JOptionPane.showMessageDialog(null, "Error saat menambah data: " + e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            return false;
        }
    }
    
    public static boolean updateJumlahBantuan(String kodeBarang, int jumlahBaru) {
        String sql = "UPDATE logistik SET jumlah = ? WHERE kode_brg = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, jumlahBaru);
            pstmt.setString(2, kodeBarang);

            int affectedRows = pstmt.executeUpdate();

            // Jika tidak ada baris yang terpengaruh, berarti Kode Barang tidak ditemukan
            if (affectedRows == 0) {
                JOptionPane.showMessageDialog(null, "Gagal: Kode Barang '" + kodeBarang + "' tidak ditemukan.", "Update Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Berhasil jika satu baris terpengaruh

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat mengupdate data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static boolean hapusBantuan(String kodeBarang) {
        String sql = "DELETE FROM logistik WHERE kode_brg = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, kodeBarang);

            int affectedRows = pstmt.executeUpdate();

            // Jika tidak ada baris yang terpengaruh, berarti Kode Barang tidak ditemukan
            if (affectedRows == 0) {
                JOptionPane.showMessageDialog(null, "Gagal: Kode Barang '" + kodeBarang + "' tidak ditemukan.", "Hapus Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Berhasil jika satu baris terhapus

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat menghapus data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Mencoba melakukan koneksi ke database...");
        
        Connection conn = getConnection();
        
        if (conn != null) {
            System.out.println("Koneksi Berhasil! Database siap digunakan.");
            try {
                // Jangan lupa menutup koneksi setelah tes selesai
                conn.close();
                System.out.println("Koneksi ditutup.");
            } catch (SQLException e) {
                System.out.println("Error saat menutup koneksi: " + e.getMessage());
            }
        } else {
            System.out.println("Koneksi Gagal. Periksa konfigurasi dan pastikan server database (XAMPP) sudah berjalan.");
        }
    }
}
