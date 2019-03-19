package com.izkml.shy.actiontype.mediator.demo;

/**
 * @author: shy
 * @description: 抽象同事类的实现类之一
 * @create: 2019-03-19 15:40
 **/

public class ConcreteColleague01 extends Colleague {

    public void receive() {
        System.out.println("具体同事类01收到请求。");
    }

    public void send() {
        System.out.println("具体同事类01发出请求。");
        mediator.relay(this);
    }
}
