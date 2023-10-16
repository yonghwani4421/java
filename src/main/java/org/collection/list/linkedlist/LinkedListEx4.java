package org.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");

        /*
            ## use descendingIterator
            ## reverse ordering
         */

        Iterator<String> iter = ll.descendingIterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}
