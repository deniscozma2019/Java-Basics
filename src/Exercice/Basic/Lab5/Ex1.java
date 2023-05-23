package Exercice.Basic.Lab5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul natural n ");
        int n = scanner.nextInt();
        int aparatii = 0;
        int cifra;

        while (n >0){
            cifra = n%10;

            if (cifra==7){
                aparatii+=1;
            }
            n /= 10;
            System.out.println("Cifra 7 apare de "+""+""+aparatii+""+"ori în numărul dat");
        }
    }
}


/*
Se dă un număr natural. Să se elaboreze un program care să numere de câte ori se
găsește cifra 7 în numărul natural dat.
* */

