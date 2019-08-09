package com.liang.ioctest;

/**
 * @Author: 梁思禹
 * @Date: Create in 16:012019/8/7
 */
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("执行了");
    }
}
