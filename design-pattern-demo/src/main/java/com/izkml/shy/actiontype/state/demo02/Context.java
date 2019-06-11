package com.izkml.shy.actiontype.state.demo02;


/**
 * @author: shy
 * @description: 拥有状态的类
 * @create: 2019-06-11 15:46
 **/

public class Context {

    //定义炸楼所有状态
    public final static LinkState carryingState = new CarryingState();
    public final static LinkState puttingState = new PuttingState();
    public final static LinkState goawayingState = new GoAwayingState();
    public final static IgnitingState ignitingState = new IgnitingState();

    //设置当前状态
    private LinkState linkState;

    public LinkState getLinkState() {
        return linkState;
    }

    public void setLinkState(LinkState linkState) {
        this.linkState= linkState;
        //把当前的所处的状态通知到各个实现类中
        this.linkState.setContext(this);
    }

    public void carry(){
        this.linkState.carry();
    }

    public void put(){
        this.linkState.put();
    }

    public void goaway(){
        this.linkState.goaway();
    }

    public void ignite(){
        this.linkState.ignite();
    }

}
