package com.izkml.shy.actiontype.iterator.demo;

/**
 * @author: shy
 * @description: 抽象聚合类
 * @create: 2019-03-15 15:29
 **/

public abstract class Aggregate {

    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();

}
