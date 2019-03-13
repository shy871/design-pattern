package com.izkml.shy.actiontype.chainresponsibility.demo02;

/**
 * @author: shy
 * @description: 责任链模式 客户主类
 * @create: 2019-03-13 16:29
 **/

public class ChainOfResponsibilityPatternMain {

    public static void main(String[] args){
        //组装责任链
        Handler handler1=new ConcreteHandler01();
        Handler handler2=new ConcreteHandler02();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }

}
