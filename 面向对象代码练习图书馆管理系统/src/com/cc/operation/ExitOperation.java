package com.cc.operation;

import com.cc.book.BookList;

public class ExitOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("退出程序！");
        System.exit(0);
    }
}
