package week3;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Point
 * @Description TODO
 * @Author msi
 * @Date 2020-10-19
 **/
public class Point {
    private Integer x;
    private Integer y;


    public Point() {
        System.out.println("点被初始化");
    }

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        System.out.println("带参数的点被初始化");
    }

    public void print() {
        System.out.println("横坐标：" + this.x + "纵坐标：" + this.y);
    }

    public static double distance(Point point1, Point point2) {
        double i = Math.pow((point1.x - point2.x), 2);
        double o = Math.pow((point1.y - point2.y), 2);
        double c = Math.sqrt(i + o);
        return c;
    }
}
