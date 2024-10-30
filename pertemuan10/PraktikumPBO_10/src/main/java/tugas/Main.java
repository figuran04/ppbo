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
        // Membuat objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 1000.0;
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik));
        // Membuat objek Makanan
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 1000.0;
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan));
    }
}
