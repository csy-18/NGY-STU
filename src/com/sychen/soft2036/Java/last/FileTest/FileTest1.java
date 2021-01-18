package soft2036.Java.last.FileTest;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        LocalDateTime time=LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String strDate = dtf.format(time);
        String filepath="D://"+"csy.txt";
        File file=new File(filepath);
        //1、写入文件
        Writer writer=new FileWriter(file);
//        writer.write(strDate);
//        writer.close();
        //2、BufferedWrite
        BufferedWriter bw=new BufferedWriter(writer);
        bw.write(strDate);
        bw.close();


        Reader reader=new FileReader(filepath);
        BufferedReader br=new BufferedReader(reader);
        System.out.println(br.readLine());
        reader.close();

    }
}
