package com.DesignPattern.Strategy;

public class BadFlyBehaviour implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飛翔技術不好！");
    }
}
