package baloktabung;

public class Lingkaran implements MenghitungBidang {
    
    final double jariJari, PI = Math.PI;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double keliling() {
        return 4*PI*jariJari;
    }

    @Override
    public double luas() {
        return PI*jariJari*jariJari;
    }
    
}

