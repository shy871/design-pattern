package com.izkml.shy.stucturetype.composite;

/**
 * @author: shy
 * @description: 组合模式
 * 1.透明组合模式
 *  抽象构件声明了管理叶结点的方法和业务方法，客户端可以一致对待所有对象。但是叶结点不可能管理子结点，如果管理方法处理不好会出错。
 *
 * 2.安全组合模式
 *  抽象构件中只声明了业务方法，叶结点没有管理子结点的方法，是安全的。但是叶子构件和容器构件不一致，客户端需要区别对待。
 *
 * 角色：
 * （1）组合部件（Component）：它是一个抽象角色，为要组合的对象提供统一的接口。
 * （2）叶子（Leaf）：在组合中表示子节点对象，叶子节点不能有子节点。
 * （3）合成部件（Composite）：定义有枝节点的行为，用来存储部件，实现在Component接口中的有关操作，如增加（Add）和删除（Remove）。
 *
 * 关键点在composite中聚合了Component，即在composite中有 private LinkedList<Component> childs;同时实现对该list的增删改查操作
 *
 * @create: 2019-03-07 15:24
 **/

public class CompositeMain {

    public static void main(String[] args){

    }

}
