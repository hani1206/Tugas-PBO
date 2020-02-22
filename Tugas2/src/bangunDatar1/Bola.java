package bangunDatar1;

public class Bola extends Lingkaran {
    @Override
    public double lingLuas(double r) {
        double volume = ((4*3.14 * r * r)/3);

        return volume;

    }
}
