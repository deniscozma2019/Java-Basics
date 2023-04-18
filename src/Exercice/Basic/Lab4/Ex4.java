import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Introduceti sirul de numere");

        // se citeste numarul de elemente din sir
        int n = number.nextInt();
        if (n <= 0) {
            System.out.println("Numarul de elemente trebuie sa fie pozitiv.");
            return;
        }

        // se creeaza vectorul de numere si se citesc valorile
        double[] num = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti un numar real");
            num[i] = number.nextDouble();
        }

        // se calculeaza valorile minim si maxim
        double minim = num[0];
        double maxim = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] < minim) {
                minim = num[i];
            }
            if (num[i] > maxim) {
                maxim = num[i];
            }
        }

        // se afiseaza valorile minim si maxim
        System.out.println("Valoarea minimă din șir este: " + minim);
        System.out.println("Valoarea maximă din șir este: " + maxim);

        // se inchide obiectul Scanner
        number.close();
    }
}
