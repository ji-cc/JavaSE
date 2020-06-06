package test;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJDBCDelete {
    //数据库的删除操作，删除姓名为小红的学生
//    mysql> select * from student;
//            +------+--------+---------+
//            | id   | name   | classId |
//            +------+--------+---------+
//            |    2 | 小红   |      20 |
//            |    1 | 小王   |      10 |
//            +------+--------+---------+
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生的姓名：");
        String name = scanner.next();

        // 1.创建DataSource对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setURL("jdbc:mysql://127.0.0.1:3306/mysql1? serverTimezone=UTC&useSSL=true");
        // 设置用户名和密码,与mysql密码一致
        ((MysqlDataSource) dataSource).setUser("root");   // 设置用户名：安装数据库时没有显式设置用户名,默认用户名都为root
        ((MysqlDataSource) dataSource).setPassword("1111");   // 数据库密码
        // 2.创建Connection对象，和数据库建立连接
        Connection connection =  dataSource.getConnection();    // 出现异常java.sql.SQLException,此时要处理异常,之后就会在main之后出现throws SQLException
        // 3.借助PrepareStatement 拼装SQL语句
        String sql = "delete from student where name = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,name);

        // 4.执行SQL
        int ret = statement.executeUpdate();
        if (ret == 1) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
//        mysql> select * from student;
//                +------+--------+---------+
//                | id   | name   | classId |
//                +------+--------+---------+
//                |    1 | 小王   |      10 |
//                +------+--------+---------+

        // 5.关闭并释放资源
        statement.close();
        connection.close();
    }
}
