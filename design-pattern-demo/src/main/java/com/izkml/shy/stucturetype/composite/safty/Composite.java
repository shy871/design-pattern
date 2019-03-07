package com.izkml.shy.stucturetype.composite.safty;

import java.util.LinkedList;

/**
 * @author: shy
 * @description: 部件类
 * @create: 2019-03-07 15:57
 **/

public class Composite extends Component {

    private LinkedList<Component> childs;

    public Composite(String name) {
        super(name);
        this.childs = new LinkedList<Component>();
    }

    public void add(Component child){
        this.childs.add(child);
    }

    public void remove(String child){
        this.childs.remove(child);
    }

    public LinkedList<Component> getChilds(){
        return this.childs;
    }


}
