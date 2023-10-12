package org.bytestream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("C:\\java_project\\Byte_Project\\src\\main\\resources\\output2.txt")){
            byte[] bs = new byte[26];

            byte data = 65;

            for(int i = 0; i < bs.length; i++){
                bs[i] = data;
                data++;
            }

            fos.write(bs);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("출력완료!");

    }
}
