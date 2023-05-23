package Exercice.Basic.Lab5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar;
        int numereDouaCifreCuCifreIdentice = 0;
        do {
            System.out.println("Introduceti un numar natural (0 pentru a iesi):");
            numar= scanner.nextInt();

            if (numar>9 && numar<100 && numar%11==0 ){
                numereDouaCifreCuCifreIdentice++;
            }

        } while (numar != 0);
        System.out.println("Au fost introduse " + (numereDouaCifreCuCifreIdentice) + " numere formate din 2 cifre identice.");
    }
}
