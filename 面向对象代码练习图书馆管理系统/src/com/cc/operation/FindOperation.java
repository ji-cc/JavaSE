package com.cc.operation;

import com.cc.book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要查找的图书：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if(bookList.getBooks(i).getName().equals(name)) {
                System.out.println(bookList.getBooks(i).toString());
                System.out.println("查找成功！");
                return;
            }
        }
        System.out.println("查找失败，这本书不存在");
    }
}
