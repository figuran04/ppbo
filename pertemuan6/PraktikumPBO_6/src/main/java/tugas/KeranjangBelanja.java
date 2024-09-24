/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import java.util.ArrayList;
import java.util.List;
class KeranjangBelanja {
    private List<Produk> daftarProduk;
    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }
    // Menambahkan produk ke dalam keranjang
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
    // Menghitung total harga setelah diskon
    public double hitungTotalHarga() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.hitungDiskon();
        }
        return total;
    }
    // Menampilkan detail produk di dalam keranjang
    public void tampilkanProduk() {
        for (Produk produk : daftarProduk) {
            System.out.println("Produk: " + produk.getNama() + ", Harga: " + produk.getHarga() + ", Harga setelah diskon: " + produk.hitungDiskon());
        }
    }
}
