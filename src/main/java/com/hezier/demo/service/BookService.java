package com.hezier.demo.service;

import com.hezier.demo.bean.Book;

public interface BookService {
    public String findBookById(int id);

    public void saveBook(Book book);
}
