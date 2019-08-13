package com.liang.springtx;

/**
 * @author 梁思禹
 * @date Create in 16:512019/8/13
 */
public interface AccountService {
    /**
     * 转账--编程式事务管理
     * @param from
     * @param to
     * @param money
     */
    void transfer(String from, String to, Double money);

    /**
     * 声明式事务管理--xml方式
     * @param from
     * @param to
     * @param money
     */
    void transfer2(String from, String to, Double money);

    /**
     * 声明式事务管理--注释方式
     * @param from
     * @param to
     * @param money
     */
    void transfer3(String from, String to, Double money);
}
