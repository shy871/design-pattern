package com.izkml.shy.stucturetype.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author: shy
 * @description: 动态代理模式
 *
 * 客户端调用方式：
 * Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
 * （1） Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, ps)
 * （2）参数一：ClassLoader是指被代理对象实现接口的加载类；
 * （3）参数二：new Class[]是指class数组，是指被代理对象实现接口的class；
 * （4）参数三：InvocationHandler对象，即代理对象
 *
 *
 * @create: 2019-03-12 14:32
 **/

public class DynamicMain {

    public static void main(String[] args){

        Subject subject = new RealSubject();
        ProxySubject ps = new ProxySubject(subject);
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Subject subject1 = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, ps);
        subject1.sayHello();

    }

}
