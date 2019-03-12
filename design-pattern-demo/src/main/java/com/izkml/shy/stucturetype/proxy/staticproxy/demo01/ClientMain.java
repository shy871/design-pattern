package com.izkml.shy.stucturetype.proxy.staticproxy.demo01;

/**
 * @author: shy
 * @description: 静态代理 主类之一
 * @create: 2019-03-12 13:58
 **/

public class ClientMain {

    public static void main(String[] args){

        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();

    }

}
