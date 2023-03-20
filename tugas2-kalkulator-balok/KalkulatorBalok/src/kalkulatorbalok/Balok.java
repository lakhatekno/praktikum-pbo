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
    
    public double luasBalok() {
        PersegiPanjang sisi2 = new PersegiPanjang(lebar, tinggi);
        PersegiPanjang sisi3 = new PersegiPanjang(panjang, tinggi);
        return (sisi2.luasPersegiPanjang() + sisi3.luasPersegiPanjang() + super.luasPersegiPanjang()) * 2;
    }
}
