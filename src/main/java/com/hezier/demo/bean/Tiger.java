package com.hezier.demo.bean;

import org.springframework.stereotype.Service;

@Service
public class Tiger {
    private String tigerName = "Nancy";

    @Override
    public String toString() {
        return "Tiger{" +
                "tigerName='" + tigerName + '\'' +
                '}';
    }
}
