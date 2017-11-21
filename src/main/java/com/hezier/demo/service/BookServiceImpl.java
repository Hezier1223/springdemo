package com.hezier.demo.service;

import com.hezier.demo.bean.Book;
import com.hezier.demo.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public String findBookById(int id) {
        return bookDao.findBookById(id);
    }

    @Override
    public void saveBook(Book book) {
        bookDao.saveBook(book);
    }
}
