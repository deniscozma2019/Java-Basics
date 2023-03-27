package Poo.Polimorfizm;

public class Cerc extends Forma {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double getArie() {
        return Math.PI * raza * raza;
    }

}
