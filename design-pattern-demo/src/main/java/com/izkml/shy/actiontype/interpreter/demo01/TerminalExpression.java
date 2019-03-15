package com.izkml.shy.actiontype.interpreter.demo01;

/**
 * @author: shy
 * @description: 终结符类
 * @create: 2019-03-15 08:58
 **/

public class TerminalExpression extends Expression {

    String variable;

    public TerminalExpression(String variable){
        this.variable = variable;
    }

    int interpreter(Context context) {
        return context.lookup(this);
    }
}
