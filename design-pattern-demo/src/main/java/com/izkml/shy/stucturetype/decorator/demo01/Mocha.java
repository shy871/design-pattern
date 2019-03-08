package com.izkml.shy.stucturetype.decorator.demo01;

/**
 * @author: shy
 * @description: 对应ConcreteComponent类  摩卡类
 * @create: 2019-03-08 15:34
 **/

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        super.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+",with mocha";
    }

    public double cost() {
        return 3.5+beverage.cost();
    }
}
