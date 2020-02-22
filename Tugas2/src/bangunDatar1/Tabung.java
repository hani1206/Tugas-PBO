package bangunDatar1;

public class Tabung extends Lingkaran {
    //private double t;
    @Override
    public double lingLuas(double r) {
        return super.lingLuas(r)*getT();
    }
}
