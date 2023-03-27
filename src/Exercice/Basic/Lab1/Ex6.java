package Exercice.Basic.Lab1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[]args){
        int mihai = 0,nicolae;
        System.out.println("Introduceti Virsta lui Mihai");
        Scanner input= new Scanner(System.in);
        mihai= input.nextInt();
        System.out.println("Virsta lui mihai este egala cu ="+""+mihai+"\s"+"ani");

        System.out.println("Introduceti Virsta lui Nicolae");
        Scanner age= new Scanner(System.in);
        nicolae= age.nextInt();
        System.out.println("Virsta lui mihai este egala cu ="+""+nicolae+"\s"+"ani");

        int virstaMedie,diferenta;
        virstaMedie= (mihai+nicolae)/2;
        System.out.println("Virsta medie este egala cu ="+"\s"+virstaMedie);

        diferenta = Math.abs(nicolae-mihai);
        System.out.println("diferenta este egala cu ="+"\s"+diferenta);

    }
}
