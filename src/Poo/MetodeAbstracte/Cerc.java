package Poo.MetodeAbstracte;

public class Cerc extends Forma {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double getArie() {
        return Math.PI * raza * raza;
    }

//În acest caz, clasa "Cerc" extinde clasa abstractă "Forma" și oferă o implementare concretă a metodei abstracte "getArie".
}
