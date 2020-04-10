package com.cc.user;

import com.cc.book.BookList;
import com.cc.operation.IOperation;
import com.sun.corba.se.spi.orb.Operation;

abstract public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }
    //把对应的操作放在数组中
    public IOperation[] operations;
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
    //不同的用户要面对不同的菜单，所以设置抽象类menu(),可以在不同的类中进行重写
    public abstract int menu();
}
