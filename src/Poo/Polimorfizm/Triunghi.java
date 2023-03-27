package Poo.Polimorfizm;

public class Triunghi  extends Forma{
    private double baza;
    private double inaltime;

    public Triunghi(double baza, double inaltime) {
        this.baza = baza;
        this.inaltime = inaltime;
    }

    public double getArie() {
        return 0.5 * baza * inaltime;
    }
}
