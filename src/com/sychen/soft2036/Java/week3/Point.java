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
    public void distance(){
        return  Math.sqrt();

    }
}
