package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] santasArray = new int[]{5, 3, 7, 6, 2, 8};
        forLoop(santasArray);
        forEachLoop(santasArray);
        whileLoop(santasArray);
        doWhileLoop(santasArray);
    }

    public static void forLoop(int[] santasArray) {

        for (int i = 0; i < santasArray.length; i++) {
            System.out.println("FOR Loop: " + i + "[" + santasArray[i] + "]");
        }
    }

    public static void forEachLoop(int[] santasArray1) {

        for (int tempVar : santasArray1) {
            System.out.println("For EACH Loop: " + tempVar);
        }
        //santasArray1[1]=42; experiment
    }

    public static void whileLoop(int[] santasArray2) {

        int i = 0;
        while(i < santasArray2.length) {
            System.out.println("WHILE Loop: " + santasArray2[i]);
            i++;
        }
    }

    public static void doWhileLoop(int[] santasArray3) {

        int i = 0;
        do {
            System.out.println("DO WHILE Loop: " + santasArray3[i]);
            i++;
        } while(i < santasArray3.length);
    }
}