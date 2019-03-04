package com.izkml.shy.creattype.singleton;

/**
 * @author: shy
 * @description: 优雅的方式处理单例模式
 * @create: 2019-03-01 18:00
 **/

public class GracefullSingle {

    private GracefullSingle(){

    }

    //类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
    public static class SingleHolder{
        ////静态初始化器，由JVM来保证线程安全
        private static GracefullSingle gracefullSingle = new GracefullSingle();
    }

    public static GracefullSingle getGracefullSingleton(){
        return SingleHolder.gracefullSingle;
    }
}
