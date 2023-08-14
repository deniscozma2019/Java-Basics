package Interview.Topic5.Arrays.OneDimensionals;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Ex {
    public static void main(String[] args) {

        String s = new String("Hello");
        String s1 = "Hello";

        int [] numbers = new int[5]; // massivu numbers ---> array
        int [] numbers1 = {1,2,3,4,5};
        System.out.println(numbers[0]);

        for (int i = 0; i<numbers.length; i++){
         numbers[i] =i*10;
         System.out.println(numbers[i]);
        }

       /* for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }*/

        System.out.println();
        for (int i = 0; i< numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
    }
}
