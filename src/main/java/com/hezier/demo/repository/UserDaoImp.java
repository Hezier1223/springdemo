package com.hezier.demo.repository;

import com.hezier.demo.bean.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {
    public void add(UserBean userBean) {
        System.out.println("this is @Repository 持久层实现UserDao");
        System.out.println("add:" + userBean);
    }
}
