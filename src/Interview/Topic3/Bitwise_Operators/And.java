package Interview.Topic3.Bitwise_Operators;

public class And {

    public static void main(String[] args) {
        int a = 5 ;
        int b = 7;

        System.out.println("a&b="+ (a&b));

        int a1 = 115 ;
        int b1 = 7100;
        System.out.println("a&b="+ (a1&b1));
    }

    /*
            Rezultatul compilației este 5 deoarece operatorul AND pe biți (&) returnează 1 numai dacă ambii biți sunt 1.
             În acest caz, reprezentarea binară a lui 5 este 0101 și reprezentarea binară a lui 7 este 0111.
              Când ȘI aceste două numere , obțineți 0101, care este egal cu 5 în zecimală.
    * */



}
