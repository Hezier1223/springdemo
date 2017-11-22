package com.hezier.demo;

import com.hezier.demo.bean.Book;
import com.hezier.demo.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class BookDaoImplTest {

    private ApplicationContext context = null;
    private BookService bookService = null;

    {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        bookService = context.getBean(BookService.class);
    }

    @Test
    public void test() {
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }

    @Test
    public void test2() {
        String bookName = bookService.findBookById(1);
        System.out.println(bookName);
    }

    @Test
    public void test3() {
        bookService.saveBook(new Book(2, "啦啦啦啦", "1002", 45, 10));
    }
}
