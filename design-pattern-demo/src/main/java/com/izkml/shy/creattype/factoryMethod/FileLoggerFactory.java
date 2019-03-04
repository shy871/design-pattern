package com.izkml.shy.creattype.factoryMethod;

/**
 * @author: shy
 * @description: 实现类
 * @create: 2019-02-21 19:57
 **/

public class FileLoggerFactory implements LoggerFactory {

    public LoggerProduct createLogger() {
        return new FileLogger();
    }
}
