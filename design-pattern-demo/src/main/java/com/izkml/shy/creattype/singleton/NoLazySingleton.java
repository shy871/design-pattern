package com.izkml.shy.creattype.singleton;

/**
 * @author: shy
 * @description: 饥汉式单例模式
 *
 *
 * @create: 2019-03-01 17:40
 **/

public class NoLazySingleton {

    private NoLazySingleton(){
        System.out.println("this is noLazySingleton construct method...");
    }

    private static NoLazySingleton noLazySingleton = new NoLazySingleton();

    public static NoLazySingleton getNoLazySingleton(){
        return noLazySingleton;
    }
}
