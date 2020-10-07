package com.sychen.soft2036.DataStr.LocateElem;

/**
 * @ClassName DLinkNode
 * @Description TODO
 * @Author msi
 * @Date 2020/10/7
 **/

public class DLinkNode1<E>{
    E data; //双链表结点泛型类
    int freq;
    DLinkNode1<E> prior;
    DLinkNode1<E> next;

    public DLinkNode1() {
        freq = 0;
       prior = null;
        next = null;
    }

    public DLinkNode1(E d) {
        data = d;
        freq = 0;
        prior = null;
        next = null;
    }


}
