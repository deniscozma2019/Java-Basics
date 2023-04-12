package Exercice.Basic.Lab4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int natural ;
        int pare=0;
        int impare=0;
        System.out.println("Introduceti numarul natural");
        Scanner natural_number = new Scanner(System.in);
        natural = natural_number.nextInt();


            for ( int i=0; i<=natural; i++){
                if (i%2==0){
                    pare +=i;
                }
                else {
                 impare += i;
                }
       }

        if (pare == 0) {
            System.out.println("Nu exista numere pare");
        }
        else {
            float raport = (float)impare / (float)pare;
            System.out.println("Raportul dintre suma numerelor impare si suma numerelor pare este egala cu  "+""+raport);
        }



    }
}
/*
* Se citește un număr natural n . Să se elaboreze un program
care calculează și afișează raportul dintre suma numerelor impare și suma numerelor
pare.
* */
// huio znaet cum de rezolvat
