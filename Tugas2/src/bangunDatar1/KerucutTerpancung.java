package bangunDatar1;

public class KerucutTerpancung extends Lingkaran {

    @Override
    public double lingLuas(double r) {
        double volume = 3.14*getT()/3*(Math.pow(getP(),2)*(getP()*r)*(Math.pow(r,2)));

        return volume;
    }

}
