package com.example.zhou.decoratordemo;

/**
 * Created by zhou on 2016/4/9.
 */
public class ConcreteDecotatorWalk extends  Decorator {
    public void addA(){
        System.out.print("小汤同学步行去上班");
    }
    @Override
    public void Operation() {
        super.Operation();
        addA();
    }
}
