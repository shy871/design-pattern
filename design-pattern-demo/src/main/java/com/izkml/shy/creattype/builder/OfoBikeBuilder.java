package com.izkml.shy.creattype.builder;

import com.izkml.shy.creattype.builder.component.IEngine;
import com.izkml.shy.creattype.builder.component.IFrame;
import com.izkml.shy.creattype.builder.component.ITire;

/**
 * @author: shy
 * @description: 具体产品建造类
 * @create: 2019-03-04 10:18
 **/

public class OfoBikeBuilder implements BikeBuilder{

    Bike obike = new Bike();

    public void buildFrame() {
        obike.setiFrame(new IFrame());
    }

    public void buildTire() {
        obike.setiTire(new ITire());
    }

    public void buildEngine() {
        obike.setiEngine(new IEngine());
    }

    public Bike createBike() {
        return obike;
    }
}
