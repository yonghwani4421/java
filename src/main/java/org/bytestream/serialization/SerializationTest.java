package org.bytestream.serialization;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        Person personLee = new Person("이순신","대표이사");
        Person personKim = new Person("김유신","상무이사");

        /*
        *  직렬화
        * */
        try(FileOutputStream fos = new FileOutputStream("C:\\java_project\\Byte_Project\\src\\\\main\\resources\\serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(personLee);
            oos.writeObject(personKim);

        }catch (IOException e){
            e.printStackTrace();
        }

        /*
         *  역직렬화
         * */
        try(FileInputStream fis = new FileInputStream("C:\\java_project\\Byte_Project\\src\\main\\resources\\serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            Person p1 =(Person)ois.readObject();
            Person p2 =(Person) ois.readObject();

            System.out.println("p1.toString() = " + p1.toString());
            System.out.println("p2.toString() = " + p2.toString());

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }






    }
}
