package bangunDatar1;

public class Kerucut extends Lingkaran {
    //private double t;
    @Override
    public double lingLuas(double r) {

        double volume = r*r*getT()/3;
        return volume;
    }
}
