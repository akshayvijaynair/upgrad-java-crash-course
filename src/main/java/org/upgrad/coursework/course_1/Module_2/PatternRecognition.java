package org.upgrad.coursework.course_1.Module_2;

/**
 * Interview questions are about Pyramidal numbers
 * https://www.javatpoint.com/pyramidal-number-in-java
 */
public class PatternRecognition {

    public static void main(String[] args){
        System.out.println(findTotalNumberOfBalls(7));
        int a = 5;

        int b = 4;

        int c = 3;

        double z = (a + b - c) / a * b;

        System.out.println(z);
    }
    public static int findTotalNumberOfBalls(int layers) {
        int totalNumberOfBalls = 0;
        for(int i =1; i<=layers; i++){
            totalNumberOfBalls += i*i;
            System.out.println("Number of Balls at layer"+ i + ": "+ i*i);
        }
        return totalNumberOfBalls;
    }
}
