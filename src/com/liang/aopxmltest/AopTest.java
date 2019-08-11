package com.liang.aopxmltest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 梁思禹
 * @date Create in 17:472019/8/11
 */
//Spring整合的JUnit的配置
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class AopTest {

    @Resource(name = "productDAO")
    private ProductDAO productDAO;

//    Spring整合的JUnit方式
    @Test
    public void test2(){
        this.productDAO.find();
        this.productDAO.save();
        this.productDAO.update();
        this.productDAO.delete();
    }

//    传统方式
    @Test
    public void test1() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        ProductDAO productDAO = (ProductDAO) classPathXmlApplicationContext.getBean("productDAO");
        productDAO.update();
        productDAO.save();
        productDAO.find();
        productDAO.delete();
    }

}
