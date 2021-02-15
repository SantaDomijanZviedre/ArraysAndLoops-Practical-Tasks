package com.company;

public class Assignment2LoopsXX {

    public static void main(String[] args) {
        int[] arrayTenElements = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        System.out.println(analyseArray(arrayTenElements));
    }

    //this is good for exercise how to check Array with several methods at once
    // but it does not function as original task

    public static int analyseArray(int[] arrayTenElements) {
        int oddCounter = 0;
        for (int num : arrayTenElements) {
            negativeElements(num);          // does not print out all negative elements, just the first one
            oddElements(num); //oddCounter +=
            countOddElements(num); // does not print out countOdd
        }
        return oddCounter++; // asks for int Method and does not allow void
        //System.out.println(oddCounter); // asks for return or requests int
    }

    public static void negativeElements(int num) {

        if (num < 0)
            System.out.println(num);
    }

    public static void oddElements(int num) {

        if (num % 2 != 0)
            System.out.println(num);
    }

    public static int countOddElements(int num) { // would make sense if this would be used as soon
                                                // as oddElement is found, using oddElements Method
        //int countOdd = 0;
        if (num % 2 != 0) {
            //      countOdd++;
            return 1;
        }
        return 0;
    }
}