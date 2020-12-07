package week3;

/**
 * @ClassName CyLinder
 * @Description TODO
 * @Author msi
 * @Date 2020-10-19
 **/
public class CyLinder extends Circle {
    private int h;

    public CyLinder(Integer x, Integer y, int r, int h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("圆柱的体积" + super.getArea() * this.h);
    }
}
