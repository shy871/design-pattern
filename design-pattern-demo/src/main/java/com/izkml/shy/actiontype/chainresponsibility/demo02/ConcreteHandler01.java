package com.izkml.shy.actiontype.chainresponsibility.demo02;

/**
 * @author: shy
 * @description: 具体实现者01
 * @create: 2019-03-13 16:26
 **/

public class ConcreteHandler01 extends Handler {

    public void handleRequest(String request) {
        if(request.equals("one")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if(getNext()!=null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
