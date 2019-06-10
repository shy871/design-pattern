package com.izkml.shy.actiontype.observer.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: shy
 * @description: 抽象目标
 * @create: 2019-06-10 15:36
 **/
abstract class Subject {
    protected List<Observer> observers=new ArrayList<Observer>();

    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer)
    {
        observers.remove(observer);
    }
    public abstract void notifyObserver(); //通知观察者方法
}
