package com.hezier.demo.dao;

import com.hezier.demo.bean.Book;

public interface BookDao {
    public String findBookById(int id);

    public void saveBook(Book book);
}
