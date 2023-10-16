package org.collection.list.arraylist;

import java.io.*;
import java.util.ArrayList;

public class ArrayListEx6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        /*
            ## Serialization
         */
        try(FileOutputStream fos = new FileOutputStream("C:\\java_project\\Byte_Project\\src\\main\\resources\\arrayListTest.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ){
            oos.writeObject(al);
            fos.close();
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        /*
            ## Deserialization
         */
        try(FileInputStream fis = new FileInputStream("C:\\java_project\\Byte_Project\\src\\main\\resources\\arrayListTest.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
        ){
            ArrayList list = (ArrayList)ois.readObject();

            System.out.println("## Deserialization Read file");
            System.out.println(list);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
