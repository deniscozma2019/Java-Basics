package Exercice.Basic.Lab2.IF_Else;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int x, y, sum, product;
        Scanner scanner = new Scanner(System.in);





        // citim numarul x
        System.out.print("Introduceti numarul X (trei cifre): ");
        x = scanner.nextInt();
        if (x>999){
            System.out.println("Numarul x nu este format din 3 cifre introduceti din nou : ");
            System.exit(0);
        }
        // calculam suma cifrelor lui x
        sum = (x / 100) + ((x % 100) / 10) + (x % 10);

        // verificam daca suma cifrelor este un numar cu exact 2 cifre
        if (sum >= 10 && sum <= 99) {
            System.out.println("Suma cifrelor lui X este un numar cu exact 2 cifre.");
        } else {
            System.out.println("Suma cifrelor lui X nu este un numar cu exact 2 cifre.");
        }

        // calculam produsul cifrelor lui x
        product = (x / 100) * ((x % 100) / 10) * (x % 10);

        // verificam daca produsul cifrelor este un numar cu exact 3 cifre
        if (product >= 100 && product <= 999) {
            System.out.println("Produsul cifrelor lui X este un numar cu exact 3 cifre.");
        } else {
            System.out.println("Produsul cifrelor lui X nu este un numar cu exact 3 cifre.");
        }

        // verificam daca produsul cifrelor este mai mare decat X
        if (product > x) {
            System.out.println("Produsul cifrelor lui X este mai mare decat X.");
        } else {
            System.out.println("Produsul cifrelor lui X nu este mai mare decat X.");
        }

        // citim numarul y
        System.out.print("Introduceti numarul Y: ");
        y = scanner.nextInt();

        // verificam daca suma cifrelor lui x este divizibila cu y
        if (sum % y == 0) {
            System.out.println("Suma cifrelor lui X este divizibila cu Y.");
        } else {
            System.out.println("Suma cifrelor lui X nu este divizibila cu Y.");
        }

        scanner.close();
    }
}

/*
8. Să se elaboreze un program care să citească un număr X natural din exact 3 cifre și
să determine:
 dacă suma cifrelor numărului X reprezintă un număr din exact 2 cifre;
 dacă produsul cifrelor numărului X reprezintă un număr din exact 3 cifre;
 dacă produsul cifrelor numărului X este mai mare decât însuși numărul X;
 dacă suma cifrelor numărului X este divizibilă cu numărul Y.
 */
