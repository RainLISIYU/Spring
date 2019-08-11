package com.liang.cglibproxy;

import com.liang.iocnotes.UserDAO;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 梁思禹
 * @date Create in 16:242019/8/11
 */
public class CglibProxy implements MethodInterceptor {

    private UserDAO userDAO;

    public CglibProxy(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public UserDAO createProxy(){
//        创建cglib核心类的对象
        Enhancer enhancer = new Enhancer();
//        设置父类
        enhancer.setSuperclass(userDAO.getClass());
//        设置回调
        enhancer.setCallback(this);

        UserDAO proxy = (UserDAO) enhancer.create();

        return proxy;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        String m = "find";
        if (m.equals(method.getName())){
            System.out.println("执行了检查");
            return methodProxy.invokeSuper(proxy,args);
        }
        return methodProxy.invokeSuper(proxy,args);
    }
}
