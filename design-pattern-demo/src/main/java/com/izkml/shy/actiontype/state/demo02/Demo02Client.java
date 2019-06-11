package com.izkml.shy.actiontype.state.demo02;

/**
 * @author: shy
 * @description: demo02客户端类
 * @create: 2019-06-11 15:53
 **/

public class Demo02Client {

    public static void main(String[] args){

        Context context = new Context();
        context.setLinkState(Context.carryingState);
        context.carry();
        context.ignite();
        context.put();
        context.goaway();
        context.ignite();

    }

}
