package com.liang.collectioninjection;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @Author: 梁思禹
 * @Date: Create in 16:562019/8/9
 */
public class CollectionTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) classPathXmlApplicationContext.getBean("collectionBean");
        System.out.println(collectionBean);
    }
}
