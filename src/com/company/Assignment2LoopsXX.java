package com.company;

public class Assignment2LoopsXX {

    public static void main(String[] args)
    {
        int[] arrayTenElements = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        int[] arrayTen = arrayTenElements;

        analyseArray();
    }

    public static int analyseArray(int negativeElements, int oddElements, int countOddElements,
                                   int sameValueElements, int eachSecondElement, int averageValueOfArray,
                                   int smallerThanAverage)
    {
        int arrayTenElements = 0;

        for (int arrayTen[] : arrayTenElements)
        {
            negativeElements(arrayTen);
            oddElements(arrayTen);
            countOddElements(arrayTen);
            sameValueElements(arrayTen);
            eachSecondElement(arrayTen);
            averageValueOfArray(arrayTen);
            smallerThanAverage(arrayTen);
        }
        return negativeElements;
        return oddElements;
        return countOddElements;
        return sameValueElements;
        return eachSecondElement;
        return averageValueOfArray;
        return smallerThanAverage;
    }

    public static void negativeElements(int[] arrayTen) {

        System.out.println("Negative elements of array: ");
        for (int num :  arrayTen) {
            if (num < 0);
            System.out.println(num);
        }
        //return num;
    }

    public static void oddElements(int[] arrayTen) {

        System.out.println("Odd elements of array: ");
        for (int num : arrayTen) {
            if (num % 2 != 0)
                System.out.println(num);
        }
    }

    public static void countOddElements(int[] arrayTen) {

        System.out.println("Count of Odd elements of array: ");

        int countOdd = 0;
        for (int num : arrayTen) {
            //countOdd += Math.abs(num % 2);
            if (num % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println(countOdd);
    }

    public static void sameValueElements(int[] arrayTen) {

        int i;
        for(i = 0; i < arrayTen.length; i++) {
            int j;
            for(j = i+1; j < arrayTen.length; j++) {
                if(arrayTen[i]==arrayTen[j])
                {
                    System.out.println("There are the following elements with same value: " + arrayTen[i]);
                    //return; (if need to stop when the first match is found)
                }
            }
        }
    }

    public static void eachSecondElement(int[] arrayTen) {

        System.out.println("Each second element of array: ");
        for (int i = 0; i < arrayTen.length; i = i + 2) {
            System.out.println(arrayTen[i]);
        }
    }

    public static double averageValueOfArray(int[] arrayTen) {

        int sumAll = 0;
        int i;
        for (i = 0; i < arrayTen.length; i++) {
            sumAll = sumAll + arrayTen[i];
        }
        //System.out.println("Average value of array is: " + sumAll/arrayTenElements6.length);
        return ((double) sumAll) /arrayTen.length; // force division to double

    }

    public static void smallerThanAverage(int[] arrayTen) {

        int countSmallerAvg = 0;
        int i;
        double avg = averageValueOfArray(arrayTen); //
        for (i = 0; i < arrayTen.length; i++) {

            if (arrayTen[i] < avg) {
                countSmallerAvg++;
            }
        }
        System.out.println("There are " + countSmallerAvg + " elements smaller than average.");
    }
}
