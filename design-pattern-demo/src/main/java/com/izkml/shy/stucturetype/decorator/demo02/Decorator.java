package com.izkml.shy.stucturetype.decorator.demo02;

/**
 * @author: shy
 * @description: 抽象的装饰者类
 * @create: 2019-03-08 17:18
 **/

public abstract class Decorator extends Component {

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

}
