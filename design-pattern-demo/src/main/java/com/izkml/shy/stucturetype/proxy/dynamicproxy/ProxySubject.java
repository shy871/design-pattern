package com.izkml.shy.stucturetype.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: shy
 * @description: 代理类
 * @create: 2019-03-12 14:29
 **/

public class ProxySubject implements InvocationHandler {
    private Object object;
    public ProxySubject(Object o){
        this.object = o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.object, args);
    }

}
