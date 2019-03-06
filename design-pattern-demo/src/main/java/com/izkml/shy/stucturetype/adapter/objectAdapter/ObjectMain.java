package com.izkml.shy.stucturetype.adapter.objectAdapter;

/**
 * @author: shy
 * @description: 面向对象适配器
 *
 * 为了解决类适配器只是适配单一类的这个问题，就又出现了对象适配器模式，
 * 对象适配器，是将适合类的对象注入到适配器中，然后达到适配的作用。
 *
 * @create: 2019-03-06 10:23
 **/

public class ObjectMain {
    public static void main(String[] args){
        HuaWei huaWei = new HuaWei();
        Adapter adapter = new Adapter(huaWei);
        System.out.println(adapter.apple());
        System.out.println(adapter.google());
        System.out.println(adapter.huawei());


    }
}
