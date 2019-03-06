package com.izkml.shy.stucturetype.bridge.example02;

/**
 * @author: shy
 * @description: 形状抽象类
 * @create: 2019-03-06 14:34
 **/

public abstract class ShapeAbstr {

    private ColorInter colorInter;

    public ColorInter getColorInter() {
        return colorInter;
    }

    public void setColorInter(ColorInter colorInter) {
        this.colorInter = colorInter;
    }

    public abstract void draw();
}
