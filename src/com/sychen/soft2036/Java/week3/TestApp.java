package week3;

/**
 * @ClassName TestApp
 * @Description TODO
 * @Author msi
 * @Date 2020-10-19
 **/
public class TestApp {
    public static void main(String[] args) {

//        point1.print();
        System.out.println("======");
//        Circle circle=new Circle(10,20,5);
//        circle.getArea();
//        CyLinder cyLinder=new CyLinder(10,20,5,6);
//        cyLinder.print();
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        double d = Point.distance(point1, point2);
        System.out.println(d);
        Circle circle = new Circle(5, 5, 3);
        double a = Point.distance(circle, point1);
        if (a > circle.r) {
            System.out.println("不在圆内");

        } else {
            System.out.println("在圆内");
        }

    }
}
