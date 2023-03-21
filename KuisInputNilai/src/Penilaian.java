/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab Informatika
 */
public class Penilaian {
    int nilai1, nilai2, nilai3, nilai4, nilaiTotal;
    String keterangan;
    public Penilaian(String lomba,
            int nilai1,
            int nilai2,
            int nilai3,
            int nilai4) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        if (lomba == "karya") {
            nilaiTotal = karyaTulis();
        } else if (lomba == "puisi") {
            nilaiTotal = puisi();
        }
        
        if(nilaiTotal < 85) {
            keterangan = "TIDAK LOLOS";
        } else if (nilaiTotal >= 85) {
            keterangan = "LOLOS";
        }
    }
    
    public int karyaTulis() {
        return ((15*this.nilai1) + (35*this.nilai2) + (25*this.nilai3) + (25*this.nilai4))/100;
    }
    
    public int puisi() {
        return ((30*this.nilai1) + (30*this.nilai2) + (20*this.nilai3) + (20*this.nilai4))/100;
    }
}
