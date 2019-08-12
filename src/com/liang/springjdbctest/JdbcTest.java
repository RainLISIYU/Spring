package com.liang.springjdbctest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 梁思禹
 * @date Create in 16:282019/8/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext5.xml")
public class JdbcTest {

    @Resource(name = "dataSource")
    private DriverManagerDataSource dataSource;
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    /**
     * JDBC模板的使用
     */
   @Test
   public void test1(){
//       创建连接池
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://localhost:3306/springtest?serverTimezone=UTC");
       dataSource.setUsername("root");
       dataSource.setPassword("lsy19980104");
//       创建JDBC模板
       JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
       jdbcTemplate.update("insert into account VALUE (NULL , ?, ?)", "张龙", 100.23);

       System.out.println("执行完毕");
   }

    /**
     * Spring管理连接池
     * 添加信息
     */
   @Test
    public void test2(){
       jdbcTemplate.update("INSERT INTO account VALUES (NULL, ?, ?)", "包包",1222.3);
       System.out.println("添加成功了");
    }

    /**
     * 修改，删除
     */
    @Test
    public void test3(){
//       jdbcTemplate.update("UPDATE account SET name = '马汉' WHERE  id = 5");
        jdbcTemplate.update("DELETE FROM account WHERE id = 6");
        System.out.println("删除成功了");
    }
    /**
     * 查询
     */
    @Test
    public void test4(){
        Double money = jdbcTemplate.queryForObject("select money from account where id = ?", Double.class, 2);
        System.out.println("查询结果为"+money);
    }

    /**
     * 将查询的结果封装到类中
     */
    @Test
    public void test5(){
        List<Account> accouts = jdbcTemplate.query("select * from account", new MyRowMapper());
        for (Account account: accouts){
            System.out.println(account);
        }
    }

}
