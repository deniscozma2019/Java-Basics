package Exercice.Basic.Lab1;

import java.util.Scanner;

public class Ex3 {
    /*
    Ion și Vasile joacă următorul joc: Ion spune un număr, iar Vasile trebuie să găsească
cinci numere consecutive, crescătoare, numărul din mijloc fiind cel ales de Ion. Ajutați-l
pe Vasile să găsească răspunsul mai repede.
    */
    public static void main(String[]args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("introduceti numarul");
        num=input.nextInt();
        int first=num-2;
        int second=num-1;
        int third=num;
        int four =num+1;
        int five =num+2;
        System.out.println("Cele cinci numere consecutive, crescătoare, sunt: " +
                first + " " +
                second+ " " +
                third + " " +
                four+ " " +
                five);
    }

}
