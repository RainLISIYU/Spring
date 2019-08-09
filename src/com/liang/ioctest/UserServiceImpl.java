package com.liang.ioctest;

/**
 * @Author: 梁思禹
 * @Date: Create in 16:012019/8/7
 */
public class UserServiceImpl implements UserService {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("执行了保存。。"+name);
    }
}
