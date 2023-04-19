package Exercice.Basic.Lab4;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea pentru n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int prod = 1;

        for (int i = 1; i <= n; i++) {
            prod -= i;
            sum += prod;
        }

        System.out.println("Suma este " + sum);
    }
    }

