package Exercice.Basic.Lab5;

import java.util.Scanner;

public class Ex3 {
    // metoda care returnează adevărat dacă un număr este prim și fals în caz contrar
    public  static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int num1, int num2) {
        int temp;
        while (num2 != 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.println("Is " + num1 + " prime? " + isPrime(num1));
        System.out.println("Is " + num2 + " prime? " + isPrime(num2));
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));

    }
}

/*
* Se citesc de la tastatură numere naturale, câte două, până la întâlnirea numărului 0.
Să se elaboreze un program care afișează după citirea fiecărei perechi de numere dacă
sunt prime între ele.
*/
