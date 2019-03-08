package com.izkml.shy.stucturetype.decorator.demo01;

/**
 * @author: shy
 * @description: Component对应的抽象基类  饮料类
 * @create: 2019-03-08 15:22
 **/

public abstract class Beverage {

    protected String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
