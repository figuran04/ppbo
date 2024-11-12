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
        // Membuat objek Pengarang
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");
        Pengarang pengarang3 = new Pengarang("Dewi Lestari");

        // Membuat objek Buku dengan pengarang masing-masing
        Buku buku1 = new Buku("Hujan", pengarang1);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);
        Buku buku3 = new Buku("Perahu Kertas", pengarang3);

        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku-buku ke perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan informasi perpustakaan
        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();
    }
}

