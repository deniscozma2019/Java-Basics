package Exercice.Basic.Lab4;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int num, first, second, third;

        System.out.println("Introduceti n = ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num < 100 || num >= 1000) {
            System.out.println("Introduceti un numar format din 3 cifre");
            return; // Terminam programul daca numarul nu este format din 3 cifre
        }

        for (int i = 100; i < 1000; i++) {
            first = i / 100;
            second = (i / 10) % 10;
            third = i % 10;
            int squares_sum = first * first + second * second;

            if (squares_sum - third * third == i) {
                System.out.println(i + " = " + first + "*" + first + " - " + third + "*" + third);
            }
        }
    }
}
