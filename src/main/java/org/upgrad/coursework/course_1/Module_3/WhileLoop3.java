package org.upgrad.coursework.course_1.Module_3;

public class WhileLoop3 {
    public static void main(String[] args) {

        int num = 1;
        int product = 1;

        while (num <= 10) {
            product = product*num;
            num ++;
        }
        System.out.println(product);
    }
}