package Interview.Topic3.Bitwise_Operators;

public class Example {

    public static void main(String[] args) {

        int a = 1;
        int b = 10;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        String binary[]={
                "0000","0001","0010","0011","0100","0101",
                "0110","0111","1000","1001","1010",
                "1011","1100","1101","1110","1111"
        };

        System.out.println(" a= "+binary[a]);
        System.out.println(" b= "+binary[b]);
        System.out.println(" a|b= "+binary);
        System.out.println(" a&b= "+binary[d]);
        System.out.println(" a^b= "+binary[e]);
        System.out.println("~a & b|a&~b= "+binary[f]);
        System.out.println("~a= "+binary[g]);

    }
}
