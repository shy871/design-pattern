package com.izkml.shy.actiontype.visitor.demo01;

/**
 * @author: shy
 * @description: demo01客户端类
 * @create: 2019-06-14 11:14
 **/

public class Demo01Client {

    public static void main(String[] args)
    {
        ObjectStructure os=new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor=new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor=new ConcreteVisitorB();
        os.accept(visitor);
    }

}
