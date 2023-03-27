package Exercice.Basic.Lab1;

import java.util.Scanner;

public class exx {
    public static void main(String[] args){
     int x;
     int y;
        System.out.println("Introduceți numarul");
        Scanner input = new Scanner(System.in);
        x=input.nextInt();
        int a = x / 1000;    // cifra de pe poziția a mii
        int b = (x / 100) % 10;    // cifra de pe poziția sutelor
        int c = (x / 10) % 10;    // cifra de pe poziția zecilor
        int d = x % 10;
        y = d*1000 + b*100 + c*10 + a;
        System.out.println("Rezultatul schimbari primei cifre cu ultima este egal cu =  "+y);
        // Schimbăm cifrele din mijloc
        int Y2 = a * 1000 + c * 100 + b * 10 + d;
        System.out.println("Numărul obținut prin schimbarea cifrelor din mijloc este: " + Y2);

        // Înlocuim cifrele din mijloc cu doi de 0
        int Y3 = a * 1000 + 0 * 100 + 0 * 10 + d;
        System.out.println("Numărul obținut prin înlocuirea cifrelor din mijloc cu doi de 0 este: " + Y3);
    }
}
