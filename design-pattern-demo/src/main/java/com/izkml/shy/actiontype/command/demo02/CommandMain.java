package com.izkml.shy.actiontype.command.demo02;

/**
 * @author: shy
 * @description: 命令模式
 * @create: 2019-03-14 15:55
 **/

public class CommandMain {

    public static void main(String[] args){

        Stock stock = new Stock();
        Order order = new BuyOrder(stock);
        Order order1 = new SellOrder(stock);

        Broker broker = new Broker();
        broker.takeOrder(order);
        broker.takeOrder(order1);

        broker.handleOrders();

    }

}
