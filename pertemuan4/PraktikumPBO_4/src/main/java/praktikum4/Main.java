/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class Main {
  public static void main(String[] args) {
    Kendaraan kendaraan = new Kendaraan("Sepeda Motor", 120, "Bensin");
    kendaraan.tampilkanInfoKendaraan();

    Mobil mobil = new Mobil("Toyota", 190, "Bensin", 4);
    mobil.tampilkanInfoMobil();

    mobil.setNama("Honda");
    System.out.println("Setelah modifikasi nama mobil:");
    mobil.tampilkanInfoMobil();
  }
}


