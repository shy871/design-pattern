package com.izkml.shy.actiontype.interpreter;

/**
 * @author: shy
 * @description: 解释器模式
 *
 * 解释器模式就是定义语言的文法，并且建立一个解释器来解释该语言中的句子。
 *
 * 解释器角色：
 * （1）抽象解释器（AbstractExpression）：具体的解释任务由各个实现类完成。
 * （2）终结符表达式（TerminalExpression）：实现与文法中的元素相关联的解释操作，通常一个解释器模式中只有一个终结表达式，但有多个实例，对应不同的终结符。
 * （3）非终结符表达式（NonterminalExpression）：文法中的每条规则对应于一个非终结表达式，非终结符表达式根据逻辑的复杂程度而增加，原则上每个文法规则都对应一个非终结符表达式
 * （4）上下文（Context）: 上下文环境类,包含解释器之外的全局信息
 * （5）客户类（Test）: 客户端,解析表达式,构建抽象语法树,执行具体的解释操作等.
 *
 *
 * 例：1 + 2
 * 1,2为终结表达式
 * + 为非终结表达式
 *在此表达式中：
 * （1）终结表达式有两个元素1和2
 * （2）非终结表达式有一个元素+，
 * （3）非终结表达式依赖context,context需注入终结表达式，即从context中获取终结表达式1和2,然后进行解释操作1+2
 *
 * 在非终结表达式NoTerminalExpression的具体实现类(plus,minus等)中，注入终结表达式TerminalExpression，并进行计算interpreter操作
 *
 * @create: 2019-03-14 16:16
 **/

public class InterpreterMain {

    public static void main(String[] args){

    }

}
