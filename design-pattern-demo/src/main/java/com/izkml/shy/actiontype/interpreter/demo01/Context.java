package com.izkml.shy.actiontype.interpreter.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: shy
 * @description: context上下文环境，包含解释器之外的全局信息
 * @create: 2019-03-15 08:49
 **/

public class Context {

    private Map<Expression,Integer> map  = new HashMap<Expression,Integer>();

    public void  add(Expression e, Integer value){
        map.put(e, value);
    }

    public int lookup(Expression expression){
        return map.get(expression);
    }

}
