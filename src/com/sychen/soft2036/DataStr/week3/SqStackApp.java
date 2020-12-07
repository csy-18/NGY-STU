package week3;

/**
 * @ClassName SqStackApp
 * @Description TODO
 * @Author msi
 * @Date 2020-10-20
 **/
public class SqStackApp {
    public static void main(String[] args) {
        SqStackClass<Integer> sqStackClass1 = new SqStackClass<Integer>();
        sqStackClass1.push(2);
        sqStackClass1.push(3);
        sqStackClass1.push(4);
        System.out.println(sqStackClass1.empty());
        System.out.println(sqStackClass1.toString());

        System.out.println("111");
        System.out.println(sqStackClass1.peek());
        sqStackClass1.pop();
        System.out.println(sqStackClass1.toString());
        sqStackClass1.pop();
        System.out.println(sqStackClass1.toString());
        System.out.println("s dadadawdwadwadawdwad adddd aw dwaeq eewadwadddddddddddddddddda");
    }
}
