package soft2036.Java.last.stream;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) throws IOException{
        FileInputStream in=new FileInputStream(new File("C:\\Users\\MSI\\Pictures\\p站\\0(1).jpg"));
        FileOutputStream out=new FileOutputStream(new File("D:\\01.jpg"));
        byte[] bytes=new byte[1024];
        int bytesRead ;
        while ((bytesRead = in.read(bytes))!=-1){
            out.write(bytes,0,bytesRead);
        }
        out.close();
        in.close();
    }
}
