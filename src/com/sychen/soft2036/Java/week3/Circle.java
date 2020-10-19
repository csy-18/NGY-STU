package week3;

/**
 * @ClassName Circle
 * @Description TODO
 * 创建两个point对象求两点之间距离
 * 创建一个point对象判断该点是否在circle圆内
 * @Author msi
 * @Date 2020-10-19
 **/
public class Circle extends Point {
    int r;

    public Circle(Integer x, Integer y,int r) {
        super(x, y);
        this.r=r;
        System.out.println("⚪被初始化");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("圆的面积："+Math.PI*r*r);
    }
    public double getArea(){
        System.out.println(Math.PI*r*r);
        return 1;
    }

}
