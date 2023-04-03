package Exercice.Basic.Lab2.IF_Else;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar real X: ");
        double x = scanner.nextDouble();
        double result;
        if (x<-3){
            result = x*x + 1;
        } else if (x >= -3 && x <= 3) {
            result = x - 2;
        }
        else {
            result = 2*x*x - 5*x + 1;
        }
        System.out.println("Valoarea functiei pentru X = " + x + " este: " + result);

    }

}
