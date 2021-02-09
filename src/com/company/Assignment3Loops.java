package com.company;

import java.util.Scanner;

public class Assignment3Loops {

    public static void main(String[] args) {

        byte[] inputGrades = getInputGrades(10);

        System.out.println("\nNumber of students who failed: " + howManyFailed(inputGrades));
        System.out.println("\nNumber of students who got A: " + howManyA(inputGrades));

        System.out.println("\nHISTOGRAM of grade frequencies: ");
        byte[] gradeCount = histogram(inputGrades);
        for (int grade = 0; grade < gradeCount.length; grade++) {
            System.out.println("\n" + gradeCount[grade] + " students with the grade " + grade);
        }
    }

    public static byte[] getInputGrades(int numGrades) {

        Scanner arrayInput = new Scanner(System.in);

        byte[] inputGrade = new byte[numGrades];
        System.out.println("Enter 10 elements of array (input values should be numbers between 0 and 10): ");
        for (int i = 0; i < inputGrade.length; i++) {
            short num;
            do {
                if (!arrayInput.hasNextShort()) {
                    System.out.println("That's not a number!");
                    arrayInput.next();
                } else {
                    num = arrayInput.nextShort();
                    if (num >= 0 && num <= 10) {
                        inputGrade[i] = (byte) num;
                        break;
                    } else {
                        System.out.println("Please enter a number between 0 and 10!");
                    }
                }
            } while (true);
        }
        return inputGrade;
    }

    public static int howManyFailed(byte[] grades) {

        int countFailed = 0;
        for (int num : grades) {
            if (num < 4) {
                countFailed++;
            }
        }
        return countFailed;
    }

    public static int howManyA(byte[] grades) {

        int countA = 0;
        for (int num : grades) {
            if (num == 10) {
                countA++;
            }
        }
        return countA;
    }

    public static byte[] histogram(byte studentGrades[]) {

        byte[] gradeCount = new byte[11];
        for (int i = 0; i < studentGrades.length; i++) {
            gradeCount[studentGrades[i]]++;
        }
        return gradeCount;
    }
}
//https://medium.com/datadriveninvestor/computing-histograms-using-java-arrays-7f81e08ed602
