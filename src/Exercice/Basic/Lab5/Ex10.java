package Exercice.Basic.Lab5;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Introduceti numarul");
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();
        int cifra_inferioara = 9;  // Presupunem inițial că cifra maximă este 9
        int cifra_superioara = 0;
        int cifra;

        while (num>0){
            cifra = num % 10;  // Obținem ultima cifră a numărului
            if (cifra < cifra_inferioara) {
                cifra_inferioara = cifra;  // Actualizăm cifra de ordin inferior
            }
            if (cifra > cifra_superioara) {
                cifra_superioara = cifra;  // Actualizăm cifra de ordin superior
            }
            num = num / 10;  // Eliminăm ultima cifră din număr
        }
        System.out.println("\"Cifra de ordin inferior: "+cifra_inferioara);
        System.out.println("Cifra de ordin superior:"+ cifra_superioara);
        }



    }
/*Se introduce un număr natural n. Să se elaboreze un program care determină cifra de
ordin inferior și superior a unui număr introdus de la tastatură
* */