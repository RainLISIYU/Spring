package com.liang.beanlifecycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 梁思禹
 * @Date: Create in 14:442019/8/9
 */
public class beanTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        userDao.save();
        UserDao userDao1 = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        System.out.println(userDao==userDao1);
//        单例创建的时候才会destroy
        classPathXmlApplicationContext.close();
    }

}
