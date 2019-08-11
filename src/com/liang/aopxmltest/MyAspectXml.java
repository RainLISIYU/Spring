package com.liang.aopxmltest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 梁思禹
 * @date Create in 17:552019/8/11
 */
public class MyAspectXml {
    /**
     * 前置通知:执行前执行
     * @param joinPoint
     */
    public void checkPri(JoinPoint joinPoint){
        System.out.println("检查校验"+joinPoint);
    }

    /**
     * 后置通知：执行后执行
     * @param result 配置中returning的值
     */
    public void writeLog(Object result){
        System.out.println("打印日志"+"这是"+result);
    }

    /**
     * 环绕通知：既有前又有后
     * @param joinPoint
     * @return obj
     * @throws Throwable
     */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后通知");
        return proceed;
    }

    /**
     * 异常抛出通知
     */
    public void afterThrowing(Throwable ex){
        System.out.println("异常抛出通知"+ex);
    }
    /**
     * 最终通知
     */
    public void last(){
        System.out.println("最终通知");
    }
}
