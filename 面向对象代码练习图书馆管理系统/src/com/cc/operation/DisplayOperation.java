package com.cc.operation;

import com.cc.book.BookList;

public class DisplayOperation implements IOperation{
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBooks(i).toString());
        }
        System.out.println("打印完成！");
    }
}
