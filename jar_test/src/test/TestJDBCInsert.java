package test;

//数据库连接connection
//        connection 接口实现类由数据库提供，获取connection对象通常有两种方式：
//        一种是通过DriverManger（驱动管理类）的静态方法获取：
//        // 加载JDBC驱动程序
//        Class.forName("com.mysql.jdbc.Driver");
//        // 创建数据库连接
//        Connection connection = DriverManager.getConnection(url);
//        一种是通过DataSource（数据源）对象获取。实际应用中会使用DataSource对象。
//        DataSource ds = new MysqlDataSource();
//        ((MysqlDataSource) ds).setUrl("jdbc:mysql://localhost:3306/test");
//        ((MysqlDataSource) ds).setUser("root");
//        ((MysqlDataSource) ds).setPassword("*****");
//        Connection connection = ds.getConnection();
//
//        JBDC里面提供了两套API:
//        1.创建DataSource对象（准备工作）
//        2.基于DataSource对象，创建Connection对象，和数据库建立连接（打开了客户端，输入了密码，连接成功了）
//        3.PrepareStatement对象拼装一个具体的SQL语句（客户端中输入了SQL的过程）
//        4.拼装好SQL之后，需要执行SQL(客户端中敲下回车，此时SQL就被发到服务器)
//        5.查看服务器返回的结果（客户端显示出结果）
//        6.关闭连接，释放资源（退出客户端）

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// JDBC的代码看起来麻烦，其实写多了之后，发现都是固定套路
public class TestJDBCInsert {
    // 数据库的插入操作
    public static void main(String[] args) throws SQLException {
        // 1.创建DataSource对象（DataSource对象的生命周期应该要跟随整个程序）
        DataSource dataSource = new MysqlDataSource();
        // 接下来需要针对dataSource进行一些配置，以便后面能够顺利的访问到数据库服务器
        // 主要配置三方面信息，URL, User, Password 需要进行向下转型
        // 向下转型                     协议名：jdbc:mysql://       mysql1:要访问的数据库名字  具体要配置的参数    useSSL=true：可选的，表示是否要加密访问数据库
        ((MysqlDataSource) dataSource).setURL("jdbc:mysql://127.0.0.1:3306/mysql1? serverTimezone=UTC&useSSL=true");
        //                                |      IP地址127.0.0.1 MySQL是通过网络访问的，ip地址相当于描述要访问网络上的哪个主机
        //             需要指定访问那个数据库服务器以及访问哪个服务器中的数据库      characterEncoding=utf-8：指定字符集：字符集要和数据库服务器配置的字符集一致，否则就会中文乱码
        //                                                         3306:端口号，为了区分开一台主机上的多个服务器        serverTimezone=UTC
        ((MysqlDataSource) dataSource).setUser("root");   // 设置用户名：安装数据库时没有显式设置用户名,默认用户名都为root
        ((MysqlDataSource) dataSource).setPassword("1111");   // 数据库密码，与mysql密码一致
        // 2.和数据库建立连接,建立连接好了之后就可以进行后续的数据传输了
        // 建立连接的意义就是为了验证当前的网络通信是否正常
        // 如果不正确，就会跑出SQLException异常
        // connection 对象生命周期应该是较短的，每个请求创建一个新的connection
        // 选择java.sql中的Connection,一定要确认connection的类时java.sql包中的类。
        Connection connection =  dataSource.getConnection();    // 出现异常java.sql.SQLException,此时要处理异常,之后就会在main之后出现throws SQLException

        // 3.拼装SQL语句，用到PrepareStatement对象
        // 先以插入数据为例
        // 当前实例中药插入的数据内容都是写死的，其实也可以让程序在运行时获取到动态的拼接进去
        //String sql = "insert into student values(1, '小王', 10)";
        int id = 1;
        String name = "小王";
        int classId = 10;
        // ?是一个占位符，可以把具体的变量的值替换到？位置
        String sql = "insert into student values(?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        // 这里的1 2 3相当于 ? 的下标（从1开始算）  替换占位符
        statement.setInt(1,id);
        statement.setString(2, name);
        statement.setInt(3, classId);
        System.out.println("statement: " + statement);
        //statement: com.mysql.cj.jdbc.ClientPreparedStatement: insert into student values(1, '小王', 10)

        // 4.拼装完毕之后，可以执行SQL了
        // insert delete update 都使用executeUpdate方法来执行
        // select 就使用executeQuery 来执行
        // 返回值表示此次操作修改了多少行
        int ret = statement.executeUpdate();
        System.out.println("ret:" + ret);
        // ret:1

        // 5.执行完毕之后，关闭释放相关资源
        // 释放的顺序不能错， 一定是后创建的先被释放
        statement.close();
        connection.close();

    }
}
