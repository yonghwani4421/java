package org.generic;

class ClassName2<K, V>{
    private K first;
    private V second;

    public void set(K first , V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
    public void setSecond(V second) {
        this.second = second;
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
        ClassName2<String, Integer> a = new ClassName2<>();

        a.set("10",10);

        System.out.println("## first data: " + a.getFirst());
        System.out.println("## first Type: " + a.getFirst().getClass().getName());
        System.out.println("## second data: " + a.getSecond());
        System.out.println("## second Type: " + a.getSecond().getClass().getName());
    }
}
