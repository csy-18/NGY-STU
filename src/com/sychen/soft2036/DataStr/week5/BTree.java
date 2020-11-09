package DataStr.week5;

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
        while (i<str.length()){
            ch=str.charAt(i);
            switch (ch){
                case '(':
                    stack.push(p);
                    flag=true;
                    break;
                case ')':
                    stack.pop();
                    break;
                case ',':
                    flag=false;
                    break;
                default:
                    p=new BTNode<Character>(ch);
                    if (b==null) b=p;
                    else {
                        if (flag)
                        {
                            if (!stack.empty())
                                stack.peek().ichild=p;
                        }else {
                            if (!stack.empty())
                                stack.peek().rchild=p;
                        }
                    }
                    break;
            }
            i++;
        }
    }

    @Override
    public String toString() {
        bstr="";
        toString1(b);
        return bstr;
    }
    private void toString1(BTNode<Character> t){
        if (t!=null){
            bstr+=t.data;
            if (t.ichild!=null||t.rchild!=null){
                bstr+="(";
                toString1(t.ichild);
                if (t.rchild!=null)
                    bstr+=",";
                toString1(t.rchild);
                bstr+=")";
            }
        }
    }

    public BTNode<Character> FindNode(char x) {
        return FindNode1(b,x);
    }
    private BTNode<Character> FindNode1(BTNode<Character> t,char x){
        BTNode<Character> p;
        if (t==null)
            return null;
        else if (t.data==x)
            return t;
        else {
            p=FindNode1(t.ichild,x);
            if (p!=null)
                return p;
            else
                return FindNode1(t.rchild,x);
        }

    }
    public int Height(){
        return Height1(b);
    }
    private int Height1(BTNode<Character> t){
        int ichild,rchild;
        if (t==null)
            return 0;
        else {
            ichild=Height1(t.ichild);
            rchild=Height1(t.rchild);
            return Math.max(ichild,rchild)+1;
        }
    }
    private void degree(){
        degree1(b);
    }
    private void degree1(BTNode<Character> t){
        if (t.ichild!=null&&t.rchild!=null){
            count++;
        }
        System.out.println(count);
    }



    public static void main(String[] args) {
        String data;
        String data1;
        data1="A(B(D,E(,H)),C(F,G(I,)))";
        data="A(B(D(,G)),C(E,F))";
        System.out.println("括号表示法"+data1);
        BTree bTree =new BTree();
        bTree.CreateBTree(data1);
        System.out.println("树的结果："+bTree.toString());
        System.out.println("查找：");
        BTNode node= bTree.FindNode('D');
        System.out.println(node.data);
        System.out.println("高度为："+bTree.Height());
        bTree.degree();
    }
}
