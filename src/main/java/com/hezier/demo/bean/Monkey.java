package com.hezier.demo.bean;

import org.springframework.stereotype.Service;

@Service
public class Monkey {
    private String monkeyName = "Rose";

    @Override
    public String toString() {
        return "Monkey{" +
                "monkeyName='" + monkeyName + '\'' +
                '}';
    }
}
