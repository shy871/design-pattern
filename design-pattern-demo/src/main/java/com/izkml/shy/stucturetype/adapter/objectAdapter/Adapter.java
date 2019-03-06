package com.izkml.shy.stucturetype.adapter.objectAdapter;

/**
 * @author: shy
 * @description: 适配器
 * @create: 2019-03-06 10:30
 **/

public class Adapter implements IMobilePhone {
    public String google() {
        return "google:type-c";
    }

    public String apple() {
        return "apple:type-c";
    }

    public Adapter(){}

    private HuaWei huaWei;

    public Adapter(HuaWei huaWei){
        this.huaWei = huaWei;
    }

    public String huawei(){
        return huaWei.huawei();
    }
}
