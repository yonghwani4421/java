package org.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");


        /*
        * Iterator 사용
        * */

        Iterator iterator = list.iterator();

        System.out.println("## use iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*
            foreach
         */
        System.out.println("## use foreach");
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
