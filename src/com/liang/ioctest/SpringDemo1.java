package com.liang.ioctest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: 梁思禹
 * @Date: Create in 16:022019/8/7
 */
public class SpringDemo1 {

    @Test
    public void test1(){
//        传统方式,若向设置名字则不能面向对象编程
        UserService userService1 = new UserServiceImpl();
        userService1.save();

//        Spring方式，加载类路径下的xml文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService2 = (UserService) applicationContext.getBean("userService");
        userService2.save();

//        加载本地的xml文件
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("E:\\MyTestWeb\\Spring\\src\\applicationContext.xml");
        UserService userService = (UserService) fileSystemXmlApplicationContext.getBean("userService");
        userService.save();

    }


}
