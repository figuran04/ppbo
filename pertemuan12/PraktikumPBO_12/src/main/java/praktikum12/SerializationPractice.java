/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author User
 */
import java.io.*;

// Kelas Produk yang dapat diserialisasi
class Produk implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;

    // Konstruktor
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}

public class SerializationPractice {
    public static void main(String[] args) {
        String filePath = "produk.ser"; // Lokasi file untuk serialisasi

        // Membuat objek Produk
        Produk produk = new Produk("Laptop", 15000000, 10);

        // Menyimpan objek ke file (Serialisasi)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(produk);  // Menulis objek produk ke file
            System.out.println("Objek Produk berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek.");
            e.printStackTrace();
        }

        // Membaca objek dari file (Deserialisasi)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Produk deserializedProduk = (Produk) ois.readObject();  // Membaca objek dari file
            System.out.println("\nObjek Produk berhasil dibaca dari file:");
            deserializedProduk.tampilkanInfo();  // Menampilkan informasi produk yang dibaca
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca objek.");
            e.printStackTrace();
        }
    }
}
