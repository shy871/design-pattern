package com.izkml.shy.actiontype.state.demo02;

/**
 * @author: shy
 * @description: 状态类实现类之三：逃跑类
 * @create: 2019-06-11 15:51
 **/

public class GoAwayingState extends LinkState {

    @Override
    public void carry() {
        System.out.println("小Y:已经逃离，无法再扛炸药包");
    }

    @Override
    public void put() {
        System.out.println("小Y:已经逃离，无法进行炸药包放置");
    }
    @Override
    public void goaway() {
        System.out.println("小Y:呼~~，终于捡回条小命");
    }
    @Override
    public void ignite() {
        super.context.setLinkState(Context.ignitingState);
        super.context.getLinkState().ignite();
    }

}
