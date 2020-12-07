package soft2036.Java.week10.work;

import javax.swing.*;
import java.awt.*;

public class CarouselFrame extends JFrame {
    private  JLabel jLabel;
    private JLabel timeLabel;
    private JLabel textLabel;

    public CarouselFrame() throws HeadlessException {
        Init();
        setTitle("CarouselFrame");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(true);
    }

    private void Init() {
        jLabel =new JLabel();
        CarouselThread carouselThread=new CarouselThread();
        carouselThread.setBgLabel(jLabel);
        new Thread(carouselThread).start();
        this.getContentPane().add(jLabel,BorderLayout.CENTER);
        //时间线程和标签
        timeLabel =new JLabel();
        timeLabel.setFont(new Font("微软雅黑",Font.BOLD,24));
        this.getContentPane().add(timeLabel,BorderLayout.SOUTH);
        TimeThread timeThread=new TimeThread();
        timeThread.setTimeLable(timeLabel);
        new Thread(timeThread).start();
        //文本输入
        textLabel =new JLabel();
        textLabel.setFont(new Font("微软雅黑",Font.BOLD,18));
        this.getContentPane().add(textLabel,BorderLayout.NORTH);
        TextThread textThread=new TextThread();
        textThread.setTextLable(textLabel);
        new Thread(textThread).start();

    }

    public static void main(String[] args) {
new CarouselFrame();
    }
}
