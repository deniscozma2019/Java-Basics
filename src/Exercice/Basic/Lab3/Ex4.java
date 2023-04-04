package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul lunei");
        int month=scanner.nextInt();
        if (month == 1){
            System.out.println("Luna Ianuarie, anotimpul Iarna");
        } else if (month==2) {
            System.out.println("Luna Februare,anotimpul Iarna");
        } else if (month==3) {
            System.out.println("Luna Martie, anotimpul primavara");
        } else if (month==4) {
            System.out.println("Luna Aprilie, anotimpul primavara");
        } else if (month==5) {
            System.out.println("Luna Mai, anotimpul primavara");
        } else if (month==6) {
            System.out.println("Luna iunie, anotimpul vara");
        } else if (month==7) {
            System.out.println("Luna Iulie, anotimpul vara");
        } else if (month==8) {
            System.out.println("Luna august, anotimpul vara");
        } else if (month==9) {
            System.out.println("Luna septembrie anotimpul toamna");
        } else if (month==10) {
            System.out.println("Luna octombrie anotimpul toamna");
        } else if (month==11) {
            System.out.println("Luna noiembrie anotimpul toamna");
        } else if (month==12) {
            System.out.println("Luna decembrie anotimpul iarna");
        }
        else{
            System.out.println("Introduceti luna corect");
        }


    }

////    De la tastieră se introduce numărul lunii anului. Să se afișeze anotimpul căruia îi
//    aparține luna corespunzătoare.
}
