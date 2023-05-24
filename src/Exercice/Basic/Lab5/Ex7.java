package Exercice.Basic.Lab5;

public class Ex7 {
/*    public static void main(String[] args) {
        int number= 10;
        for(int i = 0; i<number; i++) {
            int sumanumerelor=countsum(i);
            if (i %sumanumerelor!=0 && i % sumanumerelor == 0){
                System.out.println(i + " este divizibil cu suma cifrelor sale (" + sumanumerelor + ")");
            }
        }
    }
    public static int countsum(int number) {
        int sum = 0;
        while (number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }

    *//*7. Să se elaboreze un program care citește toate numerele strict mai mici decât n și
afișează acelea care sunt divizibile cu suma cifrelor lui*//*
}*/


    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i < number; i++) {
            int sumanumerelor = countsum(i);
            if (sumanumerelor != 0 && i % sumanumerelor == 0) {
                System.out.println(i + " este divizibil cu suma cifrelor sale (" + sumanumerelor + ")");
            }
        }
    }

    public static int countsum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
