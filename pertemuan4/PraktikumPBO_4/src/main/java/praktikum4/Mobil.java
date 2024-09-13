/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author User
 */

public class Mobil extends Kendaraan {
  private int jumlahPintu;

  public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
    super(nama, kecepatanMaks, jenisMesin);
    this.jumlahPintu = jumlahPintu;
  }

  public void tampilkanInfoMobil() {
    System.out.println("Nama Mobil: " + getNama());
    System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h"); // Mengakses atribut protected
    System.out.println("Jenis Mesin: " + jenisMesin);  // Mengakses atribut public
    System.out.println("Jumlah Pintu: " + jumlahPintu);
  }
}
