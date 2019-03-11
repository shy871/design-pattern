package com.izkml.shy.stucturetype.decorator.demo02;

/**
 * @author: shy
 * @description: 抽象基类的具体实现类之一
 * @create: 2019-03-08 17:15
 **/

public class ConcreteComponentA extends Component{

    public ConcreteComponentA(String name){
        super.name = name;
    }

    public void say() {
        System.out.print(".CA.");
    }
}
