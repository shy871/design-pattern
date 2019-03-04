package com.izkml.shy.creattype.factoryMethod;

/**
 * @author: shy
 * @description: 工厂方法模式
 * @create: 2019-02-21 19:58
 **/

public class FactoryMethodMain {

    public static void main(String[] args){
        LoggerFactory loggerFactory = new DataBaseLoggerFactory();
        loggerFactory.createLogger().write();

        LoggerFactory loggerFactory1 = new FileLoggerFactory();
        loggerFactory1.createLogger().write();
    }
}
