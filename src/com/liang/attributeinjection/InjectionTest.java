package com.liang.attributeinjection;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 梁思禹
 * @Date: Create in 15:132019/8/9
 */
public class InjectionTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) classPathXmlApplicationContext.getBean("car");
        Car2 car2 = (Car2) classPathXmlApplicationContext.getBean("car2");
        System.out.println(car);
        System.out.println(car2);
    }
}
