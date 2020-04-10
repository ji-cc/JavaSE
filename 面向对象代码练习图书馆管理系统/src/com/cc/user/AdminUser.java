package com.cc.user;

import com.cc.operation.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };
    }
    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hi " + this.name + "! 欢迎来到图书管理系统");
        System.out.println("1.查找书籍");
        System.out.println("2.新增书籍");
        System.out.println("3.删除书籍");
        System.out.println("4.打印系统");
        System.out.println("0.退出系统");
        System.out.println("请选择您要进行的操作：");
        int choice = scanner.nextInt();
        return choice;
    }
}
