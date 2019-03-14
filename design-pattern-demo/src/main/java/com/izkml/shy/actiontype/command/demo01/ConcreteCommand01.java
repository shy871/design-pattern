package com.izkml.shy.actiontype.command.demo01;

/**
 * @author: shy
 * @description: command具体实现类之一
 * @create: 2019-03-14 14:22
 **/

public class ConcreteCommand01 extends Command {

    public Receiver receiver;

    public ConcreteCommand01(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
