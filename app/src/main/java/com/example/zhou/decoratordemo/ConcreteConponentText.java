package com.example.zhou.decoratordemo;

/**
 * Created by zhou on 2016/4/9.
 */
public class ConcreteConponentText  extends  Decorator{
    private  void addText(){
        System.out.print("小汤同学打的去上班");
    }

    @Override
    public void Operation() {
        //如果以前有动作先进行以前的
        super.Operation();
        //这个就相当于装饰
        addText();
    }
}
