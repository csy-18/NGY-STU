package soft2036.Java.week7;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapTest2
 * @Description TODO
 * @Author csy
 * @Date 2020-11-16
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "CoreJava");
        map.put("Allen", "JDBC");
        //for循环遍历
        System.out.println("for循环遍历");
        for (String teacher : map.keySet()) {
            String sub = map.get(teacher);
            System.out.println("老师：" + teacher + "科目为：" + sub);
        }
        System.out.println("lambda表达式遍历");
        map.forEach((teacher, sub) -> {
            System.out.println("老师:" + teacher + ",科目:" + sub);
        });

        map.forEach((teacher, sub) -> {
            if (sub.equals("JDBC")) {
                System.out.println("只教JDBC的老师：" + teacher);
            }
        });


    }
}
