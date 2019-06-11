package com.izkml.shy.actiontype.state.demo02;

/**
 * @author: shy
 * @description: 状态类实现类之四：引爆
 * @create: 2019-06-11 15:52
 **/

public class IgnitingState  extends  LinkState{

    @Override
    public void carry() {
        System.out.println("炮楼没彻底倒下，小Y继续扛炸药");
        super.context.setLinkState(Context.carryingState);
        super.context.getLinkState().carry();
    }

    @Override
    public void put() {
        System.out.println("小Y:炸药已引爆，无须进行炸药包放置");
    }
    @Override
    public void goaway() {
        System.out.println("小Y:炸药已引爆，早已撤离");
    }
    @Override
    public void ignite() {
        System.out.println("小Y:炸楼完成，准备加薪晋职");
    }

}
