package com.izkml.shy.creattype.prototype;

/**
 * @author: shy
 * @description: 原型模式
 * 注意事项：
 * (1)使用原型模式复制对象不会调用类的构造方法。因为对象的复制是通过调用Object类的clone方法来完成的，它直接在内存中复制数据，因此不会调用到类的构造方法。
 *      不但构造方法中的代码不会执行，甚至连访问权限都对原型模式无效。还记得单例模式吗？
 *      单例模式中，只要将构造方法的访问权限设置为private型，就可以实现单例。但是clone方法直接无视构造方法的权限，所以，单例模式与原型模式是冲突的，在使用时要特别注意。
 * (2)深拷贝与浅拷贝。Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。
 *      如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。
 *
 * @create: 2019-03-01 17:09
 **/

public class PrototypeMain {

    public static void main(String[] args){

        ConcretePrototype prototype = new ConcretePrototype();
        for(int i=0;i<5;i++){
            ConcretePrototype concretePrototype = (ConcretePrototype) prototype.clone();
            concretePrototype.sayHello(i+"");
        }

    }

}
