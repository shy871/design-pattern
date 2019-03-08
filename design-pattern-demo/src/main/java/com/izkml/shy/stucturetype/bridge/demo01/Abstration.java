package com.izkml.shy.stucturetype.bridge.demo01;

/**
 * @author: shy
 * @description: 抽象类
 * @create: 2019-03-06 14:28
 **/

public abstract class Abstration {

    private Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    protected void operation(){
        implementor.operation();
    }
}
