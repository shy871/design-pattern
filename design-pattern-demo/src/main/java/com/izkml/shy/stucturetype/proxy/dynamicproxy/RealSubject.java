package com.izkml.shy.stucturetype.proxy.dynamicproxy;

/**
 * @author: shy
 * @description: 被代理类
 * @create: 2019-03-12 14:28
 **/

public class RealSubject implements Subject {

    public void sayHello() {
        System.out.println("hello,there!");
    }

}
