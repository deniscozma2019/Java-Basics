package Exercice.Basic.Lab1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[]args){
        int x;
        int first;
        int result=0;
        System.out.println("introduceti numarul");
         Scanner input= new Scanner(System.in);
        x=input.nextInt();
        result += (x % 1000) + (x % 100) + (x % 10);
        System.out.println("Suma numerelor obținute prin eliminarea cifrelor este: " + result);
    }
}
