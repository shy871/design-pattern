package com.izkml.shy.stucturetype.flyweight.demo02;

/**
 * @author: shy
 * @description: 抽象享元类
 * @create: 2019-03-12 09:00
 **/

public abstract class IgoChessman {

    public abstract String chessColor();

    public void display(){
        System.out.println("棋子颜色："+this.chessColor());
    }

}
