package test;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.rmi.PortableRemoteObject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJDBCUpdate {
    // 数据库的修改操作
//    mysql> select * from student;
//            +------+--------+---------+
//            | id   | name   | classId |
//            +------+--------+---------+
//            |    1 | 小王   |      10 |
//            +------+--------+---------+
    public static void main(String[] args) throws SQLException {
        // 让用户输入要修改id为n的同学的姓名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生id：");
        int id = scanner.nextInt();
        System.out.println("请输入修改后的学生姓名：");
        String name = scanner.next();

        // 1.创建DataSource对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setURL("jdbc:mysql://127.0.0.1:3306/mysql1? serverTimezone=UTC&useSSL=true");
        // 设置用户名和密码
        ((MysqlDataSource) dataSource).setUser("root");   // 设置用户名：安装数据库时没有显式设置用户名,默认用户名都为root
        ((MysqlDataSource) dataSource).setPassword("1111");   // 数据库密码
        // 2.创建Connection对象，和数据库建立连接
        Connection connection =  dataSource.getConnection();    // 出现异常java.sql.SQLException,此时要处理异常,之后就会在main之后出现throws SQLException
        // 3.拼装SQL语句
        String sql = "update student set name = ? where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,name);
        statement.setInt(2,id);

        // 4.执行SQL
        int ret = statement.executeUpdate();
        if (ret == 1) {
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }

//                +------+--------+---------+
//                | id   | name   | classId |
//                +------+--------+---------+
//                |    1 | 小李   |      10 |
//                +------+--------+---------+

        // 5.关闭资源
        statement.close();
        connection.close();
    }
}
