package org.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx4 {
    public static void main(String[] args) {
        /*
          ## setting list
         */
        ArrayList<String> list = new ArrayList<>();

        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        /*
            ## user ListIterator  => in reverse order
         */
        System.out.println("## Traversing list through List Iterator:");

        ListIterator<String> iter = list.listIterator(list.size());

        while (iter.hasPrevious()){
            String str = iter.previous();
            System.out.println(str);
        }
        /*
            ## use for loop
         */
        System.out.println("## Traversing list through for loop:");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        /*
            ## use foreach
         */

        System.out.println("## Traversing list through foreach() method:");
        for (String s : list) {
            System.out.println(s);
        }
        /*
            ## use forEachRemaing
         */
        System.out.println("## Traversing list through forEachRemaining method:");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a -> {
            System.out.println(a);
        });
    }
}
