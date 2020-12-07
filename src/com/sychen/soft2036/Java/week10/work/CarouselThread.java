package soft2036.Java.week10.work;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CarouselThread implements Runnable {
    private String[] imgs = {
            "http://cccsy.oss-cn-shanghai.aliyuncs.com/sm/tu3.png",
            "http://cccsy.oss-cn-shanghai.aliyuncs.com/sm/tu4.png",
            "http://cccsy.oss-cn-shanghai.aliyuncs.com/sm/tu5.png",
            "http://cccsy.oss-cn-shanghai.aliyuncs.com/sm/tu6.png"
    };

    //创建显示图片的组件
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        int index = 0;
        int len = imgs.length;
        while (true) {
            try {
                //创建URL
                URL uRL = new URL(imgs[index]);
                //创建了链接
                HttpURLConnection connection = (HttpURLConnection) uRL.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                //创建流
                InputStream inputStream = connection.getInputStream();
                //缓冲输出流
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                //缓冲
                byte[] buffer = new byte[1024];
                int length = 0;
                //通过缓冲区读取图片
                while ((length = inputStream.read(buffer)) != -1) {
                    byteArrayOutputStream.write(buffer, 0, length);
                }
                byte[] bytes = byteArrayOutputStream.toByteArray();
                //将字节数组通过字节输入流输入
                inputStream.read(bytes);
                Icon icon = new ImageIcon(bytes);
                this.bgLabel.setIcon(icon);
                Thread.sleep(2000);
                inputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            index++;
            //处理最后一个元素
            if (len == index) {
                index = 0;
            }
        }


    }
}
