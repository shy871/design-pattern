package com.izkml.shy.actiontype.observer.demo01;

/**
 * @author: shy
 * @description: 具体目标类
 * @create: 2019-06-10 15:38
 **/

class ConcreteSubject extends Subject {

    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for(Object obs:observers) {
            ((Observer)obs).response();
        }

    }
}