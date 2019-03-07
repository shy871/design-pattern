package com.izkml.shy.stucturetype.composite.transparent;

import java.util.LinkedList;

/**
 * @author: shy
 * @description: 组合部件
 * @create: 2019-03-07 16:15
 **/

public abstract class Component {

    private String name;

    public Component(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println(this.name);
    }

    public abstract void  add(Component component);

    public abstract void remove(Component component);

    public abstract LinkedList<Component> getComponents();


}
