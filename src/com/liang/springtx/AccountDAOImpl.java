package com.liang.springtx;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author 梁思禹
 * @date Create in 16:562019/8/13
 */
public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {
    @Override
    public void outMoney(String from, Double money) {
        this.getJdbcTemplate().update("UPDATE account SET money = money - ? WHERE NAME = ?", money, from);
    }

    @Override
    public void inMoney(String to, Double money) {
        this.getJdbcTemplate().update("UPDATE account SET money = money + ? WHERE NAME = ?", money, to);
    }
}
