package com.izkml.shy.stucturetype.decorator.demo02;

/**
 * @author: shy
 * @description: 抽象基类的具体实现类之二
 * @create: 2019-03-08 17:17
 **/

public class ConcreteComponentB extends Component {

    public ConcreteComponentB(String name){
        super.name = name;
    }

    public void say() {
        System.out.print(".CB.");
    }
}
