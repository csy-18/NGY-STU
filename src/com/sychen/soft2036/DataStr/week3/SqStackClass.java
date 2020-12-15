package soft2036.DataStr.week3;

import java.util.Arrays;

/**
 * @ClassName SqStackClass
 * @Description 顺序栈泛型类<E>
 * @Author msi
 * @Date 2020-10-20
 **/
public class SqStackClass<E> {
    final int initcapacity = 10;
    private int capacity;
    private E[] data;
    private int top;

    public SqStackClass() {
        data = (E[]) new Object[initcapacity];
        capacity = initcapacity;
        top = -1;
    }

    public SqStackClass(E[] data, int top) {
        this.data = data;
        this.top = top;
    }

    @Override
    public String toString() {
        return "SqStackClass{" +
                "data=" + Arrays.toString(data) +
                ", top=" + top +
                '}';
    }

    private void updatecapacity(int newcapacity) {
        E[] newdata = (E[]) new Object[newcapacity];
        for (int i = 0; i < top; i++) {
            newdata[i] = data[i];
        }
        capacity = newcapacity;
        data = newdata;
    }

    /**
     * 判断栈是否为空
     */
    public boolean empty() {
        return top == -1;
    }

    /**
     * 进栈push(e)
     */
    public void push(E e) {
        if (top == capacity - 1) {
            updatecapacity(2 * (top + 1));
        }
        top++;
        data[top] = e;
    }

    /**
     * 出栈pop
     */
    public E pop() {
        if (empty()) {
            throw new IllegalArgumentException("栈空");
        }
        E e = (E) data[top];
        top--;
        if (top + 1 > initcapacity && top + 1 == capacity / 4) {
            updatecapacity(capacity / 2);
        }
        return e;
    }

    /**
     * 取栈顶元素
     */
    public E peek() {
        if (empty()) {
            throw new IllegalArgumentException("栈空");
        }
        return (E) data[top];
    }
}
