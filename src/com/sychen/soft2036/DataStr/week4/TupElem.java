package week4;

/**
 * @ClassName TupElem
 * @Description TODO
 * @Author msi
 * @Date 2020-10-27
 **/
public class TupElem<E> {
    int r;
    int c;
    int d;

    public TupElem(int r1, int c1, int d1) {
        this.r = r1;
        this.c = c1;
        this.d = d1;
    }

    @Override
    public String toString() {
        return "TupElem{" +
                "r=" + r +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public TupElem() {

    }
}
