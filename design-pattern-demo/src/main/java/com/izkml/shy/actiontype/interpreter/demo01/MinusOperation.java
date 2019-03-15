package com.izkml.shy.actiontype.interpreter.demo01;

/**
 * @author: shy
 * @description: 非终结表达式的具体实现类之二
 * @create: 2019-03-15 10:00
 **/

public class MinusOperation extends NoTerminalExpression {

    public MinusOperation(Expression e1,Expression e2){
        super(e1,e2);
    }

    int interpreter(Context context) {
        return this.e1.interpreter(context)-this.e2.interpreter(context);
    }
}
