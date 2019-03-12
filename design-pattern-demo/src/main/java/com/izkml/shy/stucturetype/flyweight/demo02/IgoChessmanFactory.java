package com.izkml.shy.stucturetype.flyweight.demo02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: shy
 * @description: 享元工厂类
 * @create: 2019-03-12 09:04
 **/

public class IgoChessmanFactory {

    private static IgoChessmanFactory igoChessmanFactory = new IgoChessmanFactory();
    private static Map<String,IgoChessman>  ht ;

    private IgoChessmanFactory(){
        ht = new HashMap<String, IgoChessman>();
        IgoChessman whiteIgoChessman = new WhiteIgoChessman();
        IgoChessman blackIgoChessman = new BlackIgoChessman();
        ht.put("白色", whiteIgoChessman);
        ht.put("黑色", blackIgoChessman);

    }


    public static IgoChessmanFactory getIgoChessmanFactory() {
        return igoChessmanFactory;
    }

    public static IgoChessman getIgoChessman(String name){
        return ht.get(name);
    }



}
