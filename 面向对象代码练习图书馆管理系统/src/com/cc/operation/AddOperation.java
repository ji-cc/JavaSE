package com.cc.operation;

import com.cc.book.Book;
import com.cc.book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    //每个操作都需要一个work()方法引入BookList，所以可以设置一个IOperation接口
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("新增图书： ");
        System.out.println("请输入新增图书书名：");
        String name = scanner.next();
        System.out.println("请输入新增图书价格：");
        int price = scanner.nextInt();
        System.out.println("请输入新增图书类型：");
        //在用Scanner的时候，如果上一次用的是nextInt()
        // 如果接着用nextLine()时，nextLine()直接跳过
        //原因：nextInt()接收一个整型字符，
        //      nextLine()读入一行文本，会读入"\n"字符，
        //      但"\n"并不会成为返回的字符串值的一部分
        String type = scanner.next() ;
        System.out.println("请输入新增图书作者：");
        String author = scanner.next();
        Book book = new Book(name,price,type,author);
        int curUsedSize = bookList.getUsedSize();
        bookList.setBooks(curUsedSize, book);
        bookList.setUsedSize(curUsedSize+1);
        System.out.println("新增图书成功！");



    }
}
