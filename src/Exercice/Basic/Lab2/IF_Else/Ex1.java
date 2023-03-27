package Exercice.Basic.Lab2.IF_Else;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[]args) {
    int a ,b , c;
    //introducere a primului numar
        System.out.println("introduceti prima cifra");
        Scanner one = new Scanner(System.in);
        a =one.nextInt();

        System.out.println("introduceti a doua cifra");
        Scanner second = new Scanner(System.in);
        b =second.nextInt();

        System.out.println("Introduceti a trea cifra");
        Scanner third = new Scanner(System.in);
        c =third.nextInt();

        double maxDiff = Math.max(Math.max(Math.abs(a - b), Math.abs(b - c)), Math.abs(c - a));
        System.out.println("Cea mai mare diferență dintre oricare două valori este: " + maxDiff);

        /*În acest program, utilizăm clasa Scanner pentru a citi valorile numerice a, b și c de la tastatură.
         Apoi, utilizăm funcția Math.max() pentru a găsi cea mai mare diferență dintre oricare două valori.
         Pentru a face acest lucru, comparăm diferențele dintre a și b, b și c și c și a utilizând funcția
         Math.abs() pentru a ne asigura că obținem valori pozitive.
         */
    }

}

