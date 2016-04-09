
package com.example.zhou.decoratordemo;

/**
 * Created by zhou on 2016/4/9.
 */
public class ConcreteDecotatorRide extends  Decorator
{
    public  void addB(){
        System.out.print("小汤同学骑自行车去上班");
    }

    @Override
    public void Operation() {
        super.Operation();
        addB();
    }
}
