package com.company;

public class Assignment1Loops {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 7, 6, 2, 8};
        forLoop(arr);
        forEachLoop(arr);
        whileLoop(arr);
        doWhileLoop(arr);
    }

    public static void forLoop(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("FOR Loop: " + i + "[" + array[i] + "]");
        }
    }

    public static void forEachLoop(int[] array1) {

        for (int tempVar : array1) {
            System.out.println("For EACH Loop: " + tempVar);
        }
        //array1[1]=42; experiment
    }

    public static void whileLoop(int[] array2) {

        int i = 0;
        while(i < array2.length) {
            System.out.println("WHILE Loop: " + array2[i]);
            i++;
        }
    }

    public static void doWhileLoop(int[] array3) {

        int i = 0;
        do {
            System.out.println("DO WHILE Loop: " + array3[i]);
            i++;
        } while(i < array3.length);
    }
}