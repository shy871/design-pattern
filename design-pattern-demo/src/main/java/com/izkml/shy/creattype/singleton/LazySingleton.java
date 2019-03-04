package com.izkml.shy.creattype.singleton;

/**
 * @author: shy
 * @description: 懒汉 单例模式
 * @create: 2019-03-01 17:31
 **/

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){
        //验证懒汉模式 多线程下会失效 时使用
//        try {
//            Thread.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("this is lazysingleton construct method....");
    }

    public static LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
