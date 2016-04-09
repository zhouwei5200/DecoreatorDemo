package com.example.zhou.decoratordemo;

/**
 * Created by zhou on 2016/4/9.
 */
public class ConcreteConponent implements  Conponent{
    //这是
    @Override
    public void Operation() {
            System.out.print("小汤同学开始出发去上班");
    }
}
