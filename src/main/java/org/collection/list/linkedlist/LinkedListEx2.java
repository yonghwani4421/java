package org.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("## Init list of elements: " + ll);

        /*
            ## adding an element at the specific position
         */
        ll.add(1,"Gaurav");

        System.out.println("## After invoking add(int index, E element) method: " + ll);
        LinkedList<String> ll2 = new LinkedList<>();

        ll2.add("Sonoo");
        ll2.add("Hanumat");

        /*
            ## adding second list elements to the first list
         */

        ll.addAll(ll2);
        System.out.println("## After invoking addAll(Collection<? extends E> c) method: " + ll);

        /*
            ## adding second list elements to the first list at specific position
         */

        LinkedList<String> ll3 = new LinkedList<>();

        ll3.add("John");
        ll3.add("Rahul");

        ll.addAll(1,ll3);

        System.out.println("## After invoking addAll(int index, Collection<? extends E> c) method: " + ll);
        /*
            ## adding an element at the first position
         */

        ll.addFirst("Lokesh");

        System.out.println("## After invoking addFirst(E e) method: "+ ll);
        /*
            ## adding an element at the last position
         */
        ll.addLast("Harsh");

        System.out.println("## After invoking addLast(E e) method: "+ ll);
    }
}
