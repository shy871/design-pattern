package com.izkml.shy.stucturetype.bridge.example02;

/**
 * @author: shy
 * @description: 接口实现类
 * @create: 2019-03-06 14:43
 **/

public class ColorRed implements ColorInter {
    public void bepaint(String shapName) {
        System.out.println("this is red "+shapName);
    }
}
