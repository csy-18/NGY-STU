package DataStr.week1;

/**
 * @ClassName DLinkNode
 * @Description TODO
 * @Author msi
 * @Date 2020/10/7
 **/

public class DLinkNode1<E> {
    E data; //双链表结点泛型类
    int freq;  //结点中元素值
    DLinkNode1<E> prior;  //结点访问频度
    DLinkNode1<E> next;  //前驱结点指针

    public DLinkNode1() {  //构造方法
        freq = 0;
        prior = null;
        next = null;
    }

    public DLinkNode1(E d) {  //重载构造方法
        data = d;
        freq = 0;
        prior = null;
        next = null;
    }


}
