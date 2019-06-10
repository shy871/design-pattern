package com.izkml.shy.actiontype.memento.demo01;

/**
 * @author: shy
 * @description: 管理者类
 * @create: 2019-06-10 14:17
 **/

//管理者
class Caretaker {
    private Memento memento;

    public void setMemento(Memento m) {
        memento=m;
    }

    public Memento getMemento() {
        return memento;
    }
}