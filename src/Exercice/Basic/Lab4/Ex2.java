package Exercice.Basic.Lab4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner value_n = new Scanner(System.in);
        Scanner value_k = new Scanner(System.in);
        int n;
        int k;
        System.out.println("Introduceti valoarea n = ");
        n = value_n.nextInt();

        System.out.println("Introduceti valoarea k = ");
        k = value_k.nextInt();

        int counter = 0;

        for (int i = 1; i <= n; i++) {
            int divisor_count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisor_count++;
                }
            }
            if (divisor_count == k) {
                System.out.println(i);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Nu exista numere cu " + k + " divizori in cele introduse.");
        }
    }
}
