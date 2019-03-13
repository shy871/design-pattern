package com.izkml.shy.actiontype.chainresponsibility.demo01;

/**
 * @author: shy
 * @description: 具体实现类之三 院长
 * @create: 2019-03-13 15:47
 **/

public class Dean extends Leader {

    public void handleRequest(int leaveDays) {
        if(leaveDays<7){
            System.out.println("院长同意请假："+leaveDays+"天");
        }else {
            System.out.println("院长不同意请假："+leaveDays+"天");
        }
    }
}
