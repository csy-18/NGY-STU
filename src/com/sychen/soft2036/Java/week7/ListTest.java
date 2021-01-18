package soft2036.Java.week7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @ClassName ListTest
 * @Description TODO
 * @Author csy
 * @Date 2020-11-16
 */
public class ListTest {

    public static void main(String[] args) {
        //创建一个List接口的实现类的对象，泛型为String
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("Java1");
        list.add("JS");
        list.add("Java2");
        //随机取出list中某个元素
        Random random = new Random();
        int n = random.nextInt(list.size());
        String a = list.get(n);
        System.out.println(a);
        //用for循环遍历list
        System.out.println("用for循环遍历list");
        for (String s : list) {
            System.out.println(s + " ");
        }
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ",");
        }
        //用lambda表达式遍历list
        System.out.println("用lambda表达式遍历list");
        list.forEach(s -> System.out.println(s));
        System.out.println("简单版本");
        list.forEach(System.out::print);
    }
}
