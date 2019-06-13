package com.izkml.shy.actiontype.strategy;

/**
 * @author: shy
 * @description: 策略模式客户端类
 *
 * 策略模式包含以下3个角色：
 * 　　（1）Context（环境类）：负责使用算法策略，其中维持了一个抽象策略类的引用实例。
 * 　　（2）Strategy（抽象策略类）：所有策略类的父类，为所支持的策略算法声明了抽象方法。=> 既可以是抽象类也可以是接口
 * 　　（3）ConcreteStrategy（具体策略类）：实现了在抽象策略类中声明的方法。
 *
 *      每个Context依赖于一种Strategy对象,由Strategy给出具体的算法结果
 * @create: 2019-06-12 09:06
 **/

public class StrategyClient {

    public static void main(String[] args){


    }

}
