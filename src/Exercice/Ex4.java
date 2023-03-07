package Exercice;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
       int num ;
        int second=0;
        int fird=0;
        int four=0;
        int result = 0;
        int a;
        int first;
        int resultsecond;
        int resultfird;
        int resultfour;

       System.out.println("Introduceti numarul format din 4 cifre");
        Scanner input = new Scanner(System.in);
        num =input.nextInt();
        first = num/1000;
        System.out.println("Variabila 1 este egala cu="+first);
        second= num/100;
        resultsecond= second%10;
        System.out.println("Variabila 2 este egala cu="+resultsecond);
        fird=num/10;
        resultfird= fird%10;
        System.out.println("Variabila 3 este egala cu="+resultfird);
        four=num%10;
        resultfour= four;
        System.out.println("Variabila 4 este egala cu="+resultfour);
//a.Pentru a obține numărul obținut prin schimbarea primei cifre cu ultima,
// trebuie să interschimbăm cifrele a și d, astfel încât să obținem numărul dcba. Acest lucru poate fi realizat astfel:
        result = result*1000 + resultsecond*100 + resultfird*10 + resultfour;
        a = resultfour*1000 + resultsecond*100 + resultfird*10 + result;
        System.out.println("Rezultatul exercitiului a este urmatorul="+a);






    /*    num = input.nextInt();
        first=input.nextInt();
        second=input.nextInt();
        first=input.nextInt();
        four=input.nextInt();

        num = first*1000+second*100 + fird*10 + four;
        result = four*1000+second*100+fird*10+first;
        System.out.println("Rezultatul interschimbarii este="+result);
        */
    }

}
