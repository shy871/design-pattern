package com.izkml.shy.stucturetype.decorator.demo01;

/**
 * @author: shy
 * @description: 对应ConcreteDecorator类  牛奶类
 * @create: 2019-03-08 15:31
 **/

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        super.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+",with milk";
    }

    public double cost() {
        return 2.3+beverage.cost();
    }
}
