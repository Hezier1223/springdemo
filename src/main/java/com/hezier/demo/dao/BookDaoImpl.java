package com.hezier.demo.dao;

import com.hezier.demo.bean.Book;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements BookDao {
    @Autowired
    private SessionFactory sessionFactory;

    //获取和当前线程绑定的Seesion
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
//
//    @Bean
//    public LocalSessionFactoryBean getSession(DataSource dataSource) {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setPackagesToScan("my.package.model");// You need to provide to adapt : my.package.model
//        sessionFactory.setHibernateProperties(hibernateProperties());
//        return sessionFactory;
//    }

    public String findBookById(int id) {
        String hql = "SELECT bookName from Book where id=?";
        Query query = getSession().createQuery(hql).setInteger(0, id);
        String str = query.uniqueResult().toString();
        return str;
    }

    public void saveBook(Book book) {
        getSession().save(book);
    }
}
