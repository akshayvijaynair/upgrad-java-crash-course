package org.upgrad.coursework.crashcourse.day4;

import java.util.*;

/**
 * TODO -> What is a set?
 *
 * Types of sets: HashSet, LinkedHashSet, TreeSet
 */
public class CollectionsHashSet {

    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of list");
        int listLength = scanner.nextInt();
        System.out.println("Enter the numbers");
        for(int i=0; i<listLength; i++){
            set.add(scanner.nextInt());
        }

        for(int i=0; i<listLength; i++){
            linkedSet.add(scanner.nextInt());
        }

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer integer : linkedSet) {
            System.out.println(integer);
        }

    }
}
