package org.upgrad.coursework.course_1.Module_4.problems;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNumbers {
    public static void main(String args[]) throws FileNotFoundException {

        File inputfile = new File("C:\\Projects\\Upgrad-IIITB\\upgrad-java-crash-course\\src\\main\\java\\org\\upgrad\\coursework\\course_1\\Module_4\\quiz_numbers.txt"); // Specify the path of the file

        Scanner scan = new Scanner(inputfile);
        int numb = 0;
        double sum = 0;
        int numberOfValues = 0;

        while (scan.hasNext()) {  // read the numbers and add them to the value of the sum
            double number = scan.nextDouble();
            sum = sum + number;
            numberOfValues++;
        }

        System.out.println("Sum is : " + sum);
        System.out.println(numberOfValues);
        System.out.println("Mean is : " + (sum/(numberOfValues)));
    }
}
