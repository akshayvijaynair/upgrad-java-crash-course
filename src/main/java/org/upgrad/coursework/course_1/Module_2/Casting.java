package org.upgrad.coursework.course_1.Module_2;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args)
    {
        int marks1 = 20;
        int marks2 = 40;
        int marks3 = 50;

        double average = ((double)marks1 + (double)marks2 + (double)marks3)/3;
        System.out.println(average);

        // another example
        char x = 'a';
        int value = (int)x;
        System.out.println(value);
    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        int celsius = scanner.nextInt();
        float fahrenheit = ((9*(float)celsius)/5) + 32;
        System.out.println(fahrenheit);
    }

    public static void testCasting() {
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        float f=input.nextFloat();
        double d=input.nextDouble();

        float x = (float)a;
        int y = (int)f;
        float z = (float)d;

        System.out.print("x="+x+" y="+y+" z="+z);
    }
}
