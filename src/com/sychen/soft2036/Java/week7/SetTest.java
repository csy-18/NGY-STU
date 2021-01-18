package soft2036.Java.week7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest
 * @Description TODO
 * @Author csy
 * @Date 2020-11-16
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);
        //用for循环遍历list
        System.out.println("用for循环遍历list");
        for (String s : set) {
            System.out.println(s + ",");
        }
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ",");
        }
        //用lambda表达式遍历list
        System.out.println("用lambda表达式遍历list");
        set.forEach(s -> System.out.println(s));
        System.out.println("简单版本");
        set.forEach(System.out::print);

    }
}
