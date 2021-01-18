package soft2036.DataStr.week4;

import java.util.ArrayList;
/**
 * @ClassName Tup
 * @Description TODO
 * @Author msi
 * @Date 2020-10-27
 **/
public class Tup {
    int rows; //行数
    int cols; //列数
    int nums; //非零元素个数
    ArrayList<TupElem> data;

    public Tup() {
        data = new ArrayList<TupElem>();
        nums = 0;
    }

    /**
     * 创建三元组表示
     *
     * @param A
     * @param m
     * @param n
     */
    public void CreateTup(int[][] A, int m, int n) {
        //由二维数组A创建三元组表示data
        rows = m;
        cols = n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] != 0) {
                    data.add(new TupElem(i, j, A[i][j]));
                    nums++;
                }
            }

        }

    }

    /**
     * 三元组元素赋值A[i][j]=x
     *
     * @param i
     * @param j
     * @param x
     * @return
     */
    public boolean Setvalue(int i, int j, int x) {
        int k = 0;
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return false;
        }
        while (k < nums && i > data.get(k).r) {
            k++;
        }
        while (k < nums && i == data.get(k).r && j > data.get(k).c) {
            k++;
        }
        if (data.get(k).r == i && data.get(k).c == j) {
            data.set(k, new TupElem(i, j, k));
        } else {
            data.add(k, new TupElem(i, j, k));
            nums++;
        }
        return true;
    }

    /**
     * 执行x=A[i][j]
     *
     * @param i
     * @param j
     * @return
     */
    public int GetValue(int i, int j) {
        int k = 0;
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return 0;
        }
        while (k < nums && data.get(k).r < i) {
            k++;
        }
        while (k < nums && data.get(k).r == i && data.get(k).c < j) {
            k++;
        }
        if (data.get(k).r == i && data.get(k).c == j) {
            return data.get(k).d;
        }
        return 0;
    }

    /**
     * 输出三元组表示
     */
    public void DispTup() {
        if (nums <= 0) {
            return;
        }
        System.out.println("行数=%d,列数=%d,非0元素个数=%d\n" + rows + cols + nums);
        for (int i = 0; i < nums; i++) {
            System.out.println("%5d%5d%5d\n" + data.get(i).r + data.get(i).d + data.get(i).c);
        }

    }

    public static void main(String[] args) {

        TupElem<Integer> tupElem = new TupElem(1, 2, 3);
        System.out.println(tupElem.toString());
        Tup tup1 = new Tup();
        tup1.rows = 5;
        tup1.cols = 6;
        tup1.nums = 7;
//        System.out.println(tup.CreateTup();
    }
}
