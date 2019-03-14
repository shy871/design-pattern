package com.izkml.shy.actiontype.command.demo01;

/**
 * @author: shy
 * @description: 命令入口类
 * @create: 2019-03-14 14:30
 **/

public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }

}
