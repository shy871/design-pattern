package com.izkml.shy.actiontype.chainresponsibility.demo01;

/**
 * @author: shy
 * @description: 请假类
 * 抽象基类：Leader 聚合依赖Leader,指定处理方法requestHandle()
 * 具体实现类：ClassAdviser(班主任类),DepartmentHead(系主任类),Dean(院长类)
 *
 * @create: 2019-03-13 15:54
 **/

public class StudentMain {

    public static void main(String[] args){

        Leader leader = new ClassAdviser();
        Leader leader1 = new DepartmentHead();
        Leader leader2 = new Dean();

        leader.setNext(leader1);
        leader1.setNext(leader2);

        leader.handleRequest(2);
        leader.handleRequest(4);
        leader.handleRequest(6);
        leader.handleRequest(8);

    }

}
