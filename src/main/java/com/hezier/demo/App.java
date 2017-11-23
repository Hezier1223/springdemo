package com.hezier.demo;

import com.hezier.demo.controller.UserController;
import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        log.info("Going to create HelloWorld Obj");
        String[] ID = {"10208", "10609", "10331"};
        System.out.println(ID.length);
        // TODO Auto-generated method stub
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController uc = ctx.getBean(UserController.class);
        uc.controller();
        ctx.close();
    }

}
