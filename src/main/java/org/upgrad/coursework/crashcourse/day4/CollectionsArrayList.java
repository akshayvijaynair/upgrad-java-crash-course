package org.upgrad.coursework.crashcourse.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * TODO -> Explore the collections API
 * Things to know:
 *  - Node: Fundamental data unit
 *  - Node -> LinkedList/ List -> ArrayList
 */
public class CollectionsArrayList {

    public static void main(String[] args){
        List<Integer> intArray = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of list");
        int listLength = scanner.nextInt();
        System.out.println("Enter the numbers");
        for(int i=0; i<listLength; i++){
            intArray.add(scanner.nextInt());
        }
        printGroupOfEvenNumbersAt(1, intArray);

    }

    private static void printGroupOfEvenNumbersAt(int printGroupLocation, List<Integer> list) {
        // int[] value = {3, 7, 2, 8, 12, 16, 31, 20, 16, 19, 21, 23, 24, 11, 16, 19, 22, 26, 29, 31};
        int indexLocation;
        int groups = 0;
        List<Integer> evenGroup = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                groups++;
                if (groups == printGroupLocation) {
                    System.out.println("Output at " + printGroupLocation + " is: ");
                    System.out.println(list.get(i));
                    indexLocation = i + 1;
                    for (int j = indexLocation; j < list.size(); j++) {
                        if (list.get(j) % 2 == 0) {
                            evenGroup.add(list.get(j));
                        } else {
                            i = j;
                            break;
                        }
                    }
                } else {
                    indexLocation = i + 1;
                    for (int j = indexLocation; j < list.size(); j++) {
                        if (list.get(j) % 2 != 0) {
                            i = j;
                            break;
                        }
                    }
                }
            }
        }

        for (int i = evenGroup.size()-1; i >= 0; i--){
            System.out.println(evenGroup.get(i));
        }
    }
}
