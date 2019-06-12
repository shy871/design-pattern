package com.izkml.shy.actiontype.strategy.demo01;

/**
 * @author: shy
 * @description: 策略使用上下文
 * @create: 2019-06-12 10:14
 **/

public class ContextStrategy {
    //持有一个策略实现的引用
    private IStrategy strategy;

   //使用构造器注入具体的策略类
   public ContextStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void contextMethod(){
        //调用策略实现的方法
        strategy.algorithmMethod();
    }

}
