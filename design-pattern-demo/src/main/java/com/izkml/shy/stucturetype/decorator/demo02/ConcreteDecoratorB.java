package com.izkml.shy.stucturetype.decorator.demo02;

/**
 * @author: shy
 * @description: 装饰类具体实现类之二
 * @create: 2019-03-11 14:32
 **/

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component){
        super.component = component;
    }

    @Override
    public void say() {
        component.say();
        System.out.print(".DB.");
    }
}
