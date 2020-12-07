package DataStr.week1;

/**
 * @ClassName DLinkListClass1
 * @Description TODO
 * @Author msi
 * @Date 2020/10/7
 **/
public class DLinkListClass1<E> {  //双链表泛型类
    DLinkNode1<E> dhead;  //存放头结点

    public DLinkListClass1() {
        dhead = new DLinkNode1<E>();
        dhead.next = null;
        dhead.prior = null;
    }

    /**
     * 线性表的基本运算算法
     */

    public void CreateListR(E[] a) {   //尾插法：有数组a整体建立双链表
        DLinkNode1<E> s, t;
        t = dhead;                      //t始终指向尾结点，开始指向头结点
        for (int i = 0; i < a.length; i++) {   //循环建立数据结点s
            s = new DLinkNode1<>(a[i]);   //存放a[i]元素的结点s
            t.next = s;          //将s结点插入t结点之后
            s.prior = t;
            t = s;
        }
        t.next = null;   //将尾结点的next成员置为空null
    }

    @Override
    public String toString() {       //将线性表转换为字符串
        String ans = "";
        DLinkNode1<E> p = dhead.next;
        while (p != null) {
            ans += p.data + "[" + p.freq + "]";
            p = p.next;
        }
        return ans;
    }
}
