package Exercice.Basic.Lab4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
       int sum= 0; int n;
       System.out.println("Introduceti numarul");
       Scanner scanner = new Scanner(System.in);
       n= scanner.nextInt();

        int i;

        for (i= 2; i<=n; i+=2 ){
            sum += i;
        }
        System.out.println("Suma este egala cu ="+ "" +sum);
    }
}
