package com.DesignPattern.Strategy;

public class NoFlyBehaviour implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("沒有飛翔技術！");
    }
}
