package soft2036.Java.week11.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestJdbc3
 * @Description TODO
 * @Author csy
 * @Date 2020-11-8
 */
public class TestJdbc3 {
    public List<Stu> finaAll(){
        Connection connection=null;
        Statement statement =null;
        ResultSet resultSet =null;
        List<Stu> list =null;
        try {
            connection=DriverManager.getConnection("jdbc:mysql:///test","root","123456");
            String sql="select * from stu";
            //获取执行sql的对象
            statement= connection.createStatement();
            //执行sql
            resultSet=statement.executeQuery(sql);
            //遍历结果集，封装对象
            Stu stu =null;
            list=new ArrayList<Stu>();
            while (resultSet.next()){
                //获取数据
                int sid=resultSet.getInt(1);
                String sname = resultSet.getString("sname");
                String ssex = resultSet.getString("ssex");
                //创建stu对象
                stu=new Stu();
                stu.setSid(sid);
                stu.setSname(sname);
                stu.setSsex(ssex);
                //装载集合
                list.add(stu);
                stu.getSid();

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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
        return list;
    }
    public static void main(String[] args) {
        List<Stu> list=new TestJdbc3().finaAll();
        System.out.println(list);

    }
}
