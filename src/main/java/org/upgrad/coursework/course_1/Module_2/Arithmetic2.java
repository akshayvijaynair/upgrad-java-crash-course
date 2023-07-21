package org.upgrad.coursework.course_1.Module_2;

import java.util.Scanner;
public class Arithmetic2 {
    public static void main(String[] args) {
        average();
        printDigits(2345456);
        test();
        printDigitsInSequence();
    }

    private static void average() {
        int marks1 = 20;
        int marks2 = 40;
        int marks3 = 50;

        double average = (marks1 + marks2 + marks3) / 3;
        System.out.println(average);
    }

    private static void printDigits(int value) {
        int lastDigit = value % 10;
        if (lastDigit != 0) {
            System.out.println(lastDigit);
            printDigits(value / 10);
        }
    }

    private static void test() {
        int a = 5;
        int b = 4;
        int c = 3;

        int z = a + b - c * a;

        System.out.println(z);
    }

    static int[] digits = new int[5];
    public static void printDigitsInSequence() {

        //Create new scanner
        Scanner input = new Scanner(System.in);

        //Prompt user to input 5 digit number
        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        } else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        } else if (10000 <= number && number <= 99999) {
            storeDigits(number, 4);
            for(int i=0; i<5; i++) {
                System.out.println(digits[i]);
            }
        }
    }

    private static void storeDigits(int value, int position) {
        int lastDigit = value % 10;
        if (lastDigit != 0) {
            digits[position] = lastDigit;
            storeDigits(value / 10, --position);
        }
    }
}
