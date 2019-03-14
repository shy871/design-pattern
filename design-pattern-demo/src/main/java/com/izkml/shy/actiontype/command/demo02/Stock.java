package com.izkml.shy.actiontype.command.demo02;

/**
 * @author: shy
 * @description: 相当于命令模式中的Receiver
 * @create: 2019-03-14 14:49
 **/

public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }

}
