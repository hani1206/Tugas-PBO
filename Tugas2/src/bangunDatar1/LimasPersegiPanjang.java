package bangunDatar1;

public class LimasPersegiPanjang extends PersegiPanjang{
    public double volumeLimas(double p, double l, double t) {
        double volume = ((luas(p, l)*1/2)*t)*1/3;

        return volume;

    }
}


