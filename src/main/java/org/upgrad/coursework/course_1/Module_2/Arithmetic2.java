package org.upgrad.coursework.course_1.Module_2;

public class Arithmetic2 {
    public static void main(String[] args)
    {
        average();
        printDigits(2345456);
        test();
    }

    private static void average(){
        int marks1 = 20;
        int marks2 = 40;
        int marks3 = 50;

        double average = (marks1 + marks2 + marks3)/3;
        System.out.println(average);
    }

    private static void printDigits(int value){
        int lastDigit = value % 10;
        if(lastDigit != 0) {
            System.out.println(lastDigit);
            printDigits(value/10);
        }
    }

    private static void test(){
        int a = 5; int b = 4; int c = 3;

        int z = a + b - c * a;

        System.out.println(z);
    }
}
