package Poo.Interfete;

public class Cerc  implements Forma{

    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double getArie() {
        return Math.PI * raza * raza;
    }
}
//Astfel, clasa "Cerc" implementează metoda "getArie" definită în interfața "Forma",
// permițând utilizatorilor să calculeze aria unui cerc folosind interfața "Forma".
