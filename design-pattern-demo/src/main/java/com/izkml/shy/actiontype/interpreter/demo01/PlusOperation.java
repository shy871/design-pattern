package com.izkml.shy.actiontype.interpreter.demo01;

/**
 * @author: shy
 * @description: 解释器的具体实现类之一
 * @create: 2019-03-15 09:01
 **/

public class PlusOperation extends NoTerminalExpression {

    public PlusOperation(Expression e1,Expression e2){
        super(e1,e2);
    }
    int interpreter(Context context) {
        return this.e1.interpreter(context)+this.e2.interpreter(context);
    }
}
