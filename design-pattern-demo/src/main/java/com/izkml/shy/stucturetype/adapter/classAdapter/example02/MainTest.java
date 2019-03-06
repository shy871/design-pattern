package com.izkml.shy.stucturetype.adapter.classAdapter.example02;

/**
 * @author: shy
 * @description: 测试主类
 * 1.目标接口 IMobilePhone
 *
 * 2.被适配器类 HuaWei
 *
 * 3.适配器 AdapterAbstract 同时继承被适配器类和实现目标接口
 *调用时，目标接口和被适配器类都可以通过new AdapterAbstract()获取响应的实例对象
 * 从而调用各自的方法，实现相关功能。
 *
 * @create: 2019-03-06 09:26
 **/

public class MainTest {
    public static void main(String[] args){

        IMobilePhone adapter = new Adapter();
        System.out.println(adapter.apple());
        System.out.println(adapter.google());

        HuaWei huaWei = new Adapter();
        System.out.println(huaWei.huawei());

    }
}
