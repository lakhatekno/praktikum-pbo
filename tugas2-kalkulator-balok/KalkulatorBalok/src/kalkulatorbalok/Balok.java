/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorbalok;

/**
 *
 * @author msi-modern
 */
public class Balok extends PersegiPanjang {
    double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public double volumeBalok() {
        return luasPersegiPanjang() * tinggi;
    }
    
    public double kelilingBalok() {
        return (2 * tinggi * kelilingPersegiPanjang()) * 2;
    }
}
