package Exercice;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[]args){
        int S = 0;
        int P = 0;
        int termen = 0;
        int Suma = 0;
        System.out.println("Introduceti suma de bani");
        Scanner input =new Scanner(System.in);
        S= input.nextInt();
        System.out.println("suma de bani este egala cu = "+S);

        System.out.println("Introduceti suma procentului");
        Scanner procent =new Scanner(System.in);
        P= input.nextInt();
        System.out.println("Suma procentului este egala cu = "+P);

        System.out.println("Introduceti termenul");
        Scanner termnul =new Scanner(System.in);
        termen= input.nextInt();
        System.out.println("termenul este egal cu = "+termen);

        Suma = (S*P*termen)/100;
        System.out.println("Dobinda este egala cu  = "+Suma);
    }
}
