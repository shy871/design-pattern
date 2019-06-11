package com.izkml.shy.actiontype.state.demo01;

/**
 * @author: shy
 * @description: 状态类实现B
 * @create: 2019-06-11 15:39
 **/

public class ConcreteStateB implements State {

    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }
}
