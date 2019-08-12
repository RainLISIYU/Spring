package com.liang.aopnotes;

import org.aspectj.lang.annotation.*;

/**
 * @author 梁思禹
 * @date Create in 14:182019/8/12
 */
@Aspect
public class MyAspect {

    /**
     * 前置通知
     */
    @Before(value = "MyAspect.pointCut1()")
    public void before(){
        System.out.println("前置通知");
    }

//    后置通知:@AfterReturning(value="execution(...), returning="")
//    环绕通知:@Around(value="execution(* *.*.*())")
//    异常抛出通知:@AfterThrowing(value = "execution(...)")
//    最终通知:@After(value = "execution(..)")

    /**
     *  切入点注解
     */
    @Pointcut(value = "execution(* com.liang.aopnotes.OrderDAO.save(..))")
    public void pointCut1(){
    }
}
