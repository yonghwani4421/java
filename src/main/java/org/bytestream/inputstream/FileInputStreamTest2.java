package org.bytestream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("C:\\java_project\\Byte_Project\\src\\main\\resources\\input.txt")){
            int i = 0;
            while((i = fis.read()) != -1){
                System.out.println((char)i);
            }
            System.out.println("end");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
