package soft2036.Java.last;

import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time= sdf.format(new Date());
        System.out.println(time);
    }
}
