package com.izkml.shy.actiontype.visitor.demo01;

/**
 * @author: shy
 * @description: 元素实现类A
 * @create: 2019-06-14 11:11
 **/

public class ConcreteElementA implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }

}
