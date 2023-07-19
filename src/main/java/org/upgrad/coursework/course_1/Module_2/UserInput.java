package org.upgrad.coursework.course_1.Module_2;

import java.util.Scanner;

public class UserInput {
    public static void main( String[] args ) {
        basicTest();
        arithmeticInputTest();
        celsiusToFahrenheit();
    }

    public static void basicTest(){
        int numberA;
        int numberB;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a");

        numberA = input.nextInt();

        System.out.println("Enter the value for b");

        numberB = input.nextInt();
        System.out.println(numberA + numberB);
    }

    public static void arithmeticInputTest() {
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println(a*b+c);
    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        int celsius = scanner.nextInt();
        System.out.println(((9*celsius)/5) + 32);
    }
}
