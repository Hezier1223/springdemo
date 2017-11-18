package com.hezier.demo;

import com.hezier.demo.bean.Zoo;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZooTest {
    private static Zoo zoo;

    @BeforeClass
    public static void init() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        zoo = (Zoo) ac.getBean("zoo");
    }

    @Test
    public void showAnimals() {
        System.out.println(zoo);
    }
}
