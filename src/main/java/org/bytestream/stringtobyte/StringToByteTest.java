package org.bytestream.stringtobyte;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class StringToByteTest {
    public static void main(String[] args) {
        try{
            String test ="테스트";
            System.out.println("test length : " + test.length());
            System.out.println("test length (UTF-8) : " + getByteLength(test,"utf-8"));
            System.out.println("test length (EUC-KR): " + getByteLength(test,"euc-kr"));

        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }

    private static int getByteLength(String str, String charset) throws UnsupportedEncodingException {
        return str.getBytes(charset).length;
    }
}
