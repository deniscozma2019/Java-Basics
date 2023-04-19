package Exercice.Basic.Lab4;

import java.net.SocketOption;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

            for (int i=10; i<100; i++){
                if (i % 10 == 0 || i % 10 % 3 != 0){
                    System.out.println("Rezultatul este egal cu " + ""+i);
            }
        }
    }
}

/*
* Să se elaboreze un program care afișează numerele de două cifre care au ultima cifră
divizibilă cu 3*/
