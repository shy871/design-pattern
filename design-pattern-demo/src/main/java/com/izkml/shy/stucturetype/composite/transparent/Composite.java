package com.izkml.shy.stucturetype.composite.transparent;

import java.util.LinkedList;

/**
 * @author: shy
 * @description: 部件类
 * @create: 2019-03-07 16:31
 **/

public class Composite extends Component {

    private LinkedList<Component> components ;

    public Composite(String name) {
        super(name);
        this.components  =  new LinkedList<Component>();
    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public LinkedList<Component> getComponents() {
        return this.components;
    }
}
