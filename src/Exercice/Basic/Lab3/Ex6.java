package Exercice.Basic.Lab3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner one = new Scanner(System.in);
        System.out.println("Introduceti marimea segmentului");
        double segment = scanner.nextDouble();
        System.out.println("Introduceti numarul unitati de masura: \n 1-dm \n 2-km \n 3-m \n 4-mm \n 5-cm");
        double unitate = one.nextDouble();
        System.out.println("Unitatea pe care ati aleso este "+""+unitate);

        double result;
        String numeUnitate;

        switch ((int) unitate){
            case 1:
                 numeUnitate = "decimetri";
                result = segment/10;
                System.out.println("Lungimea segmentului in metri este ="+""+ result);
                break;
            case 2:
                numeUnitate = "kilometri";
                result = segment*1000;
                System.out.println("Lungimea segmentului in metri este ="+""+ result+""+numeUnitate);
                break;
            case 3:
                numeUnitate = "metri";
                result = segment;
                System.out.println("Lungimea segmentului in metri este ="+""+ result+""+numeUnitate);
                break;
            case 4:
                numeUnitate = "milimetri";
                result = segment/1000;
                System.out.println("Lungimea segmentului in metri este ="+""+ result+""+numeUnitate);
                break;
            case 5 :
                numeUnitate = "centimetri";
                result = segment/100;
                System.out.println("Lungimea segmentului in metri este ="+""+ result+""+numeUnitate);
                break;
            default:
                System.out.println("Ati introdus o valoare neasteptata!");
                return;
        }
    }


//    Unitățile de măsură a lungimii se numerotează în felul următor: 1 - dm, 2 - km, 3 -
//    m, 4 - mm, 5 - cm. Se introduce lungimea segmentului și numărul unității de
//    măsură. Să se afișeze lungimea segmentului în metri
}
