package com.izkml.shy.stucturetype.decorator.demo01;

/**
 * @author: shy
 * @description: 对应ConcreteComponent类  混合咖啡
 * @create: 2019-03-08 15:25
 **/

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend coffee";
    }

    public double cost() {
        return 4.9;
    }
}
