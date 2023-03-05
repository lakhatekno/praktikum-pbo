package baloktabung;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    
    double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public double getLuas() {
        return super.luas();
    }
    
    public double getKeliling() {
        return super.keliling();
    }
        
    @Override
    public double luasPermukaan() {
        return (2*getLuas()) + (2*panjang*tinggi) + (2*lebar*tinggi);
    }

    @Override
    public double volume() {
        return getLuas()*tinggi;
    }
    
}
