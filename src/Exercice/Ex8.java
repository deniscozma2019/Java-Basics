package Exercice;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[]args) {
        int V1 ,V2;
        int T;
        int S;
        System.out.println("Introduceti viteza Marinei");
        Scanner marina =new Scanner(System.in);
        V1= marina.nextInt();
        System.out.println("Viteza marinei este egala cu = "+V1);

        System.out.println("Introduceti viteza Valentina");
        Scanner valentina =new Scanner(System.in);
        V2= valentina.nextInt();
        System.out.println("Viteza marinei este egala cu = "+V2);

        System.out.println("Introduceti distanta dintre marina si valentina");
        Scanner distance =new Scanner(System.in);
        S= distance.nextInt();
        System.out.println("Distanta este egala cu = "+S);

        T = S / (V1 + V2);
        System.out.println("Timpul in care se vor intilni este  egal cu = "+T);


    }
}
