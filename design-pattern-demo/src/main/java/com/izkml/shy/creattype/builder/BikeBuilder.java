package com.izkml.shy.creattype.builder;

public interface BikeBuilder {

    void buildFrame();
    void buildTire();
    void buildEngine();

    Bike createBike();

}
