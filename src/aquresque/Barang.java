/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquresque;

/**
 *
 * @author ACER
 */
public class Barang {
    private String kode, nama, satuan;
    private int jumlah;

    public Barang(String kode, String nama, int jumlah, String satuan) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.satuan = satuan;
    }

    // Getter methods untuk mengambil data
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getJumlah() { return jumlah; }
    public String getSatuan() { return satuan; }
}
