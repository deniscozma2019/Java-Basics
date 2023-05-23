package Exercice.Basic.Lab5;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int numar;
        int cifra;
        int CifraPara = 0;
        int CifraImpara = 0;
        System.out.println("Introduceti numarul: ");
        Scanner scanner = new Scanner(System.in);
        numar = scanner.nextInt();

            while (numar>0){
                cifra= numar %10;// Obținem ultima cifră a numărului
                if (cifra%2==0){
                    CifraPara++;
                }
                else {
                    CifraImpara++;
                }
                numar = numar/10;// Eliminăm ultima cifră din număr
        }
            System.out.println("Cifre pare sunt= "+""+CifraPara);
            System.out.println("Cifre impare sunt=" +""+CifraImpara);
    }


   /* 6. Să se elaboreze un program care afișează câte cifre pare și câte impare are un număr
    întreg*/
}


/*
avem un numar
n= 978;

* */
