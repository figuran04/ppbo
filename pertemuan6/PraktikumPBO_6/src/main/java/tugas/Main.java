/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek produk
        Produk buku = new Buku("Buku Java", 100000);
        Produk elektronik = new Elektronik("Laptop", 5000000);
        Produk pakaian = new Pakaian("Jaket", 300000);
        // Membuat keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        // Menambahkan produk ke dalam keranjang
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);
        // Menampilkan produk yang ada di keranjang
        System.out.println("Detail Produk dalam Keranjang:");
        keranjang.tampilkanProduk();
        // Menghitung dan menampilkan total harga setelah diskon
        double totalHarga = keranjang.hitungTotalHarga();
        System.out.println("\nTotal Harga setelah diskon: " + totalHarga);
    }
}
