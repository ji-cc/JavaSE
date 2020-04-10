package com.cc.operation;

import com.cc.book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅的书籍： ");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            bookList.getBooks(i);
            //字符串的比较要用.equals()
            if(bookList.getBooks(i).getName().equals(name)) {
                //说明这本书存在
                //判断这本书是否已经被借阅
                //若被借阅，则Book类中的isBorrowed == true
                if(bookList.getBooks(i).isBorrowed()) {
                    System.out.println("这本书已被借出去了！");
                    return;
                }
                System.out.println("借阅成功！");
                bookList.getBooks(i).setBorrowed(true);
                return;
            }else {
                System.out.println("这本书不存在！");
            }
        }


    }
}
