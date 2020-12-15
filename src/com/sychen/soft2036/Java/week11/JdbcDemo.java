package soft2036.Java.week11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws Exception{
        //1、导入驱动jar包
        //2、注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        //3、获取数据库链接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///niit?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=GMT%2B8","root","123456");
        //4、定义sql语句
        String sql = "INSERT INTO stu VALUES('csy','2')";
        String sql1 = "update student set sname='111' where sno='3'";
        String sql2 = "delete from student where sno='3'";
        String sql3 = "select * from student";
        //5、获取执行sql的对象 Statement
        Statement statement = conn.createStatement();
        //6、执行sql
//        int count = statement.executeUpdate("update student set sname ='123' WHERE sno='1'");
        ResultSet count= statement.executeQuery("select * from stu");
//        int count = statement.executeUpdate(sql);
        //7、处理结果
        System.out.println(count);
        //8、释放资源
        statement.close();
        conn.close();
    }

}
