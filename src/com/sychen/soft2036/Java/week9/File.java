package Java.week9;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName File
 * @Description TODO
 * @Author csy
 * @Date 2020-11-30
 */
class FileTest {
    public static void main(String[] args) throws IOException {
        //1-1.使用系统时间命名文件夹
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // 现在使用今天.
        String output = sdf.format(c.getTime());
        System.out.println(output);
        String d = "E:" + File.separator + output + File.separator + "hi.txt";
        File f = new File(d);
        if (!f.exists()) {
            boolean flag = f.mkdirs();
            System.out.println(flag);
        }
        //2-2.删除刚才创建的目录，判断是否存在
        else {
            boolean success = f.delete();
            if (success) {
                System.out.println("删除成功 ");
            } else {
                System.out.println("删除失败 ");
            }
        }
        //1-3.递归创建目录，顶级目录：JAVA，一级目录：面向对象、异常、集合、IO、多线程
        //io目录下：字符流、字节流

        String[] list = {"面向对象", "异常", "集合", "io", "多线程"};
        String[] list2 = {"字符流", "字节流"};
        File dir = new File("E:\\java");
        if (!dir.exists()) {
            boolean flag = dir.mkdirs();
            System.out.println(flag + "Java目录创建成功");
        }
        for (String s : list) {
            File file = new File("E:\\java" + File.separator + s);
            if (!file.exists()) {
                boolean flag = file.mkdirs();
                System.out.println(flag + ",Java下子目录创建成功");
            }
            if (s.equals("io")) {
                for (String a : list2) {
                    File file1 = new File("E:\\java\\io\\" + a);
                    if (!file1.exists()) {
                        boolean flag = file1.mkdirs();
                        System.out.println(flag + ",io下子目录创建成功");
                    }
                }
            }


        }

    }
}
