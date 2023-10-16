package org.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        /*
            get set function
         */
        System.out.println("## list index to 1  = " + list.get(1));
        list.set(1,"B");
        System.out.println("## list = " + list);
    }

}
