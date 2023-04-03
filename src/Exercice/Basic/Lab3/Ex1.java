package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un caracter");
        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch)){
            System.out.println("Caracterul introdus este o litera");
        } else if (Character.isDigit(ch)) {
          System.out.println("Caracterul este un cifra");
        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') {
            System.out.println("Caracterul este un operator");
        }
        else {
            System.out.println("Caracter necunoscut");
        }
    }
}

/*    De la tastieră se introduce un caracter ch. Să se precizeze și afișeze felul
        caracterului (literă, cifră, operator). În caz dacă nu este nici unul din cele
        enumerate, să se afișeze „Caracter necunoscut”

 */
