package com.izkml.shy.stucturetype.adapter.classAdapter.demo01;

/**
 * @author: shy
 * @description: 适配器类
 * @create: 2019-03-05 16:52
 **/

public class Adapter extends Adaptee implements Target{
    public void request() {
        super.adapteeRequest();
    }
}
