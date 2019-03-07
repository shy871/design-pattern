package com.izkml.shy.stucturetype.composite.transparent;

import java.util.LinkedList;

/**
 * @author: shy
 * @description: 叶子节点
 * @create: 2019-03-07 16:29
 **/

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public LinkedList<Component> getComponents() {
        throw new UnsupportedOperationException();
    }
}
