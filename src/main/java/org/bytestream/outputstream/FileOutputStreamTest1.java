package org.bytestream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args) {

        /*
        * FileOutputStream : 파일에서 바이트 단위로 자료를 씀
        * */
        try(FileOutputStream fos = new FileOutputStream("C:\\java_project\\Byte_Project\\src\\main\\resources\\output.txt")){
            fos.write(65);
            fos.write(66);
            fos.write(67);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("출력완료");
    }
}
