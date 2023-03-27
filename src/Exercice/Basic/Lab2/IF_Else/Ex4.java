package Exercice.Basic.Lab2.IF_Else;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int a ,b;
        System.out.println("introduceti prima cifra");
        Scanner unu = new Scanner(System.in);
        a = unu.nextInt();

        System.out.println("introduceti a 2 a cifra");
        Scanner doi = new Scanner(System.in);
        b = doi.nextInt();

            System.out.println(": Ce doriți să calculați");
            System.out.println("1- media aritmetică");
            System.out.println("2- media geometrică");
            System.out.println("Raspunsul dumneavoastra");

        Scanner x = new Scanner(System.in);
        int rezultat = x.nextInt();
        if(rezultat == 1){
          double media =(a+b)/2;
          System.out.println("Media aritmetica a numerelor este"+media);
        }
       else if (rezultat ==2){
            if(a > 0 && b > 0) {
                double media = Math.sqrt(a * b);
                System.out.println("Media geometrica a numerelor este \n"+ ""+a+""+""+b+""+ media);
            }
            else {
                System.out.println("Nu se poate calcula media geometrica pentru numerele introduse.\n");
            }

        }
        else {
            System.out.println("Raspuns incorect.\n");
        }
    }
}
