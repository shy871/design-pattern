package com.izkml.shy.actiontype.state.demo02;

/**
 * @author: shy
 * @description: 状态类实现类之一：搬运炸药状态
 * @create: 2019-06-11 15:48
 **/

public class CarryingState extends LinkState {

    @Override
    public void carry() {
        System.out.println("小Y:报告排长，我已跑到炮楼底下");
    }

    @Override
    public void put() {
        super.context.setLinkState(Context.puttingState);
        super.context.getLinkState().put();
    }
    @Override
    public void goaway() {
        System.out.println("小Y:还没放置炸药成功，撤离失败");
    }
    @Override
    public void ignite() {
        System.out.println("小Y:还没放置炸药成功，引爆失败");
    }
}
