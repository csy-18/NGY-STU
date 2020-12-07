package soft2036.Java.week10.work;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeThread implements Runnable{
    private JLabel timeLable;

    public void setTimeLable(JLabel timeLable) {
        this.timeLable = timeLable;
    }

    @Override
    public void run() {
        while (true){
            LocalDateTime time=LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String strDate = dtf.format(time);
            timeLable.setText(strDate);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
