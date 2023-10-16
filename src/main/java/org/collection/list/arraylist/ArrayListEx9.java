package org.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx9 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("Ravi");
        al2.add("Ajay");
        al.retainAll(al2);

        System.out.println("## Iterating the elements after retaining the elements of al2");

        Iterator<String> iter = al.iterator();
        while (iter.hasNext()){
            String next = iter.next();
            System.out.println(next);
        }
    }
}
