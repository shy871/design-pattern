package com.izkml.shy.creattype.builder;

import com.izkml.shy.creattype.builder.component.IEngine;
import com.izkml.shy.creattype.builder.component.IFrame;
import com.izkml.shy.creattype.builder.component.ITire;

/**
 * @author: shy
 * @description: 具体产品建造类
 * @create: 2019-03-04 10:19
 **/

public class MobaiBikeBuilder implements BikeBuilder {
    Bike mbike = new Bike();

    public void buildFrame() {
        mbike.setiFrame(new IFrame());
    }

    public void buildTire() {
        mbike.setiTire(new ITire());
    }

    public void buildEngine() {
        mbike.setiEngine(new IEngine());
    }

    public Bike createBike() {
        return mbike;
    }
}
