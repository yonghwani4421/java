package org.bytestream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        /*
        * FileInputStream : 파일에서 바이트 단위로 자료를 읽음
        *
        * */
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:\\java_project\\Byte_Project\\src\\main\\resources\\input.txt");

            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());

        } catch (IOException ex){

        } finally {
            try{
                fis.close();
            } catch (IOException e){
                System.out.println(e);
            } catch (NullPointerException e){
                System.out.println(e);
            }

        }
        System.out.println("end");
    }
}
