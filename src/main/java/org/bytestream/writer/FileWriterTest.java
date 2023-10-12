package org.bytestream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("C:\\java_project\\Byte_Project\\src\\main\\resources\\writer.txt")){

            fw.write('A');
            char buf[] = {'B','C','D','F','G'};

            fw.write("안녕하세요. 잘 써지네요"); 			//String 출력
            fw.write(buf, 1, 2); 				// 문자 배열의 일부 출력
            fw.write("65");  				// 숫자를 그대로 출력

            fw.write(buf);

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("출력 완료");
    }
}
