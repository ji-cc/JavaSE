package com.cc.operation;

import com.cc.book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还的书籍名：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if(bookList.getBooks(i).getName().equals(name)) {
                bookList.getBooks(i).setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
