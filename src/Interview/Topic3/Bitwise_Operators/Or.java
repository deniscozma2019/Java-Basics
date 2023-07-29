package Interview.Topic3.Bitwise_Operators;

public class Or {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;

        System.out.println("a|b=" + (a|b) );

    }


    /*The expression a|b is equal to 15 because the | operator in Java is the bitwise OR operator.
    The bitwise OR operator returns 1 if either or both of the operands are 1, and 0 if both operands are 0. In this case, the value of a is 5, which is 00000101 in binary.
     The value of b is 15, which is 00001111 in binary. So, the expression a|b is equivalent to the following:
     00000101 | 00001111 = 00001111

    This is 15 in binary, which is why the output of the program is 15.

    Here is a table of the bitwise OR operator in Java:
    a | b | Result
    ---|---|---|
    0 | 0 | 0
    0 | 1 | 1
    1 | 0 | 1
    1 | 1 | 1
As you can see, the bitwise OR operator only returns 0 if both operands are 0. In all other cases, it returns 1.
    * */

/*    Expresia a|b este egală cu 15 deoarece '|' operatorul în Java este operatorul OR pe biți.
    Operatorul SAU pe biți returnează 1 dacă unul sau ambii operanzi sunt 1 și 0 dacă ambii operanzi sunt 0. În acest caz, valoarea lui a este 5, care este 00000101 în binar.
    Valoarea lui b este 15, care este 00001111 în binar.
    Deci, expresia a|b este echivalentă cu următoarea: 00000101 | 00001111 = 00001111
Acesta este 15 în binar, motiv pentru care rezultatul programului este 15.
Iată un tabel al operatorului OR pe biți în Java:
a | b | Rezultat
---|---|---|
0 | 0 | 0
0 | 1 | 1
1 | 0 | 1
1 | 1 | 1

    */


}
