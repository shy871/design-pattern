package com.izkml.shy.actiontype.command.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: shy
 * @description: 相当于命令模式中中Invoker
 * @create: 2019-03-14 14:55
 **/

public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        this.orderList.add(order);
    }

    public void handleOrders(){
        for(Order order: this.orderList){
            order.execute();
        }
    }
}
