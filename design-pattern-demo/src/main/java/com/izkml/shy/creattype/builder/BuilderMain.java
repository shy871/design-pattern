package com.izkml.shy.creattype.builder;

/**
 * @author: shy
 * @description: 建造者模式
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
