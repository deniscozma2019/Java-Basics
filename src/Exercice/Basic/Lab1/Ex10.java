package Exercice.Basic.Lab1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[]args){
        int R;
        int W;
        int sumaUnu;
        int sumaDoi;
        int sumaTrei;
        // introducem suma de bani
        System.out.println("introduceti suma de bani");
        Scanner r =new Scanner(System.in);
        R = r.nextInt();
        System.out.println("Suma initiala de bani este"+"\s"+R);
        //introducem procentul
        System.out.println("introduceti procentul");
        Scanner w =new Scanner(System.in);
        W = w.nextInt()/100;
        System.out.println("Procentul este egal cu"+"\s"+W);

        //Calulam benefitul peste 3 luni
        sumaUnu = R*(W/4);
        System.out.println("beneficiul pe 3 luni este egal cu"+"\s"+sumaUnu);
    }
}
