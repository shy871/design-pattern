package com.izkml.shy.actiontype.state.demo01;

/**
 * @author: shy
 * @description: 状态类实现A
 * @create: 2019-06-11 15:38
 **/

public class ConcreteStateA implements State {

    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }
}
