package com.hezier.demo.bean;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Zoo {
    @Resource(name = "monkey")
    private Monkey monkey;
    @Resource(type = Tiger.class)
    private Tiger tiger;

    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey) {
        this.monkey = monkey;
    }

    public Tiger getTiger() {
        return tiger;
    }

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "monkey=" + monkey +
                ", tiger=" + tiger +
                '}';
    }
}
