package com.cc.user;

import com.cc.operation.ExitOperation;
import com.cc.operation.IOperation;

import java.util.Scanner;
import com.cc.operation.*;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
        };
    }
    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hi" + this.name + "! 欢迎来到图书管理系统");
        System.out.println("1.查找书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("0.退出系统");
        System.out.println("请选择您要进行的操作：");
        int choice = scanner.nextInt();
        return choice;
    }
}
