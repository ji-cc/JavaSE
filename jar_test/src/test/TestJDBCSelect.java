package test;
import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBCSelect {
    // 数据库的查找操作
    public static void main(String[] args) throws SQLException {
        // 1.创建DataSource对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setURL("jdbc:mysql://127.0.0.1:3306/mysql1? serverTimezone=UTC&useSSL=true");
        // 设置用户名和密码,与mysql密码一致
        ((MysqlDataSource) dataSource).setUser("root");   // 设置用户名：安装数据库时没有显式设置用户名,默认用户名都为root
        ((MysqlDataSource) dataSource).setPassword("1111");   // 数据库密码
        // 2.创建Connection对象，和数据库建立连接
        Connection connection =  dataSource.getConnection();    // 出现异常java.sql.SQLException,此时要处理异常,之后就会在main之后出现throws SQLException

        // 3.借助PrepareStatement 拼装SQL语句
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);

        // 4.执行SQL语句
        ResultSet resultSet = statement.executeQuery();    // ResultSet 表示select查找结果的结果集

        // 5.遍历结果集   // 遍历过程和使用迭代器遍历集合类有点像
        // 结果集相当于一张表，这个表里有很多行，每一行是一条记录（又包含很多列）
        // next() 一方面是判定当前是否存在下一行，另一方面如果存在下一行就获取到这一行
        // 可以直观的把resultSet 对象想象成一个“光标”
        // 初始情况下resultSet的光标不指向任何记录。第一次调用next就会判定当前结果集是否为空，为空时next返回false,非空时，next就会返回true同时让光标指向第一行记录
        // 后续再循环执行到next，仍然是先判定下一行是否存在，不存在就返回false,存在就返回true，同时让光标指向下一行
        while(resultSet.next()) {
            // resultSet的光标指向了当前行，就可以把当前行中的列数都获取到
            // 当前表中的每一行包含3个列，id, name, classId, 根据列名来获取对应的列数据
            // 此处参数中写的列名。就必须和数据库表结构中的列名完全一致
//            +------+--------+---------+
//            | id   | name   | classId |
//            +------+--------+---------+
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int classId = resultSet.getInt("classId");
            System.out.println("id:" + id + "name: " + name + "classId :" + classId);
//            id:1name: 小王classId :10

        }
        // 6.关闭释放资源
        //后创建的对象要先释放
        resultSet.close();
        statement.close();
        connection.close();

    }}
