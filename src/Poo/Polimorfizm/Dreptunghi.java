package Poo.Polimorfizm;

import Poo.MetodeAbstracte.Forma;

public class Dreptunghi extends Forma {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public double getArie() {
        return lungime * latime;
    }
}
