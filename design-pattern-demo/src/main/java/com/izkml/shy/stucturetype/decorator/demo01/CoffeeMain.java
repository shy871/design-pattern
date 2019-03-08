package com.izkml.shy.stucturetype.decorator.demo01;

/**
 * @author: shy
 * @description: 测试主类
 * @create: 2019-03-08 15:35
 **/

public class CoffeeMain {

    public static void main(String[] args){

        Beverage beverage = new Milk(new HouseBlend());
        System.out.println(beverage.getDescription()+"---"+beverage.cost());


        Beverage beverage1 = new Mocha(new HouseBlend());
        System.out.println(beverage1.getDescription()+"---"+beverage1.cost());


        Beverage beverage2 = new Milk(new Mocha(new DarkRoast()));
        System.out.println(beverage2.getDescription()+"---"+beverage2.cost());

    }

}
