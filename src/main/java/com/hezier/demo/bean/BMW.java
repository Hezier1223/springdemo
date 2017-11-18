package com.hezier.demo.bean;

import org.springframework.stereotype.Service;

@Service
public class BMW implements Car {
    @Override
    public String carName() {
        return "BMW car";
    }
}
