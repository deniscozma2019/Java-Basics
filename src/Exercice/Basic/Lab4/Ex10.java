package Exercice.Basic.Lab4;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar natural: ");
        int n = scanner.nextInt();

        int sum = 1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (n / i != i) {
                    sum += n / i;
                }
            }
        }

        if (n == sum) {
            System.out.println(n + " este un numar perfect");
        } else {
            System.out.println(n + " nu este un numar perfect");
        }
    }
}
