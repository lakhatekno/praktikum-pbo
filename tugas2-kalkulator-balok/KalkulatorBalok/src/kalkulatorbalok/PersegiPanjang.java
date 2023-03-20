/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorbalok;

/**
 *
 * @author msi-modern
 */
public class PersegiPanjang {
    double panjang, lebar, luasPersegiPanjang, kelilingPersegiPanjang;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double luasPersegiPanjang() {
        return panjang * lebar;
    }
    
    public double kelilingPersegiPanjang() {
        return 2*(panjang + lebar);
    }
}
