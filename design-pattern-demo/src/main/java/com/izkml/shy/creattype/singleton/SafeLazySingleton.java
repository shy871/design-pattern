package com.izkml.shy.creattype.singleton;

/**
 * @author: shy
 * @description: 安全模式单例模式
 * @create: 2019-03-01 17:50
 **/

public class SafeLazySingleton {

    private SafeLazySingleton(){
        System.out.println("this is safeLazySingleton constuct method...");
    }

    private static SafeLazySingleton safeLazySingleton = null;

    //1.对整个访问实例的方法进行同步
    public static synchronized SafeLazySingleton getSafeLazySingleton(){
        if(safeLazySingleton == null){
            safeLazySingleton = new SafeLazySingleton();
        }
        return safeLazySingleton;
    }

    //2.对必要的代码块进行同步
    public static synchronized SafeLazySingleton getSafeLazySingleton2(){
        if(safeLazySingleton == null){
            synchronized (SafeLazySingleton.class){
                if(safeLazySingleton == null){
                    safeLazySingleton = new SafeLazySingleton();
                }
            }
        }
        return safeLazySingleton;
    }

}
