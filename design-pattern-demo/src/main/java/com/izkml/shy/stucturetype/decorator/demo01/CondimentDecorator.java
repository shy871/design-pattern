package com.izkml.shy.stucturetype.decorator.demo01;

/**
 * @author: shy
 * @description: 对应于Decorator类  调料装饰者类
 * @create: 2019-03-08 15:29
 **/

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
