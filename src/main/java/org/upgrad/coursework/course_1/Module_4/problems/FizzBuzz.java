package org.upgrad.coursework.course_1.Module_4.problems;

/**
 * TODO --> find other methods for this
 */
public class FizzBuzz {

    public static void main(String args[]) {
        int[] numbers = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        fizzBuzz(numbers);
    }

    public static void fizzBuzz(int[] numbers) {
        for(int i =0; i< numbers.length; i++){
            if(numbers[i] % 3 == 0){
                System.out.print("Fizz");
            }
            if(numbers[i] % 5 == 0){
                System.out.print("Buzz");
            }
            if(numbers[i] % 3 !=0 && numbers[i] % 5 !=0 ){
                System.out.print(numbers[i]);
            }
            System.out.print(" ");
        }
    }
}
