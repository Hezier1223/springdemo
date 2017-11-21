package com.hezier.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advices {
    @Before("execution(* com.hezier.demo.aop.Math.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("----------前置通知----------");
        System.out.println(jp.getSignature().getName());
    }

    @After("execution(* com.hezier.demo.aop.Math.*(..))")
    public void after(JoinPoint jp) {
        System.out.println("----------最终通知----------");
    }
}
