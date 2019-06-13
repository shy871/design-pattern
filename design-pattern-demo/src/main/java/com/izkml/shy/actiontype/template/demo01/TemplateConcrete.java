package com.izkml.shy.actiontype.template.demo01;

/**
 * @author: shy
 * @description: 模板方法具体实现类
 * @create: 2019-06-13 15:41
 **/

public class TemplateConcrete extends TemplateAbstract {

    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }


}
