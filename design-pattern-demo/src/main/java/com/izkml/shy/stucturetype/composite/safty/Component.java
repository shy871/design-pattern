package com.izkml.shy.stucturetype.composite.safty;

/**
 * @author: shy
 * @description: 组合部件类
 * @create: 2019-03-07 15:52
 **/

public abstract class Component {

    private String name;

    public Component(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println(this.name);
    }


}
