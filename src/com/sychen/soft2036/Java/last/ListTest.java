package soft2036.Java.last;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("陈思远");
        list.add("18852099661");
        list.forEach(System.out::println);
    }
}
