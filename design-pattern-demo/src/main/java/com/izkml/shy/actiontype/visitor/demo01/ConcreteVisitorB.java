package com.izkml.shy.actiontype.visitor.demo01;

/**
 * @author: shy
 * @description: 访问者实现类B
 * @create: 2019-06-14 11:15
 **/

public class ConcreteVisitorB implements Visitor{

    public void visit(ConcreteElementA element)
    {
        System.out.println("具体访问者B访问-->"+element.operationA());
    }
    public void visit(ConcreteElementB element)
    {
        System.out.println("具体访问者B访问-->"+element.operationB());
    }

}
