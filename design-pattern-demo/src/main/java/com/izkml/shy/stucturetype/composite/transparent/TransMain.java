package com.izkml.shy.stucturetype.composite.transparent;

import java.util.LinkedList;

/**
 * @author: shy
 * @description: 透明式的组合模式
 * @create: 2019-03-07 16:14
 **/

public class TransMain {

    public static void main(String[] args){

        Composite root = new Composite("root");
        Composite child01 = new Composite("child01");
        Composite child02 = new Composite("child02");

        Leaf leaf = new Leaf("leaf01");
        Leaf leaf1 = new Leaf("leaf02");

        root.add(leaf);
        root.add(child01);

        child01.add(leaf1);

        child01.add(child02);

        displayTree(root);
    }


    public static void displayTree(Composite composite){
        LinkedList<Component> components = composite.getComponents();
//        composite.getName();
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
