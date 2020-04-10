package com.cc.book;

public class BookList {
    public Book[] books;
    private int usedSize;

    public BookList() {
        this.books = new Book[20];
        this.books[0] = new Book("西游记", 13, "小说","吴承恩");
        this.books[1] = new Book("三国演义",6,"小说","施耐庵");
        this.books[2] = new Book("水浒传",23,"小说","罗贯中");
        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public void setBooks(int pos, Book books) {
        this.books[pos] = books;
    }
}
