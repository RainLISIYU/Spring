package com.liang.attributeinjection;

/**
 * @Author: 梁思禹
 * @Date: Create in 15:072019/8/9
 */
public class Car {
    private String name;

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    private Double price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
