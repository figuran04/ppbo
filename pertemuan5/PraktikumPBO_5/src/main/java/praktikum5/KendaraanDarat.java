/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author User
 */
public class KendaraanDarat extends Kendaraan {
    String bahanBakar;
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bahan Bakar: " + bahanBakar);
    }
}
