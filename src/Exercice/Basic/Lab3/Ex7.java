package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        int number = scanner.nextInt();
        int sute = number/100;
        int zeci = (number/10)%10;
        int unitati =  number%10;
        String[] nume_sute = {"", "o suta", "doua sute", "trei sute", "patru sute", "cinci sute", "sase sute", "sapte sute", "opt sute", "noua sute"};
        String[] nume_zeci = {"", "", "douazeci", "treizeci", "patruzeci", "cincizeci", "saizeci", "saptezeci", "optzeci", "nouazeci"};
        String[] nume_unitati = {"", "unu", "doi", "trei", "patru", "cinci", "sase", "sapte", "opt", "noua"};

        if (sute != 0) {
            System.out.print(nume_sute[sute] + " ");
        }
        if (zeci == 1){
            System.out.println("zeci" + nume_unitati[unitati]);
        } else  {
            System.out.println(nume_zeci[zeci]+ " "+ nume_unitati[unitati]);
        }

    }
}
