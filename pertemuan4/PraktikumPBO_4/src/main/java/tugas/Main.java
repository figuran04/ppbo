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
        Pekerja pekerja = new Pekerja("Budi", 30, "Programmer", 15000000);

        System.out.println("Informasi Pekerja:");
        System.out.println(pekerja.toString());

        pekerja.setNama("Andi");
        System.out.println("\nSetelah mengubah nama:");
        System.out.println(pekerja.toString());

        // Coba akses langsung atribut nama, usia, dan gaji
        // System.out.println(pekerja.nama);  // Error, karena 'nama' bersifat private
        // System.out.println(pekerja.usia);  // Tidak error, karena 'usia' bersifat protected
        // System.out.println(pekerja.gaji);  // Error, karena 'gaji' bersifat private
    }
}


