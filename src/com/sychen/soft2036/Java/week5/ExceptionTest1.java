package week5;

import java.io.Reader;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName ExceptionTest1 运行时异常
 * @Description TODO
 * @Author msi
 * @Date 2020-11-2
 **/
public class ExceptionTest1 {
    public static void main(String[] args) {

//        int result=0;
//        try {
//            result=3/0;
//        }catch (ArithmeticException e){
//            System.err.println("除数不能为零"+new Date());
//            System.err.println(e.getMessage());
//        }
//        System.out.println(result);

        //2、ArrayIndexOutOfBoundsException数组索引越界异常
//        int [] a=new int[]{1,2,3,4,5};
//        try {
//            System.out.println(a[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("数组索引越界");
//            System.err.println("引起的原因"+e.getCause());
//            System.err.println("异常的详细信息"+e.getMessage());
//            System.err.println("异常的对象"+e.toString());
//        }

        //3、NumberFormatException数字格式化异常
//        Scanner scanner=new Scanner(System.in);
//        //从键盘读入一串字符
//        String  priceStr = scanner.nextLine();
//        try {
//            int price =Integer.parseInt(priceStr);
//            System.out.println("price="+price);
//        } catch (NumberFormatException e) {
//            System.err.println("引起的原因"+e.getCause());
//            System.err.println("异常的详细信息"+e.getMessage());
//            System.err.println("异常的对象"+e.toString());
//        }
        //4、NPE 空指针异常 NullPointerException



    }
}
