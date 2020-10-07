package com.sychen.soft2036.DataStr.LocateElem;

/**
 * @ClassName DLinkListClass1
 * @Description TODO
 * @Author msi
 * @Date 2020/10/7
 **/
public class DLinkListClass1<E> {
    DLinkNode1<E> dhead;

    public DLinkListClass1() {
        dhead = new DLinkNode1<E>();
        dhead.next = null;
        dhead.prior = null;


    }
    public void CreateListR(E[] a){
        DLinkNode1<E> s,t;
        t=dhead;
        for (int i = 0; i <a.length ; i++) {
            s=new DLinkNode1<>(a[i]);
            t.next=s;
            s.prior=t;
            t=s;
        }
        t.next=null;
    }

    @Override
    public String toString() {       //将线性表转换为字符串
        String ans="";
        DLinkNode1<E> p=dhead.next;
        while (p!=null){
            ans+=p.data+"["+p.freq+"]";
            p=p.next;
        }
        return ans;
    }
}
