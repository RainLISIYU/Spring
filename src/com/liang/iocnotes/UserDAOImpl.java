package com.liang.iocnotes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * DAO实现类
 * @author 梁思禹
 * @date Create in 14:492019/8/10
 */
//@Component("userDao")//相当于<bean id="" class=""></bean>
@Repository("userDAO222")
public class UserDAOImpl implements UserDAO {
//    没有set方法

    @Value("张龙")
    private String name;
//    有set方法，注解加在set方法上
/*    @Value("张龙")
    public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public void save() {
        System.out.println("执行了。。。"+name);
    }
}
