package org.generic;

class ClassName<E>{
    private E element;

    public void set(E element) {
        this.element = element;
    }
    public E get() {
        return element;
    }
}


public class GenericEx1 {
    public static void main(String[] args) {


        ClassName<String> string = new ClassName<>();
        ClassName<Integer> integer = new ClassName<>();

        string.set("10");
        integer.set(10);

        System.out.println("## string data: " + string.get());
        System.out.println("## string E Type: " + string.get().getClass().getName());

        System.out.println("## integer data: "+integer.get());
        System.out.println("## integer E Type: "+integer.get().getClass().getName());




    }
}
