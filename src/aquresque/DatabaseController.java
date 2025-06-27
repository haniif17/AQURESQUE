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
                        JOptionPane.showMessageDialog(null, "Username sudah terdaftar. Silakan gunakan username lain.", "Registrasi Gagal", JOptionPane.WARNING_MESSAGE);
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
    
    public static boolean tambahBantuan(String namaBarang, int jumlah, String satuan) {
        String sql = "INSERT INTO logistik (nama_barang, jumlah, satuan) VALUES (?, ?, ?)";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, namaBarang);
            pstmt.setInt(2, jumlah);
            pstmt.setString(3, satuan);
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat menambah data bantuan: " + e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
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
