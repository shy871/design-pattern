package com.izkml.shy.stucturetype.composite.safty;

import java.util.LinkedList;

/**
 * @author: shy
 * @description: 安全式的组合模式
 * @create: 2019-03-07 16:02
 **/

public class SaftyMain {

    public static void main(String[] args){

        Composite composite = new Composite("root");
        Composite composite1 = new Composite("child01");
        Composite composite2 = new Composite("child02");
        Composite composite11 = new Composite("child011");

        Leaf leaf = new Leaf("leaf01");
        Leaf leaf1 = new Leaf("leaf011");

        composite.add(composite1);
        composite.add(composite2);
        composite.add(leaf);

        composite2.add(composite11);
        composite2.add(leaf1);

        displayTree(composite);
    }

    public static void displayTree(Composite composite){
        LinkedList<Component> components = composite.getChilds();
        for(Component component: components){
            if(component instanceof Leaf){
                component.getName();
            }else {
                component.getName();
                displayTree((Composite) component);
            }
        }



    }

}
