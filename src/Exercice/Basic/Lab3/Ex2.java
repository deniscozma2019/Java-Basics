package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti ziua");
        int decada = scanner.nextInt();
        if (decada < 1 || decada> 31){
            System.out.println("Introduceti ziua corect");
            return;
        }
        if(decada<=10 ){
            System.out.println("Ziua face parte din decada 1");
        }
        if(decada<=20 ){
            System.out.println("Ziua face parte din decada 2");
        }
        if(decada<=30 ){
            System.out.println("Ziua face parte din decada 3");
        }
        else {
            System.out.println("Ziua face parte din decada 1");
        }
    }

}
//    Afișați decada căreia îi aparține o anumită zi dintr-o lună oarecare:
//        1..10 – decada I
//        11..20 – decada II
//        21..30 – decada III
//        31 – decada I