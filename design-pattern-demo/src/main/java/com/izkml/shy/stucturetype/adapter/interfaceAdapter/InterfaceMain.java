package com.izkml.shy.stucturetype.adapter.interfaceAdapter;

/**
 * @author: shy
 * @description: 接口适配器
 * @create: 2019-03-06 11:32
 **/

public class InterfaceMain {

    public static void main(String[] args){

        Target target = new AdapterConcrete();
        target.a();
        target.b();
        target.c();

    }

}
