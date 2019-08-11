package com.liang.iocnotes;

import com.liang.iocnotes.UserDAO;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 梁思禹
 * @Date: Create in 14:502019/8/10
 */
public class IocNoteTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserDAO userDao = (UserDAO) classPathXmlApplicationContext.getBean("userDao");
        userDao.save();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService1 = (UserService)classPathXmlApplicationContext.getBean("userService");
        UserService userService2 = (UserService)classPathXmlApplicationContext.getBean("userService");
        System.out.println(userService1);
        System.out.println(userService2);
        classPathXmlApplicationContext.close();
    }
}
