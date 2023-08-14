package Interview.Topic4.Loops.ForEach;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Ex {
    public static void main(String[] args) {
       /* int [] numbers = new int[5];
        numbers [0] = 5;
        numbers [1] = 10;
        numbers [2] = 15;
        numbers [3] = 20;
        numbers [4] = 25;*/
     //   System.out.println(numbers[0]);
        String [] strings = new String[3];
        strings [0] = "Hi";
        strings [1] = "How are you";
        strings [2] = "Goodbye";
      //  System.out.println("1: "+ strings[0] + " 2:" + strings[1] + " 3:" + strings[2]);

       /* for (int i = 0;  i<numbers.length; i++){
            System.out.println(numbers[i]);

            for obisnuit
        }*/


        for (String string:strings){
            System.out.println(string);
        }
        /*
        forEach
        * */

        int []  numbers = {1, 2, 3, 4, 5 };
        int sum = 0 ;
        for ( int number:numbers){
            sum = sum+number;
        }
        System.out.println("rezultatul este egal cu: " + sum);
}

}
