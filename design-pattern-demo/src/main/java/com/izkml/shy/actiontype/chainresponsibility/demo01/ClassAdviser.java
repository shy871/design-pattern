package com.izkml.shy.actiontype.chainresponsibility.demo01;

/**
 * @author: shy
 * @description: 具体实现类之一 班主任类
 * @create: 2019-03-13 15:41
 **/

public class ClassAdviser extends Leader {

    public void handleRequest(int leaveDays) {
        if(leaveDays<3){
            System.out.println("班主任同意请假："+leaveDays+"天");
        }else {
//            if(this.getNext()==null){
//                this.setNext(new DepartmentHead());
//            }
//            this.getNext().handleRequest(leaveDays);
            super.next.handleRequest(leaveDays);
        }
    }
}
