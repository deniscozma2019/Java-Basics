package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nota pentru purtarea elevului");
        int nota = scanner.nextInt();
        if (nota>10){
            System.out.println("nu ati introdus nota corect");
        }

        switch (nota){
            case 1:
                System.out.println("Nota este nesatisfacatoare");
                break;
            case 2:
                System.out.println("Nota este nesatisfacatoare");
                break;
            case 3:
                System.out.println("Nota este nesatisfacatoare");
                break;
            case 4:
                System.out.println("Nota este nesatisfacatoare");
                break;
            case 5:
                System.out.println("Nota este satisfacatoare");
                break;
            case 6:
                System.out.println("Nota este satisfacatoare");
                break;
            case 7:
                System.out.println("Nota este buna");
                break;
            case 8:
                System.out.println("Nota este buna");
                break;
            case 9:
                System.out.println("Nota este exemplara");
                break;
            case 10:
                System.out.println("Nota este exemplara");
                break;
        }
    }



  /*  Se introduce un număr din intervalul 1..10 care reprezintă nota la purtare a elevului.
    Să se afișeze caracterizarea verbală a notei (1..4 - nesatisfăcătoare; 5, 6 -
    satisfăcătoare; 7, 8 - bună; 9, 10 - exemplară)*/
}
