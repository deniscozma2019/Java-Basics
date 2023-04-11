package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Selectati operatia care doriti sa o efectuati \n 1. suma\n" + "2. produs");
        Scanner scanner = new Scanner(System.in);
        double choise = scanner.nextInt();
        System.out.println("Operatorul ales este "+""+choise);

        System.out.println("Introduceti primul numar");
        Scanner unu = new Scanner(System.in);
        double a = unu.nextDouble();
        System.out.println("Introduceti al doilea numar numar");
        Scanner doi = new Scanner(System.in);
        double b = doi.nextDouble();
        double result ;


        if (choise == 1) {
            result = a + b;
            System.out.println("Rezultatul operatiei este egal cu " + "" + "=" + result);
        } else if (choise == 2) {
            result = a / b;
            System.out.println("Rezultatul operatiei este egal cu" + "" + "" + result);
        } else {
            System.out.println("dvs nu ati ales corect operatia incercati din nou");
        }
    }
}






   /* Scrieți un program care să permită alegerea unei opțiuni dintr-un anumit meniu
        afișat pe ecran: se afișează meniul:
        1. suma
        2. produs
        Apoi se introduc două numere şi se alege o operație din meniu prin introducerea
        numărului de ordine. Pe ecran să se afișeze expresia şi valoarea calculată.*/
