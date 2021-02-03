package com.company;

import java.util.Enumeration;

public class Assignment2Loops {

    public static void main(String[] args) {

        int[] arrayTenElements = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        negativeElements(arrayTenElements);
        oddElements(arrayTenElements);
        countOddElements(arrayTenElements);
        samValueElements(arrayTenElements);
        eachSecondElement(arrayTenElements);
        averageValueOfArray(arrayTenElements);
        smallerThanAverage(arrayTenElements);
    }

    public static void negativeElements(int[] arrayTenElements1) {

        System.out.println("Negative elements of array: ");
        for (int num : arrayTenElements1) {
            if (num < 0)
                System.out.println(num);
        }
    }

    public static void oddElements(int[] arrayTenElements2) {

        System.out.println("Odd elements of array: ");
        for (int num : arrayTenElements2) {
            if (num % 2 != 0)
                System.out.println(num);
        }
    }

    public static void countOddElements(int[] arrayTenElements3) {

        System.out.println("Count of Odd elements of array: ");

        int countOdd = 0;
        for (int num : arrayTenElements3) {
            //countOdd += Math.abs(num % 2);
            if (num % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println(countOdd);
    }

    public static void samValueElements(int[] arrayTenElements4) {

        int i;
        int j;
        for(i = 0; i < arrayTenElements4.length; i++) {

            for(j = i+1; j < arrayTenElements4.length; j++) {
                if(arrayTenElements4[i]==arrayTenElements4[j])
                {
                    System.out.println("There are the following elements with same value: " + arrayTenElements4[i]);
                    //return; (if need to stop when the first match is found)
                }
            }
        }
    }

    public static void eachSecondElement(int[] arrayTenElements5) {

        System.out.println("Each second element of array: ");
        for (int i = 0; i < arrayTenElements5.length; i = i + 2) {
            System.out.println(arrayTenElements5[i]);
        }
    }

    public static double averageValueOfArray(int[] arrayTenElements6) {

        int sumAll = 0;
        int i;
        for (i = 0; i < arrayTenElements6.length; i++) {
            sumAll = sumAll + arrayTenElements6[i];
        }
        //System.out.println("Average value of array is: " + sumAll/arrayTenElements6.length);
        return ((double) sumAll) /arrayTenElements6.length; // force division to double

    }

    public static void smallerThanAverage(int[] arrayTenElements7) {

        int countSmallerAvg = 0;
        int i;
        double avg = averageValueOfArray(arrayTenElements7); //
        for (i = 0; i < arrayTenElements7.length; i++) {

            if (arrayTenElements7[i] < avg) {
                countSmallerAvg++;
            }
        }
        System.out.println("There are " + countSmallerAvg + " elements smaller than average.");
    }
}

