package com.izkml.shy.actiontype.visitor.demo01;

/**
 * @author: shy
 * @description: 元素具体实现类B
 * @create: 2019-06-14 11:12
 **/

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作。";
    }
}
