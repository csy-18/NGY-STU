package soft2036.DataStr.week1;

/**
 * @ClassName Exam
 * @Description TODO
 * @Author msi
 * @Date 2020/10/7
 **/

public class Exam {
    private static void swap(DLinkNode1<Integer> p, DLinkNode1<Integer> q) {
        int tmp = p.data;   //交换p,q结点
        p.data = q.data;
        q.data = tmp;
        tmp = p.freq;
        p.freq = q.freq;
        q.freq = tmp;

    }

    /**
     * 查找值为x的结点
     */

    public static boolean LocateElem(DLinkListClass1<Integer> L, Integer x) {
        DLinkNode1<Integer> p, pre;
        p = L.dhead.next;           //p指向开始结点
        while (p != null && !p.data.equals(x))
            p = p.next;
        if (p == null)
            return false;
        p.freq++;        //找到值为x的结点p
        pre = p.prior;
        while (pre != L.dhead && pre.freq < p.freq) {   //若p.freq比前驱大，两者值交换
            swap(pre, p);
            p = pre;
            pre = p.prior;             //p、pre同步前移

        }
        return true;               //成功找到值为x的结点返回真
    }

    public static void Find(DLinkListClass1<Integer> L, Integer x) {
        System.out.println("查找值为" + x + "的结点");
        if (LocateElem(L, x))
            System.out.println("查找成功，双链表L：" + L.toString());
        else
            System.out.println("查找失败");
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5};
        DLinkListClass1<Integer> L = new DLinkListClass1<Integer>();
        L.CreateListR(a);
        System.out.println("L:" + L.toString());
        Find(L, 5);
        Find(L, 1);
        Find(L, 2);
        Find(L, 3);
        Find(L, 4);

    }
}
