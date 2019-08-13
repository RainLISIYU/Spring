package com.liang.springtx;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

/**
 * @author 梁思禹
 * @date Create in 16:532019/8/13
 */
@Transactional
public class AccountServiceImpl implements AccountService {

//    注入DAO
    @Resource(name = "accountDAO")
    private AccountDAO accountDAO;

//    注入事务管理模板
    @Resource(name = "transactionTemplate")
    private TransactionTemplate transactionTemplate;

//        编程的方式实现事务管理
    @Override
    public void transfer(String from, String to, Double money) {


        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDAO.inMoney(to, money);
//                int a= 23/0;
                accountDAO.outMoney(from, money);
            }
        });

    }

    @Override
    public void transfer2(String from, String to, Double money) {
        accountDAO.outMoney(from, money);
//        int i = 2/0;
        accountDAO.inMoney(to, money);
    }

    @Override
    public void transfer3(String from, String to, Double money) {
        accountDAO.outMoney(from, money);
//        int i = 1/0;
        accountDAO.inMoney(to, money);
    }
}
