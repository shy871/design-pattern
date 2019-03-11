package com.izkml.shy.stucturetype.decorator.demo02;

/**
 * @author: shy
 * @description: 装饰类具体实现类之一
 * @create: 2019-03-11 14:28
 **/

public class ConcreteDecorateA extends Decorator {

    public ConcreteDecorateA(Component component){
        super.component = component;
    }

    @Override
    public void say() {
        component.say();
        System.out.print(".DA.");
    }
}
