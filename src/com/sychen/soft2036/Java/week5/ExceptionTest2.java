package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName ExceptionTest2 编译时异常
 * @Description TODO
 * @Author msi
 * @Date 2020-11-2
 **/
public class ExceptionTest2 {
    public static void main(String[] args) {
//        File file =new File("C://Users/msi/OneDrive/图片/123.jpg");
        //在方法调用处捕获异常，这样做即使出现异常，也不会影响其他代码运行
        try {
            byte[] b = readFile("C://Users/msi/OneDrive/图片/1234.jpg");
        } catch (IOException e) {
            System.err.println("出现IO异常");
        }finally { //通常用于数据库连接的关闭，线程池的资源回收，IO流的关闭
            System.out.println("无论有无异常都会执行的代码段");
        }
        System.out.println("111111111");
    }

    /**
     * 声明异常
     * @param path 文件路径
     * @return bytes 字节数组
     * @throws IOException
     */
    public static byte[] readFile(String path) throws IOException {
        File file = new File(path);
        byte[] bytes = new byte[(int) file.length()];
        InputStream inputStream = new FileInputStream(file);
        int result = inputStream.read(bytes);
        System.out.println(result);
        inputStream.close();
        return bytes;

    }

}
