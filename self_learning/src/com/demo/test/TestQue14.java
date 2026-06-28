package com.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestQue14 {
    public static void main(String[] args) 
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(05);
        numbers.add(10);
        numbers.add(31);
        numbers.add(98);
        numbers.add(37);
        System.out.println("Original List: \n" + numbers);    
        int searchKey = 30;
        if (numbers.contains(searchKey)) {
            System.out.println("Search: " + searchKey + " found at index " + numbers.indexOf(searchKey));
        }
         numbers.remove(Integer.valueOf(50));
        System.out.println("After Deleting 50: \n" + numbers);
        Collections.sort(numbers);
        System.out.println("After Sorting (Ascending): \n" + numbers);
        System.out.print("Iterating through list: \n");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}