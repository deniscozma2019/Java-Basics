package Interview.Topic3.Bitwise_Operators;

public class Xor {
    public static void main(String[] args) {
        int a = 555;
        int b = 147;

        System.out.println("a^b=" +(a^b));
    }

    /*The expression a^b is equal to 696 because the ^ operator in Java is the bitwise XOR operator.
     The bitwise XOR operator returns 1 if the two operands have different bits, and 0 if the two operands have the same bits.
     In this case, the value of a is 555, which is 010100111101 in binary. The value of b is 147, which is 01001001011 in binary.
     So, the expression a^b is equivalent to the following: 010100111101 ^ 01001001011 = 000110101010
            This is 696 in binary, which is why the output of the program is 696.

            Here is a table of the bitwise XOR operator in Java:

            a ^ b | Result
            ---|---|
            0 ^ 0 | 0
            0 ^ 1 | 1
            1 ^ 0 | 1
            1 ^ 1 | 0
            As you can see, the bitwise XOR operator only returns 0 if the two operands are the same. In all other cases, it returns 1.
                * */

/*Expresia a^b este egală cu 696 deoarece operatorul ^ din Java este operatorul XOR pe biți.
 Operatorul XOR pe biți returnează 1 dacă cei doi operanzi au biți diferiți și 0 dacă cei doi operanzi au aceiași biți.
  În acest caz, valoarea lui a este 555, care este 010100111101 în binar. Valoarea lui b este 147, care este 01001001011 în binar.
  Deci, expresia a^b este echivalentă cu următoarea:

010100111101 ^ 01001001011 = 000110101010
Acesta este 696 în binar, motiv pentru care rezultatul programului este 696.

Iată un tabel al operatorului XOR pe biți în Java:

a ^ b | Rezultat
---|---|
0 ^ 0 | 0
0 ^ 1 | 1
1 ^ 0 | 1
1 ^ 1 | 0
După cum puteți vedea, operatorul XOR pe biți returnează 0 numai dacă cei doi operanzi sunt aceiași. În toate celelalte cazuri, returnează 1.
*/


}
