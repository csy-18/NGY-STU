package soft2036.Java.week10;

import java.awt.*;
import java.util.Random;

public class LineThread implements Runnable{
    private int x=300;
    private int y=100;
    private Frame frame;

    private Color[] colors ={ Color.DARK_GRAY,Color.CYAN,Color.blue
    ,Color.PINK,Color.ORANGE,Color.WHITE};

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //得到传入的窗体对象的绘图对象(2d)
            Graphics graphics =this.frame.getGraphics();
            Random random=new Random();
            int index = random.nextInt(colors.length);
            //设置画笔颜色
            graphics.setColor(colors[index]);
            graphics.drawLine(x,y,400,600);
            x +=50;
            y +=30;
            if (x>=1000){
                break;
            }
        }
    }
}
