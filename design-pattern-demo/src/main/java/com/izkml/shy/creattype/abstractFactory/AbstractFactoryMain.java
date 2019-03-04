package com.izkml.shy.creattype.abstractFactory;

/**
 * @author: shy
 * @description:  抽象工厂模式
 * @create: 2019-02-21 19:18
 *
 *                          abstractFactory
 *              interface01                  interface02
 *      inimpl0101  inimpl0102      inimpl0201      inimpl0202
 *
 *      abstractF01                     abstractF02
 **/

public class AbstractFactoryMain {
    public static void main(String[] args){

        CarAbstractFactory car01Factory = new Car01Factory();
        car01Factory.createEngine().create();
        car01Factory.createTire().create();

        CarAbstractFactory car02Factory = new Car02Factory();
        car02Factory.createEngine().create();
        car02Factory.createTire().create();

    }
}
