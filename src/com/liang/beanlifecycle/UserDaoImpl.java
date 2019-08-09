package com.liang.beanlifecycle;

/**
 * @Author: 梁思禹
 * @Date: Create in 14:452019/8/9
 */
public class UserDaoImpl implements UserDao {

    public void init(){
        System.out.println("初始化了");
    }

    @Override
    public void save() {
        System.out.println("执行了保存操作。。");
    }

    public void destroy(){
        System.out.println("销毁了。。");
    }

}
