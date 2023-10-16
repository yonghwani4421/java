package org.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListEx7 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println("## Init list of elements:" + al);

        /*
            ## adding elements to the end of the list
         */
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("## After invoking add(E e) method: " + al);


        /*
            ## adding an element at the specific postion
         */
        al.add(1,"Gaurav");
        System.out.println("## After invoking add(int index, E element) method:" + al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("Sonoo");
        al2.add("Hanumat");
        /*
            ## adding second list elements to the first list
         */
        al.addAll(al2);
        System.out.println("## After invoking addAll(Collection<? extends E> c) method:" + al);

        ArrayList<String> al3 = new ArrayList<>();

        al3.add("John");
        al3.add("Rahul");
        /*
            ## adding second list elements to the first list at specific postion
         */
        al.addAll(1,al3);
        System.out.println("## After invoking addAll(int index, Collection<? extends E> C) method:" + al);
    }

}
