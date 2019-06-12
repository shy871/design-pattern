package com.izkml.shy.actiontype.strategy.demo01;

/**
 * @author: shy
 * @description: 策略算法具体实现类
 * @create: 2019-06-12 10:12
 **/

public class ConcreteStrategy01 implements IStrategy {

    @Override
    public void algorithmMethod() {
        System.out.println("this is ConcreteStrategy01 method...");
    }
}
