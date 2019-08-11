package com.liang.iocnotes;

import com.liang.beanlifecycle.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author 梁思禹
 * @date Create in 13:072019/8/11
 */
@Service("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Qualifier(value="userDAO222")
    @Resource(name = "userDAO222")
    private UserDAO userDAO;

    @PostConstruct//init-method
    public void init(){
        System.out.println("初始化了");
    }

    @PreDestroy//destroy-method
    public void destroy(){
        System.out.println("销毁了");
    }

    @Override
    public void save() {
        System.out.println("Service执行了");
        userDAO.save();
    }
}
