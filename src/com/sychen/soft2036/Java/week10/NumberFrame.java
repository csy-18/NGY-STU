package soft2036.Java.week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberFrame extends JFrame implements ActionListener {
    private JButton pauseBtn,resumeBtn;
    public NumberThread numberThread;

    public NumberFrame() throws HeadlessException {
        init();
        setTitle("线程恢复与暂停");
        setSize(500,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init(){
        pauseBtn=new JButton("暂停");
        resumeBtn=new JButton("恢复");
        pauseBtn.addActionListener(this);
        resumeBtn.addActionListener(this);
        JLabel numberLabel=new JLabel();
        numberLabel.setFont(new Font("微软雅黑", Font.BOLD,50));
        setLayout(new FlowLayout(FlowLayout.CENTER,30,100));
        add(numberLabel);
        add(pauseBtn);
        add(resumeBtn);
        numberThread=new NumberThread();
        numberThread.setNumLabel(numberLabel);
        Thread thread=new Thread(numberThread);
        thread.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==pauseBtn){
            numberThread.pauseThread();
        }
        if (e.getSource()==resumeBtn){
            numberThread.resumeThread();
        }
    }

    public static void main(String[] args) {
        new NumberFrame();
    }
}
