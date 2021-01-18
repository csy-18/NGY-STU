package soft2036.Java.week11.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName TestJdbc1
 * @Description TODO
 * @Author csy
 * @Date 2020-11-8
 */
public class TestJdbc1 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql:///sch", "root", "123456");
            String sql = "INSERT INTO student VALUES('5','csy','男','2020-11-8','2036','1')";
            String sql1 = "update student set sname='111' where sno='3'";
            String sql2 = "delete from student where sno='3'";
            statement = connection.createStatement();
            int count = statement.executeUpdate(sql2);
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
