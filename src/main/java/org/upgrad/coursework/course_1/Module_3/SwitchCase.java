package org.upgrad.coursework.course_1.Module_3;

public class SwitchCase {
    public static void main(String[] args)
    {
        String coffee = "Espresso";

        switch (coffee) {
            case "Cappuccino":
                System.out.println("Preparing Cappuccino!");
                break;
            case "Espresso":
                System.out.println("Preparing Espresso!");
                break;
            case "Latte":
                System.out.println("Preparing Latte!");
                break;
            case "Black Coffee":
                System.out.println("Preparing Black Coffee!");
                break;
            default:
                System.out.println("Please select a valid option...");
                break;
        }
    }
}