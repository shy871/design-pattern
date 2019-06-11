package com.izkml.shy.actiontype.state.demo01;

/**
 * @author: shy
 * @description: demo01客户端类
 * @create: 2019-06-11 15:41
 **/

public class StateDemo01Client {

    public static void main(String[] args){

        // 创建状态
        State state = new ConcreteStateA();
        Context context = new Context();
        context.setState(state);
        // 请求
        context.request("test");

        State state1 = new ConcreteStateB();
        context.setState(state1);
        context.request("test");
    }

}
