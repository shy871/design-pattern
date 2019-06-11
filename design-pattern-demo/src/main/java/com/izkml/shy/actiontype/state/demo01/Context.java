package com.izkml.shy.actiontype.state.demo01;

/**
 * @author: shy
 * @description: 拥有状态的对象类
 * @create: 2019-06-11 15:40
 **/

public class Context {
    // 持有一个State类型的对象实例
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 用户感兴趣的接口方法
     */
    public void request(String param) {
        // 转调state来处理
        state.handle(param);
    }
}
