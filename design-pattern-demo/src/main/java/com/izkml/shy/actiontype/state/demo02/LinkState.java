package com.izkml.shy.actiontype.state.demo02;

/**
 * @author: shy
 * @description: 抽象状态类
 * @create: 2019-06-11 15:45
 **/

public abstract class LinkState {
        protected Context context;
        public void setContext(Context  context){
            this.context = context;
        }
        //扛炸药包
        public abstract void carry();
        //放置炸药包
        public abstract void put();
        //跑路
        public abstract void goaway();
        //点燃炸药包
        public abstract void ignite();
}
