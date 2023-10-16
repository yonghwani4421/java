package org.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListEx8 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Anuj");
        al.add("Gaurav");
        System.out.println("## Init list of elements: " + al);

        /*
            ## removing specific element from arraylist
         */

        al.remove("Vijay");
        System.out.println("## After invoking remove(object) method: " + al);

        /*
            ## removing element on the basis of  specific postion
         */
        al.remove(0);
        System.out.println("## After invoking remove(index) method: " + al);

        /*
            ## adding new elements to arraylist
         */
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al.addAll(al2);

        System.out.println("## update new list : " + al);

        /*
            ## removing all the new elements from arraylist
         */
        al.removeAll(al2);
        System.out.println("## After invoking removeAll() method : " + al);

        /*
            ## Removing elements on the basis of specified condition
         */
        al.removeIf(str -> str.contains("Ajay"));
        System.out.println("## After invoking removeIf() method : "+ al);


        /*
            ## Removing all the elements available in the list
         */
        al.clear();
        System.out.println("## After invoking clear() method : " + al);
    }
}
