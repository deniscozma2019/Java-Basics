import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        if (num==1) {
            System.out.println("este egal cu unu");
            }
        else{
            System.out.println("nu este egal cu unu");
        }
    }
}