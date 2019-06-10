package com.izkml.shy.actiontype.observer.demo01;

/**
 * @author: shy
 * @description: 测试客户类
 * @create: 2019-06-10 15:44
 **/

public class Demo01TestMain {

    public static void main(String[] args)
    {
        Subject subject=new ConcreteSubject();
        Observer obs1=new ConcreteObserver01();
        Observer obs2=new ConcreteObserver02();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }

}
