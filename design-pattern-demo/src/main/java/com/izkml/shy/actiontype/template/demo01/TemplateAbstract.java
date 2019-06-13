package com.izkml.shy.actiontype.template.demo01;

/**
 * @author: shy
 * @description: 模板方法抽象类
 * @create: 2019-06-13 15:40
 **/

public abstract class TemplateAbstract {

    //模板方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    //具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
    public abstract void abstractMethod1(); //抽象方法1
    public abstract void abstractMethod2(); //抽象方法2


}
