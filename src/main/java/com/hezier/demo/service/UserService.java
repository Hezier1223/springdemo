package com.hezier.demo.service;

import com.hezier.demo.bean.UserBean;
import com.hezier.demo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserBean userBean;
    @Autowired
    private UserDao userDao;


    public void service() {

        userDao.add(userBean);
        System.out.println("ths is @Servive 业务层，调用持久层的Add方法");
    }
}
