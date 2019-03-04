package com.izkml.shy.creattype.factoryMethod;

/**
 * @author: shy
 * @description: 实现类
 * @create: 2019-02-21 19:58
 **/

public class DataBaseLoggerFactory implements LoggerFactory {
    public LoggerProduct createLogger() {
        return new DataBaseLogger();
    }
}
