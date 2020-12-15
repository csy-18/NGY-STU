package soft2036.DataStr.week5;

public class BTNode<E> {
    E data;
    BTNode<E> ichild;
    BTNode<E> rchild;

    public BTNode() {
        ichild = rchild = null;
    }

    public BTNode(E d) {
        data = d;
        ichild = rchild = null;
    }
}
