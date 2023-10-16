package org.generic;
class ClassName3<E>{
    private E element;

    public void set(E element) {
        this.element = element;
    }

    public E get() {
        return element;
    }

    static <T> T genericMethod(T o){
        return o;
    }
}


public class GenericEx3 {
    public static void main(String[] args) {
        ClassName3<String> a = new ClassName3<String>();
        ClassName3<Integer> b = new ClassName3<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("## a data : " + a.get());
        System.out.println("## a E Type : " + a.get().getClass().getName());

        System.out.println("## b data : " + b.get());
        System.out.println("## b E Type : " + b.get().getClass().getName());

        System.out.println("<T> returnType: " + a.genericMethod(3).getClass().getName());
        System.out.println("<T> returnType: " + a.genericMethod("ABCD").getClass().getName());
        System.out.println("<T> returnType: " + a.genericMethod(b).getClass().getName());
    }
}
