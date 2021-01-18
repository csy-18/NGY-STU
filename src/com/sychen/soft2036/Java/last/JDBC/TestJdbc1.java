package soft2036.Java.last.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJdbc1 {
    public static void main(String[] args) throws Exception {
        //1、导入JAR包
        //2、注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        //3、获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=GMT%2B8", "root", "123456");
        //4、定义Sql语句
        //查询crm数据库的admin表
        String sql1 = "select * from t_admin";
        //新增字段
        String sql2 = "insert into t_admin values('2','csy4','1234','csy',null)";
        //修改字段
        String sql3 = "Update t_admin set account='陈思远' where id ='4' ";
        //删除字段
        String sql4="delete from t_admin where id = '4'";
        //5、获取执行sql的对象
        Statement statement = conn.createStatement();
        //6、执行sql
        //执行新增sql2语句
        // int count = statement.executeUpdate(sql2);
        //执行修改字段
//        int count = statement.executeUpdate(sql3);
        //执行删除语句
        int count=statement.executeUpdate(sql4);
        //成功返回1
        System.out.println(count);
        //执行查询sql1语句
        ResultSet resultSet = statement.executeQuery(sql1);
        while (resultSet.next()) {
            //通过字符id得到数据库的字符赋值给tid
            String Sid = resultSet.getString("id");
            int int_id = resultSet.getInt(1);
            String Saccount = resultSet.getString("account");
            String Spassword = resultSet.getString("password");
            String Sname = resultSet.getString("name");
//            System.out.println("通过字符串得到id:"+Sid);
//            System.out.println("通过Int型得到id:"+int_id);
            System.out.println("id:" + int_id + ",账户:" + Saccount
                    + ",密码:" + Spassword + ",姓名:" + Sname);
        }
        //释放资源
        conn.close();
        statement.close();
    }
}
