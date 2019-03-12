package com.izkml.shy.stucturetype.proxy;

/**
 * @author: shy
 * @description: 代理模式
 *
 * (1)静态代理
 * --接口Subject
 * --被代理类RealSubject,实现接口Subject
 * --代理类ProxySubject,实现接口Subject,并关联RealSubject属性，在实现方法中调用注入的realSubject的方法。
 *
 *
 * （2）动态代理jdk动态代理
 * --接口Subject
 * --被代理类RealSubject,实现接口Subject
 * --代理类ProxySubject,实现接口InvocationHandler, 注入Object类，重写invoke方法
 * --客户端 Proxy.newInstance(ClassLoader subject的加载类，new Class[]{Subject.class},注入subject的InvocationHandler的实现类对象)
 *
 * @create: 2019-03-12 09:53
 **/

public class ProxyMain {

    public static void main(String[] args){


    }

}
