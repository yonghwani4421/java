package org.bytestream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:\\java_project\\Byte_Project\\src\\main\\resources\\reader.txt")){

            int i = 0;
            while( (i = fr.read()) != -1 ){
                System.out.println((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
