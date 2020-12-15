package soft2036.DataStr.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertSort {
    public static void insertSort(int[] a) {
        int i, j, insertNote;// 要插入的数据
        for (i = 1; i < a.length; i++) {// 从数组的第二个元素开始循环将数组中的元素插入
            insertNote = a[i];// 设置数组中的第2个元素为第一次循环要插入的数据
            j = i - 1;
            while (j >= 0 && insertNote < a[j]) {
                a[j + 1] = a[j];// 如果要插入的元素小于第j个元素,就将第j个元素向后移动
                j--;
            }
            a[j + 1] = insertNote;// 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
        }
    }

    public static void main(String[] args) {
        int arr[] = { 32,54,65,84,54,21,32,15};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}