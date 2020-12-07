package Java.week9.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName DownloadFile
 * @Description TODO
 * @Author csy
 * @Date 2020-11-30
 */
public class DownloadFile {
    public static void main(String[] args) {

    }

    public static void download(String urlString, String
            fileName, String savePath) throws IOException {
        //构造url
        URL ur = new URL(urlString);
        //打开连接
        URLConnection connection = ur.openConnection();
        //设置请求超时
        connection.setConnectTimeout(5000);
        //构建输入流
        InputStream is = connection.getInputStream();
        //定义数据缓冲
        byte[] bytes = new byte[1024];
        //读取的数据长度
        int length;
        //创建文件对象
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }


    }
}
