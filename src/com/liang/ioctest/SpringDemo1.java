package com.liang.ioctest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 梁思禹
 * @Date: Create in 16:022019/8/7
 */
public class SpringDemo1 {

    @Test
    public void test1(){
//        传统方式
        UserService userService1 = new UserServiceImpl();
        userService1.save();
//        Spring方式
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService2 = (UserService) applicationContext.getBean("userService");
        userService2.save();

    }


}
