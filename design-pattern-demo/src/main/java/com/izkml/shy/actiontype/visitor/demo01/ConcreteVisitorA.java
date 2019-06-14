package com.izkml.shy.actiontype.visitor.demo01;

/**
 * @author: shy
 * @description: 访问者实现类A
 * @create: 2019-06-14 11:15
 **/

public class ConcreteVisitorA implements Visitor {

    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->"+element.operationA());
    }
    public void visit(ConcreteElementB element)
    {
        System.out.println("具体访问者A访问-->"+element.operationB());
    }

}
