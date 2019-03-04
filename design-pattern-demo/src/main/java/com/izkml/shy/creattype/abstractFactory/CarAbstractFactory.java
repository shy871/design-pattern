package com.izkml.shy.creattype.abstractFactory;

/**
 * @author: shy
 * @description: 抽象工厂类
 * @create: 2019-02-21 18:27
 **/

public abstract class CarAbstractFactory {

    public abstract IEngine createEngine();

    public abstract ITire createTire();

}
