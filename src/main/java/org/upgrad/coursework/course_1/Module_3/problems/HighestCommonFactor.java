package org.upgrad.coursework.course_1.Module_3.problems;

import java.util.Scanner;

/**
 * Write Java code to calculate the HCF or the greatest common divisor of two numbers.
 * Once you've calculated the HCF of two numbers, print out the HCF.
 *
 * Hint: HCF is the highest number that divides two numbers.
 * So your loop should start by checking if the lower of the two numbers entered is the HCF
 *  and then check the numbers below, one by one until the HCF is found.
 */
public class HighestCommonFactor {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter number 1 in the Input Console
        int num1 = scan.nextInt();
        // Enter number 2 in the Input Console
        int num2 = scan.nextInt();

        int hcf = 1;
        // Write logic
        if(num1 < num2){
            for(int i = num1; i>0; i--){
                if(num2 % i == 0  && num1 % i == 0){
                    hcf = i;
                    break;
                }
            }
        } else {
            for(int i = num2; i>0; i--){
                if(num2 % i == 0  && num1 % i == 0){
                    hcf = i;
                    break;
                }
            }
        }

        System.out.print(hcf);
        scan.close();
    }
}
