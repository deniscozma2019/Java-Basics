package Exercice.Basic.Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int ani, zile,luni,ore;
        Scanner input = new Scanner(System.in);
        System.out.println("introduceti numarul de ani");
        ani= input.nextInt();

        luni=ani * 12;
        zile = ani * 365;
        ore = zile * 24;
        System.out.println(ani + " ani echivalează cu:");
        System.out.println(luni + " luni");
        System.out.println(zile + " zile");
        System.out.println(ore + " ore");
    }
}
