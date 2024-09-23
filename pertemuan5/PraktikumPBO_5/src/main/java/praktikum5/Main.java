/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Objek Mobil
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.bahanBakar = "Bensin";
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();

        // Objek SepedaMotor
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.bahanBakar = "Pertalite";
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();
  }
}
