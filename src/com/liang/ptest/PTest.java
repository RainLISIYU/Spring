package com.liang.ptest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 梁思禹
 * @Date: Create in 16:522019/8/9
 */
public class PTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car3 car3 = (Car3) classPathXmlApplicationContext.getBean("car3");
        System.out.println(car3);

    }
}
