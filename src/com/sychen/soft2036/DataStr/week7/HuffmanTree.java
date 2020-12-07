package DataStr.week7;

import java.util.*;

/**
 * @ClassName HuffmanTree
 * @Description TODO
 * @Author csy
 * @Date 2020-11-17
 */


public class HuffmanTree {

    public static void main(String[] args) {
        int arr[] = {10, 20, 5, 15, 8, 2, 3, 7, 30};
        Node root = createHuffmanTree(arr);
        root.preOrder();


        //测试一把

    }

    //编写一个前序遍历的方法
    public static void preOrder(Node root) {
        if (root != null) {
            root.preOrder();
        } else {
            System.out.println("是空树，不能遍历~~");
        }
    }

    // 创建赫夫曼树的方法

    /**
     * @param arr 需要创建成哈夫曼树的数组
     * @return 创建好后的赫夫曼树的root结点
     */
    public static Node createHuffmanTree(int[] arr) {
        List<Node> nodesList = new ArrayList<Node>();
        for (int value : arr) {
            nodesList.add(new Node(value));
        }
        //2、用循环创建哈夫曼树
        while (nodesList.size() > 1) {
            //1)排序
            Collections.sort(nodesList);
            //2)取集合中权值最小的两个结点
            Node leftNode = nodesList.get(0);
            Node rightNode = nodesList.get(1);
            //3）构建一颗新的二叉树
            Node parentNode = new Node(leftNode.value + rightNode.value);
            parentNode.left = leftNode;
            parentNode.right = rightNode;
            //4)对集合进行更新
            //移除两个子节点
            nodesList.remove(leftNode);
            nodesList.remove(rightNode);
            //增加父节点
            nodesList.add(parentNode);
        }
        return nodesList.get(0);
    }

    public static void WPL() {

    }
}


// 创建结点类
// 为了让Node 对象持续排序Collections集合排序
// 让Node 实现Comparable接口
class Node implements Comparable<Node> {
    int value; // 结点权值
    char c; //字符
    Node left; // 指向左子结点
    Node right; // 指向右子结点

    //写一个前序遍历
    public void preOrder() {
        System.out.print(this.value + " ");
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    public Node(int value) {
        this.value = value;
    }

    //@Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

    //@Override
    public int compareTo(Node o) {
        // TODO Auto-generated method stub
        // 表示从小到大排序
        return this.value - o.value;
    }

}
