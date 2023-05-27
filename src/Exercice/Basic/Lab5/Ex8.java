package Exercice.Basic.Lab5;

import java.util.Scanner;
import java.util.Objects;

public class Ex8 {
    public static void main(String[] args) {
        int numar_de_schimbari = 0;
        Integer semn_anterior = null;
        int num;

        while (true) {
            System.out.println("Introduceți un număr întreg (0 pentru a încheia): ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (semn_anterior != null && num * semn_anterior < 0) {
                numar_de_schimbari++;
            }
            semn_anterior = Objects.nonNull(semn_anterior) ? semn_anterior : (num > 0 ? 1 : -1);
        }
        System.out.println("Numărul de schimbări de semn în secvență este: " + numar_de_schimbari);
    }
}


/*8. Se introduc numere întregi până la introducerea lui 0. Să se elaboreze un program
care determină de câte ori se schimbă semnul.*/
