package com.izkml.shy.actiontype.chainresponsibility.demo01;

/**
 * @author: shy
 * @description: 抽象基类 领导
 * @create: 2019-03-13 15:38
 **/

public abstract class Leader {

    public Leader next;

    public void setNext(Leader leader){
        this.next = leader;
    }

    public Leader getNext(){
        return this.next;
    }

    public abstract void handleRequest(int leaveDays);

}
