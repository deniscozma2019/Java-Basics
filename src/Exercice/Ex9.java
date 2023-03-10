package Exercice;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[]args){
        int p;
        int l;
        int s;
        System.out.println("dati aria patratului");
        Scanner aria =new Scanner(System.in);
        s = aria.nextInt();
        l = ((int) Math. sqrt(s));
        System.out.println("Latura este egala cu"+"\s"+l);
        p=4*l;
        System.out.println("Perimetrul este egal cu"+"\s"+p);

    }
}
