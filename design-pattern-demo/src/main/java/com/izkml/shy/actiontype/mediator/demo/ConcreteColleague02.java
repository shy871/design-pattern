package com.izkml.shy.actiontype.mediator.demo;

/**
 * @author: shy
 * @description: 抽象同事类具体实现类之二
 * @create: 2019-03-19 15:47
 **/

public class ConcreteColleague02 extends Colleague {

    public void receive() {
        System.out.println("具体同事类02收到请求。");
    }

    public void send() {
        System.out.println("具体同事类02发起请求。");
        mediator.relay(this);
    }
}
