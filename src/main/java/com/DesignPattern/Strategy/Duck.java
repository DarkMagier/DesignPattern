package com.DesignPattern.Strategy;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    public abstract void display();

    public void fly(){
        if(flyBehavior!=null){
            flyBehavior.fly();
        }
    }
}
