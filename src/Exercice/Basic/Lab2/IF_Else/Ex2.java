package Exercice.Basic.Lab2.IF_Else;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("introduceti prima cifra");
        Scanner unu = new Scanner(System.in);
        a = unu.nextInt();

        System.out.println("introduceti a 2 a cifra");
        Scanner doi = new Scanner(System.in);
        b = doi.nextInt();

        System.out.println("introduceti a 3 a cifra");
        Scanner trei = new Scanner(System.in);
        c = trei.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triunghiul este echilateral");
            }
        } else if (a == b || a == c || b == c) {
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
                System.out.println("Triunghiul este isoscel și dreptunghic.");
            } else {
                System.out.println("Triunghiul este isoscel");
            }
        } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
            System.out.println("Triunghiul este  dreptunghic.");
        } else {
            System.out.println("Triunghiul este de oarecare");
        }
    }
}
