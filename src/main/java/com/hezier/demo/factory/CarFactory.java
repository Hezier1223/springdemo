package com.hezier.demo.factory;

import com.hezier.demo.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CarFactory {
    @Autowired
    @Qualifier("BMW")
    private Car car;

    @Override
    public String toString() {
        return "CarFactory{" +
                "car=" + car.carName() +
                '}';
    }
}
