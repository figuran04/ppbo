/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Corolla", 2020, "Hitam");
        mobil1.displayInfo();
        mobil1.startEngine();

        System.out.println();

        Mobil mobil2 = new Mobil("Honda", "Civic", 2021, "Putih");
        mobil2.displayInfo();
        mobil2.startEngine();

        System.out.println();

        mobil2.setWarna("Merah");
        System.out.println("Setelah warna diubah:");
        mobil2.displayInfo();
    }
}
