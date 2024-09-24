/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author User
 */
public abstract class Produk {
    protected String nama;
    protected double harga;
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    // Metode abstrak untuk menghitung diskon
    public abstract double hitungDiskon();
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
}