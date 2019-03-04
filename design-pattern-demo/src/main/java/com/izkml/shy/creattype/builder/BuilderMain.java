package com.izkml.shy.creattype.builder;

/**
 * @author: shy
 * @description: 建造者模式
 *建造者模式，
 * 是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 创建者模式隐藏了复杂对象的创建过程，它把复杂对象的创建过程加以抽象，通过子类继承或者重载的方式，动态的创建具有复合属性的对象。
 *
 *各角色的作用：
 * （1）指挥者（Director）直接和客户（Client）进行需求沟通；
 * （2）沟通后指挥者将客户创建产品的需求划分为各个部件的建造请求（Builder）；
 * （3）将各个部件的建造请求委派到具体的建造者（ConcreteBuilder）；
 * （4）各个具体建造者负责进行产品部件的构建；
 * （5）最终构建成具体产品（Product）。
 *
 *
 * @create: 2019-03-01 22:07
 **/

public class BuilderMain {

    public static void main(String[] args){

        BikeDirector bikeDirector = new BikeDirector(new OfoBikeBuilder());
        bikeDirector.conBike();

        BikeDirector bikeDirector1 = new BikeDirector(new MobaiBikeBuilder());
        bikeDirector1.conBike();

    }
}
