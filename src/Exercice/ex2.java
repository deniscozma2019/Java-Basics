package Exercice;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("introduceti numarul format din 4 cifre");
        num = input.nextInt();

        int mii = num / 1000;
        int sute = (num / 100) % 10;
        int zeci = (num / 10) % 10;
        int unitati = num % 10;
        int rezultat = mii * 100 + unitati;

        System.out.println("Numărul obținut prin eliminarea cifrelor din mijloc: " + rezultat);
    }
}
