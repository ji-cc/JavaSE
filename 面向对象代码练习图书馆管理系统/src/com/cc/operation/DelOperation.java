package com.cc.operation;

import com.cc.book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要删除的图书名：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if(bookList.getBooks(i).getName().equals(name)) {
                //说明这本书存在
                //进行删除操作
                for (int j = i; j < bookList.getUsedSize(); j++) {
                    bookList.setBooks(j,bookList.getBooks(j+1));
                }
                System.out.println("删除成功！");
                int curUsedSize = bookList.getUsedSize() - 1;
                bookList.setUsedSize(curUsedSize);
                return;
            }
        }
        System.out.println("这本书不存在！");
    }
}
