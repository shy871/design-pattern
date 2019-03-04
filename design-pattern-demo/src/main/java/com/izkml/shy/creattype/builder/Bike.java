package com.izkml.shy.creattype.builder;

import com.izkml.shy.creattype.builder.component.IEngine;
import com.izkml.shy.creattype.builder.component.IFrame;
import com.izkml.shy.creattype.builder.component.ITire;

/**
 * @author: shy
 * @description: 产品类
 * @create: 2019-03-04 10:18
 **/

public class Bike {
    private IFrame iFrame;
    private ITire iTire;
    private IEngine iEngine;

    public IFrame getiFrame() {
        return iFrame;
    }

    public void setiFrame(IFrame iFrame) {
        this.iFrame = iFrame;
    }

    public ITire getiTire() {
        return iTire;
    }

    public void setiTire(ITire iTire) {
        this.iTire = iTire;
    }

    public IEngine getiEngine() {
        return iEngine;
    }

    public void setiEngine(IEngine iEngine) {
        this.iEngine = iEngine;
    }
}
