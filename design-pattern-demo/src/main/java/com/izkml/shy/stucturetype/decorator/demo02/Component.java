package com.izkml.shy.stucturetype.decorator.demo02;

/**
 * @author: shy
 * @description: 抽象基类
 * @create: 2019-03-08 17:13
 **/

public abstract class Component {

    protected String name;

    public String getName(){
        return name;
    }

    public abstract void say();

}
