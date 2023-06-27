package Exercice.Basic.Lab6;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double a, b, c;
        double delta;
        double x1, x2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea pentru a: ");
        a = scanner.nextDouble();

        System.out.print("Introduceti valoarea pentru b: ");
        b = scanner.nextDouble();

        System.out.print("Introduceti valoarea pentru c: ");
        c = scanner.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta >= 0) {
            if (delta == 0) {
                x1 = -b / (2 * a);
                x2 = x1; // x2 va fi egal cu x1 pentru o soluție dublă
                System.out.println("Ecuatia are o solutie reala:");
                System.out.println("x1 = x2 = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Ecuatia are doua solutii reale distincte:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        } else {
            System.out.println("Ecuatia nu are solutii reale.");
        }
    }

}

