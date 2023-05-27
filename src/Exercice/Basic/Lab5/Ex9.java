package Exercice.Basic.Lab5;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int num = 0;
        boolean contineCifraCinci = false;
        int cifra;
        System.out.println("Introduceti numarul");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while (num>0){
            cifra= num%10;

            if (cifra==5){
                contineCifraCinci = true;
                break;
            }
            num=num/10;
        }
        if (contineCifraCinci) {
            System.out.println("Numărul conține cifra 5.");
        } else {
            System.out.println("Numărul nu conține cifra 5.");
        }
    }
}


/*
* 9. Se introduce un număr natural n. Să se elaboreze un program care determină dacă în
scrierea numărului se întâlnește cifra 5.
* */
