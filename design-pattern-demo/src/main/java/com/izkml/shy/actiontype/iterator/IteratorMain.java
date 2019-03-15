package com.izkml.shy.actiontype.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: shy
 * @description: 迭代器模式
 *
 *  * (1)Iterator迭代器接口，ConcreteIterator迭代器接口具体实现类
 *  * (2)Aggregate抽象聚合类，ConcreteAggregate抽象聚合类具体实现类，Object[] 对象数组体现 聚合类
 *  * (3)ConcreteAggregate依赖ConcreteIterator类，将自身交于ConcreteInterator控制，从而后续可由ConcreteIterator遍历ConcreteAggregate中的Object数组
 *  *
 *  *Aggregate 相当于一个List, ConcreteAggregate相当于一个ArrayList
 *  *Iterator 相当于jdk中的Iterator接口，ConcreteIterator相当于ArrayList类中对Iterator实现的内部类Itr
 *
 *
 * @create: 2019-03-15 15:48
 **/

public class IteratorMain {

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.iterator();
    }

}
