package com.izkml.shy.stucturetype.decorator.demo02;

/**
 * @author: shy
 * @description: 主类
 * @create: 2019-03-11 14:34
 **/

public class TestMain {

    public static void main(String[] args){


        Decorator decorator = new ConcreteDecorateA(new ConcreteComponentA("ca"));
        decorator.say();

        System.out.println("###########################");

        Decorator decorator1 = new ConcreteDecoratorB(new ConcreteComponentA("ca"));
        decorator1.say();

        System.out.println("##########################");

        Decorator decorator2 = new ConcreteDecoratorB(new ConcreteDecoratorB(new ConcreteComponentB("cb")));
        decorator2.say();
    }

}
