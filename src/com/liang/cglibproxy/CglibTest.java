package com.liang.cglibproxy;

import com.liang.iocnotes.UserDAO;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 梁思禹
 * @date Create in 16:332019/8/11
 */
public class CglibTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserDAO userDAO = (UserDAO) classPathXmlApplicationContext.getBean("userDAO222");
//        可以输出注入的属性值
        userDAO.save();
        UserDAO proxy = new CglibProxy(userDAO).createProxy();
//        属性值为NULL
        proxy.save();
        proxy.find();
    }
}
