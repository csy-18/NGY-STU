package soft2036.Java.week10;

import javax.swing.*;
import java.awt.*;

public class LineFrame extends JFrame {

    public LineFrame() throws HeadlessException {
        frameinit();
        getContentPane().setBackground(Color.BLACK);
        setTitle("Line frame");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void frameinit(){
        LineThread lt =new LineThread();
        lt.setFrame(this);
        new Thread(lt).start();

    }

    public static void main(String[] args) {
new LineFrame();
    }
}
