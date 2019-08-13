package com.liang.springtx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 梁思禹
 * @date Create in 17:102019/8/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext6.xml")
public class SpringTxTest {

    @Resource(name = "accountService")
    private AccountServiceImpl accountService;

    @Test
    public void test1(){
        accountService.transfer("赵虎", "张龙", 100.0);
    }

    @Test
    public void test2(){
        accountService.transfer2("张龙", "赵虎", 100D);
    }

    @Test
    public void test3(){
        accountService.transfer3("包包", "王朝", 100D);
    }
}
