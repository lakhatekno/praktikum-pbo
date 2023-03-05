package baloktabung;

public class PersegiPanjang implements MenghitungBidang {
    
    final double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double keliling() {
        return panjang*lebar;
    }

    @Override
    public double luas() {
        return panjang*lebar;
    }
    
}
