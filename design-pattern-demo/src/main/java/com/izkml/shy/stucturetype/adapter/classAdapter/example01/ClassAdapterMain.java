package com.izkml.shy.stucturetype.adapter.classAdapter.example01;

/**
 * @author: shy
 * @description: 类适配器 测试类
 *类适配器把适配的类的API转换成目标类的API，类适配器所涉及的角色有：
 * 1.目标接口 Target
 *
 * 2.被适配者类 adaptee
 *
 * 3、适配器角色 adapter
 * 	模式的核心，适配器把源接口转换成目标接口
 *
 * @create: 2019-03-05 16:53
 **/

public class ClassAdapterMain {

    public static void main(String[] args){

        Target target = new Adapter();
        target.request();


        Adaptee adaptee = new Adapter();
        adaptee.adapteeRequest();

    }

}
