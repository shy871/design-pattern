package com.izkml.shy.stucturetype.adapter.classAdapter.example02;

/**
 * @author: shy
 * @description: 适配器类
 * @create: 2019-03-06 09:25
 **/

public class Adapter extends HuaWei implements IMobilePhone {
    public String google() {
        return "google:type-c";
    }

    public String apple() {
        return "apple:type-c";
    }
}
