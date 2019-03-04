package com.izkml.shy.creattype.abstractFactory;

/**
 * @author: shy
 * @description: 抽象类实现类
 * @create: 2019-02-21 19:18
 **/

public class Car02Factory extends CarAbstractFactory {
    public IEngine createEngine() {
        return new IEngine02Impl();
    }

    public ITire createTire() {
        return new ITire02Impl();
    }
}
