package org.staticex;

public class Singleton {
    /*
    * 클래스 내부에 private static 인스턴스 생성
    * */
    private static Singleton instance;

    // 외부 접근
    private Singleton() {
        System.out.println("singleton 생성자 호출!!");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
