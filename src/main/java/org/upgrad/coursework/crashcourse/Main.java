package org.upgrad.coursework.crashcourse;

import org.upgrad.coursework.crashcourse.day2.BookMyShow;
import org.upgrad.coursework.crashcourse.day2.Computer;
import org.upgrad.coursework.crashcourse.day2.LampButton;
import org.upgrad.coursework.crashcourse.day2.ParkingLot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Day 1: July 8th 2023
        squareSum();
        printReverse();
        printFunctionValue(2);
        printFunctionValue(-1);
        printStringArray();
        printArraySquareWithLoop();
        printGroupsOfEvenNumbers();

        // Day 2: July 9th 2023
        printGroupOfEvenNumbersAt(5);
        Computer computer = new Computer();
        Computer computer1 = new Computer("Windows", "ASUS", "Intel Core i7");
        BookMyShow bms = new BookMyShow();
        ParkingLot lot = new ParkingLot(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0);
        printLargestNumber();
        isValueInRange();
        LampButton inheritanceTrial = new LampButton();

        // Day 3


    }

    private static void squareSum() {
        int value_1 = 3;
        int value_2 = 4;

        int sumOfSquares = (value_1 * value_1) + (value_2 * value_2);
        System.out.println(sumOfSquares);
    }

    private static void printReverse() {
        int value_1 = 3;
        int value_2 = 4;
        int value_3 = 5;
        int value_4 = 7;

        System.out.println(value_4 + " " + value_3 + " " + value_2 + " " + value_1);
    }

    private static void printFunctionValue(int param) {
        int value_1 = 4;
        int value_2 = 3;
        int value_3 = -1;

        int bx = value_2 * param;
        System.out.println(value_1 * (param * param) + bx + value_3);
    }

    private static void printStringArray() {
        String[] value = {"a", "bc", "def"};
        System.out.println(value[2]);
    }

    private static void printArraySquareWithLoop() {
        int[] value = {2, 8, 12, 16};

        // enhanced for
        for (int j : value) System.out.println(j * j);

        // traditional for
        for (int i = 0; i < value.length; i++)
            System.out.println(value[i] * value[i]);
    }

    /**
     * For an array of numbers, output groups of even numbers
     */
    private static void printGroupsOfEvenNumbers() {
        int[] value = {1, 2, 3, 4, 6, 5, 7, 8, 8, 6, 11};
        int indexLocation;

        for (int i = 0; i < value.length; i++) {
            if (value[i] % 2 == 0) {
                System.out.print("Output is: " + value[i]);
                indexLocation = i + 1;
                for (int j = indexLocation; j < value.length; j++) {
                    if (value[j] % 2 == 0) {
                        System.out.print(" " + value[j]);
                    } else {
                        i = j;
                        System.out.println(" ");
                        break;
                    }
                }
            }
        }
    }

    /**
     * For an array of numbers, output groups of even numbers at specified location
     * @Note leetcode solve | easy | took 15 minutes
     * @O(n) n^2
     */
    private static void printGroupOfEvenNumbersAt(int printGroupLocation) {
        int[] value = {3, 7, 2, 8, 12, 16, 31, 20, 16, 19, 21, 23, 24, 11, 16, 19, 22, 26, 29, 31};
        int indexLocation;
        int groups = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] % 2 == 0) {
                groups++;
                if (groups == printGroupLocation) {
                    System.out.print("Output at " + printGroupLocation + " is: " + value[i]);
                    indexLocation = i + 1;
                    for (int j = indexLocation; j < value.length; j++) {
                        if (value[j] % 2 == 0) {
                            System.out.print(" " + value[j]);
                        } else {
                            i = j;
                            System.out.println(" ");
                            break;
                        }
                    }
                } else {
                    indexLocation = i + 1;
                    for (int j = indexLocation; j < value.length; j++) {
                        if (value[j] % 2 != 0) {
                            i = j;
                            break;
                        }
                    }
                }
            }
        }
    }

    static void printLargestNumber() {
        Scanner scanner = new Scanner(System.in);
        int value_1 = scanner.nextInt();
        int value_2 = scanner.nextInt();
        int value_3 = scanner.nextInt();

        if (value_1 >= value_2) {
            if (value_1 >= value_3)
                System.out.println(value_1);
            else {
                if (value_2 >= value_3) {
                    System.out.println(value_2);
                } else {
                    System.out.println(value_3);
                }
            }
        } else {
            if (value_2 >= value_3) {
                System.out.println(value_2);
            } else {
                System.out.println(value_3);
            }
        }
    }

    static void isValueInRange() {
        Scanner scanner = new Scanner(System.in);
        int value_1 = scanner.nextInt();

        if (value_1 < 10 || value_1 > 100) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}