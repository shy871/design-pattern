package com.izkml.shy.creattype.prototype;

/**
 * @author: shy
 * @description: 原型类
 * @create: 2019-02-28 17:30
 **/

public class Prototype implements Cloneable {

    public Prototype(){
        System.out.println("this is construct method...");
    }

    @Override
    protected Object clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
