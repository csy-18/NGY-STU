package week4;

/**
 * @ClassName Min
 * @Description TODO
 * @Author msi
 * @Date 2020-10-27
 **/
public class Min {
    public static int Min(int[] a, int low, int heigh) {
        int min;
        if (low < heigh - 2) {
            if (a[low] < a[heigh]) {
                min = a[low];
            } else {
                min = a[heigh];
            }
        } else {
            int mid = (low + heigh) / 2;
            int min1 = Min(a, low, mid);
            int min2 = Min(a, mid + 1, heigh);
            min = min1 > min2 ? min1 : min2;
        }
        System.out.println(min);
        return min;
    }

    public static void fun(int n) {
        if (n == 1) {
            System.out.print("a:%d\n");
            System.out.println(n);
        } else {
            System.out.print("b:%d\n");
            System.out.println(n);
            fun(n - 1);
            System.out.print("c:%d\n");
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        Min min = new Min();
//        min.fun(5);
    }

}
