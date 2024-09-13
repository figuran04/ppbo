/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class Kendaraan {
  private String nama;
  protected int kecepatanMaks; 
  public String jenisMesin;

  public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
    this.nama = nama;
    this.kecepatanMaks = kecepatanMaks;
    this.jenisMesin = jenisMesin;
  }

  public String getNama(){
    return nama;
  }
  public void setNama(String nama){
    this.nama = nama;
  }

  public void tampilkanInfoKendaraan(){
    System.out.println("Nama Kendaraan: " + nama);
    System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
    System.out.println("Jenis Mesin: " + jenisMesin);
  }
}
