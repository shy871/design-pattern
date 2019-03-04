package com.izkml.shy.creattype.abstractFactory;

/**
 * @author: shy
 * @description: 抽象类实现类
 * @create: 2019-02-21 19:16
 **/

public class Car01Factory extends CarAbstractFactory{
    public IEngine createEngine() {
        return new IEngin01Impl();
    }

    public ITire createTire() {
        return new ITire01Impl();
    }
}
