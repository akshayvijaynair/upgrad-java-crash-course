package org.upgrad.coursework.course_1.Module_4;

public class Exceptions1 {
    public static void main(String args[]) {

        try {
            int data = 50 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Rest of the code is here");
    }
} 
