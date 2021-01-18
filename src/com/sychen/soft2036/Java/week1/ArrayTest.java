package soft2036.Java.week1;

import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * 在代码上完成
 * 1在一个循环中，找出最大值、最小值、求和
 * 2用两种排序方式，对数组进行排序
 * @Author msi
 * @Date 2020/10/11
 **/
public class ArrayTest {
    static int MAX = 5;

    public static void main(String[] args) {
        int[] a = new int[MAX];
        Random random = new Random();  //创建随机种子
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(100);  //循环生成100以内的随机整数赋值给数组
            System.out.println(a[i] + "");
        }

        int max = a[0];
        int min = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        for (int k = 0; k < a.length - 1; k++) {
            if (max < a[k]) {
                max = a[k];
            }
            if (min > a[k]) {
                min = a[k];
            }
        }
        System.out.println("当前数组中的最小值为" + min + ",最大值为" + max);
        System.out.println("数组求和：" + sum);
    }


}
