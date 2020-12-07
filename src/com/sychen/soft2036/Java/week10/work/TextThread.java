package soft2036.Java.week10.work;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class TextThread implements Runnable {
    private JLabel textLable;

    public void setTextLable(JLabel textLable) {
        this.textLable = textLable;
    }

    @Override
    public void run() {
        while (true) {
            String filePath="D:\\Test1.txt";
            File f1= new File(filePath);
            BufferedReader reader = null;
            String tempString = null;
            int line =1;
            try {
                //InputStreamReader类是从字节流到字符流的桥接器：它使用指定的字符集读取字节并将它们解码为字符
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(f1),"UTF-8"));
                while ((tempString = reader.readLine()) != null) {
                    System.out.println("Line"+ line + ":" +tempString);
                    line ++ ;
                    textLable.setText(tempString);
                    Thread.sleep(2000);
                }
                reader.close();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }finally{
                if(reader != null){
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

//    public static void main(String[] args) {
//TextThread t1=new TextThread();
//Thread thread =new Thread(t1);
//thread.start();
//    }

}
