package org.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ravi");
        ll.add("Ajay");
        System.out.println("## Init list of LinkedList :" + ll);
    }
}
