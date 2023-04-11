package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti valoarea elementului (1 - raza, 2 - diametru, 3 - lungime, 4 - aria): ");
        int element = scanner.nextInt();
        System.out.print("Introduceti valoarea numarului: ");
        double numar = scanner.nextDouble();

        double raza, diametru, lungime, aria;
        if (element == 1) {
            raza = numar;
            diametru = 2 * raza;
            lungime = diametru * Math.PI;
            aria = raza * raza * Math.PI;
        } else if (element == 2) {
            diametru = numar;
            raza = diametru / 2;
            lungime = diametru * Math.PI;
            aria = raza * raza * Math.PI;
        } else if (element == 3) {
            lungime = numar;
            diametru = lungime / Math.PI;
            raza = diametru / 2;
            aria = raza * raza * Math.PI;
        } else if (element == 4) {
            aria = numar;
            raza = Math.sqrt(aria / (Math.PI * 4));
            diametru = 2 * raza;
            lungime = diametru * Math.PI;
        } else {
            System.out.println("Valoarea elementului introdusa este invalida!");
            return;
        }

        System.out.println("Raza: " + raza);
        System.out.println("Diametru: " + diametru);
        System.out.println("Lungime: " + lungime);
        System.out.println("Aria: " + aria);
    }
}

/*Elementele circumferinței se numerotează în felul următor: 1- raza, 2 - diametru,
3 - lungimea, 4 - aria. Se introduce valoarea elementului și numărul său. Să se
afișeze valorile celorlalte elemente ale circumferinței.
*/
