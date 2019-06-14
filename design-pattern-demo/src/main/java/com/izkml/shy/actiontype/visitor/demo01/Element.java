package com.izkml.shy.actiontype.visitor.demo01;


/**
 * 抽象元素类
 */
public interface Element {

    void accept(Visitor visitor);

}
