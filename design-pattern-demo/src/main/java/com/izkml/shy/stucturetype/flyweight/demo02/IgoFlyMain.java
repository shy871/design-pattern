package com.izkml.shy.stucturetype.flyweight.demo02;

/**
 * @author: shy
 * @description: 享元模式客户端测试类
 * @create: 2019-03-12 09:09
 **/

public class IgoFlyMain {

    public static void main(String[] args){

        IgoChessmanFactory igoChessmanFactory = IgoChessmanFactory.getIgoChessmanFactory();
        IgoChessman w1 = IgoChessmanFactory.getIgoChessman("白色");
        IgoChessman w2 = IgoChessmanFactory.getIgoChessman("白色");
        System.out.println(w1==w2);

        IgoChessman b1 = IgoChessmanFactory.getIgoChessman("黑色");
        IgoChessman b2 = IgoChessmanFactory.getIgoChessman("黑色");
        System.out.println(b1==b2);

        w1.display();
        w2.display();
    }

}
