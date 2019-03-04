package com.izkml.shy.creattype.builder;

/**
 * @author: shy
 * @description: 指挥者
 * @create: 2019-03-04 10:28
 **/

public class BikeDirector {

    private BikeBuilder bBuilder= null;

    public BikeDirector(BikeBuilder bikeBuilder){
        bBuilder = bikeBuilder;
    }

    public Bike conBike(){
        bBuilder.buildFrame();
        bBuilder.buildTire();
        bBuilder.buildEngine();
        return bBuilder.createBike();
    }
}
