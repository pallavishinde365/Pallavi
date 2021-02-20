package filehandlingexception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Handling_Exception {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("FHdemo.txt");
        String s = "today is thursday";
        byte[] arr = s.getBytes();
        fileOutputStream.write(arr);

        FileInputStream fileInputStream = new FileInputStream("FHdemo.txt");
        int i = fileInputStream.read();
        while (i > 0) {
            System.out.print((char) i);
            i = fileInputStream.read();


        }
    }
}
