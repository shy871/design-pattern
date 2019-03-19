package com.izkml.shy.actiontype.mediator.demo;

/**
 * @author: shy
 * @description: 抽象中介者类
 * @create: 2019-03-19 15:38
 **/

public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发

}
