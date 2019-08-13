package com.liang.springtx;

/**
 * @author 梁思禹
 * @date Create in 16:542019/8/13
 */
public interface AccountDAO {
    /**
     * 转出
     * @param from
     * @param money
     */
    void outMoney(String from, Double money);

    /**
     * 转入
     * @param to
     * @param money
     */
    void inMoney(String to, Double money);
}
