package org.bytestream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:\\java_project\\Byte_Project\\src\\main\\resources\\input.txt")){

            byte[] bs = new byte[10];

            int i = 0;
            while((i = fis.read(bs)) != -1){
                for (byte b : bs) {
                    System.out.println((char)b);
                }
                System.out.println(": " + i + "바이트 읽음");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
