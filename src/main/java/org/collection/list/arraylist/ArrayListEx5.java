package org.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListEx5 {
    public static void main(String[] args) {

        /*
            ## Create Student
         */
        Student s1=new Student(101,"Sonoo",23);
        Student s2=new Student(102,"Ravi",21);
        Student s3=new Student(103,"Hanumat",25);


        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        for (Student student : al) {
            System.out.println("student info = " + student.toString());
        }

    }
}
/*
    ## Student class
 */
class Student{
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
