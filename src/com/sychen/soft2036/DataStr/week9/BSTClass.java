package DataStr.week9;

/**
 * @ClassName BSTClass
 * @Description TODO
 * @Author csy
 * @Date 2020-12-1
 */
public class BSTClass {
    public BSTNode r;
    private BSTNode f;

    public BSTClass() {
        r = null;
    }

    //插入一个关 键字为k的结点
    public void InsertBST(int k) {
        InsertBST1(r, k);

    }

    //在以p为根的BST中插入关键字为k的结点
    private BSTNode InsertBST1(BSTNode p, int k) {
        if (p == null) { //空,新插入的元素为根结点
            p = new BSTNode();
            p.key = k;
        } else if (k < p.key)
            p.lchild = InsertBST1(p.lchild, k); //插入到p的左子树中
        else if (k > p.key)
            p.rchild = InsertBST1(p.rchild, k); //插入 到p的右子树中
        return p;

    }

    public void CreateBST(int[] a) { //由关键字序列a创建一棵二叉排序树
        r = new BSTNode();
        r.key = a[0];
        for (int i = 1; i < a.length; i++) //创建其他结点
            InsertBST1(r, a[i]);
    }

    public static void main(String[] args) {

    }
}

class BSTNode {//二叉排序树结点类
    public int key;//存放关键字,假设关键字为int类型
    public BSTNode lchild;//存放左孩子指针
    public BSTNode rchild; //存放右孩子指针

    BSTNode() {
        lchild = rchild = null;
    }
}








