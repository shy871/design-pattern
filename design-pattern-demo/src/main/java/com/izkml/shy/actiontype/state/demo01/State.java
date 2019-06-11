package com.izkml.shy.actiontype.state.demo01;


public interface State {
    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}