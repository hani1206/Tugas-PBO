package bangunDatar1;

public class Lingkaran {
    private double t;
    private double p;
    public double lingLuas(double r) {
        double luasLingkaran = 3.14 * r * r;
        return luasLingkaran;
    }
    public void setT(double t){
        this.t=t;
    }
    public double getT()
    {
        return t;
    }
    public double getP() {
        return p;
    }

    public void setP(double p) {
        p = p;
    }

}
