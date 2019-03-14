package com.izkml.shy.actiontype.command.demo02;

/**
 * @author: shy
 * @description: 在命令模式中相当于ConcreteCommand
 * @create: 2019-03-14 14:52
 **/

public class BuyOrder extends Order {

    private Stock stock;

    public BuyOrder(Stock stock){
        this.stock = stock;
    }

    void execute() {
        this.stock.buy();
    }
}
