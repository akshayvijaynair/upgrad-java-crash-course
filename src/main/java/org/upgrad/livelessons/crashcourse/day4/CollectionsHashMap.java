package org.upgrad.livelessons.crashcourse.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO -> What is hashing? Why is this pattern so much better for searching?
 * TODO -> What is a map?
 * <p>
 * Types of Hashmap: Hashmap, LinkedHashmap, TreeHashMap
 * <p>
 * Question:
 * Input:  list of integers
 * Output: is another hashmap with only two key,even and another is odd
 * [1, 2, 3, 4, 5, 6] => "even" --> [2, 4, 6] AND "odd" --> [1, 3, 5]
 */
public class CollectionsHashMap {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();


        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
                hashMap.put("even", evenList);
            } else {
                oddList.add(i);
                hashMap.put("odd", oddList);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
