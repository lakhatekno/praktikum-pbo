package baloktabung;

public class Tabung extends Lingkaran implements MenghitungRuang {

    final double tinggi;
    
    public Tabung(double jariJari, double tinggi) {
        super(jariJari);
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
        return 2*getLuas() + getKeliling()*tinggi;
    }

    @Override
    public double volume() {
        return getLuas()*tinggi;
    }
    
    
}
