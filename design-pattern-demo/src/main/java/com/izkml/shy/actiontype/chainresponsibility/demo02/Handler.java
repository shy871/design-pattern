package com.izkml.shy.actiontype.chainresponsibility.demo02;

/**
 * @author: shy
 * @description: 抽象基类
 * @create: 2019-03-13 16:25
 **/

public abstract class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next=next;
    }
    public Handler getNext() {
        return next;
    }

    public abstract void handleRequest(String request);

}
