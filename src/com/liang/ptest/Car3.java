package com.liang.ptest;

import com.liang.attributeinjection.Car;

/**
 * @Author: 梁思禹
 * @Date: Create in 16:492019/8/9
 */
public class Car3 {
    private String name;
    private Car car;

    @Override
    public String toString() {
        return "Car3{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
