package com.izkml.shy.stucturetype.facade;

/**
 * @author: shy
 * @description: 外观类 集成子系统的各个功能
 * @create: 2019-03-11 15:11
 **/

public class Facade {

    private RepairLight repairLight = new RepairLight();
    private RepairWater repairWater = new RepairWater();

    public void repairLight(){
        repairLight.repair();
    }

    public void repairWater(){
        repairWater.repair();
    }

    public void repairLightAndWater(){
        repairWater.repair();
        repairLight.repair();
    }

}
