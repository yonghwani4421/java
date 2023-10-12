package org.bytestream.stringtobyte;

import java.io.*;

public class StringToByteTest2 {
    public static void main(String[] args) {

        try{
            String data = "asd테스트";
            byte[] bytes1 = stringToByte(data, "euc-kr");
            byte[] bytes2 = stringToByte2(data, "euc-kr");

            System.out.println("=============bytes1================");
            System.out.println("bytes1 length : " + bytes1.length);
            for (byte aByte : bytes1) {
                System.out.println("aByte : " + aByte);
            }
            System.out.println("string : "+new String(bytes1,"euc-kr"));
            System.out.println("=============bytes2================");
            System.out.println("bytes2 length : " + bytes2.length);
            for (byte aByte : bytes2) {
                System.out.println("aByte : " + aByte);
            }
            System.out.println("string : "+new String(bytes2,"euc-kr"));


        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static byte[] stringToByte(String data, String charset) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter OutputStreamWriter = new OutputStreamWriter(baos, charset);
        BufferedWriter bufferedWriter = new BufferedWriter(OutputStreamWriter);
        bufferedWriter.write(data);
        bufferedWriter.flush();
        bufferedWriter.close();

        byte[] sendbyte = baos.toByteArray();

        return sendbyte;
    }
    private static byte[] stringToByte2(String data, String charset) throws IOException {
        return data.getBytes(charset);
    }
}