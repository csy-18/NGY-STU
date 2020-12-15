package soft2036.Java.week11;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ClockFrame extends JFrame {
    private JLabel timeLabel;
    private JPanel timePanel;
    private TimerTask timerTask;
    private ScheduledExecutorService mScheduledExecutorService = Executors.newScheduledThreadPool(4);

    public ClockFrame() throws HeadlessException {
        init();
        setTitle("ClockFrame");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        timeLabel = new JLabel();
        timePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                //绘制背景图
                Image bg = null;
                try {
                    bg = ImageIO.read(new File("C://Users//MSI//Documents//头像大礼包//img427.jpg"));
                    g.drawImage(bg, 0, 0, getWidth(), getHeight(), null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        Font font = new Font("微软雅黑", Font.BOLD, 20);
        timeLabel.setFont(font);
        timePanel.setPreferredSize(new Dimension(300, 400));
        timePanel.setBackground(new Color(255, 200, 0));
        timePanel.add(timeLabel);
        add(timePanel);
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String strDate = dtf.format(time);
        timeLabel.setText(strDate);
        //创建定时任务
        timerTask =new TimerTask() {
            @Override
            public void run() {
                LocalDateTime time=LocalDateTime.now();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String strDate = dtf.format(time);
                timeLabel.setText(strDate);
                //
                if ("2020-12-14 15:10:00".equals(strDate)){
                    JOptionPane.showMessageDialog(timePanel,"NO.1");
                }
//                if ("2020-12-14 15:05:05".equals(strDate)){
//                    JOptionPane.showMessageDialog(timePanel,"NO.1");
//                }
            }
        };
//        mScheduledExecutorService.scheduleWithFixedDelay(timerTask,2,1,TimeUnit.SECONDS);
//        mScheduledExecutorService.scheduleAtFixedRate(timerTask,5,1,TimeUnit.SECONDS);



    }

    public static void main(String[] args) {
        new ClockFrame();
    }

    private class Builder extends JFrame{
    }
}
