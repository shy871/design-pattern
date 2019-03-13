package com.izkml.shy.actiontype.chainresponsibility;

import com.izkml.shy.actiontype.chainresponsibility.demo01.ClassAdviser;
import com.izkml.shy.actiontype.chainresponsibility.demo01.Leader;

/**
 * @author: shy
 * @description: 责任链模式
 * @create: 2019-03-13 15:00
 **/

public class ChainMain {

    public static void main(String[] args){
        Leader leader = new ClassAdviser();
        leader.handleRequest(2);
        leader.handleRequest(4);
        leader.handleRequest(6);
        leader.handleRequest(8);
    }

}
