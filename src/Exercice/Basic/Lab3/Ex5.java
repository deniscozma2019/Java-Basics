package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cifra");
        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("Unu");
                break;
            case 2:
                System.out.println("Doi");
                break;
            case 3:
                System.out.println("Trei");
                break;
            case 4:
                System.out.println("Patru");
                break;
            case 5:
                System.out.println("Cinci");
                break;
            case 6:
                System.out.println("Sase");
                break;
            case 7:
                System.out.println("Sapte");
                break;
            case 8:
                System.out.println("Opt");
                break;
            case 9:
                System.out.println("Noua");
                break;
            case 10:
                System.out.println("Zece");
                break;
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("nu ati introdus cifra corect");
        }

    }



//    Se introduce de la tastieră o cifră. Să se afișeze cuvântul ce descrie cifra introdusă
//            (pentru 0 - „zero”, „1” - unu”, etc.).

}
