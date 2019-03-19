package com.izkml.shy.actiontype.mediator.demo;

/**
 * @author: shy
 * @description: 中介者模式 客户端测试类
 * @create: 2019-03-19 15:49
 **/

public class Mediator01Main {

    public static void main(String[] args){

        Colleague c1 = new ConcreteColleague01();
        Colleague c2 = new ConcreteColleague02();

        Mediator mediator = new ConcreteMediator();
        mediator.register(c1);
        mediator.register(c2);

        c1.send();

//        c2.send();

    }

}
