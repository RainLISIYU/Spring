package com.liang.aopnotes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 梁思禹
 * @date Create in 14:232019/8/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class AopNotesTest {

    @Resource(name = "orderDAO")
    private OrderDAO orderDAO;

    @Test
    public void test1(){
        orderDAO.delete();
        orderDAO.save();
        orderDAO.find();
        orderDAO.update();
    }

}
