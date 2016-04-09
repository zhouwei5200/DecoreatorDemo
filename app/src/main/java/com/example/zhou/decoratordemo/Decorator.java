package com.example.zhou.decoratordemo;

/**
 * Created by zhou on 2016/4/9.
 */
public abstract  class Decorator implements  Conponent {
    protected   Conponent conponent;
    public  void setConponent(Conponent conponent){
        this.conponent = conponent;

    }

    @Override
    public void Operation() {
        if(conponent != null){
            conponent.Operation();
        }
    }
}
