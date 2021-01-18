package soft2036.Java.last.JDBC;

import java.sql.*;

public class TestJdbc2 {
    public static final String Url="jdbc:mysql://localhost:3306/crm?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=GMT%2B8";
    public static final String username="root";
    public static final String password="123456";
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        //导入JAR包并注册驱动
        try {
            //获取数据库连接对象
            connection= DriverManager.getConnection(Url,username,password);
            //获取执行sql的对象
            statement=connection.createStatement();
            //定义sql语句
            //查询t_admin表
            String sql_select="select * from t_admin";
            resultSet=statement.executeQuery(sql_select);
            while (resultSet.next()){
                String name=resultSet.getString("name");
                System.out.println("姓名:"+name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
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
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
