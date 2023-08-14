package Interview.Topic4.Loops.DoWhile;

import java.util.Scanner;

public class Ex {

    public static void main(String[] args) {
        System.out.println("Introdu Cifra 5");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        do {
            System.out.println("Introdu  5");
            a = scanner.nextInt();
        }
        while (a!=5);
        System.out.println("Ai introdus 5");


}
}
// Ciclul do while lucreaza cel putin odata, apoi se verifica conditia,
// apoi bucata de cod se indeplineste pina la momentul cind conditia satisface cerintei
/*Acesta diferă de bucla while clasică, deoarece în do-while blocul de cod este executat înainte de evaluarea condiției.
Într-o buclă while obișnuită, condiția este verificată înainte de a intra în buclă,
astfel că blocul de cod poate să nu fie executat deloc dacă condiția nu este inițial îndeplinită.
 * */
