package Exercice.Basic.Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Introduceti sirul de numere");
        Scanner scanner = new Scanner(System.in);
        // int number = scanner.nextInt();
        int result = 0;

        /*for (int i = 0; number !=0 ; i++ ){

            if (number>=100 && number<=999){
                result ++;
            }
        }*/

        int number;
        do {
            number = scanner.nextInt();

            if (number >= 100 && number <= 999) {
                result++;
            }
        }
        while (number != 0);

        System.out.println("in sirul dat de numere sunt:" + result + "" + "numere formate din 3 cifre");


    }
}

/*
    Se introduc de la tastatură un șir de numere întregi până la 0 (nenule). Să se
        elaboreze un program care determină numărul elementelor de trei cifre
*/
