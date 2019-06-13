package com.izkml.shy.actiontype.template.demo01;

/**
 * @author: shy
 * @description: demo01客户端类
 * @create: 2019-06-13 15:43
 **/

public class Demo01Client {

    public static void main(String[] args){

        TemplateAbstract tm=new TemplateConcrete();
        tm.TemplateMethod();

    }

}
