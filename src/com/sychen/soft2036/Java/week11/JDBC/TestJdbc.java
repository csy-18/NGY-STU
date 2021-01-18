package soft2036.Java.week11.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @ClassName TestJdbc
 * @Description TODO
 * @Author csy
 * @Date 2020-11-6
 */
public class TestJdbc {
    public static void main(String[] args) throws Exception {
        //1、导入驱动jar包
        //2、注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        //3、获取数据库链接对象
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sch","root","123456");
        //4、定义sql语句
//        String sql="update student set sname ='csy' WHERE sno='1'";
        //5、获取执行sql的对象 Statement
        Statement statement = conn.createStatement();
        //6、执行sql
        int count = statement.executeUpdate("update student set sname ='123' WHERE sno='1'");
//        ResultSet count= statement.executeQuery("select * from student");
        //7、处理结果
        System.out.println(count);
        //8、释放资源
        statement.close();
        conn.close();


    }
}
