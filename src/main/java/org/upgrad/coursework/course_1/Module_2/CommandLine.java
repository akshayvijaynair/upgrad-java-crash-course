package org.upgrad.coursework.course_1.Module_2;

/**
 * Code in question was provided as part of the recorded video
 * See comments below
 */
public class CommandLine {

    public static void main(String[] args) {

        for (int num = 2; num <= 1000; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {


                if (num % i == 0) {
                    /*
                        There is an error on this line -> missing semicolon
                        isPrime = false
                     */
                    // corrected line
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.println(num);
            }
        }
    }
}
