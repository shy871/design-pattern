package com.izkml.shy.actiontype.interpreter.demo01;

/**
 * @author: shy
 * @description: 解释器客户端类
 * @create: 2019-03-15 09:03
 **/

public class ExpressionMain {

    public static void main(String[] args){

        Context context = new Context();
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");

        context.add(a, 10);
        context.add(b, 20);

        System.out.println(a.interpreter(context));
        System.out.println(new PlusOperation(a, b).interpreter(context));
        System.out.println(new MinusOperation(a, b).interpreter(context));


    }

}
