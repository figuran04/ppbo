/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private List<tugas.Buku> bukuList;

    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(tugas.Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        for (tugas.Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}
