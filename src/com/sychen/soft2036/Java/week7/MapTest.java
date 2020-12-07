package Java.week7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author csy
 * @Date 2020-11-16
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(8);
        map.put("apple", 12);
        map.put("pear", 8);
        map.put("banana", 24);

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "单价为：" + value);
        }

        System.out.println("iterator遍历");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "单价为：" + entry.getValue());
        }
        System.out.println("lambda表达式遍历");
        map.forEach((key, value) -> {
            System.out.println("key:" + key + ",value:" + value);
        });
        System.out.println("通过遍历Mapd entrySer,遍历key和value");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "单价为：" + entry.getValue());
        }
        System.out.println("通过遍历Map 的value 只能遍历 value 获取不到key");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

    }
}
