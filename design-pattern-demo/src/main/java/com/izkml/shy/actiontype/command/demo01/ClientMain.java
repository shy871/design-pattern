package com.izkml.shy.actiontype.command.demo01;

/**
 * @author: shy
 * @description: 命令模式 客户端类
 * @create: 2019-03-14 14:32
 **/

public class ClientMain {

    public static void main(String[] args){

        Receiver receiver = new ConcreteReceiver01();
        Command command = new ConcreteCommand01(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();


        Receiver receiver1 = new ConcreteReceiver02();
        Command command1 = new ConcreteCommand02(receiver1);
        Invoker invoker1 = new Invoker(command1);
        invoker1.action();


    }
}
