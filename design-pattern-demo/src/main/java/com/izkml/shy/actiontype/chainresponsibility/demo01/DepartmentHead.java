package com.izkml.shy.actiontype.chainresponsibility.demo01;

/**
 * @author: shy
 * @description: 具体实现类之二 系主任
 * @create: 2019-03-13 15:46
 **/

public class DepartmentHead extends Leader {

    public void handleRequest(int leaveDays) {
        if(leaveDays<5){
            System.out.println("系主任同意请假："+leaveDays+"天");
        }else {
//            if(this.getNext()==null){
//                this.setNext(new Dean());
//            }
//            this.getNext().handleRequest(leaveDays);
            super.next.handleRequest(leaveDays);
        }
    }
}
