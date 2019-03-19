package com.izkml.shy.actiontype.mediator.demo;

/**
 * @author: shy
 * @description: 抽象同事类
 * @create: 2019-03-19 15:39
 **/

public abstract class Colleague {

    protected Mediator mediator;

    public void setMedium(Mediator mediator)
    {
        this.mediator=mediator;
    }
    public abstract void receive();
    public abstract void send();

}
