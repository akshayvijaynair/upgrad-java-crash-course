package org.upgrad.coursework.course_1.Module_3;

import java.util.Scanner;

/**
 * omprehension: Day of the week
 *
 * Let’s say that the 1st of January of a given non-leap year is a Monday.
 *Write a program that takes the day number and returns what day it is.
 *
 * Hint: The first day is a Monday, the second is a Tuesday, the third is a Wednesday, and so on.
 * Then, the eighth day will be a Monday again, the ninth will be a Tuesday, and the tenth will be a Wednesday.
 * So day number %7 could help you frame the logic here.
 */
public class DayOfWeek {

    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            int day  = scanner.nextInt();

            if(day > 0 && day < 366){
                int dayOfWeek = day % 7;
                switch(dayOfWeek){
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Sunday");
                        break;
                }
            } else {
                System.out.println("Weird day of the year. When does this happen?");
            }
    }
}
