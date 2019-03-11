package com.izkml.shy.stucturetype.facade;

/**
 * @author: shy
 * @description: 外观模式（门面模式）
 *
 * 客户端通过外观类，实现调用多个子系统的作用
 *
 * @create: 2019-03-11 14:50
 **/

public class FacadeMain {

    public static void main(String[] args){

        Facade facade = new Facade();
        facade.repairLightAndWater();


    }


}
