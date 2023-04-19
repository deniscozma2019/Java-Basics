package Exercice.Basic.Lab4;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Introduceti numarul");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <100){
            System.out.println("nu a ti introdus un numar format din 3 cifre");
        }
        else {

            for(int i = 100; i < 1000; i++){
              int number_one = i/100;
              int number_two = (i/10)%10;
              int number_three = i%10;
              int sum= number_one + number_two+number_three;

              if (sum %5==0){
                  System.out.println("numarul se divice cu 5"+""+i);
              }
            }
        }
    }
}


 /*   Să se elaboreze un program care afișează toate numerele de 3 cifre, suma cifrelor cărora este divizibilă prin 5*/