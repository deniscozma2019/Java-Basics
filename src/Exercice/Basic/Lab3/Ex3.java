package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter;
        System.out.println("Introduceti litera");
        letter= scanner.next().charAt(0);
        letter = Character.toLowerCase(letter);
   if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' /*|| letter == 'A' || letter == 'E' || letter == 'I' || letter == 'U' || letter == 'O'*/) {
            System.out.println("Litera introdusa este Vocala");
      }

        else if (Character.isDigit(letter)){
            System.out.println("A fost introdusa o cifra va rog introduceti o litera");
            return;
        } else if (letter == '+' || letter == '-' || letter == '*' || letter == '/' || letter == '=') {
            System.out.println("Caracterul este un operator");
        }
        else {
            System.out.println("Litera introdusa este o consoana");
        }
    }
}

//    Să se elaboreze un program care determină dacă caracterul citit de la tastieră este
//    vocală sau consoană
