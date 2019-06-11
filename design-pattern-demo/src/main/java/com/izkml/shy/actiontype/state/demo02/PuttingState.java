package com.izkml.shy.actiontype.state.demo02;

/**
 * @author: shy
 * @description: 状态类实现类之二：把炸药放置在炮楼底下
 * @create: 2019-06-11 15:50
 **/

public class PuttingState extends LinkState {

    @Override
    public void carry() {
        System.out.println("小Y:还在敌方区，无法再扛炸药包");
    }

    @Override
    public void put() {
        System.out.println("小Y:好险，成功把放置炸药包");
    }

    @Override
    public void goaway() {
        super.context.setLinkState(Context.goawayingState);
        super.context.getLinkState().goaway();
    }

    @Override
    public void ignite() {
        System.out.println("小Y:还没逃离敌方区，无法引爆炸药");
    }

}
