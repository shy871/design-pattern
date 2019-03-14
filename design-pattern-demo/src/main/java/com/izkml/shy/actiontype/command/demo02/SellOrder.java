package com.izkml.shy.actiontype.command.demo02;

/**
 * @author: shy
 * @description: 在命令模式中相当于ConcreteCommand
 * @create: 2019-03-14 14:53
 **/

public class SellOrder extends Order {

    private Stock stock;
    public SellOrder(Stock stock){
        this.stock = stock;
    }

    void execute() {
        this.stock.sell();
    }
}
