package Poo.Polimorfizm;

public class Triunghi  extends Forma{
    private double baza;
    private double inaltime;

    public Triunghi(double baza, double inaltime) {
        this.baza = baza;
        this.inaltime = inaltime;
    }
// OVERIDE doar pt mostenire
    @Override
    public double getArie() {
        return 0.5 * baza * inaltime;
    }
    //OVELOAD
    public double getArie(int aprox) {
        return 1 * baza * inaltime;
    }
    public double getArie(String aprox) {
        return 2 * baza * inaltime;
    }



    public static void main(String[] args) {
        Triunghi triunghi = new Triunghi(2.5 ,3.5);
        System.out.println(triunghi.getArie("2"));
    }
}



