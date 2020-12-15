package soft2036.Java.week10;

import javax.swing.*;

public class NumberThread implements Runnable {
    private JLabel numLabel;

    public void setNumLabel(JLabel numLabel) {
        this.numLabel = numLabel;
    }

    private final Object lock = new Object();
    private boolean pause = false;

    /**
     * 线程暂停
     */
    void pauseThread() {
        pause = true;
    }

    /**
     * 线程运行
     */
    void resumeThread() {
        pause = false;
        synchronized (lock) {
            lock.notify();
        }
    }

    void onPause() {
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        int index = 0;
        while (true) {
            while (pause) {
                onPause();
            }
            try {
                numLabel.setText(String.valueOf(index));
                Thread.sleep(500);
                ++index;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
