package com.izkml.shy.actiontype.command.demo01;

/**
 * @author: shy
 * @description: command具体实现类之二
 * @create: 2019-03-14 14:29
 **/

public class ConcreteCommand02 extends Command {

    private Receiver receiver;

    public ConcreteCommand02(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
