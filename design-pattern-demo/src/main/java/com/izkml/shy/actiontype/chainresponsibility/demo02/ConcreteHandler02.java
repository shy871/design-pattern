package com.izkml.shy.actiontype.chainresponsibility.demo02;

/**
 * @author: shy
 * @description: 具体实现类02
 * @create: 2019-03-13 16:28
 **/

public class ConcreteHandler02 extends Handler {

    public void handleRequest(String request) {
        if(request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if(getNext()!=null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
