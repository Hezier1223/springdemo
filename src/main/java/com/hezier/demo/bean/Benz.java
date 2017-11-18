package com.hezier.demo.bean;

import org.springframework.stereotype.Service;

@Service
public class Benz implements Car {
    @Override
    public String carName() {
        return "Benz car";
    }
}
