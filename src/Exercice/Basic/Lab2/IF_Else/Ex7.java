package Exercice.Basic.Lab2.IF_Else;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int a, b, c, d;
        //citim de la tastiera variabila a
        System.out.println("Introduceti valoarea cifrei a=");
        Scanner one = new Scanner(System.in);
        a = one.nextInt();

        //citim de la tastiera variabila b
        System.out.println("Introduceti valoarea cifrei b=");
        Scanner two = new Scanner(System.in);
        b = two.nextInt();

        //citim de la tastiera variabila c
        System.out.println("Introduceti valoarea cifrei c=");
        Scanner three = new Scanner(System.in);
        c = three.nextInt();

        //citim de la tastiera variabila d
        System.out.println("Introduceti valoarea variabilei d = ");
        Scanner four = new Scanner(System.in);
        d = four.nextInt();

        if (c < d) {
            int result1 = a + b;
            System.out.println("Suma primelor doua numere este:"+""+ result1);
        }
        if (c > d) {
            int result2 = a*b;
            System.out.println("Produsul primelor doua numere este:"+""+ result2);
        }
        if (c==d){
            double invers_a = 1 / a;
          double  invers_b = 1 / b;
          double result3 =invers_a + invers_b;
          System.out.println("Suma inverselor doua numere este:"+""+ result3);
        }
    }
}




/*
Fie a, b, c, d numere întregi citite de la tastatură. Să se elaboreze un program care
să calculeze suma primelor două dacă c<d, produsul lor dacă c>d și suma
inverselor, dacă c=d.
 */