package org.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {

        List<String> list1=new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        //Sorting the list
        Collections.sort(list1);

        /*
            ## String Sort
         */
        System.out.println("## String");
        for (String s : list1) {
            System.out.println("string = " + s);
        }

        /*
            ## Integer Sort
         */
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(21);
        integers.add(11);
        integers.add(1);
        integers.add(6);

        Collections.sort(integers);


        System.out.println("## Integer");
        for (Integer integer : integers) {
            System.out.println("integer = " + integer);
        }
    }
}
