package Exercice.Basic.Lab2.IF_Else;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int x, sorted_x = 0, max_num = 0, digit, i, j;
        System.out.println("Introduceți un număr natural cu exact 3 cifre:");
        Scanner number = new Scanner(System.in);
        x = number.nextInt();
        if (x < 100 || x > 999) {
            System.out.println("Introduceți un număr natural cu exact 3 cifre!\n");
        }
        else {
            // Sortăm cifrele numărului dat în ordine descrescătoare
            for (i = 0; i < 3; i++) {
                digit = x % 10;
                sorted_x = sorted_x * 10 + digit;
                x /= 10;
            }
            for (i = 9; i >= 0; i--) {
                int temp = sorted_x, new_num = 0;
                for (j = 0; j < 3; j++) {
                    digit = temp % 10;
                    if (digit == i) {
                        new_num = new_num * 10 + digit;
                    }
                    temp /= 10;
                }
                if (new_num > max_num) {
                    max_num = new_num;
                }
            }
    }
        System.out.print("Cel mai mare număr care are aceleași cifre ca " + x + " este " + max_num);

    }
}

