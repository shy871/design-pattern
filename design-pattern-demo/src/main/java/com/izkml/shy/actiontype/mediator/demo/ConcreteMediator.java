package com.izkml.shy.actiontype.mediator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: shy
 * @description: 抽象中介者类的具体实现类
 * @create: 2019-03-19 15:42
 **/

public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues=new ArrayList<Colleague>();

    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    public void relay(Colleague cl) {
        for(Colleague ob:colleagues){
            if(!ob.equals(cl)){
                ob.receive();
            }
        }
    }
}
