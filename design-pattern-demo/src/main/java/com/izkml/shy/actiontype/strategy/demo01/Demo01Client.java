package com.izkml.shy.actiontype.strategy.demo01;

/**
 * @author: shy
 * @description: demo01客户端类
 * @create: 2019-06-12 10:15
 **/

public class Demo01Client {

    public static void main(String[] args){

        //1.创建具体测策略实现
          IStrategy strategy = new ConcreteStrategy01();
        //2.在创建策略上下文的同时，将具体的策略实现对象注入到策略上下文当中
        ContextStrategy contextStrategy = new ContextStrategy(strategy);
        //3.调用上下文对象的方法来完成对具体策略实现的回调
        contextStrategy.contextMethod();
    }

}
