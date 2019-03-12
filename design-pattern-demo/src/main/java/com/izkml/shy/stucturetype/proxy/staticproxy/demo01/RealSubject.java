package com.izkml.shy.stucturetype.proxy.staticproxy.demo01;

/**
 * @author: shy
 * @description: 被代理对象
 * @create: 2019-03-12 13:56
 **/

public class RealSubject implements Subject {

    private String name = "realSubject";

    public void visit() {
        System.out.println(name);
    }
}
