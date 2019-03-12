package com.izkml.shy.stucturetype.proxy.staticproxy.demo01;

/**
 * @author: shy
 * @description: 代理类
 * @create: 2019-03-12 13:57
 **/

public class ProxySubject implements Subject {

    private Subject subject ;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    public void visit() {
        subject.visit();
    }
}
