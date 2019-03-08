package com.izkml.shy.stucturetype.decorator.demo01;

/**
 * @author: shy
 * @description: 对应ConcreteComponent类  礁炒咖啡类
 * @create: 2019-03-08 15:27
 **/

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 9.0;
    }
}
