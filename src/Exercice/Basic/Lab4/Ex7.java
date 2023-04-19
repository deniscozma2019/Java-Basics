import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pozitiveCount = 0;
        int pozitiveSum = 0;
        int negativeCount = 0;
        int negativeSum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduceti numarul " + i + ": ");
            int num = scanner.nextInt();

            if (num > 0) {
                pozitiveCount++;
                pozitiveSum += num;
            } else if (num < 0) {
                negativeCount++;
                negativeSum += num;
            }
        }

        System.out.println("Numarul de numere pozitive este " + pozitiveCount + ", iar suma lor este " + pozitiveSum);

        if (negativeCount == 0) {
            System.out.println("Nu exista numere negative.");
        } else {
            double negativeMedia = (double) negativeSum / negativeCount;
            System.out.println("Media aritmetica a numerelor negative este " + negativeMedia);
        }
    }
}
/*
* . De la tastatură se introduc 10 numere întregi. Să se elaboreze un program care
determină și afișează:
 numărul celor pozitive și suma lor,
 media aritmetică а celor negative*/
