/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Si Manis";
        kucing.jenis = "Kucing Persia";
        kucing.tampilkanInfo();
        // Objek Anjing
        Anjing anjing = new Anjing();
        anjing.nama = "Rocky";
        anjing.jenis = "Anjing Bulldog";
        anjing.tampilkanInfo();
    }
}