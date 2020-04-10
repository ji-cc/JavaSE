package com.cc;

import com.cc.book.BookList;
import com.cc.user.AdminUser;
import com.cc.user.NormalUser;
import com.cc.user.User;

import java.util.Scanner;

public class Main {
    //登录
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名： ");
        String name = scanner.next();
        System.out.println("请输入您的身份：1.管理员    2.普通用户");
        int num = scanner.nextInt();
        if(num == 1) {
            return new AdminUser(name);
        }
        if(num == 2) {
            return new NormalUser(name);
        }
        return null;
    }

    //
    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();
        //登录
        User user = login();
        while(true) {
            int choice = user.menu();  //选择要进行的操作
            user.doOperation(choice, bookList);
        }
    }
}
