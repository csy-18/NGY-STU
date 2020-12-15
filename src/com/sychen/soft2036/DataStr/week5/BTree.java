package soft2036.DataStr.week5;

import java.util.Stack;

/**
 * 二叉树类
 */
public class BTree {
    BTNode<Character> b; //根节点
    String bstr;  //二叉树的括号表示串
    int count;

    public BTree() {
        b = null;
    }

    public void CreateBTree(String str) {
        Stack<BTNode> stack = new Stack<BTNode>();  //建立一个栈stack
        BTNode<Character> p = null;
        boolean flag = true;
        char ch;
        int i = 0;
        while (i < str.length()) {
            ch = str.charAt(i);
            switch (ch) {
                case '(':
                    stack.push(p);
                    flag = true;
                    break;
                case ')':
                    stack.pop();
                    break;
                case ',':
                    flag = false;
                    break;
                default:
                    p = new BTNode<Character>(ch);
                    if (b == null) b = p;
                    else {
                        if (flag) {
                            if (!stack.empty())
                                stack.peek().ichild = p;
                        } else {
                            if (!stack.empty())
                                stack.peek().rchild = p;
                        }
                    }
                    break;
            }
            i++;
        }
    }

    @Override
    public String toString() {
        bstr = "";
        toString1(b);
        return bstr;
    }

    private void toString1(BTNode<Character> t) {
        if (t != null) {
            bstr += t.data;
            if (t.ichild != null || t.rchild != null) {
                bstr += "(";
                toString1(t.ichild);
                if (t.rchild != null)
                    bstr += ",";
                toString1(t.rchild);
                bstr += ")";
            }
        }
    }

    public BTNode<Character> FindNode(char x) {
        return FindNode1(b, x);
    }

    private BTNode<Character> FindNode1(BTNode<Character> t, char x) {
        BTNode<Character> p;
        if (t == null)
            return null;
        else if (t.data == x)
            return t;
        else {
            p = FindNode1(t.ichild, x);
            if (p != null)
                return p;
            else
                return FindNode1(t.rchild, x);
        }

    }

    public int Height() {
        return Height1(b);
    }

    private int Height1(BTNode<Character> t) {
        int ichild, rchild;
        if (t == null)
            return 0;
        else {
            ichild = Height1(t.ichild);
            rchild = Height1(t.rchild);
            return Math.max(ichild, rchild) + 1;
        }
    }

    private void degree() {
        degree1(b);
    }

    private void degree1(BTNode<Character> t) {
        if (t.ichild != null && t.rchild != null) {
            count++;
        }
        System.out.println(count);
    }

    /**
     * 先序遍历算法
     *
     * @param
     */
    public void PreOrder1(BTree bTree) {
        PreOrder11(bTree.b);
    }

    public void PreOrder11(BTNode<Character> t) {
        if (t != null) {
            System.out.print(t.data + " ");
            PreOrder11(t.ichild);
            PreOrder11(t.rchild);
        }
    }

    /**
     * 中序遍历
     *
     * @param bTree
     */
    public void InOrder1(BTree bTree) {
        InOrder11(bTree.b);
    }

    private void InOrder11(BTNode<Character> t) {
        if (t != null) {
            InOrder11(t.ichild);
            System.out.print(t.data + " ");
            InOrder11(t.rchild);
        }
    }

    /**
     * 后序遍历算法
     *
     * @param bTree
     */
    public void PostOrder1(BTree bTree) {
        PostOrder11(bTree.b);
    }

    private void PostOrder11(BTNode<Character> t) {
        if (t != null) {
            PostOrder11(t.ichild);
            PostOrder11(t.rchild);
            System.out.print(t.data + " ");
        }
    }

    public int NodeNum(BTree bTree) {
        return NodeNum1(bTree.b);
    }

    private int NodeNum1(BTNode<Character> t) {
        int count = 0;
        if (t != null) {
            return 1 + NodeNum1(t.ichild) + NodeNum1(t.rchild);
        } else {
            return count;
        }
    }


    public static void main(String[] args) {
        String data;
        String data1;
        String data2;
        data1 = "A(B(D,E(,H)),C(F,G(I,)))";
        data2 = "A(B(D(,F(H,))),C(,E(G,)))";
        data = "A(B(D(,G)),C(E,F))";
        BTree bTree = new BTree();
        bTree.CreateBTree(data);
//        System.out.println("括号表示法" + data2);
//        BTree bTree = new BTree();
//        bTree.CreateBTree(data2);
//        System.out.println("树的结果：" + bTree.toString());
//        System.out.println("查找：");
//        BTNode node = bTree.FindNode('D');
//        System.out.println(node.data);
//        System.out.println("高度为：" + bTree.Height());
        bTree.degree();

        bTree.PreOrder1(bTree);
        System.out.println("-->先序遍历");

        bTree.InOrder1(bTree);
        System.out.println("-->中序遍历");

        bTree.PostOrder1(bTree);
        System.out.println("-->后序遍历");
        System.out.println("这棵树的总结点数：" + bTree.NodeNum(bTree));

    }

}
