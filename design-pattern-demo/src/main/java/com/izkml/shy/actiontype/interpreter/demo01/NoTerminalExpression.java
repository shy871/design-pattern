package com.izkml.shy.actiontype.interpreter.demo01;

/**
 * @author: shy
 * @description: 非终结符抽象类
 * @create: 2019-03-15 08:56
 **/

public abstract class NoTerminalExpression extends Expression {

    Expression e1,e2;

    public NoTerminalExpression(Expression e1,Expression e2){
        this.e1 = e1;
        this.e2 = e2;
    }

}
