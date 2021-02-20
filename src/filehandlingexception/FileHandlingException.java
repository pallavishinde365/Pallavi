package filehandlingexception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileHandlingException {
    public static void main(String[] args){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("FHdemo.txt");

            String s = "today is thursday";
            byte[] arr = s.getBytes();
            fileOutputStream.write(arr);

            System.out.println("File is written");
        }catch(IOException filenothandling){
            filenothandling.printStackTrace();
        }
        try{
            FileInputStream fileInputStream=new FileInputStream("FHdemo.txt");
            int i= fileInputStream.read();
            while(i>0){
            System.out.print((char) i);
            i=fileInputStream.read();
            }

        }catch(IOException filenothandling){
            filenothandling.printStackTrace();
        }

    }
}
