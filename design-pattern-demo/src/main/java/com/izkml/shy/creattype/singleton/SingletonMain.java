package com.izkml.shy.creattype.singleton;

/**
 * @author: shy
 * @description: 单例模式主类
 * 懒汉单例模式：
 * 懒汉式：顾名思义懒汉式就是应用刚启动的时候，并不创建实例，当外部调用该类的实例或者该类实例方法的时候，才创建该类的实例。是以时间换空间。
 * 　　懒汉式的优点：实例在被使用的时候才被创建，可以节省系统资源，体现了延迟加载的思想。
 * 　　延迟加载：通俗上将就是：一开始的时候不加载资源，一直等到马上就要使用这个资源的时候，躲不过去了才加载，这样可以尽可能的节省系统资源。
 *     懒汉式的缺点：由于系统刚启动时且未被外部调用时，实例没有创建；如果一时间有多个线程同时调用LazySingleton.getLazyInstance()方法很有可能会产生多个实例。
 * 　　　　　　　　　也就是说下面的懒汉式在多线程下，是不能保持单例实例的唯一性的，要想保证多线程下的单例实例的唯一性得用同步，同步会导致多线程下由于争夺锁资源，运行效率不高。
 *
 *
 * 饥汉式：顾名思义懒汉式就是应用刚启动的时候，不管外部有没有调用该类的实例方法，该类的实例就已经创建好了。以空间换时间。
 * 　　饥汉式的优点：写法简单，在多线程下也能保证单例实例的唯一性，不用同步，运行效率高。
 * 　　饥汉式的缺点：在外部没有使用到该类的时候，该类的实例就创建了，若该类实例的创建比较消耗系统资源，并且外部一直没有调用该实例，那么这部分的系统资源的消耗是没有意义的。
 *
 * @create: 2019-03-01 17:23
 **/

public class SingletonMain {
    public static void main(String[] args){
        //懒汉单例模式
//        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
//        LazySingleton lazySingleton1 = LazySingleton.getLazySingleton();
//        LazySingleton lazySingleton2 = LazySingleton.getLazySingleton();

        //饥汉单例模式
//        NoLazySingleton noLazySingleton = NoLazySingleton.getNoLazySingleton();
//        NoLazySingleton noLazySingleton1 = NoLazySingleton.getNoLazySingleton();
//        NoLazySingleton noLazySingleton2 = NoLazySingleton.getNoLazySingleton();

        for(int i=0; i<5;i++){
            new Thread(){
                @Override
                public void run() {
                    LazySingleton.getLazySingleton();
                }
            }.start();
        }

    }
}
