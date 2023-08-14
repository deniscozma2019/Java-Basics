package Exercice.Basic.Lab6;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(CMMDC(4,20));
        System.out.println(CMMMC(4,10,25,58));
    }



    public static double CMMDC(double n , double m){
        while (m != 0){
            double r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    public static double CMMMC(double a , double b, double r, double p){
        r=a%b;p=a*b;

        while(r!=0)
        {
            a=b;
            b=r;
            r=a%b;
        }
        return p/b;
    }

}
