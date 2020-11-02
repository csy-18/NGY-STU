package week5;

import java.util.Arrays;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author msi
 * @Date 2020-11-1
 **/
public class Test1 {
    public static void main(String[] args) {
        int [][] mat=new int[4][];
        for (int i = 0; i <mat.length ; i++) {
            mat[i]=new int[i+1];
            System.out.println(Arrays.toString(mat[i]));
        }

    }
}
