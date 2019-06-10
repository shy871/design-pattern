package com.izkml.shy.actiontype.memento.demo01;

/**
 * @author: shy
 * @description: 发起人类
 * @create: 2019-06-10 14:16
 **/

//发起人
class Originator {
    private String state;

    public void setState(String state) {
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}