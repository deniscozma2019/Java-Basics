package Exercice.Basic.Lab5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int numar;
        int numarCifre = 0;

        System.out.println("Introduceti numarul: ");
        Scanner scanner = new Scanner(System.in);
        numar = scanner.nextInt();

        if (numar < 0) {
            numar = Math.abs(numar);
        }

        if (numar == 0) {
            numarCifre = 1;
        } else {
            while (numar != 0) {
                numar = numar / 10;
                numarCifre++;
            }
        }

        System.out.println("Numarul de cifre al numarului dat este: " + numarCifre);

    }
}

//5. Să se elaboreze un program care afișează numărul de cifre a unui număr
