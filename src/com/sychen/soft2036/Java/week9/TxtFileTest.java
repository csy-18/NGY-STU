package soft2036.Java.week9;

import com.mysql.cj.jdbc.Blob;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

/**
 * @ClassName TxtFileTest
 * @Description TODO
 * @Author csy
 * @Date 2020-11-30
 */
public class TxtFileTest {

    public static void main(String[] args) throws IOException {
        //从键盘输入一串字符，用三种方法将其持久化到本地文件，文件名用UUID命名即可
        //1
        System.out.println("方法一：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        File file = new File("D:\\Test1.txt");
        Writer out = new FileWriter(file, true);
        out.write(chars);
        out.close();
        System.out.println("文件保存成功。" + file);
        //2
        System.out.println("方法二：");
        String file2 = "D:/Test2.txt";
        FileOutputStream foutput = new FileOutputStream(file2);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入");
        String s1 = scanner1.next().trim();
        String content = s1;
        content = UUID.randomUUID().toString();
        assert false;
        foutput.write(content.getBytes("UTF-8"));
        foutput.flush();
        foutput.close();
        System.out.println("文件保存成功。" + file2);

        System.out.println("方法三：");
        String file3 = "D:/Test3.txt";
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入");
        String s2 = scanner2.next().trim();
        String content1 = s2;
        content1 = UUID.randomUUID().toString();
        BufferedWriter bwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file3), "UTF-8"));
        bwriter.write(content1);
        bwriter.flush();
        bwriter.close();
        System.out.println("文件保存成功。" + file3);
    }
}
