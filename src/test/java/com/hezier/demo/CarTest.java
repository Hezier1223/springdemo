package com.hezier.demo;

import com.hezier.demo.factory.CarFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    private static CarFactory carFactory;

    @BeforeClass
    public static void init() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        carFactory = (CarFactory) ac.getBean("carFactory");
    }

    @Test
    public void showCar() {
        System.out.println(carFactory);
    }
}
