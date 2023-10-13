package org.staticex;

public class Main {
    public static void main(String[] args) {
        /*
         * static 변수는 객체 생성 없이 접근이 가능하다.
         * */
        Book.price = 2000;
        Book.showPrice();

        Book b1 = new Book();
        b1.price = 4000;
        b1.showPrice();

        System.out.println("singleton1 = " + Singleton.getInstance());
        System.out.println("singleton2 = " + Singleton.getInstance());

    }
}
